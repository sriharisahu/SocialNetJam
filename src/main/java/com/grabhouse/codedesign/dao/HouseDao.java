package com.grabhouse.codedesign.dao;

import com.grabhouse.codedesign.utils.HibernateUtil;
import com.grabhouse.codedesign.beans.House;
import com.grabhouse.codedesign.beans.User;
import com.grabhouse.codedesign.utils.Constants;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class HouseDao {
	public static boolean addHouse(House house){
		boolean flag = true;
		try {
			Session session = HibernateUtil.getSessioinFactory().openSession();
			Transaction ts = session.beginTransaction();
			session.saveOrUpdate(house);
			ts.commit();
			session.close();
		} catch (HibernateException e) {
			e.printStackTrace();
			flag = false;
		}	
		return flag;
	}
	
	public static List<House> getHouseListPerOwner(String userName){
		List<House> houseList = null;
		Session session = HibernateUtil.getSessioinFactory().openSession();
		Query query=session.createQuery("from House where userName = :userName");
		query.setString("userName", userName);
		houseList = query.list();
		session.close();
		return houseList;
	}
	
	public static List<House> getHouseListPerLocation(String location){
		List<House> houseList = null;
		Session session = HibernateUtil.getSessioinFactory().openSession();
		Query query=session.createQuery("from House where location = :location");
		query.setString("location", location);
		houseList = query.list();
		session.close();
		return houseList;
	}
	
	public static List<House> getHouseListPerLocationAndHouseType(String location, String houseType){
		List<House> houseList = null;
		Session session = HibernateUtil.getSessioinFactory().openSession();
		Criteria cr = session.createCriteria(House.class);
		cr.add(Restrictions.like("location", location)).add(Restrictions.like("houseType", houseType));
		houseList = cr.list();
		session.close();
		return houseList;
	}
	
	public static House getHouse(Integer houseId){
		Session session = HibernateUtil.getSessioinFactory().openSession();
		return (House) session.get(House.class, houseId);
	}
}

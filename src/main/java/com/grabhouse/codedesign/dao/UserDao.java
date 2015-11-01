package com.grabhouse.codedesign.dao;

import com.grabhouse.codedesign.utils.HibernateUtil;
import com.grabhouse.codedesign.beans.User;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserDao {
	public static boolean addUser(User user){
		boolean flag = true;
		try {
			Session session = HibernateUtil.getSessioinFactory().openSession();
			Transaction ts = session.beginTransaction();
			session.saveOrUpdate(user);
			ts.commit();
			session.close();
		} catch (HibernateException e) {
			e.printStackTrace();
			flag = false;
		}	
		return flag;
	}
	
	
	public static String isUserExist(User user) {
		String role = null;
		Session session = HibernateUtil.getSessioinFactory().openSession();
		Query query=session.createQuery("from User where userName=:name and password=:passwd");
		query.setString("name", user.getUserName()).setString("passwd", user.getPassword());
		User user1 = (User) query.uniqueResult();
		if(user1 !=null){
			role = user1.getRole();
		}
		session.close();		
		return role;
	}
	
	public static User getUserByUserName(String userName) {
		String role = null;
		Session session = HibernateUtil.getSessioinFactory().openSession();
		Query query=session.createQuery("from User where userName=:name");
		query.setString("name", userName);
		return (User) query.uniqueResult();
	}
}

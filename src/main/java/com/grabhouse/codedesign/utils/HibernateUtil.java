package com.grabhouse.codedesign.utils;

import com.grabhouse.codedesign.beans.Photo;
import com.grabhouse.codedesign.beans.Review;
import com.grabhouse.codedesign.beans.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Calendar;

public class HibernateUtil {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
        session.beginTransaction();

		Photo photo = new Photo();
		photo.setPhotoUrl("anything");
		session.save(photo);

        Review review = new Review();
        review.setDescription("Default Desc");
        review.setCreatedTime(Calendar.getInstance().getTime());
        review.setUpdatedTime(Calendar.getInstance().getTime());
        session.save(review);

        User user = new User();

        session.getTransaction().commit();
		session.close();
		factory.close();
        System.out.println("Done...");
	}

}

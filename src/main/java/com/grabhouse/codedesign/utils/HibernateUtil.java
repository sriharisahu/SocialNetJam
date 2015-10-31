package com.grabhouse.codedesign.utils;

import com.grabhouse.codedesign.beans.Photo;
import com.grabhouse.codedesign.beans.Review;
import com.grabhouse.codedesign.beans.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.Calendar;

public class HibernateUtil {
    private static final Logger logger = LogManager.getLogger(HibernateUtil.class);
    private static final Marker SQL_MARKER = MarkerManager.getMarker("SQL");
    SessionFactory factory =null;
    Session session = null;

    public HibernateUtil(){}
    public Session getSession(){
        if(this.session != null){
            return this.session;
        }else{
            Configuration cfg = new Configuration().configure();
            this.factory = cfg.buildSessionFactory();
            this.session = factory.openSession();
            this.session.beginTransaction();
            return this.session;
        }
    }
    public void close(){
        try {
            session.getTransaction().commit();
            session.close();
            factory.close();
        }
        catch (Exception e){
            logger.error(SQL_MARKER,e.getMessage());
            session.getTransaction().rollback();
            session.close();
            factory.close();
        }

    }

	/*public static void main(String[] args) {


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
	}*/

}

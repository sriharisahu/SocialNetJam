package com.grabhouse.codedesign.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static Configuration cfg = new Configuration();
	static {
		cfg.configure();
	}
	
	public static SessionFactory getSessioinFactory(){
		SessionFactory factory = cfg.buildSessionFactory();
		return factory;
	}

}

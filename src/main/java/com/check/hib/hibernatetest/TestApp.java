package com.check.hib.hibernatetest;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.check.hib.dto.Message;

public class TestApp {

	public static void main(String...strings){
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Message message = new Message();
		message.setId((long)1);
		message.setMessageText("sorabh");
		session.save(message);
		transaction.commit();
		session.close();
		HibernateUtil.shutdown();
	}
}

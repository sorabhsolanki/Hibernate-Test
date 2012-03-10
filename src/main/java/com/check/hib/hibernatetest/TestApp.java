package com.check.hib.hibernatetest;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.check.hib.dto.Event;
import com.check.hib.dto.Message;

public class TestApp {

	public static void main(String...strings){
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
//		Message message = new Message();
//		message.setId((long)1);
//		message.setMessageText("sorabh");
//		session.save(message);
//		Event event = new Event();
//		event.setEventId(101L);
//		event.setEventDescription("First Event");
//		session.save(event);
		
		Message message = (Message)session.load(Message.class, new Long(1));
		Event event = (Event)session.load(Event.class, new Long(3));
		message.getEvents().add(event);
		
		transaction.commit();
		session.close();
		HibernateUtil.shutdown();
	}
}

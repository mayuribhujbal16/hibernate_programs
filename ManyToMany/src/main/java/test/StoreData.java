package test;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {

	public static void main(String[] args) 
	{
		// Step-1 Reading details from hibernate configuration file
		
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		
		//Step-2 
		SessionFactory factory= conf.buildSessionFactory();
		
		//Step-3 
		Session session = factory.openSession();  // session:create new session/column in ur session in ur database
		
		//Step-4 
		Transaction tx = session.beginTransaction();
	
		Answers ans1 = new Answers();
		ans1.setAnsname("Java is Programming Language");
		ans1.setPostedby("Mayuri Mohite");
		
		Answers ans2 = new Answers();
		ans1.setAnsname("Java is platform");
		ans1.setPostedby("Mayura Rai");
		
		Question q1 = new Question();
		q1.setQname("wht is Java");
		
		ArrayList<Answers> a1 = new ArrayList<Answers>();
		a1.add(ans1);
		a1.add(ans2);
		
		q1.setAnswers(a1);
		
		Answers ans3 = new Answers();
		ans3.setAnsname("Servlet is API");
		ans3.setPostedby("Gaurav Mohite");
		
		Answers ans4 = new Answers();
		ans4.setAnsname("Servlet is Interface");
		ans4.setPostedby("Shubham Mohite");
		
		Question q2 = new Question();
		q1.setQname("wht is Servlet");
		
		ArrayList<Answers> a2 = new ArrayList<Answers>();
		a2.add(ans3);
		a2.add(ans4);
		
		
		q2.setAnswers(a2);
		
		session.persist(q1);
		session.persist(q2);
		
		tx.commit();
		session.close();
		factory.close();
		
		System.out.println("Details added Successfullyyyyyyy!!!");

	}

}

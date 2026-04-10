package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpDataAccess {

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
		
		//create persistance object 
		
		Employee e1 = new Employee();
		e1.setName("Mayuri");
		
		Reg_emp e2=new Reg_emp();
		e2.setName("Bunty");
		e2.setSalary(40000);
		e2.setBonus(5);
		
		Cont_emp e3= new Cont_emp();
		e3.setName("Pradnya");
		e3.setPay_per_hours(10);
		e3.setContrct_period("15 Hours");
		
		session.persist(e1);
		session.persist(e2);
		session.persist(e3);
		
		tx.commit();
		session.close();
		factory.close();
		
		System.out.println("Details added Successfullyyyyyyy!!!");
		


	}

}

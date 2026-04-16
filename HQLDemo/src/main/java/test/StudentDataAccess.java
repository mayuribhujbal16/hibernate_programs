package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentDataAccess {

    public static void main(String[] args) {

        // Step-1
        Configuration conf = new Configuration();
        conf.configure("hibernate.cfg.xml");

        // Step-2
        SessionFactory factory = conf.buildSessionFactory();

        // Step-3
        Session session = factory.openSession();

        // Step-4
        Transaction tx = session.beginTransaction();

        session.save(new Student("Mayuri", 22));
        session.save(new Student("Gaurav", 26));
        session.save(new Student("Shubham", 23));
        session.save(new Student("Pradnya", 19));

        tx.commit();

        session.close();
        factory.close();

        System.out.println("Details added Successfully!");
    }
}
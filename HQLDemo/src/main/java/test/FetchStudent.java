package test;

import java.lang.module.Configuration;
import java.util.List;

import javax.management.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class FetchStudent {

    public static void main(String[] args) {

        // Step-1
        Configuration conf = new Configuration() ;
        conf.configure("hibernate.cfg.xml");

        // Step-2
        SessionFactory factory = conf.buildSessionFactory();

        // Step-3
        Session session = factory.openSession();

        // Step-4
  /*
   //fetch all details
        List<Student> l1 = session.createQuery("from Student", Student.class).list();

        for(Student s1 : l1)
        {
            System.out.println(s1.getName() + " " + s1.getAge());
        }
        ///////////////////////////////
*/
        
     /* 
      //where name = ram
         Query<Student> q1 = session.creatQuery("from Student s WHERE s.name= :n", Student.class);
        
        q1.setParameter("n","Siya");
        List<Student> list = q1.list();
        
        for(Student s1 : list)
        {
            System.out.println(s1.getId()+" "+s1.getName() + " " + s1.getAge());
        }
        //////////////////
      */
       
 /*      
      // select specific column name
       Query<String>q1 =  session.createQuery("SELECT s.name FROM Student s", String.class);
        
        List<String> list = q1.list();
        
        for(String s1 :list)
        {
            System.out.println(s1);
        }
       ////////////////////
   */
        // select student where age > 35
        
        Query<Student> q1 = session.createQuery("FROM Student s WHERE s.age > :a", Student.class);
        q1.setParameter("a",35);
        List<Student> list = q1.list();
        
        for(Student s1 :list)
        {
        	System.out.println(s1.getId()+" "+s1.getName() + " " + s1.getAge());
        }
        
        
        session.close();
        factory.close();

        System.out.println("Details fetched Successfully!");
    }
}
package demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;


public class hibernatetest {
    public static void main(String[] args) {

        SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionfactory.openSession();
        session.beginTransaction();
        for (int i = 0; i<10; i++){
            userdetails u = new userdetails();
            u.setUsername("u" + i);
            session.save(u);
        }

        session.getTransaction().commit();
        session.close();





    }
}

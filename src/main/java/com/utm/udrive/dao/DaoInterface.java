package com.utm.udrive.dao;

import com.utm.udrive.service.UserClass;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public interface DaoInterface {

    default void usersToDataBase(UserClass... users) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            for (int i = 0; i < users.length; i++) {
                session.save(users[i]);
            }
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}

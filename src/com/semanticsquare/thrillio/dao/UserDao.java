package com.semanticsquare.thrillio.dao;

import java.util.ArrayList;

import com.semanticsquare.thrillio.entities.User;
import com.semanticsquare.thrillio.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserDao {
	
	// Retrieves all users from the database
	public ArrayList<User> getAlluser() {
		return new ArrayList<User>();
	}
	
	// Checks if a user exists in the database with the provided email and password
	public User findUserByEmailAndPassword(String email, String password) {
		Session session = null;
		try {
			session = HibernateUtils.getSessionFactory().openSession();
            return session.createQuery("FROM User WHERE email = :email AND password = :password", User.class)
                          .setParameter("email", email)
                          .setParameter("password", password)
                          .uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (session != null) {
                session.close();
            }
        }
	}
	
	// Adds a new user to the database
	public void insertUser(User user) {
		Transaction transaction = null;
		Session session = null;
        try {
        	session = HibernateUtils.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(user);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
	}
	
	// Retrieves a user by their ID
    public User findUserById(int userId) {
        User user = null;
        return user;
    }
    
    // Checks if a user exists in the database by their email
    public boolean findUserByEmail(String email) {
        return false;
    }
}

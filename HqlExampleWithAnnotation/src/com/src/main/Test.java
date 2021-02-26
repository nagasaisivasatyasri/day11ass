package com.src.main;

import java.util.ArrayList;
import java.util.List;

//import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

//import com.src.model.Product;
import com.src.model.User;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
   
    SessionFactory factory = meta.getSessionFactoryBuilder().build();
    Session session = factory.openSession();
    Transaction t = session.beginTransaction();
    User u=new User();
    //u.setUid(1);
    u.setUsername("sai");
    session.persist(u);
    Query q=session.createQuery("from User");
    List<User> li=q.list();
    System.out.println(li);
    t.commit();
    System.out.println("values inserted successfully");
    session.close();
    factory.close();

	}

}

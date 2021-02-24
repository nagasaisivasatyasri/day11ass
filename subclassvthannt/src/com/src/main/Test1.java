package com.src.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.src.model.Customer;
import com.src.model.PermAddress;
import com.src.model.TempAddress;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
           Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
      
       SessionFactory factory = meta.getSessionFactoryBuilder().build();
       Session session = factory.openSession();
       Transaction t = session.beginTransaction();
       Customer c=new Customer();
       
       c.setName("satya");
       PermAddress p=new PermAddress();
       
       p.setName("bhavana");
       p.setAddress("kkd");
       TempAddress t1=new TempAddress();
     
       t1.setName("satyasri");
       t1.setTempAdd("hyd");
       session.persist(c);
       session.persist(p);
       session.persist(t1);
       t.commit();
       System.out.println("values inserted successfully");
       session.close();
       factory.close();

	}

}

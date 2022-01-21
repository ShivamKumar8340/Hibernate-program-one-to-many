package com.sunglowsys.test;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.domain.Order;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.HashSet;
import java.util.Set;

public class SaveData {
    public static void main(String[] args) {
        Configuration cfg=new Configuration().configure();
        SessionFactory sessionFactory= cfg.buildSessionFactory();

        Set<Order> orders=new HashSet<>();
        Order o1=new Order("Laptop","Lenvo",972749);
        Order o2= new Order("Mobile","Samsung",89498);
        Order o3=new Order("fridge","Lg",8924897);

        orders.add(o1);
        orders.add(o2);
        orders.add(o3);

        Customer cust=new Customer("shivam","kashyap","89844989","sk@gmail.com");
        cust.setOrders(orders);

        Session session=sessionFactory.openSession();
        Transaction txn=session.beginTransaction();
        session.save(cust);
        txn.commit();
        session.close();
        System.out.println("saved successfully!");
    }
}

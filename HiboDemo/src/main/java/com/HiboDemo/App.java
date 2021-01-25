package com.HiboDemo;

import java.lang.module.Configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.Entity;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;



/**
 * Hello world!
 *
 */


public class App 
{
    public static void main( String[] args )
    {
        Laptoop laptop = new Laptoop();
        laptop.setLid(101);
        laptop.setLname("Dell");
        
       
        
        Student s= new Student();
        s.setName("prawin");
        s.setRollno(1);
        s.setMarks(50);
        
        laptop.getStudent().add(s);
        
        s.getLaptop().add(laptop);
        
        org.hibernate.cfg.Configuration con = new org.hibernate.cfg.Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptoop.class);
        ServiceRegistry registry=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        SessionFactory sf= con.buildSessionFactory(registry);
        Session session=sf.openSession();
        session.beginTransaction();
        
        
        
        session.save(laptop);
        session.save(s);
        session.getTransaction().commit();
        
        
    }
}

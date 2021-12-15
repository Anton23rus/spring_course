package com.bbraun.spring.hibernate_test;

import com.bbraun.spring.hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test5 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            // ++  удаление единичного объекта
//            Employee emp = session.get(Employee.class, 1);
//            session.delete(emp);

// ++ удаление объектов запросом
            session.createQuery("delete Employee where name = 'Alexandr'").executeUpdate();

            session.getTransaction().commit();

            System.out.println("Done!");
        } finally {
            factory.close();
        }
    }
}

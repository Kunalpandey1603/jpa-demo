package com.learning.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistMain {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("unit1");
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        Main m1= new Main();
        m1.setEmpId(104);
         m1.setEmpName("rahul");
         m1.setEmpSalary(11455.76);
         em.persist(m1);
         em.getTransaction().commit();
         emf.close();


    }
}

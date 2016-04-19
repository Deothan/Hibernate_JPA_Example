/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.deothan.hibernatetest.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Mads
 */
public class main {
    public static EntityManagerFactory EMF;
    public static EntityManager EM;
    
    public static void main(String args[]){
        EMF = Persistence.createEntityManagerFactory("Hibernate_JPA");
        EM = EMF.createEntityManager();
        
        EM.getTransaction().begin();
        EM.persist(new Album("dddd"));
        EM.persist(new Album("fffffsf"));
        EM.getTransaction().commit();
    }
}

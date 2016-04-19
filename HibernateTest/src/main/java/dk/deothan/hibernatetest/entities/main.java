/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.deothan.hibernatetest.entities;

import java.util.ArrayList;
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
        Album album = new Album("test_with_artists");
        ArrayList<Artist> artists = new ArrayList<>();
        artists.add(new Artist("name1"));
        artists.add(new Artist("name2"));
        artists.add(new Artist("name3"));
        album.setArtists(artists);
        
        EMF = Persistence.createEntityManagerFactory("Hibernate_JPA");
        EM = EMF.createEntityManager();
        
        EM.getTransaction().begin();
        EM.persist(album);
        EM.getTransaction().commit();
    }
}

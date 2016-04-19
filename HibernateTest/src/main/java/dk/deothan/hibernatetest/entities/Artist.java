/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.deothan.hibernatetest.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Deothan
 */
@Entity
public class Artist {
    @Id
    @GeneratedValue
    private int artistid;
    @Column(name="artistname")
    private String name;
    
    public Artist(){}
    
    public Artist(String name){
        this.name = name;
    }
}

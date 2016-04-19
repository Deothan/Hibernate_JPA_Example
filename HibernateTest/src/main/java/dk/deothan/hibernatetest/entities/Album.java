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
 * @author Mads
 */
@Entity
public class Album {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "albumname")
    private String name;
    
    public Album(String name){
        this.name = name;        
    }
    
    public Album(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}

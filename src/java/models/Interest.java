/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package models;

import com.sun.org.apache.bcel.internal.util.Objects;
import java.io.Serializable;

/**
 *
 * @author JNA-RNDLT-UNIV
 */
public class Interest implements Serializable {
    private int id;
    private String name;
    private String title;
    
    public Interest(){
        id = 0;
        title = "";
    }
    
    public Interest(int id, String name, String title){
        this.id = id;
        this.title = name;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the name to set
     */
    public void setTitle(String title) {
        this.title = title;
    }
    
    @Override
    public String toString(){
        return "Interest: " + id + ", " + name + ", " + title;
    }
    
    @Override
    public int hashCode(){
        int hash = 11;
        hash += 31 * hash + id;
        hash += 31 * hash + Objects.hashCode(name);
        hash += 31 * hash + Objects.hashCode(title);
        return hash;
    }
    
    @Override
    public boolean equals(Object obj){
        if(obj == null) { return false; }
        if(this == obj) { return true; }
        if(!getClass().equals(obj.getClass())) {
            return false;
        }
        Interest ntrst = (Interest)obj;
        if(this.getName() != ntrst.getName() && !this.getTitle().equals(ntrst.getTitle())){
            return false;
        }
        return true;
    }
    
} 

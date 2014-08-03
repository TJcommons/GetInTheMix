/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package user.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Tobias Lovell
 */
@Entity
@Table(name="UserMember")
public class UserMember implements Serializable {
    //JavaBeans must be serializable to conform to spec
    @Id
    @Column(name="MEMBER_ID", unique=true, nullable=false)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer memberId;
    
    @Column(name="FIRST_NAME", nullable=false, length=35)
    private String firstName;
    
    @Column(name="LAST_NAME", nullable=false, length=40)
    private String lastName;
    
    @Column(name="EMAIL", nullable=false, length=50)
    private String email;
    
    @Column(name="USER_NAME", nullable=false, length=40)
    private String username;
    
    @Column(name="PASSWORD", nullable=false, length=40)
    private String password;
    
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="person")
    private List<Interest> interests;

    //This ensures that the class conforms to the JavaBean Specifications and is used to initialise the form...
    
    public UserMember() {
        //this.email = "user@user.com";
        this.email = "";
        this.firstName = "";
        this.lastName = "";
        this.username = "";
        this.password = "";
        this.memberId = 0;
    }
    
    public UserMember(Integer memberId, String firstName, String lastName, 
            String email, String username, String password, 
            ArrayList<Interest> interests) {
        
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.memberId = memberId;
        this.username = username;
        this.password = password;
    }
    
    
    /**
     * @return the userID
     */
    public Integer getMemberId() {
        return memberId;
    }

    /**
     * @param memberId the userID to set
     */
    public void setMemberID(Integer memberId) {
        this.memberId = memberId;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the interests
     */
    public List<Interest> getInterests() {
        return interests;
    }

    /**
     * @param interests the interests to set
     */
    public void setInterests(List<Interest> interests) {
        this.interests = interests;
    }

    /**
     * @return the userName
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the userName to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
      @Override
    public String toString() {
        return("ID: " + this.memberId + ", First Name: " + this.firstName + ", Last Name: " + this.lastName +
                ", Email: " + this.email);
    }
}

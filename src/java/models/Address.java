/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package models;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author JNA-RNDLT-UNIV
 */
public class Address implements Serializable {
    
    private String addrLine1;
    private String addrLine2;
    private String postCode;
    private String town;
    private String country;
    
    public Address(){
        addrLine1 = "";
        addrLine2 = "";
        postCode = "";
        town = "";
        country = "";
    }
    
    public Address(String line1, String line2, String pstCd, String town, String cntry){
        addrLine1 = line1;
        addrLine2 = line2;
        postCode = pstCd;
        this.town = town;
        country = cntry;
    }

    public String getAddrLine1() {
        return addrLine1;
    }

    public void setAddrLine1(String addrLine1) {
        this.addrLine1 = addrLine1;
    }

    public String getAddrLine2() {
        return addrLine2;
    }

    public void setAddrLine2(String addrLine2) {
        this.addrLine2 = addrLine2;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.addrLine1);
        hash = 11 * hash + Objects.hashCode(this.addrLine2);
        hash = 11 * hash + Objects.hashCode(this.postCode);
        hash = 11 * hash + Objects.hashCode(this.town);
        hash = 11 * hash + Objects.hashCode(this.country);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Address other = (Address) obj;
        if (!Objects.equals(this.addrLine1, other.addrLine1)) {
            return false;
        }
        if (!Objects.equals(this.addrLine2, other.addrLine2)) {
            return false;
        }
        if (!Objects.equals(this.postCode, other.postCode)) {
            return false;
        }
        if (!Objects.equals(this.town, other.town)) {
            return false;
        }
        if (!Objects.equals(this.country, other.country)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Address{" + "addrLine1=" + addrLine1 + ", addrLine2=" + addrLine2 + ", postCode=" + postCode + ", town=" + town + ", country=" + country + '}';
    }
    
    
    
}

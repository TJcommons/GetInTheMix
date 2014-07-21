/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package models;

import java.io.Serializable;

/**
 *
 * @author JNA-RNDLT-UNIV
 */
public class Event implements Serializable {
    
    //
    //  Javabean Model Properties
    //
    //
    
    private long id;
    private String title;
    private String summarize;
    private String desc;
    private Address location;
    /* startDate and duration are stored as Unix-like timestamp.*/
    private long startDate;
    private long duration;

    //
    //  Javabean Model Constructors
    //
    //
    
    public Event(){
        id = 0;
        title = "";
        summarize = "";
        desc = "";
        location = null;
        startDate = 0;
        duration = 0;
    }
    
    public Event(long eId, String eTitle, String eSumm, String eDesc, Address eLoc, long eDate, long eLength){
        id = eId;
        title = eTitle;
        summarize = eSumm;
        desc = eDesc;
        location = eLoc;
        startDate = eDate;
        duration = eLength;
    }
    
    //
    //  Javabean Model Getters/Setters
    //
    //
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummarize() {
        return summarize;
    }

    public void setSummarize(String summarize) {
        this.summarize = summarize;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Address getLocation() {
        return location;
    }

    public void setLocation(Address location) {
        this.location = location;
    }

    /**
     * retrieve the start date of an event which is stored as a Unix timestamp into the Javabean.
     * @return long that represents a Unix timestamp.
     */
    public long getStartDate() {
        return startDate;
    }

    /**
     * Set up the start date of an event which is stored as a Unix timestamp into the Javabean.
     * @param startDate the timestamp as long that represents a specific date.
     */
    public void setStartDate(long startDate) {
        this.startDate = startDate;
    }

    /**
     * Retrieve the duration for an event held as an Unix timestamp into the Javabean.
     * @return long that represents a Unix timestamp.
     */
    public long getDuration() {
        return duration;
    }

    /**
     * Set up the duration of the event from its start date. It is held as a Unix timestamp into the Javabean.
     * @param duration the duration to set as a long value.
     */
    public void setDuration(long duration) {
        this.duration = duration;
    }
    
    @Override
    public boolean equals(Object obj){
        if(obj == null) { return false; }
        if(this == obj) { return true; }
        if(!getClass().equals(obj.getClass())) { return false; }
        if(getTitle().equals(((Event)obj).getTitle()) && getLocation().equals(((Event)obj).getLocation()) &&
                getStartDate() == ((Event)obj).getStartDate()) { return true; }
        return false;
    }
    
    @Override
    public int hashCode(){
        return title.hashCode() + location.hashCode() + String.valueOf(startDate).hashCode();
    }
    
    @Override
    public String toString(){
      final String NEW_LINE = System.getProperty("line.separator");
      StringBuilder sb = new StringBuilder("Event: " + String.valueOf(id) + ", ");
      sb.append("title: " + title + ", ");
      sb.append(NEW_LINE);
      sb.append("summarize: ");
      sb.append(NEW_LINE);
      sb.append(summarize);
      sb.append(NEW_LINE);
      sb.append("description: ");
      sb.append(NEW_LINE);
      sb.append(desc);
      sb.append(NEW_LINE);
      sb.append(location);
      sb.append(NEW_LINE);
      sb.append("date: " + new java.util.Date(startDate) + ", duration: " + duration + "milli secs");
      return sb.toString();
    }
    
    
}

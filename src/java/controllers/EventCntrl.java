/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controllers;

import models.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author JNA-RNDLT-UNIV
 */
@Controller
@RequestMapping("/event")
public class EventCntrl {
    
    @Autowired
    private Service eventService;
    
    public EventCntrl(){
        // do nothing
    }
    
    @RequestMapping(value="/organize", method=RequestMethod.GET)
    public String preLoadOrganizeEvent(Model model){
        
        // instantiate empty event model to transfert to view and init form.
        Event event = new Event();
        model.addAttribute("event", event);
        
        return "event";
    }
    
    @RequestMapping(value="/organize", method=RequestMethod.POST)
    public String organizeEvent(@ModelAttribute("event") Event event, Model mo){ // what about info related to organizer?
        
        return "events"; // specify view.
    }
    
    @RequestMapping(value="/edit", method=RequestMethod.GET)
    public String editEvent(@RequestParam("eventId") String eventId, Model model){
        
        return "event";
    }
    
    @RequestMapping(value="/edit", method=RequestMethod.POST)
    public String submitEditEvent(@ModelAttribute("event") Event event, Model model){
        
        return "events";
    }
    
    @RequestMapping(value="/cancel", method=RequestMethod.POST)
    public String cancelEvent(@RequestParam("eventId") String eventId, Model model){
        
        return "events";
    }
    
    @RequestMapping(value="/all", method=RequestMethod.GET)
    public String showAllEvents(Model model){
        
        return "events";
    }
    
    @RequestMapping(value="/attendees", method=RequestMethod.GET)
    public String showAllAttendees(@RequestParam("eventId") String eventId, Model model){
        
        return ""; // what is the view attendees or another list on events?
    }
    
    @RequestMapping(value="/organizer", method=RequestMethod.GET)
    public String showEventByOrganizer(@RequestParam("organizerId") String organzrId, Model model){
        
        return ""; // what to return the view organizer or another list on events?
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controllers;

import java.util.List;
import models.Interest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author JNA-RNDLT-UNIV
 */
@Controller
@RequestMapping("/interest")
public class InterestCntrl {
  
    @Autowired
    private Service interestService;
    
    public InterestCntrl(){
        // do nothing for now.
    }
    
    @RequestMapping(value="/all", method=RequestMethod.GET)
    public String showAllInterests(Model model){
     
        
        List<Interest> interests = interestService.listAllInterests();
        
        return "interests";
    }
    
    @RequestMapping(value="/member", method=RequestMethod.GET)
    public String showMemberInterests(@RequestParam("memberId") String memberId, Model model){
        
        List<Interest> interests = interestService.listInterestsByMember(memberId);
        
        return "interests";
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import models.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author ankitmishra
 */

@Controller
@RequestMapping("/demo.htm")
public class DemoController {
    
    @RequestMapping(method = RequestMethod.GET)
    public String helloWorld(Model model) {
        Customer customer = new Customer();
	model.addAttribute("userForm", customer);
        System.out.println("on method");
        return "index";
    }
    
   @RequestMapping(method = RequestMethod.POST)
   public String addStudent(@ModelAttribute("userForm")Customer customer, 
   Model model) {
      model.addAttribute("name", customer.getEmail());
      model.addAttribute("password", customer.getPassword()); 
      System.out.print(customer.getEmail());
      return "customer-details";
   }
}

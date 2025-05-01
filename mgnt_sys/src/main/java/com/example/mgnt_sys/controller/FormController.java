package com.example.mgnt_sys.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;

@Controller
public class FormController {
    @GetMapping("/form")
    public String getForm(){
        return "form";
    }
    
    @PostMapping("/submit_form")
    @ResponseBody 
    public String handleFormSubmission(
        @RequestParam String first_name,
        @RequestParam String last_name,
        @RequestParam String country, 
        @RequestParam String subject){
        return "Form Sumbitted!! --> \nFirst Name: " + first_name + ", Last Name: " + last_name +  " Country : " + country + " subject : " + subject ;
    }
    
    
}



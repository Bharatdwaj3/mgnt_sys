package com.example.mgnt_sys.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
/*
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
*/
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.stereotype.Controller;

@Controller
public class FormController {
    @GetMapping
    public String getForm(){
        return "form";
    }

    @PostMapping("/sumbit") 
    public String handleFormSumbission(
        @RequestParam String first_name,
        @RequestParam String last_name,
        @RequestParam String country, 
        @RequestParam String subject){
        return "Form Sumbitted!! --> First Name: " + first_name + ", Last Name: " + last_name +  " Counrtry : " + country + "subject" + subject;
    }
    
    {
        /*
         * @PutMapping("/update")
         * public String updateForm(@RequestParam String name, @RequestParam String
         * email){
         * return "Form Updated New Name: " + name + ", New Email: " + email;
         * }
         * 
         * @DeleteMapping("/delete")
         * public String deleteForm(@RequestParam String name, @RequestParam String
         * email){
         * return "Form Data Deleted for  Name: " + name + ", Email: " + email;
         * }
         * 
         * 
         */}
}



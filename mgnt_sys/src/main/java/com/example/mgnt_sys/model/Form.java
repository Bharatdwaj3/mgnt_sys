package com.example.mgnt_sys.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Form {
        
        @Id 
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String firstname,lastname, country, subject;

        public String getFirstName(){
            return firstname;
        }
        public String getLastName(){
            return lastname;
        }
        public String getCountry(){
            return country;
        }
        public String getSubject(){
            return subject;
        }


         public void setFirstName(String firstname){
            this.firstname=firstname;
        }
        public void setLastName(String lastname){
            this.lastname=lastname;
        }
        public void setCountry(String country){
            this.country=country;
        }
        public void setSubject(String subject){
            this.subject=subject;
        }
        
    }

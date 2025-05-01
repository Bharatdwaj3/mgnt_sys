package com.example.mgnt_sys.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tasks")
public class Form {
        private String firstname,lastname, country, subject;

        public String getFirstName(String firstname){
            return firstname;
        }
        public String getLastName(String lastname){
            return lastname;
        }
        public String getCountry(String country){
            return country;
        }
        public String getSubject(String subject){
            return subject;
        }


         public String setFirstName(String firstname){
            this.firstname=firstname;
        }
        public String setLastName(String lastname){
            this.lastname=lastname;
        }
        public String setCountry(String country){
            this.country=country;
        }
        public String setSubject(String subject){
            this.subject=subject;
        }
        
    }

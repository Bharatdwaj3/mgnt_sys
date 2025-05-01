package com.example.mgnt_sys.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;

public class CredController {
    @GetMapping("/cred")
    public String getForm() {
        return "cred";
    }
}

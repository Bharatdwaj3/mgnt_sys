package com.example.mgnt_sys.controller;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.UUID;

import org.springframework.ui.Model;

import org.springframework.beans.factory.annotation.Autowired;


import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

import com.example.mgnt_sys.model.User;
import com.example.mgnt_sys.repository.UserRepository;

import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/register")
    public String handleRegister(){
            return "register";
        }

    @GetMapping("/login")
    public String showLoginForm(
        @CookieValue(value="userSession",defaultValue = "")String sessionCookie,
        Model model
    ) {

        if(!sessionCookie.isEmpty()){
            String[] parts=sessionCookie.split("-");
            if(parts.length==2){
                model.addAttribute("loggedIn", true);
                model.addAttribute("username", parts[0]);
                return "welcome";
            }
        }
        model.addAttribute("notLoggedIn", true);
        return "login";
        
    }

    @PostMapping("/register")
    public String handleRegister(
        @RequestParam String name,
        @RequestParam String username,
        @RequestParam String email,
        @RequestParam String password,
        Model model
    ){
        name = name.trim();
        password = password.trim();
        email = email.trim();
        password = password.trim();


        if(userRepository.findByUsername(username)!=null){
            model.addAttribute("error", "User already exists");
            return "register";
        }
        User user = new User();
        user.setName(name);
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);
        userRepository.save(user);
                model.addAttribute("message", "Registration Successful!! Please Log in");
        return "login";
    }

    @PostMapping("/login")
    public String handleLogin(
        @RequestParam String username,
        @RequestParam String password,
        HttpServletResponse res,
        Model model
    ){
        username=username.trim();
        password=password.trim();
        System.out.println("Input username: > " + username + "<");
        System.out.println("Input password: > " + password + "<");

        User user=userRepository.findByUsername(username);
        if(user!=null && user.getPassword().trim().equals(password)){
            System.out.println("DB password: " + user.getPassword());
        String sessionToken = UUID.randomUUID().toString();
        Cookie sessionCookie =  new Cookie("userSession",username+"-"+sessionToken);
        sessionCookie.setHttpOnly(true);
        sessionCookie.setMaxAge(3600);
        sessionCookie.setPath("/");
        res.addCookie(sessionCookie);

        model.addAttribute("loggedIn", true);
        model.addAttribute("username", username);
        model.addAttribute("message", "Login Sucessful");
        return "welcome";
    }else{
        model.addAttribute("error","Invalid username or password");
        return "login";
    }
}

    @GetMapping("/logout")
    public String getLogout(HttpServletResponse res) {
        Cookie cookie = new Cookie("userSession",null);
        cookie.setMaxAge(0);
        cookie.setPath("/");
        res.addCookie(cookie);
        return "redirect:/login";
    }

}
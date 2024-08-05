package com.boostmytool.beststore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;


@Controller
public class LoginController {
    @Autowired
    private UserRepository userRepository;
    @PostMapping("/login")
    public String login(@RequestParam("username") String username,
    @RequestParam("password") String password,
    HttpSession session  ) {
        User user=userRepository.findByUsernameAndPassword(username, password);
        if(user!=null)
        {
            session.setAttribute("user", user);
            return "redirect://index.html";
        }else
        {
            return "redirect://login.html"; 
        }
        
    }
    
    
}

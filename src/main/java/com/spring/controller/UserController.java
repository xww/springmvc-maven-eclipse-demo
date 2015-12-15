package com.spring.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;  
import org.slf4j.LoggerFactory;  
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.entity.*;
import com.spring.service.*;
  
 
@Controller  
public class UserController {  
      
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);  
  
    @Resource
    private UserService userService;  
      
    //@RequestMapping(value = "/", method = RequestMethod.GET) 
    @RequestMapping("/home/index")
    public ModelAndView Add(HttpServletRequest request, HttpServletResponse response) {
    //public ModelAndView home(Model model) {  
        logger.info("get all user info ---->/n");  
        List<User> users = userService.getUserList();  
        logger.info(users.toString());  
        //model.addAttribute("users", users);
        return new ModelAndView("index", "users", users);
          
        //return "showUsers";  
    } 
    
      
}
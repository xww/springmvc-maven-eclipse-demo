package com.spring.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.spring.dao.*;
import com.spring.entity.*; 
/** 
 * guangzhoudaxue  
 * @author xing 
 * 
 */ 

@Service
public class UserService {
	
	@Resource
    private UserDao userDao;  
      
    /*public UserDao getUserDao() {  
        return userDao;  
    }  
    //注入  
    public void setUserDao(UserDao userDao) {  
        this.userDao = userDao;  
    } */ 
  
    /** 
     * 查找所有的用户信息 
     * @return 
     */  
    public List<User> getUserList(){  
        return userDao.findAllUser();  
    }  
}

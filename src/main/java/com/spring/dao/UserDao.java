package com.spring.dao;

import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;  
import org.springframework.jdbc.core.RowMapper;  
import org.springframework.jdbc.core.RowMapperResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.spring.entity.*;;  
/** 
 * guangzhoudaxue  
 * @author xing 
 * 
 */ 

@Repository
public class UserDao {  
    class UserRowMapper implements RowMapper{  
        public Object mapRow(ResultSet rs,int index) throws SQLException        {  
            User u = new User(rs.getString("name"), rs.getString("password"));  
            return u;  
        }  
    }  
    
    @Autowired
    private JdbcTemplate jdbcTemplate;  
      
    /*public JdbcTemplate getJdbcTemplate() {  
        return jdbcTemplate;  
    }  
    //注入  
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
        this.jdbcTemplate = jdbcTemplate;  
    }  */
      
    @SuppressWarnings({ "unchecked", "rawtypes" })  
    public List findAllUser()  
    {  
        List list = null;  
        try{  
              
            String sql ="select * from user";  
            list = jdbcTemplate.query(sql,new RowMapperResultSetExtractor(new UserRowMapper()));  
        }catch (Exception e) {  
            System.out.println(e.toString());  
        }  
        return list;  
    }  
      
}

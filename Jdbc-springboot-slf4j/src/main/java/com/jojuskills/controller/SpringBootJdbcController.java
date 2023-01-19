package com.jojuskills.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class SpringBootJdbcController {
	
	 @Autowired  
	    JdbcTemplate jdbc;    
	    
	 @RequestMapping("/insert")  
	    public String index(){  
	        jdbc.execute("insert into raju(name,email)values('maha','lakshmi@gmail.com')");  
	        return"data inserted Successfully";  
	}
	 
	 @RequestMapping("/lombok")
	    public String index1() {
	        log.trace("A TRACE Message");
	        log.debug("A DEBUG Message");
	        log.info("An INFO Message");
	        log.warn("A WARN Message");
	        log.error("An ERROR Message");
	 
	        return "Howdy! Check out the Logs to see the output...";
	    }
}

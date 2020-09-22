package org.com.capg;


import org.com.capg.healthcare.entity.DiagnosticCenter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class HealthCareSystemApplicationTests {
	
	static Logger logger=LoggerFactory.getLogger(HealthCareSystemApplication.class);
	 RestTemplate template;
	 
	 @BeforeEach
		public void setUp()
		{
			template=new RestTemplate();		
		}
	 
	@Test
	void contextLoads() {
	}
	
	@Test
	public void addCenter() {
		

	}

}

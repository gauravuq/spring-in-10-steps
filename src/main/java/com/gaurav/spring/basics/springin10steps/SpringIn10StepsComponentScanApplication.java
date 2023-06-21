package com.gaurav.spring.basics.springin10steps;

import com.gaurav.spring.basics.componentscan.ComponentDAO;
import com.gaurav.spring.basics.componentscan.ComponentJDBCConnection;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@Slf4j
@ComponentScan("com.gaurav.spring.basics.componentscan") // fixes the issue of component scan, remove it and see the issue.
public class SpringIn10StepsComponentScanApplication {



	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringIn10StepsComponentScanApplication.class, args);

		ComponentDAO componentDAO1 = applicationContext.getBean(ComponentDAO.class);
		ComponentJDBCConnection componentJdbcConnection1 = componentDAO1.getJdbcConnection();
		log.info("{}",componentDAO1);
		log.info("{}",componentJdbcConnection1);



	}

}

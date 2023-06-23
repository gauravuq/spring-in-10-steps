package com.gaurav.spring.basics.springin10steps;

import com.gaurav.spring.basics.componentscan.ComponentDAO;
import com.gaurav.spring.basics.componentscan.ComponentJDBCConnection;
import lombok.extern.slf4j.Slf4j;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.gaurav.spring.basics.componentscan") // fixes the issue of component scan, remove it and see the issue.
@Slf4j
public class SpringIn10StepsComponentScanApplication {



	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn10StepsScopeApplication.class)) {

			ComponentDAO componentDAO1 = applicationContext.getBean(ComponentDAO.class);
			ComponentJDBCConnection componentJdbcConnection1 = componentDAO1.getJdbcConnection();
			log.info("{}", componentDAO1);
			log.info("{}", componentJdbcConnection1);
		}


	}

}

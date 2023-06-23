package com.gaurav.spring.basics.springin10steps;

import com.gaurav.spring.basics.springin10steps.scope.JDBCConnection;
import com.gaurav.spring.basics.springin10steps.scope.PersonDAO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@Slf4j
public class SpringIn10StepsScopeApplication {



	public static void main(String[] args) {

		try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn10StepsScopeApplication.class)) {
			PersonDAO personDAO1 = applicationContext.getBean(PersonDAO.class);
			JDBCConnection jdbcConnection1 = personDAO1.getJdbcConnection();
			log.info("{}", personDAO1);
			log.info("{}", jdbcConnection1);
			PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);
			JDBCConnection jdbcConnection2 = personDAO2.getJdbcConnection();
			log.info("{}", personDAO2);
			log.info("{}", jdbcConnection2);
		}
	}

}

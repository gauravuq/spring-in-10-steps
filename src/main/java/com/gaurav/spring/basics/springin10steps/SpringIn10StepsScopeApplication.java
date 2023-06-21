package com.gaurav.spring.basics.springin10steps;

import com.gaurav.spring.basics.springin10steps.basic.BinarySearchImpl;
import com.gaurav.spring.basics.springin10steps.scope.JDBCConnection;
import com.gaurav.spring.basics.springin10steps.scope.PersonDAO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@Slf4j
public class SpringIn10StepsScopeApplication {



	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringIn10StepsScopeApplication.class, args);

		PersonDAO personDAO1 = applicationContext.getBean(PersonDAO.class);
		JDBCConnection jdbcConnection1 = personDAO1.getJdbcConnection();
		log.info("{}",personDAO1);
		log.info("{}",jdbcConnection1);

		PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);
		JDBCConnection jdbcConnection2 = personDAO2.getJdbcConnection();
		log.info("{}",personDAO2);
		log.info("{}",jdbcConnection2);


	}

}

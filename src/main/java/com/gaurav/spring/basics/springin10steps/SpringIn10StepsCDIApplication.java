package com.gaurav.spring.basics.springin10steps;

import com.gaurav.spring.basics.springin10steps.cdi.CDIDAO;
import com.gaurav.spring.basics.springin10steps.cdi.CDIJDBCConnection;
import com.gaurav.spring.basics.springin10steps.scope.JDBCConnection;
import com.gaurav.spring.basics.springin10steps.scope.PersonDAO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@Slf4j
public class SpringIn10StepsCDIApplication {



	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringIn10StepsCDIApplication.class, args);
		CDIDAO cdidao = applicationContext.getBean(CDIDAO.class);
		CDIJDBCConnection cdijdbcConnection = cdidao.getJdbcConnection();
		log.info("{}",cdidao);
		log.info("{}",cdijdbcConnection);

	}

}

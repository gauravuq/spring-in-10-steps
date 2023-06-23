package com.gaurav.spring.basics.springin10steps;

import com.gaurav.spring.basics.springin10steps.cdi.CDIDAO;
import com.gaurav.spring.basics.springin10steps.cdi.CDIJDBCConnection;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@Slf4j
public class SpringIn10StepsCDIApplication {



	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn10StepsScopeApplication.class)) {
			CDIDAO cdidao = applicationContext.getBean(CDIDAO.class);
			CDIJDBCConnection cdijdbcConnection = cdidao.getJdbcConnection();
			log.info("{}", cdidao);
			log.info("{}", cdijdbcConnection);
		}
	}

}

package com.gaurav.spring.basics.springin10steps;

import com.gaurav.spring.basics.springin10steps.externalproperties.SomeExternalService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
// the above annotation automatically searches the package and the sub-packages from the relevant position of this class file.
@PropertySource("classpath:app.properties")
public class SpringIn10StepsExternalPropertiesApplication {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn10StepsExternalPropertiesApplication.class)) {
            SomeExternalService someExternalService = applicationContext.getBean(SomeExternalService.class);
            System.out.println("URL is : "+ someExternalService.getUrl());
        }
    }

}

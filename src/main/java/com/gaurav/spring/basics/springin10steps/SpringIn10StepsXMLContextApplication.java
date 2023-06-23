package com.gaurav.spring.basics.springin10steps;

import com.gaurav.spring.basics.springin10steps.basic.BinarySearchImpl;
import com.gaurav.spring.basics.springin10steps.xml.XmlPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan
// the above annotation automatically searches the package and the sub-packages from the relevant position of this class file.
public class SpringIn10StepsXMLContextApplication {

    private static Logger log = LoggerFactory.getLogger(SpringIn10StepsXMLContextApplication.class);
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            XmlPersonDAO xmlPersonDAO = applicationContext.getBean(XmlPersonDAO.class);
            log.info(xmlPersonDAO.toString());
            log.info(xmlPersonDAO.getXmlJdbcConnection().toString());
        }
    }
}

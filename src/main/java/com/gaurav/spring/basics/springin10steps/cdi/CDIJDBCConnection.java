package com.gaurav.spring.basics.springin10steps.cdi;

import jakarta.inject.Named;

@Named
public class CDIJDBCConnection {

    public CDIJDBCConnection() {
        System.out.println("JDBC Connection");
    }
}

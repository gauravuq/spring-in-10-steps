package com.gaurav.spring.basics.springin10steps.cdi;

import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
public class CDIDAO {

    @Inject
    CDIJDBCConnection jdbcConnection;

    public CDIJDBCConnection getJdbcConnection() {
        return jdbcConnection;
    }

    public void setJdbcConnection(CDIJDBCConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }
}

package com.gaurav.spring.basics.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class ComponentDAO {

    @Autowired
    ComponentJDBCConnection componentJdbcConnection;

    public ComponentJDBCConnection getJdbcConnection() {
        return componentJdbcConnection;
    }

    public void setJdbcConnection(ComponentJDBCConnection componentJdbcConnection) {
        this.componentJdbcConnection = componentJdbcConnection;
    }
}

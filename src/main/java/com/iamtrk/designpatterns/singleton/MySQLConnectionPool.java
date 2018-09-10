package com.iamtrk.designpatterns.singleton;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;
/*
* MySQL Connection pool implemented using Singleton Pattern
* */
public enum MySQLConnectionPool {
    INSTANCE;
    private static BasicDataSource ds;
    static {
        ds =  new BasicDataSource();
        ds.setUsername("root");
        ds.setPassword("ravi");
        ds.setUrl("jdbc:mysql://localhost/urlshortner?useSSL=false");

        // the settings below are optional -- dbcp can work with defaults
        ds.setMinIdle(1);
        ds.setMaxIdle(1);
        ds.setMaxOpenPreparedStatements(1);
        ds.setMaxTotal(2);
    }


    public Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

    public static void main(String[] args) throws Exception {

        System.out.println(MySQLConnectionPool.INSTANCE.getConnection().hashCode() == MySQLConnectionPool.INSTANCE.getConnection().hashCode());
        System.out.println(MySQLConnectionPool.INSTANCE.hashCode());
        System.out.println(MySQLConnectionPool.INSTANCE.hashCode());

    }



}

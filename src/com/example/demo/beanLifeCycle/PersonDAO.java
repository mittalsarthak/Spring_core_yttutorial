package com.example.demo.beanLifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.sql.*;
import java.util.Date;

public class PersonDAO {
    private String driver;
    private String url;
    private String userName;
    private String password;

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    Connection con;
    @PostConstruct
    public void init() throws SQLException, ClassNotFoundException {
        getConnection();
    }
    private void getConnection() throws ClassNotFoundException, SQLException {
        Class.forName(driver);
        con = DriverManager.getConnection(url, userName, password);
        System.out.println("Connection to postgres database completed.");
    }

    public void DisplaySomeRows() throws ClassNotFoundException, SQLException {
        System.out.println("Retrieving data for first 10 persons...");


        Statement stmt = con.createStatement();

        ResultSet rs = stmt.executeQuery(" SELECT * FROM person LIMIT 10");

        while(rs.next()) {
            int id = rs.getInt(1);
            String first_name = rs.getString(2);
            String last_name = rs.getString(3);
            String email = rs.getString(4);
            String  gender = rs.getString(5);
            String dob = rs.getString(6);
            String country = rs.getString(7);
//            System.out.println(email);
            System.out.println(id + " " + first_name + " " + last_name + " " + gender + " " + email + " " + dob + " " + country);
        }
    }

    @PreDestroy
    public void destroy() throws SQLException {
        con.close();
        System.out.println("Connection is closed.");
    }
}

package org.example;

import java.sql.Connection;
import org.example.models.user;

import java.sql.Driver;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:mydb.db";
        String createStatement = "CREATE TABLE IF NOT EXISTS User(id integer PRIMARY KEY NOT NULL AUTO INCREMENT,"+
                "name text"+
                "age integer"+
                "active boolean";
        try{
            Connection c = DriverManager.getConnection(url);
            System.out.println("Connected");
            c.close();
        }
        catch(Exception e){
            System.out.println("Error");
        }
    }
}
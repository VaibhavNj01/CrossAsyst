package com.crossasyst;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Connectivity {

//    private final static String url = "jdbc:postgresql://localhost:5432/PersonDB";
//    private final static String user = "postgres ";
//    private final static String password = "Vaibhav@1234 ";
//
//    public static void main(String[] args)  {
//        Connection con = null;
//
//
//        try{
//            Class.forName("org.postgresql.Driver");
//            con= DriverManager.getConnection(url,user,password);
//
//
//            PreparedStatement ps = con.prepareStatement("create table Emloyee(emp_id int, emp_name varchar(50))");
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/PersonDB","postgres","Vaibhav@1234");
            PreparedStatement ps = con.prepareStatement("create table Emloyee(emp_id int, emp_name varchar(50))");
            ps.execute();

            if(con!=null){
                System.out.println("Connected Succesfully");
            }else {
                System.out.println("not connected");
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}

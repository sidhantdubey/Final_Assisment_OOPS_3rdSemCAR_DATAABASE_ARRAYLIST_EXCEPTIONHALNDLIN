package com.company;

import java.sql.*;
import java.util.ArrayList;

import static java.time.ZoneOffset.UTC;

public class Main {

    public static void main(String[] args) {
        Cars car =new Cars();
        Connection connection= null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=UTC","root","");
            Statement statement=connection.createStatement();
            // statement.execute("create table cars(ID integer(10),Model varchar(50),Company varchar(50),Price double(10,2))");
            ResultSet resultSet= statement.executeQuery("select * from cars");
            ArrayList<String> arrayList=new ArrayList<>();
            while(resultSet.next()){
                int id=resultSet.getInt(1);
                String model=resultSet.getString(2);
                String company=resultSet.getString(3);
                double price=resultSet.getDouble(4);

                arrayList.add(id+" "+model+" "+company+" "+price);
            }
        } catch (SQLException e) {
            e.printStackTrace();

    }
    }
}

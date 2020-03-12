package com.akaleaf.course;

import java.sql.*;

public class Main {

    private static final String USERNAME = "root";
    private static final String PASSWORD = "steinHER35.-";
    private static final String URL = "jdbc:mysql://localhost:3306/mysql?useSSL=false";

    public static void main(String args[]) throws SQLException {

//        Driver driver;
//
//        try {
//            driver = new com.mysql.jdbc.Driver();
//        } catch (SQLException e) {
//            e.printStackTrace();
//            System.out.println("Could not create driver!");
//            return;
//        }
//
//        try {
//            DriverManager.registerDriver();
//        } catch (SQLException e) {
//            e.printStackTrace();
//            System.out.println("Could not register the driver!");
//            return;
//        }
//
//        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
//            System.out.println("Connection established!");
//            Statement statement = connection.createStatement();
//            statement.execute(String.format(""))
//        }


//        DBProcessor db = new DBProcessor();
//        Connection connection = db.getConnection(URL, USERNAME, PASSWORD);
//        String query = "select * from restaurant.Dish";
//
//        String INSERT = "insert into restaurant.Dish (name, price) values (?, ?)";
//        PreparedStatement prepInsert = connection.prepareStatement(INSERT);
//        prepInsert.setString(1, "Cooked Potatoes");
//        prepInsert.setDouble(2, 40);
//        prepInsert.execute();
//
//        PreparedStatement prepStatement = connection.prepareStatement(query);
//        ResultSet resSet = prepStatement.executeQuery();
//
//        while (resSet.next()) {
//            System.out.println(resSet.getInt("idDish") + " " + resSet.getString("name") + " " + resSet.getDouble("price"));
//        }
//
//        prepStatement.close();
//        connection.close();
    }

}

package ir.learn.creational.singleton;

import ir.learn.creational.singleton.service.DBConnection;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        DBConnection instance = DBConnection.getInstance();
//        System.out.println(System.currentTimeMillis() - time);
//        time = System.currentTimeMillis();
//        DBConnection.getInstance();
//        System.out.println(System.currentTimeMillis() - time);
        Connection connection = instance.getConnection();
        String qr = "CREATE TABLE PERSON (ID INT PRIMARY KEY, NAME VARCHAR2(255))";
        try(Statement statement = connection.createStatement()){ //automatic close if exception not accrued
            statement.execute(qr);
        }catch (SQLException e){
            e.printStackTrace();
        }

        String insertQr = "INSERT INTO PERSON (ID, NAME) VALUES (?,?)";
        try(PreparedStatement preparedStatement = connection.prepareStatement(insertQr)){
            preparedStatement.setInt(1, 1);;
            preparedStatement.setString(2 , "test1");
            preparedStatement.executeUpdate();

            preparedStatement.setInt(1, 2);;
            preparedStatement.setString(2 , "test2");
            preparedStatement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }

        String selectQr = "SELECT COUNT(*) FROM PERSON";
        try(Statement query = connection.createStatement()){
            try (ResultSet resultSet = query.executeQuery(selectQr)){
                if(resultSet.next()){
                    System.out.println("The count is :"+resultSet.getInt(1));
                }
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}

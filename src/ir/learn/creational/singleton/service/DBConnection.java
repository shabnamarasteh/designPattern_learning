package ir.learn.creational.singleton.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    //1-new object has cost
    //private static DBConnection dbConnection = new DBConnection();
    //1- then instantiate with null, method convert to lazy
    private static DBConnection dbConnection = null;
    private Connection connection;
    private static final String DB_DRIVER = "org.h2.Driver";
    private static final String DB_CONNECTION = "jdbc:h2:mem:test";
    private static final String DB_USER = "";
    private static final String DB_PASSWORD = "";

    private DBConnection(){
        initialConnection();
    }

    private void initialConnection() {
        try {
            Class.forName(DB_DRIVER);
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try {
            connection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public DBConnection getDbConnection() {
        return dbConnection;
    }

    //we used synchronized for threadsafe
    //but dont use this in method definition because we need to lock part of method not all method
    public static DBConnection getInstance()
    {
        if(dbConnection == null){
            synchronized (DBConnection.class){
                if(dbConnection == null)
                    dbConnection = new DBConnection();
            }
        }
        return dbConnection;
    }
}

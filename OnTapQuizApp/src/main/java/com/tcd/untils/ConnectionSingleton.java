/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tcd.untils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author CongDinh
 */
public class ConnectionSingleton {
    private static ConnectionSingleton instance;
    private Connection conn;
    
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.getLogger(ConnectionSingleton.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
    
    private ConnectionSingleton() throws SQLException {
        this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/englishquiz2", "root", "trancongdinh1");
    }
    
    public static ConnectionSingleton getCon() throws SQLException {
        if(instance == null)
            instance = new ConnectionSingleton();
        
        return instance;
    }
    
    public Connection connect() {
        return this.conn;
    }
    
    public void close() throws SQLException {
        if(this.conn != null)
            this.conn.close();
    }
}

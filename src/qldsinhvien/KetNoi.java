/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qldsinhvien;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Admin
 */
public class KetNoi {
    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://localhost:1433;databasename=QUANLYSV;"
                    + "username=sa;password=123";
            connection = DriverManager.getConnection(url);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return connection;
    }
    public static void closeConnection(Connection con){
        if(con != null){
            try {
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
}
    public static void main(String[] args) {
        System.out.println(getConnection());
    }
}
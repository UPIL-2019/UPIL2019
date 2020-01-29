/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.upil.koneksi;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Agung Nurhamidan
 */
public class Koneksi {
    private static Connection connection;
    public static Connection getConnection() {
        if (connection == null) {
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setURL("jdbc:mysql://localhost:3306/upil");
            dataSource.setUser("root");
            dataSource.setPassword("");
            try {
                connection = dataSource.getConnection();
            } catch(SQLException ex) {
                ex.printStackTrace();
            }
        }
        return connection;
    }
}

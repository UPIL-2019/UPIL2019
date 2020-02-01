/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.upil.koneksi;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Agung Nurhamidan
 */
public class Koneksi {
    private static Connection connection;
    public static Connection getConnection() {
        if (connection == null) {
            try {
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setURL("jdbc:mysql://localhost:3306/upil");
            dataSource.setUser("root");
            dataSource.setPassword("");
            connection = dataSource.getConnection();
            } catch(SQLException ex) {
                ex.printStackTrace();
                if (JOptionPane.showConfirmDialog(null, "Gagal terhubung ke database. Keluar dari Program?", "Kesalahan", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE) == JOptionPane.YES_OPTION) {
                    System.exit(0);
                } else {
                    getConnection();
                }
                
            }
        }
        return connection;
    }
}

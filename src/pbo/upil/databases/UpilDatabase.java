/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.upil.databases;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import pbo.upil.errors.KandidatException;
import pbo.upil.impls.KandidatDaoImpl;
import pbo.upil.services.KandidatDao;

/**
 *
 * @author Agung Nurhamidan
 */
public class UpilDatabase {
    private static Connection connection;
    private static KandidatDao kandidatDao;
    public static Connection getConnection() throws SQLException {
        if (connection == null) {
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setURL("jdbc:mysql://localhost:3306/upil");
            dataSource.setUser("root");
            dataSource.setPassword("");
            connection = dataSource.getConnection();
        }
        return connection;
    }
    
    public static KandidatDao getKandidatDao() throws SQLException {
        if (kandidatDao == null) {
            kandidatDao = new KandidatDaoImpl(getConnection());
        }
        return kandidatDao;
    }
}

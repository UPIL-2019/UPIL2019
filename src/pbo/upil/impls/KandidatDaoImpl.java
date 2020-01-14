/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.upil.impls;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import pbo.upil.entities.Kandidat;
import pbo.upil.errors.KandidatException;
import pbo.upil.services.KandidatDao;

/**
 *
 * @author Agung Nurhamidan
 */
public class KandidatDaoImpl implements KandidatDao {
    private final Connection connection;
    
    private final String insertKandidat = "INSERT INTO kandidat (nama) VALUES (?)";
    private final String updateKandidat = "UPDATE kandidat SET nama = ? WHERE no_kandidat = ?";
    private final String deleteKandidat = "DELETE FROM kandidat WHERE no_kandidat = ?";
    private final String getById = "SELECT * FROM kandidat WHERE no_kandidat = ?";
    private final String selectAll = "SELECT * FROM kandidat";

    public KandidatDaoImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insertKandidat(Kandidat kandidat) throws KandidatException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(insertKandidat);
            statement.setString(1, kandidat.getNama());
            statement.executeUpdate();
            connection.commit();
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            throw new KandidatException(e.getMessage());
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException e) {
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    
                }
            }
        }
    }

    @Override
    public void updateKandidat(Kandidat kandidat) throws KandidatException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(updateKandidat);
            statement.setString(1, kandidat.getNama());
            statement.setInt(2, kandidat.getNomorKandidat());
            statement.executeUpdate();
            connection.commit();
        } catch (SQLException e) {
            throw new KandidatException(e.getMessage());
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    
                }
            }
        }
    }

    @Override
    public void deleteKandidat(Integer nomorKandidat) throws KandidatException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(deleteKandidat);
            statement.setInt(1, nomorKandidat);
            statement.executeUpdate();
            connection.commit();
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            throw new KandidatException(e.getMessage());
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException e) {
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    
                }
            }
        }
    }

    @Override
    public Kandidat getKandidat(Integer nomorKandidat) throws KandidatException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(getById);
            statement.setInt(1, nomorKandidat);
            ResultSet result = statement.executeQuery();
            Kandidat kandidat = null;
            if (result.next()) {
                kandidat = new Kandidat();
                kandidat.setNomorKandidat(result.getInt("no_kandidat"));
                kandidat.setNama(result.getString("nama"));
            } else {
                throw new KandidatException("Kandidat dengan nomor " + nomorKandidat + " tidak ditemukan.");
            }
            connection.commit();
            return kandidat;
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            throw new KandidatException(e.getMessage());
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException e) {
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    
                }
            }
        }
    }

    @Override
    public List<Kandidat> selectAllKandidat() throws KandidatException {
        Statement statement = null;
        List<Kandidat> list = new ArrayList<>();
        try {
            connection.setAutoCommit(false);
            statement = connection.createStatement();
            ResultSet result = statement.executeQuery(selectAll);
            Kandidat kandidat = null;
            while (result.next()) {
                kandidat = new Kandidat();
                kandidat.setNomorKandidat(result.getInt("no_kandidat"));
                kandidat.setNama(result.getString("nama"));
                list.add(kandidat);
            }
            connection.commit();
            return list;
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            throw new KandidatException(e.getMessage());
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException e) {
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    
                }
            }
        }
    }
    
}

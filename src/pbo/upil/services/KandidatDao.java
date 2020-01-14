/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.upil.services;
import java.util.List;
import pbo.upil.entities.Kandidat;
import pbo.upil.errors.KandidatException;

/**
 *
 * @author Agung Nurhamidan
 */
public interface KandidatDao {
    public void insertKandidat(Kandidat kandidat) throws KandidatException;
    public void updateKandidat(Kandidat kandidat) throws KandidatException;
    public void deleteKandidat(Integer nomorKandidat) throws KandidatException;
    public Kandidat getKandidat(Integer nomorKandidat) throws KandidatException;
    public List<Kandidat> selectAllKandidat() throws KandidatException;
}

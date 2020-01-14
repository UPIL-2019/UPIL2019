/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.upil.models;

import java.sql.SQLException;
import pbo.upil.controllers.KandidatController;
import pbo.upil.databases.UpilDatabase;
import pbo.upil.entities.Kandidat;
import pbo.upil.errors.KandidatException;
import pbo.upil.events.KandidatListener;
import pbo.upil.services.KandidatDao;

/**
 *
 * @author nurhamidan
 */
public class KandidatModel {
    private int nomorKandidat;
    private String nama;
    private KandidatListener listener;

    public KandidatListener getListener() {
        return listener;
    }

    public void setListener(KandidatListener listener) {
        this.listener = listener;
    }

    public int getNomorKandidat() {
        return nomorKandidat;
    }

    public void setNomorKandidat(int nomorKandidat) {
        this.nomorKandidat = nomorKandidat;
        fireOnChange();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        fireOnChange();
    }
    
    protected void fireOnChange() {
        if (listener != null) {
            listener.onChange(this);
        }
    }
    
    protected void fireOnInsert(Kandidat kandidat) {
        if (listener != null) {
            listener.onInsert(kandidat);
        }
    }
    
    protected void fireOnUpdate(Kandidat kandidat) {
        if (listener != null) {
            listener.onUpdate(kandidat);
        }
    }
    
    protected void fireOnDelete() {
        if (listener != null) {
            listener.onDelete();
        }
    }
    
    public void insertKandidat() throws SQLException, KandidatException {
        KandidatDao dao = UpilDatabase.getKandidatDao();
        Kandidat kandidat = new Kandidat();
        kandidat.setNama(nama);
        dao.insertKandidat(kandidat);
        fireOnInsert(kandidat);
    }
    
    public void updateKandidat() throws SQLException, KandidatException {
        KandidatDao dao = UpilDatabase.getKandidatDao();
        Kandidat kandidat = new Kandidat();
        kandidat.setNomorKandidat(nomorKandidat);
        kandidat.setNama(nama);
        dao.updateKandidat(kandidat);
        fireOnUpdate(kandidat);
    }
    
    public void deleteKandidat() throws SQLException, KandidatException {
        KandidatDao dao = UpilDatabase.getKandidatDao();
        dao.deleteKandidat(nomorKandidat);
        fireOnDelete();
    }
    
    public void resetFormulirTambahKandidat() {
        setNomorKandidat(0);
        setNama("");
    }
}

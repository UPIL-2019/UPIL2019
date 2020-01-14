/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.upil.entities;

import java.util.Objects;

/**
 *
 * @author Agung Nurhamidan
 */
public class Kandidat {
    private Integer nomorKandidat;
    private String nama;

    public Kandidat() {
        
    }

    public Kandidat(String nama) {
        this.nama = nama;
    }

    public Integer getNomorKandidat() {
        return nomorKandidat;
    }

    public void setNomorKandidat(Integer nomorKandidat) {
        this.nomorKandidat = nomorKandidat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.nomorKandidat);
        hash = 79 * hash + Objects.hashCode(this.nama);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Kandidat other = (Kandidat) obj;
        if (!Objects.equals(this.nama, other.nama)) {
            return false;
        }
        if (!Objects.equals(this.nomorKandidat, other.nomorKandidat)) {
            return false;
        }
        return true;
    }
}

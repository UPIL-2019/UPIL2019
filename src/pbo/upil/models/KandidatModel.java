/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.upil.models;

import pbo.upil.controllers.KandidatController;

/**
 *
 * @author nurhamidan
 */
public class KandidatModel extends AbstractModel {
    private String nomorKandidat;
    private String namaKandidat;

    public KandidatModel(KandidatController kandidatController) {
        kandidatController.addModel(this);
    }

    public String getNomorKandidat() {
        return nomorKandidat;
    }

    public void setNomorKandidat(String nomorKandidat) {
        String oldNomorKandidat = this.nomorKandidat;
        this.nomorKandidat = nomorKandidat;
        firePropertyChange(KandidatController.ELEMENT_TEXT_PROPERTY, oldNomorKandidat, nomorKandidat);
    }

    public String getNamaKandidat() {
        return namaKandidat;
    }

    public void setNamaKandidat(String namaKandidat) {
        String oldNamaKandidat = this.namaKandidat;
        this.namaKandidat = namaKandidat;
        firePropertyChange(KandidatController.ELEMENT_TEXT_PROPERTY, oldNamaKandidat, namaKandidat);
    }
}

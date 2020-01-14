/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.upil.controllers;

import javax.swing.JOptionPane;
import pbo.upil.models.KandidatModel;
import pbo.upil.views.TambahKandidat;
import pbo.upil.views.TampilanAdmin;
import pbo.upil.views.UbahKandidat;


/**
 *
 * @author nurhamidan
 */
public class KandidatController {
    private KandidatModel model;

    public void setModel(KandidatModel model) {
        this.model = model;
    }
    
    public void resetFormulirTambahKandidat(TambahKandidat view) {
        model.resetFormulirTambahKandidat();
    }
    
    public void insertKandidat(TambahKandidat view) {
        String nama = view.getTxtNamaKandidat().getText();
        if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nama tidak boleh kosong.");
        } else if (nama.length() > 50) {
            JOptionPane.showMessageDialog(view, "Nama tidak boleh lebih dari 50 karakter.");
        } else {
            model.setNama(nama);
            try {
                model.insertKandidat();
                JOptionPane.showMessageDialog(view, "Kandidat berhasil ditambahkan");
                model.resetFormulirTambahKandidat();
            } catch (Throwable throwable) {
                JOptionPane.showMessageDialog(view, new Object[]{"Terjadi error di database dengan pesan ", throwable.getMessage()});
            }
        }
    }
    
    public void updateKandidat(TampilanAdmin tampilanAdmin, UbahKandidat ubahKandidat) {
        
        ////////////////////!!!!!!!!!!!!!!!!!!!GET DARI ROW!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        
        if (tampilanAdmin.getTableKandidat().getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(tampilanAdmin, "Silakan seleksi baris data yang akan diubah.");
            return;
        }
        Integer nomorKandidat = Integer.parseInt(ubahKandidat.getTxtNomorKandidat().getText());
        String nama = ubahKandidat.getTxtNamaKandidat().getText();
        if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(ubahKandidat, "Nama tidak boleh kosong.");
        } else if (nama.length() > 50) {
            JOptionPane.showMessageDialog(ubahKandidat, "Nama tidak boleh lebih dari 50 karakter.");
        } else {
            model.setNomorKandidat(nomorKandidat);
            model.setNama(nama);
            try {
                model.updateKandidat();
                JOptionPane.showMessageDialog(ubahKandidat, "Kandidat berhasil diubah");
                model.resetFormulirTambahKandidat();
            } catch (Throwable throwable) {
                JOptionPane.showMessageDialog(ubahKandidat, new Object[]{"Terjadi error di database dengan pesan ", throwable.getMessage()});
            }
        }
    }
    
    public void deleteKandidat(TampilanAdmin tampilanAdmin) {
        if (tampilanAdmin.getTableKandidat().getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(tampilanAdmin, "Silakan seleksi baris data yang akan dihapus");
            return;
        }
        if (JOptionPane.showConfirmDialog(tampilanAdmin, "Anda yakin akan menghapus ?")==JOptionPane.OK_OPTION) {
            Integer nomorKandidat = Integer.parseInt(tampilanAdmin.getName());
            model.setNomorKandidat(nomorKandidat);
            
            try {
                model.deleteKandidat();
                JOptionPane.showMessageDialog(tampilanAdmin, "Kandidat berhasil dihapus");
                model.resetFormulirTambahKandidat();
            } catch (Throwable throwable) {
                JOptionPane.showMessageDialog(tampilanAdmin, new Object[]{"Terjadi error di database dengan pesan ", throwable.getMessage()});
            }
        }
    }
}

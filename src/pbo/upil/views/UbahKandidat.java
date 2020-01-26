/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.upil.views;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import pbo.upil.controllers.KandidatController;
import pbo.upil.entities.Kandidat;
import pbo.upil.koneksi.Koneksi;
import pbo.upil.models.KandidatModel;

/**
 *
 * @author Agung Nurhamidan
 */
public class UbahKandidat extends javax.swing.JDialog {
    private static UbahKandidat ubahKandidat;
    private static java.awt.Frame parent;
    private static boolean modal;
//    KandidatController controller;
//    TampilanAdmin tampilanAdmin;
    /**
     * Creates new form DialogUbahKandidat
     * @param parent
     * @param modal
     */
    public UbahKandidat(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        UbahKandidat.parent = parent;
        UbahKandidat.modal = modal;
        initComponents();
//        this.tampilanAdmin = tampilanAdmin;
//        this.controller = tampilanAdmin.getController();
//        Kandidat model = tampilanAdmin.getTableModel().get(tampilanAdmin.getTableKandidat().getSelectedRow());
//        this.txtNomorKandidat.setText(model.getNomorKandidat().toString());
//        this.txtNamaKandidat.setText(model.getNama());
    }
    
    public static UbahKandidat getInstance(java.awt.Frame parent, boolean modal) {
        if ((ubahKandidat == null) || (UbahKandidat.parent != parent) || (UbahKandidat.modal != modal)) {
            ubahKandidat = new UbahKandidat(parent, modal);
        }
        return ubahKandidat;
    }

    public JTextField getTxtNamaKandidat() {
        return txtNamaKandidat;
    }

    public void setTxtNamaKandidat(JTextField txtNamaKandidat) {
        this.txtNamaKandidat = txtNamaKandidat;
    }

    public JTextField getTxtNomorKandidat() {
        return txtNomorKandidat;
    }

    public void setTxtNomorKandidat(JTextField txtNomorKandidat) {
        this.txtNomorKandidat = txtNomorKandidat;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtNomorKandidat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnMasuk = new javax.swing.JButton();
        btnMasuk2 = new javax.swing.JButton();
        txtNamaKandidat = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(250, 248, 240));

        jLabel1.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ubah Kandidat");

        jSeparator1.setForeground(new java.awt.Color(49, 173, 226));

        txtNomorKandidat.setEditable(false);
        txtNomorKandidat.setBackground(new java.awt.Color(250, 248, 240));
        txtNomorKandidat.setFont(new java.awt.Font("Montserrat SemiBold", 0, 10)); // NOI18N
        txtNomorKandidat.setForeground(new java.awt.Color(49, 173, 226));
        txtNomorKandidat.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtNomorKandidat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomorKandidatActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Montserrat SemiBold", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(6, 62, 97));
        jLabel5.setText("Nama Kandidat");

        jLabel3.setFont(new java.awt.Font("Montserrat SemiBold", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(6, 62, 97));
        jLabel3.setText("Nomor Kandidat");

        jSeparator2.setForeground(new java.awt.Color(49, 173, 226));

        btnMasuk.setBackground(new java.awt.Color(49, 173, 226));
        btnMasuk.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        btnMasuk.setForeground(new java.awt.Color(250, 248, 240));
        btnMasuk.setText("Ok");
        btnMasuk.setAlignmentY(1.0F);
        btnMasuk.setFocusable(false);
        btnMasuk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMasukMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMasukMouseExited(evt);
            }
        });
        btnMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasukActionPerformed(evt);
            }
        });

        btnMasuk2.setBackground(new java.awt.Color(49, 173, 226));
        btnMasuk2.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        btnMasuk2.setForeground(new java.awt.Color(250, 248, 240));
        btnMasuk2.setText("Batal");
        btnMasuk2.setAlignmentY(1.0F);
        btnMasuk2.setFocusable(false);
        btnMasuk2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMasuk2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMasuk2MouseExited(evt);
            }
        });
        btnMasuk2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasuk2ActionPerformed(evt);
            }
        });

        txtNamaKandidat.setBackground(new java.awt.Color(250, 248, 240));
        txtNamaKandidat.setFont(new java.awt.Font("Montserrat SemiBold", 0, 10)); // NOI18N
        txtNamaKandidat.setForeground(new java.awt.Color(49, 173, 226));
        txtNamaKandidat.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtNamaKandidat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaKandidatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNamaKandidat, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNomorKandidat)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 87, Short.MAX_VALUE)
                        .addComponent(btnMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMasuk2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomorKandidat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNamaKandidat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMasuk)
                    .addComponent(btnMasuk2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomorKandidatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomorKandidatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomorKandidatActionPerformed

    private void btnMasukMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMasukMouseEntered
        // TODO add your handling code here:
        btnMasuk.setBackground(new java.awt.Color(6,62,97));
    }//GEN-LAST:event_btnMasukMouseEntered

    private void btnMasukMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMasukMouseExited
        // TODO add your handling code here:
        btnMasuk.setBackground(new java.awt.Color(49,173,226));
    }//GEN-LAST:event_btnMasukMouseExited

    private void btnMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasukActionPerformed
        if (this.txtNamaKandidat.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Nama tidak boleh kosong.", "Kesalahan", JOptionPane.ERROR_MESSAGE);
        } else if (this.txtNamaKandidat.getText().length() > 50) {
            JOptionPane.showMessageDialog(this, "Nama tidak boleh lebih dari 50 karakter.", "Kesalahan", JOptionPane.ERROR_MESSAGE);
        } else {
            String sql = "UPDATE kandidat SET nama = ? WHERE no_kandidat = ?";
            //int nomorKandidat = (int) TampilanAdmin.getInstance().getTableKandidat().getValueAt(TampilanAdmin.getInstance().getTableKandidat().getSelectedRow(), 0);
            try {
                PreparedStatement ps = Koneksi.getConnection().prepareStatement(sql);
                //ps.setInt(1, Integer.parseInt(txtNomorKandidat.getText()));
                //ps.setString(2, txtNamaKandidat.getText());
                ps.setString(1, txtNamaKandidat.getText());
                ps.setInt(2, Integer.parseInt(txtNomorKandidat.getText()));
                ps.executeUpdate();
                ps.close();
                JOptionPane.showMessageDialog(this, "Berhasil mengubah.", "Berhasil", JOptionPane.INFORMATION_MESSAGE);
                this.setVisible(false);
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Gagal Mengubah", "Gagal", JOptionPane.ERROR_MESSAGE);
            }
            TampilanAdmin.getInstance().refreshTable();
        }        
    }//GEN-LAST:event_btnMasukActionPerformed

    private void btnMasuk2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMasuk2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMasuk2MouseEntered

    private void btnMasuk2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMasuk2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMasuk2MouseExited

    private void btnMasuk2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasuk2ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnMasuk2ActionPerformed

    private void txtNamaKandidatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaKandidatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaKandidatActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMasuk;
    private javax.swing.JButton btnMasuk2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtNamaKandidat;
    private javax.swing.JTextField txtNomorKandidat;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.upil.views;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import pbo.upil.koneksi.Koneksi;

/**
 *
 * @author Agung Nurhamidan
 */
public class LihatMisi extends javax.swing.JFrame {
    private static LihatMisi LihatMisi;
    private DefaultTableModel tableModel;
    private Integer nomorKandidat;
    private Integer idMisi;
    private int mouseX;
    private int mouseY;

   
    private LihatMisi() {
        initComponents();
    }
    
    public static LihatMisi getInstance() {
        if (LihatMisi == null) {
            LihatMisi = new LihatMisi();
        }
        return LihatMisi;
    }
    
    public void refreshTable() {
        String sql = "SELECT misi.id_misi, misi.teks_misi FROM kandidat, misi WHERE kandidat.no_kandidat = misi.no_kandidat AND kandidat.no_kandidat = ?";
        nomorKandidat = (Integer) TampilanAdmin.getInstance().getTableKandidat().getValueAt(TampilanAdmin.getInstance().getTableKandidat().getSelectedRow(), 0);
        tableModel = (DefaultTableModel) tableMisi.getModel();
        tableModel.setRowCount(0);
        try {
            PreparedStatement ps = Koneksi.getConnection().prepareStatement(sql);
            ps.setInt(1, nomorKandidat);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                tableModel.addRow(new Object[]{rs.getInt("misi.id_misi"), rs.getString("misi.teks_misi")});
            }
            ps.close();
            JOptionPane.showMessageDialog(this, "Refresh Berhasil", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal Refresh", "Gagal", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public Integer getNomorKandidat() {
        return nomorKandidat;
    }

    public JTable getTableMisi() {
        return tableMisi;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMisi = new javax.swing.JTable();
        btnHapus = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableMisi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID_Misi", "Misi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableMisi.getTableHeader().setReorderingAllowed(false);
        tableMisi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMisiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableMisi);
        if (tableMisi.getColumnModel().getColumnCount() > 0) {
            tableMisi.getColumnModel().getColumn(0).setMinWidth(0);
            tableMisi.getColumnModel().getColumn(0).setPreferredWidth(0);
            tableMisi.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 510, 230));

        btnHapus.setBackground(new java.awt.Color(255, 255, 255));
        btnHapus.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.setAlignmentY(1.0F);
        btnHapus.setFocusable(false);
        btnHapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHapusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHapusMouseExited(evt);
            }
        });
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        jPanel1.add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 130, 40));

        btnUbah.setBackground(new java.awt.Color(255, 255, 255));
        btnUbah.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        btnUbah.setText("Ubah");
        btnUbah.setAlignmentY(1.0F);
        btnUbah.setFocusable(false);
        btnUbah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUbahMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUbahMouseExited(evt);
            }
        });
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });
        jPanel1.add(btnUbah, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 120, 40));

        btnTambah.setBackground(new java.awt.Color(255, 255, 255));
        btnTambah.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        btnTambah.setText("Tambah");
        btnTambah.setAlignmentY(1.0F);
        btnTambah.setFocusable(false);
        btnTambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTambahMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTambahMouseExited(evt);
            }
        });
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        jPanel1.add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 120, 40));

        btnBatal.setBackground(new java.awt.Color(255, 255, 255));
        btnBatal.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        btnBatal.setText("Batal");
        btnBatal.setAlignmentY(1.0F);
        btnBatal.setFocusable(false);
        btnBatal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBatalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBatalMouseExited(evt);
            }
        });
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });
        jPanel1.add(btnBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 110, 40));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pbo/upil/media/Dialog.png"))); // NOI18N
        bg.setPreferredSize(new java.awt.Dimension(630, 600));
        bg.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bgMouseDragged(evt);
            }
        });
        bg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bgMousePressed(evt);
            }
        });
        jPanel1.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahMouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnTambahMouseEntered

    private void btnTambahMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahMouseExited
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btnTambahMouseExited

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        TambahMisi.getInstance(this, true).clearText();
        TambahMisi.getInstance(this, true).getTxtNomorKandidat().setText(nomorKandidat.toString());
        TambahMisi.getInstance(this, true).setVisible(true);
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnUbahMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUbahMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUbahMouseEntered

    private void btnUbahMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUbahMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUbahMouseExited

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        UbahMisi.getInstance(this, true).refreshTextAreaMisi();
        UbahMisi.getInstance(this, true).getTxtNomorKandidat().setText(nomorKandidat.toString());
        UbahMisi.getInstance(this, true).setVisible(true);
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHapusMouseEntered

    private void btnHapusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHapusMouseExited

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Apakah anda yakin?", "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            String sql = "DELETE FROM misi WHERE id_misi = ?";
            try {
                PreparedStatement ps = Koneksi.getConnection().prepareStatement(sql);
                ps.setString(1, tableMisi.getValueAt(tableMisi.getSelectedRow(), 0).toString());
                ps.executeUpdate();
                ps.close();
                tableModel.removeRow(tableMisi.getSelectedRow());
                JOptionPane.showMessageDialog(this, "Berhasil menghapus.", "Berhasil", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Gagal Menghapus", "Gagal", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void tableMisiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMisiMouseClicked
        if (tableMisi.getSelectedRow() < 0) {
            btnUbah.setEnabled(false);
            btnHapus.setEnabled(false);
        } else {
            btnUbah.setEnabled(true);
            btnHapus.setEnabled(true);
        }
    }//GEN-LAST:event_tableMisiMouseClicked

    private void btnBatalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBatalMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBatalMouseEntered

    private void btnBatalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBatalMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBatalMouseExited

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        this.setVisible(false);

    }//GEN-LAST:event_btnBatalActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if (tableMisi.getSelectedRow() < 0) {
            btnUbah.setEnabled(false);
            btnHapus.setEnabled(false);
        } else {
            btnUbah.setEnabled(true);
            btnHapus.setEnabled(true);
        }
    }//GEN-LAST:event_formWindowActivated

    private void bgMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMouseDragged
        int koordinatX = evt.getXOnScreen();
        int koordinatY = evt.getYOnScreen();
        this.setLocation(koordinatX - mouseX, koordinatY - mouseY);
    }//GEN-LAST:event_bgMouseDragged

    private void bgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_bgMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LihatMisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LihatMisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LihatMisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LihatMisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LihatMisi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableMisi;
    // End of variables declaration//GEN-END:variables
}

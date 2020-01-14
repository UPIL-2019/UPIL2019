package pbo.upil.views;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import pbo.upil.models.TableKandidatModel;

/**
 *
 * @author Achapasya2109
 */
public class TampilanAdmin extends javax.swing.JFrame {
    private TableKandidatModel tableModel;
    public TampilanAdmin() {
        tableModel = new TableKandidatModel();
        initComponents();
        tableKandidat.setModel(tableModel);
    }

    public JTable getTableKandidat() {
        return tableKandidat;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnKembali = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnHasil = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableKandidat = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnKembali.setBackground(new java.awt.Color(49, 173, 226));
        btnKembali.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        btnKembali.setForeground(new java.awt.Color(250, 248, 240));
        btnKembali.setText("KEMBALI");
        btnKembali.setAlignmentY(1.0F);
        btnKembali.setFocusable(false);
        btnKembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnKembaliMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnKembaliMouseExited(evt);
            }
        });
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });
        getContentPane().add(btnKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 530, 235, 40));

        btnUbah.setBackground(new java.awt.Color(49, 173, 226));
        btnUbah.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        btnUbah.setForeground(new java.awt.Color(250, 248, 240));
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
        getContentPane().add(btnUbah, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 140, 235, 40));

        btnTambah.setBackground(new java.awt.Color(49, 173, 226));
        btnTambah.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        btnTambah.setForeground(new java.awt.Color(250, 248, 240));
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
        getContentPane().add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 90, 235, 40));

        btnHapus.setBackground(new java.awt.Color(49, 173, 226));
        btnHapus.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        btnHapus.setForeground(new java.awt.Color(250, 248, 240));
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
        getContentPane().add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 190, 235, 40));

        btnHasil.setBackground(new java.awt.Color(49, 173, 226));
        btnHasil.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        btnHasil.setForeground(new java.awt.Color(250, 248, 240));
        btnHasil.setText("Hasil");
        btnHasil.setAlignmentY(1.0F);
        btnHasil.setFocusable(false);
        btnHasil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHasilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHasilMouseExited(evt);
            }
        });
        btnHasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHasilActionPerformed(evt);
            }
        });
        getContentPane().add(btnHasil, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 240, 235, 40));

        jLabel1.setFont(new java.awt.Font("Montserrat SemiBold", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DAFTAR KANDIDAT");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, -1));

        tableKandidat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {}
            },
            new String [] {

            }
        ));
        tableKandidat.setFocusable(false);
        tableKandidat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableKandidatMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tableKandidatMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(tableKandidat);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 740, 480));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pbo/upil/media/bg.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnKembaliMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKembaliMouseEntered
        // TODO add your handling code here:
        btnKembali.setBackground(new java.awt.Color(6,62,97));

    }//GEN-LAST:event_btnKembaliMouseEntered

    private void btnKembaliMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKembaliMouseExited
        // TODO add your handling code here:
        btnKembali.setBackground(new java.awt.Color(49,173,226));
    }//GEN-LAST:event_btnKembaliMouseExited

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        // TODO add your handling code here:
        TanyaPengguna tp = new TanyaPengguna();
        this.setVisible(false);
        tp.setVisible(true);

    }//GEN-LAST:event_btnKembaliActionPerformed

    private void btnUbahMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUbahMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUbahMouseEntered

    private void btnUbahMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUbahMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUbahMouseExited

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        UbahKandidat dialogUbahKandidat = new UbahKandidat(this, true);
        dialogUbahKandidat.getTxtNomorKandidat().setText(tableKandidat.getValueAt(tableKandidat.getSelectedRow(), 0).toString());
        dialogUbahKandidat.getTxtNamaKandidat().setText(tableKandidat.getValueAt(tableKandidat.getSelectedRow(), 1).toString());
        dialogUbahKandidat.setVisible(true);
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnTambahMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTambahMouseEntered

    private void btnTambahMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTambahMouseExited

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        TambahKandidat tambahKandidat = new TambahKandidat(this, true);
        tambahKandidat.setVisible(true);
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnHapusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHapusMouseEntered

    private void btnHapusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHapusMouseExited

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnHasilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHasilMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHasilMouseEntered

    private void btnHasilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHasilMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHasilMouseExited

    private void btnHasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHasilActionPerformed

    }//GEN-LAST:event_btnHasilActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if (tableKandidat.getSelectedRow() < 0) {
            btnUbah.setEnabled(false);
        }
    }//GEN-LAST:event_formWindowActivated

    private void tableKandidatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableKandidatMouseEntered
        if (tableKandidat.getSelectedRow() < 0) {
            btnUbah.setEnabled(false);
        } else {
            btnUbah.setEnabled(true);
        }
    }//GEN-LAST:event_tableKandidatMouseEntered

    private void tableKandidatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableKandidatMouseClicked
        if (tableKandidat.getSelectedRow() < 0) {
            btnUbah.setEnabled(false);
        } else {
            btnUbah.setEnabled(true);
        }
    }//GEN-LAST:event_tableKandidatMouseClicked

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
            java.util.logging.Logger.getLogger(TampilanAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TampilanAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TampilanAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TampilanAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TampilanAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnHasil;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableKandidat;
    // End of variables declaration//GEN-END:variables
}

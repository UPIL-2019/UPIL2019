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
import javax.swing.table.DefaultTableModel;
import pbo.upil.koneksi.Koneksi;

/**
 *
 * @author Agung Nurhamidan
 */
public class LihatVisiPengguna extends javax.swing.JFrame {
private static LihatVisiPengguna lihatVisiPengguna;
    private DefaultTableModel tableModel;
    private String nomorKandidat;
    private int mouseX;
    private int mouseY;
    /**
     * Creates new form LihatVisiPengguna
     */    

    private LihatVisiPengguna() {
        initComponents();
    }
    
    public static LihatVisiPengguna getInstance() {
        if (lihatVisiPengguna == null) {
            lihatVisiPengguna = new LihatVisiPengguna();
        }
        return lihatVisiPengguna;
    }
    
    public void refreshTable() {
        String sql = "SELECT teks_visi FROM visi WHERE no_kandidat = ?";
        nomorKandidat = (String) TampilanPemilihan.getInstance().getTableKandidat().getValueAt(TampilanPemilihan.getInstance().getTableKandidat().getSelectedRow(), 0);
        tableModel = (DefaultTableModel) tableVisiPengguna.getModel();
        tableModel.setRowCount(0);
        try {
            PreparedStatement ps = Koneksi.getConnection().prepareStatement(sql);
            ps.setString(1, nomorKandidat);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                tableModel.addRow(new Object[]{rs.getString("teks_visi")});
            }
            ps.close();
            JOptionPane.showMessageDialog(this, "Refresh Berhasil", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal Refresh", "Gagal", JOptionPane.ERROR_MESSAGE);
        }
    }

    public String getNomorKandidat() {
        return nomorKandidat;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnLihatMisi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableVisiPengguna = new javax.swing.JTable();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLihatMisi.setBackground(new java.awt.Color(49, 173, 226));
        btnLihatMisi.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        btnLihatMisi.setForeground(new java.awt.Color(250, 248, 240));
        btnLihatMisi.setText("Tutup");
        btnLihatMisi.setAlignmentY(1.0F);
        btnLihatMisi.setFocusable(false);
        btnLihatMisi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLihatMisiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLihatMisiMouseExited(evt);
            }
        });
        btnLihatMisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLihatMisiActionPerformed(evt);
            }
        });
        jPanel1.add(btnLihatMisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 510, -1));

        tableVisiPengguna.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Visi"
            }
        ));
        tableVisiPengguna.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableVisiPengguna);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 510, 240));

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

    private void btnLihatMisiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLihatMisiMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLihatMisiMouseEntered

    private void btnLihatMisiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLihatMisiMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLihatMisiMouseExited

    private void btnLihatMisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLihatMisiActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnLihatMisiActionPerformed

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
            java.util.logging.Logger.getLogger(LihatVisiPengguna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LihatVisiPengguna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LihatVisiPengguna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LihatVisiPengguna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LihatVisiPengguna().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnLihatMisi;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableVisiPengguna;
    // End of variables declaration//GEN-END:variables
}

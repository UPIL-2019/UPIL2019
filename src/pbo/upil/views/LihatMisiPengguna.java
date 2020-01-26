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
public class LihatMisiPengguna extends javax.swing.JFrame {
private static LihatMisiPengguna LihatMisiPengguna;
    private DefaultTableModel tableModel;
    private Integer nomorKandidat;

    /**
     * Creates new form LihatVisi
     */
    private LihatMisiPengguna() {
        initComponents();
    }
    
    public static LihatMisiPengguna getInstance() {
        if (LihatMisiPengguna == null) {
            LihatMisiPengguna = new LihatMisiPengguna();
        }
        return LihatMisiPengguna;
    }
    
    public void refreshTable() {
        String sql = "SELECT kandidat.no_kandidat, kandidat.nama, misi.teks_misi FROM kandidat, misi WHERE kandidat.no_kandidat = misi.no_kandidat AND kandidat.no_kandidat = ?";
        nomorKandidat = (Integer) TampilanPemilihan.getInstance().getTableKandidat().getValueAt(TampilanPemilihan.getInstance().getTableKandidat().getSelectedRow(), 0);
        tableModel = (DefaultTableModel) tableMisiPengguna.getModel();
        tableModel.setRowCount(0);
        try {
            PreparedStatement ps = Koneksi.getConnection().prepareStatement(sql);
            ps.setInt(1, nomorKandidat);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                tableModel.addRow(new Object[]{rs.getString("misi.teks_misi")});
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
        tableMisiPengguna = new javax.swing.JTable();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableMisiPengguna.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Misi"
            }
        ));
        jScrollPane1.setViewportView(tableMisiPengguna);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 510, 280));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pbo/upil/media/Dialog.png"))); // NOI18N
        bg.setPreferredSize(new java.awt.Dimension(630, 600));
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
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(LihatMisiPengguna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LihatMisiPengguna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LihatMisiPengguna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LihatMisiPengguna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LihatMisiPengguna().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableMisiPengguna;
    // End of variables declaration//GEN-END:variables
}
/*
 *  Nama : Tassyakur Pasya
 *  Kelas : IF01
 *  NIM : 10118009
 *  Deskripsi Program : 
 */
package pbo.upil.views;

import java.awt.Frame;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pbo.upil.koneksi.Koneksi;

/**
 *
 * @author Achapasya2109
 */
public class LihatHasil extends javax.swing.JFrame {
    private static LihatHasil lihatHasil;
    private int mouseX;
    private int mouseY;
    

    /**
     * Creates new form LihatHasil
     */
    private LihatHasil() {
        initComponents();
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(16);
        jScrollPane1.getHorizontalScrollBar().setUnitIncrement(16);
    }
    
    public static LihatHasil getInstance() {
        if (lihatHasil == null) {
            lihatHasil = new LihatHasil();
        }
        return lihatHasil;
    }
    
    public void refreshPnlKandidat() {
        String sql = "SELECT * FROM kandidat";
        try {
            PreparedStatement ps = Koneksi.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            String nomorKandidatTertinggi = "";
            String namaKandidatTertinggi = "";
            Integer jumlahSuaraTertinggi = 0;
            ArrayList<String> listKandidatTertinggi = new ArrayList<>();
            while (rs.next()) {
                KartuHasil kartuHasil = new KartuHasil();
                kartuHasil.getLblNomorKandidat().setText(rs.getString("no_kandidat"));
                kartuHasil.getLblNamaKandidat().setText(rs.getString("nama"));
                String sql2 = "SELECT * FROM pemilih WHERE no_kandidat = ?";
                try {
                    PreparedStatement ps2 = Koneksi.getConnection().prepareStatement(sql2);
                    ps2.setString(1, rs.getString("no_kandidat"));
                    ResultSet rs2 = ps2.executeQuery();
                    rs2.last();
                    kartuHasil.getLblJumlahSuara().setText(Integer.toString(rs2.getRow()).concat(" Suara"));
                    if ((rs2.getRow() >= jumlahSuaraTertinggi) && (rs2.getRow() > 0)) {
                        if (rs2.getRow() == jumlahSuaraTertinggi) {
                            if (listKandidatTertinggi.isEmpty()) {
                                listKandidatTertinggi.add(namaKandidatTertinggi);
                            }
                            listKandidatTertinggi.add(rs.getString("nama"));
                        }
                        nomorKandidatTertinggi = rs.getString("no_kandidat");
                        namaKandidatTertinggi = rs.getString("nama");
                        jumlahSuaraTertinggi = rs2.getRow();
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                pnlKandidat.add(kartuHasil);
            }
            if (!(nomorKandidatTertinggi.trim().equals(""))) {
                if (listKandidatTertinggi.isEmpty()) {
                    lblHasilSuara.setText("Kandidat yang mendapatkan hasil suara tertinggi adalah " + namaKandidatTertinggi + " dengan nomor " + nomorKandidatTertinggi + " dan jumlah suara " + jumlahSuaraTertinggi + ".");
                } else {
                    lblHasilSuara.setText("Ada " + listKandidatTertinggi.size() + " yang mendapatkan suara tertinggi yaitu ");
                    for (int i = 0; i < listKandidatTertinggi.size(); i++) {
                        lblHasilSuara.setText(lblHasilSuara.getText().concat(listKandidatTertinggi.get(i)));
                        if (i != listKandidatTertinggi.size() - 1) {
                            if (i == listKandidatTertinggi.size() - 2) {
                                lblHasilSuara.setText(lblHasilSuara.getText().concat(" dan "));
                            } else {
                                lblHasilSuara.setText(lblHasilSuara.getText().concat(", "));
                            }
                        } else if (i == listKandidatTertinggi.size() - 1) {
                            lblHasilSuara.setText(lblHasilSuara.getText().concat("."));
                        }
                    }
                }
            } else {
                lblHasilSuara.setText("Tidak ada suara tertinggi");
            }
            lblHasilSuara.setText("<html><p style=\"width: 455px; text-align: justify\">" + lblHasilSuara.getText() + "</p></html>");
            ps.close();
            JOptionPane.showMessageDialog(this, "Refresh Berhasil", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal Refresh", "Gagal", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContainer = new javax.swing.JPanel();
        pnlBack = new javax.swing.JPanel();
        lblBack = new javax.swing.JLabel();
        pnlMinimize = new javax.swing.JPanel();
        lblMinimize = new javax.swing.JLabel();
        pnlExit = new javax.swing.JPanel();
        lblExit = new javax.swing.JLabel();
        lblHasilSuara = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlKandidat = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnlContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBack.setBackground(new java.awt.Color(255, 255, 255));
        pnlBack.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBack.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        lblBack.setForeground(new java.awt.Color(153, 153, 153));
        lblBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBack.setText("<");
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBackMouseExited(evt);
            }
        });
        pnlBack.add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, -1));

        pnlContainer.add(pnlBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, -1, -1));

        pnlMinimize.setBackground(new java.awt.Color(255, 255, 255));
        pnlMinimize.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMinimize.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        lblMinimize.setForeground(new java.awt.Color(153, 153, 153));
        lblMinimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinimize.setText("_");
        lblMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseExited(evt);
            }
        });
        pnlMinimize.add(lblMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, -1));

        pnlContainer.add(pnlMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, -1, -1));

        pnlExit.setBackground(new java.awt.Color(255, 255, 255));
        pnlExit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblExit.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        lblExit.setForeground(new java.awt.Color(109, 109, 109));
        lblExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExit.setText("x");
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblExitMouseExited(evt);
            }
        });
        pnlExit.add(lblExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, -1));

        pnlContainer.add(pnlExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 0, -1, -1));

        lblHasilSuara.setForeground(new java.awt.Color(255, 255, 255));
        lblHasilSuara.setText("Suara Tertinggi adalah");
        pnlContainer.add(lblHasilSuara, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 530, 590, -1));

        jLabel1.setFont(new java.awt.Font("Montserrat SemiBold", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hasil Pemilihan");
        pnlContainer.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1060, -1));

        pnlKandidat.setLayout(new java.awt.GridLayout(0, 2, 50, 50));
        jScrollPane1.setViewportView(pnlKandidat);

        pnlContainer.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 590, 310));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pbo/upil/media/Frame.png"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(1060, 600));
        jLabel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel2MouseDragged(evt);
            }
        });
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        pnlContainer.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        this.setVisible(false);
        TampilanAdmin.getInstance().setVisible(true);
    }//GEN-LAST:event_lblBackMouseClicked

    private void lblBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseEntered
        pnlBack.setBackground(new java.awt.Color(153,153,153));
        lblBack.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_lblBackMouseEntered

    private void lblBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseExited
        pnlBack.setBackground(new java.awt.Color(255,255,255));
        lblBack.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_lblBackMouseExited

    private void lblMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_lblMinimizeMouseClicked

    private void lblMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseEntered
        pnlMinimize.setBackground(new java.awt.Color(153,153,153));
        lblMinimize.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_lblMinimizeMouseEntered

    private void lblMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseExited
        pnlMinimize.setBackground(new java.awt.Color(255,255,255));
        lblMinimize.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_lblMinimizeMouseExited

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblExitMouseClicked

    private void lblExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseEntered
        pnlExit.setBackground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_lblExitMouseEntered

    private void lblExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseExited
        pnlExit.setBackground(new java.awt.Color(255,255,255));
        lblExit.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_lblExitMouseExited

    private void jLabel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseDragged
        int koordinatX = evt.getXOnScreen();
        int koordinatY = evt.getYOnScreen();
        this.setLocation(koordinatX - mouseX, koordinatY - mouseY);
    }//GEN-LAST:event_jLabel2MouseDragged

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_jLabel2MousePressed

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
            java.util.logging.Logger.getLogger(LihatHasil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LihatHasil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LihatHasil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LihatHasil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LihatHasil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblHasilSuara;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JPanel pnlBack;
    private javax.swing.JPanel pnlContainer;
    private javax.swing.JPanel pnlExit;
    private javax.swing.JPanel pnlKandidat;
    private javax.swing.JPanel pnlMinimize;
    // End of variables declaration//GEN-END:variables
}

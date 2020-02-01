package pbo.upil.views;

import java.awt.Frame;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import pbo.upil.koneksi.Koneksi;

/**
 *
 * @author Achapasya2109
 */
public class AdminMasuk extends javax.swing.JFrame {
    private static AdminMasuk adminMasuk;
    private int mouseX;
    private int mouseY;
    /**
     * Creates new form Admin
     */
    private AdminMasuk() {
        initComponents();
   
    }
    
    public static AdminMasuk getInstance() {
        if (adminMasuk == null) {
            adminMasuk = new AdminMasuk();
        }
        return adminMasuk;
    }
    
    public void clearText() {
        txtUsername.setText("");
        txtPassword.setText("");
        txtUsername.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBack = new javax.swing.JPanel();
        lblBack = new javax.swing.JLabel();
        pnlMinimize = new javax.swing.JPanel();
        lblMinimize = new javax.swing.JLabel();
        pnlExit = new javax.swing.JPanel();
        lblExit = new javax.swing.JLabel();
        Nama_Pengguna = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        btnMasuk = new javax.swing.JButton();
        Kata_Sandi = new javax.swing.JLabel();
        lblDaftar = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(250, 248, 240));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        getContentPane().add(pnlBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, -1, -1));

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

        getContentPane().add(pnlMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, -1, -1));

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

        getContentPane().add(pnlExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 0, -1, -1));

        Nama_Pengguna.setFont(new java.awt.Font("Montserrat SemiBold", 0, 10)); // NOI18N
        Nama_Pengguna.setForeground(new java.awt.Color(6, 62, 97));
        Nama_Pengguna.setText("Nama Pengguna");
        getContentPane().add(Nama_Pengguna, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, -1, -1));

        txtUsername.setFont(new java.awt.Font("Montserrat SemiBold", 0, 10)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(49, 173, 226));
        txtUsername.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 230, 30));

        jSeparator1.setForeground(new java.awt.Color(49, 173, 226));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 230, 10));

        jLabel4.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(6, 62, 97));
        jLabel4.setText("Apakah anda tidak memilik akun?");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 180, 20));

        txtPassword.setFont(new java.awt.Font("Montserrat SemiBold", 0, 10)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(49, 173, 226));
        txtPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 230, 30));

        jSeparator2.setForeground(new java.awt.Color(49, 173, 226));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 230, 10));

        btnMasuk.setBackground(new java.awt.Color(49, 173, 226));
        btnMasuk.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        btnMasuk.setForeground(new java.awt.Color(250, 248, 240));
        btnMasuk.setText("Masuk");
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
        getContentPane().add(btnMasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 235, 40));

        Kata_Sandi.setFont(new java.awt.Font("Montserrat SemiBold", 0, 10)); // NOI18N
        Kata_Sandi.setForeground(new java.awt.Color(6, 62, 97));
        Kata_Sandi.setText("Kata Sandi");
        getContentPane().add(Kata_Sandi, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, -1, -1));

        lblDaftar.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        lblDaftar.setForeground(new java.awt.Color(49, 173, 226));
        lblDaftar.setText("Daftar");
        lblDaftar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDaftar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDaftarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDaftarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDaftarMouseExited(evt);
            }
        });
        getContentPane().add(lblDaftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, 40, 20));

        bg.setBackground(new java.awt.Color(49, 173, 226));
        bg.setForeground(new java.awt.Color(250, 248, 240));
        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pbo/upil/media/login v.2.png"))); // NOI18N
        bg.setFocusable(false);
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
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMasukMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMasukMouseEntered
        btnMasuk.setBackground(new java.awt.Color(6,62,97));
    }//GEN-LAST:event_btnMasukMouseEntered

    private void btnMasukMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMasukMouseExited
        btnMasuk.setBackground(new java.awt.Color(49,173,226));
    }//GEN-LAST:event_btnMasukMouseExited

    private void btnMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasukActionPerformed
        String sql = "SELECT * FROM admin WHERE username = ? AND password = ?";
        try {
            PreparedStatement ps = Koneksi.getConnection().prepareStatement(sql);
            ps.setString(1, txtUsername.getText());
            ps.setString(2, String.copyValueOf(txtPassword.getPassword()));
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Login Berhasil", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                this.setVisible(false);
                TampilanAdmin.getInstance().setVisible(true);
                TampilanAdmin.getInstance().refreshTable();
            } else {
                JOptionPane.showMessageDialog(this, "Login Gagal", "Gagal", JOptionPane.ERROR_MESSAGE);
            }
            ps.close();
        } catch (SQLException | NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "Kesalahan di database", "Kesalahan", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnMasukActionPerformed

    private void lblDaftarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDaftarMouseEntered
        lblDaftar.setText("<html><u>Daftar</u></html");
    }//GEN-LAST:event_lblDaftarMouseEntered

    private void lblDaftarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDaftarMouseExited
        lblDaftar.setText("<html>Daftar</html");
    }//GEN-LAST:event_lblDaftarMouseExited

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        btnMasukActionPerformed(evt);
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void lblDaftarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDaftarMouseClicked
        BuatAkun.getInstance().clearText();
        BuatAkun.getInstance().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblDaftarMouseClicked

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        btnMasukActionPerformed(evt);
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        this.setVisible(false);
        TanyaPengguna.getInstance().setVisible(true);
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
        jLabel4.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_lblMinimizeMouseEntered

    private void lblMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseExited
        pnlMinimize.setBackground(new java.awt.Color(255,255,255));
        jLabel4.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_lblMinimizeMouseExited

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblExitMouseClicked

    private void lblExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseEntered
        pnlExit.setBackground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_lblExitMouseEntered

    private void lblExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseExited
        pnlExit.setBackground(new java.awt.Color(255,255,255));
        jLabel4.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_lblExitMouseExited

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
            java.util.logging.Logger.getLogger(PemilihMasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PemilihMasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PemilihMasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PemilihMasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMasuk().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Kata_Sandi;
    private javax.swing.JLabel Nama_Pengguna;
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnMasuk;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblDaftar;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JPanel pnlBack;
    private javax.swing.JPanel pnlExit;
    private javax.swing.JPanel pnlMinimize;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}

package pbo.upil.views;

import java.awt.Frame;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import pbo.upil.koneksi.Koneksi;

/**
 *
 * @author Achapasya2109
 */
public class TampilanPemilihan extends javax.swing.JFrame {
    private static TampilanPemilihan tampilanPemilihan;
    private DefaultTableModel tableModel;
    private String nim;
    private int mouseX;
    private int mouseY;
    /**
     * Creates new form TampilanPemilih
     */
    private TampilanPemilihan() {
        initComponents();
    }
    
    public static TampilanPemilihan getInstance() {
        if (tampilanPemilihan == null) {
            tampilanPemilihan = new TampilanPemilihan();
        }
        return tampilanPemilihan;
    }
    
    public void refreshTable() {
        String sql = "SELECT * FROM kandidat";
        tableModel = (DefaultTableModel) tableKandidat.getModel();
        tableModel.setRowCount(0);
        try {
            Statement st = Koneksi.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                tableModel.addRow(new Object[]{rs.getString("no_kandidat"), rs.getString("nama")});
            }
            st.close();
            JOptionPane.showMessageDialog(this, "Refresh Berhasil", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal Menyimpan", "Gagal", JOptionPane.ERROR_MESSAGE);
        }
    }

    public JTable getTableKandidat() {
        return tableKandidat;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupKandidat = new javax.swing.ButtonGroup();
        pnlContainer = new javax.swing.JPanel();
        pnlBack = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_pilih = new javax.swing.JButton();
        pnlExit = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pnlMinimize = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableKandidat = new javax.swing.JTable();
        btnLihatVisi = new javax.swing.JButton();
        btnLihatMisi = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(530, 300));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        pnlContainer.setBackground(new java.awt.Color(250, 248, 240));
        pnlContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBack.setBackground(new java.awt.Color(250, 248, 240));
        pnlBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlBackMouseClicked(evt);
            }
        });
        pnlBack.setLayout(new java.awt.GridBagLayout());

        jLabel7.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("<");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });
        pnlBack.add(jLabel7, new java.awt.GridBagConstraints());

        pnlContainer.add(pnlBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 30, 30));

        jLabel1.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pemilihan Kandidat");
        pnlContainer.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 530, 20));

        btn_pilih.setBackground(new java.awt.Color(255, 255, 255));
        btn_pilih.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btn_pilih.setText("PILIH");
        btn_pilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pilihActionPerformed(evt);
            }
        });
        pnlContainer.add(btn_pilih, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 470, 30));

        pnlExit.setBackground(new java.awt.Color(250, 248, 240));
        pnlExit.setPreferredSize(new java.awt.Dimension(20, 20));
        pnlExit.setLayout(new java.awt.GridBagLayout());

        jLabel4.setBackground(new java.awt.Color(255, 102, 102));
        jLabel4.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(109, 109, 109));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("x");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        pnlExit.add(jLabel4, new java.awt.GridBagConstraints());

        pnlContainer.add(pnlExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 30, 30));

        pnlMinimize.setBackground(new java.awt.Color(250, 248, 240));
        pnlMinimize.setLayout(new java.awt.GridBagLayout());

        jLabel6.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("_");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        pnlMinimize.add(jLabel6, new java.awt.GridBagConstraints());

        pnlContainer.add(pnlMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 30, 30));

        tableKandidat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "No Kandidat", "Nama"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableKandidat.getTableHeader().setReorderingAllowed(false);
        tableKandidat.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                tableKandidatAncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tableKandidat.addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
                tableKandidatAncestorMoved1(evt);
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
            }
        });
        tableKandidat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableKandidatMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tableKandidatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tableKandidatMouseExited(evt);
            }
        });
        tableKandidat.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tableKandidatPropertyChange(evt);
            }
        });
        tableKandidat.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                tableKandidatVetoableChange(evt);
            }
        });
        jScrollPane2.setViewportView(tableKandidat);
        if (tableKandidat.getColumnModel().getColumnCount() > 0) {
            tableKandidat.getColumnModel().getColumn(1).setResizable(false);
        }

        pnlContainer.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 470, 130));

        btnLihatVisi.setBackground(new java.awt.Color(49, 173, 226));
        btnLihatVisi.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        btnLihatVisi.setForeground(new java.awt.Color(250, 248, 240));
        btnLihatVisi.setText("Lihat Visi");
        btnLihatVisi.setAlignmentY(1.0F);
        btnLihatVisi.setFocusable(false);
        btnLihatVisi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLihatVisiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLihatVisiMouseExited(evt);
            }
        });
        btnLihatVisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLihatVisiActionPerformed(evt);
            }
        });
        pnlContainer.add(btnLihatVisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 130, -1));

        btnLihatMisi.setBackground(new java.awt.Color(49, 173, 226));
        btnLihatMisi.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        btnLihatMisi.setForeground(new java.awt.Color(250, 248, 240));
        btnLihatMisi.setText("Lihat Misi");
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
        pnlContainer.add(btnLihatMisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 130, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pbo/upil/media/Dialog.png"))); // NOI18N
        jLabel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel3MouseDragged(evt);
            }
        });
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        pnlContainer.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_pilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pilihActionPerformed
        String sql = "UPDATE pemilih SET no_kandidat = ? WHERE nim = ?";
        try {
            PreparedStatement ps = Koneksi.getConnection().prepareStatement(sql);
            ps.setString(1, (String) tableKandidat.getValueAt(tableKandidat.getSelectedRow(), 0));
            ps.setString(2, nim);
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(this, "Berhasil memilih.", "Berhasil", JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
            PemilihMasuk.getInstance().clearText();
            PemilihMasuk.getInstance().setVisible(true);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal memilih", "Gagal", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_pilihActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        pnlExit.setBackground(new java.awt.Color(153,153,153));
        jLabel1.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        pnlExit.setBackground(new java.awt.Color(250,248,240));
        jLabel1.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        pnlMinimize.setBackground(new java.awt.Color(153,153,153));
        jLabel4.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        pnlMinimize.setBackground(new java.awt.Color(250,248,240));
        jLabel4.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        pnlBack.setBackground(new java.awt.Color(153,153,153));
        jLabel7.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        pnlBack.setBackground(new java.awt.Color(250,248,240));
        jLabel7.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_jLabel7MouseExited

    private void tableKandidatPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tableKandidatPropertyChange
        //System.out.println("tes");
    }//GEN-LAST:event_tableKandidatPropertyChange

    private void tableKandidatAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tableKandidatAncestorMoved

    }//GEN-LAST:event_tableKandidatAncestorMoved

    private void tableKandidatVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_tableKandidatVetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tableKandidatVetoableChange

    private void tableKandidatAncestorMoved1(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_tableKandidatAncestorMoved1
        //System.out.println("tes");        // TODO add your handling code here:
    }//GEN-LAST:event_tableKandidatAncestorMoved1

    private void tableKandidatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableKandidatMouseClicked
        if (tableKandidat.getSelectedRow() < 0) {
            btnLihatVisi.setEnabled(false);
            btnLihatMisi.setEnabled(false);
        } else {
            btnLihatVisi.setEnabled(true);
            btnLihatMisi.setEnabled(true);
        }
    }//GEN-LAST:event_tableKandidatMouseClicked

    private void btnLihatVisiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLihatVisiMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLihatVisiMouseEntered

    private void btnLihatVisiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLihatVisiMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLihatVisiMouseExited

    private void btnLihatVisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLihatVisiActionPerformed
        LihatVisiPengguna.getInstance().refreshTable();
        LihatVisiPengguna.getInstance().setVisible(true);
    }//GEN-LAST:event_btnLihatVisiActionPerformed

    private void btnLihatMisiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLihatMisiMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLihatMisiMouseEntered

    private void btnLihatMisiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLihatMisiMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLihatMisiMouseExited

    private void btnLihatMisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLihatMisiActionPerformed
        LihatMisiPengguna.getInstance().refreshTable();
        LihatMisiPengguna.getInstance().setVisible(true);
    }//GEN-LAST:event_btnLihatMisiActionPerformed

    private void pnlBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBackMouseClicked
        this.setVisible(false);
        PemilihMasuk.getInstance().setVisible(true);
    }//GEN-LAST:event_pnlBackMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if (tableKandidat.getSelectedRow() < 0) {
            btnLihatVisi.setEnabled(false);
            btnLihatMisi.setEnabled(false);
        } else {
            btnLihatVisi.setEnabled(true);
            btnLihatMisi.setEnabled(true);
        }
    }//GEN-LAST:event_formWindowActivated

    private void tableKandidatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableKandidatMouseEntered
        if (tableKandidat.getSelectedRow() < 0) {
            btnLihatVisi.setEnabled(false);
            btnLihatMisi.setEnabled(false);
        } else {
            btnLihatVisi.setEnabled(true);
            btnLihatMisi.setEnabled(true);
        }
    }//GEN-LAST:event_tableKandidatMouseEntered

    private void tableKandidatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableKandidatMouseExited
        if (tableKandidat.getSelectedRow() < 0) {
            btnLihatVisi.setEnabled(false);
            btnLihatMisi.setEnabled(false);
        } else {
            btnLihatVisi.setEnabled(true);
            btnLihatMisi.setEnabled(true);
        }
    }//GEN-LAST:event_tableKandidatMouseExited

    private void jLabel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseDragged
        int koordinatX = evt.getXOnScreen();
        int koordinatY = evt.getYOnScreen();
        this.setLocation(koordinatX - mouseX, koordinatY - mouseY);
    }//GEN-LAST:event_jLabel3MouseDragged

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_jLabel3MousePressed
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
                new TampilanPemilihan().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLihatMisi;
    private javax.swing.JButton btnLihatVisi;
    private javax.swing.JButton btn_pilih;
    private javax.swing.ButtonGroup buttonGroupKandidat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnlBack;
    private javax.swing.JPanel pnlContainer;
    private javax.swing.JPanel pnlExit;
    private javax.swing.JPanel pnlMinimize;
    private javax.swing.JTable tableKandidat;
    // End of variables declaration//GEN-END:variables
}

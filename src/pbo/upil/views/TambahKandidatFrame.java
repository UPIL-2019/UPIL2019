/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.upil.views;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author nurhamidan
 */
public class TambahKandidatFrame extends JFrame {

    public TambahKandidatFrame(TambahKandidatPanel tambahKandidatPanel) {
        setTitle("Display (View 1)");
        getContentPane().add(tambahKandidatPanel, BorderLayout.CENTER);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.upil.views;

import java.beans.PropertyChangeEvent;
import javax.swing.JPanel;

/**
 *
 * @author nurhamidan
 */
public abstract class AbstractView extends JPanel {
    public abstract void modelPropertyChange(PropertyChangeEvent evt);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.upil.controllers;


/**
 *
 * @author nurhamidan
 */
public class KandidatController extends AbstractController {
    public static final String ELEMENT_TEXT_PROPERTY = "NomorKandidat";
    
    public void reset() {
        setModelProperty(ELEMENT_TEXT_PROPERTY, "");
    }
}

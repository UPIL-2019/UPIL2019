/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.upil.errors;

/**
 *
 * @author Agung Nurhamidan
 */
public class KandidatException extends Exception {

    /**
     * Creates a new instance of <code>KandidatException</code> without detail
     * message.
     */
    public KandidatException() {
    }

    /**
     * Constructs an instance of <code>KandidatException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public KandidatException(String msg) {
        super(msg);
    }
}

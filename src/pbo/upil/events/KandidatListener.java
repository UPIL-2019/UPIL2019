/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.upil.events;

import pbo.upil.entities.Kandidat;
import pbo.upil.models.KandidatModel;

/**
 *
 * @author Agung Nurhamidan
 */
public interface KandidatListener {
    public void onChange(KandidatModel model);
    public void onInsert(Kandidat kandidat);
    public void onDelete();
    public void onUpdate(Kandidat kandidat);
}

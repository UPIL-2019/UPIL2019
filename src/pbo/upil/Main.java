package pbo.upil;

import pbo.upil.controllers.KandidatController;
import pbo.upil.models.KandidatModel;
import pbo.upil.views.TambahKandidatFrame;
import pbo.upil.views.TambahKandidatPanel;
import pbo.upil.views.TambahKandidatView;
import pbo.upil.views.TampilanAdmin;
import pbo.upil.views.TanyaPengguna;

/**
 *
 * @author UPIL-Team
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //KandidatController kandidatController = new KandidatController();
        //KandidatModel kandidatModel = new KandidatModel(kandidatController);
        //TambahKandidatPanel tambahKandidatPanel = new TambahKandidatPanel(kandidatController);
        //TambahKandidatView tambahKandidatView = new TambahKandidatView(new javax.swing.JFrame(), true, tambahKandidatPanel);
        //kandidatController.addModel(kandidatModel);
        //tambahKandidatView.setVisible(true);
        TanyaPengguna tp = new TanyaPengguna();
        tp.setVisible(true);
    }
    
}

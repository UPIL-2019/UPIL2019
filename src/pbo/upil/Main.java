package pbo.upil;

import java.sql.SQLException;
import java.util.List;
import pbo.upil.controllers.KandidatController;
import pbo.upil.databases.UpilDatabase;
import pbo.upil.models.KandidatModel;
import pbo.upil.services.KandidatDao;
import pbo.upil.views.TampilanAdmin;
import pbo.upil.views.TanyaPengguna;
import pbo.upil.entities.Kandidat;
import pbo.upil.errors.KandidatException;

/**
 *
 * @author UPIL-Team
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, KandidatException {
        //KandidatController kandidatController = new KandidatController();
        //KandidatModel kandidatModel = new KandidatModel(kandidatController);
        //TambahKandidatPanel tambahKandidatPanel = new TambahKandidatPanel(kandidatController);
        //TambahKandidatView tambahKandidatView = new TambahKandidatView(new javax.swing.JFrame(), true, tambahKandidatPanel);
        //kandidatController.addModel(kandidatModel);
        //tambahKandidatView.setVisible(true);
        //TanyaPengguna tp = new TanyaPengguna();
        //tp.setVisible(true);
        //KandidatDao dao = UpilDatabase.getKandidatDao();
        //dao.deleteKandidat(3);
        TampilanAdmin ta = new TampilanAdmin();
        ta.setVisible(true);
    }
    
}

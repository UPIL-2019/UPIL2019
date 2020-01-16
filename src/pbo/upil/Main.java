package pbo.upil;

import java.sql.SQLException;
import java.util.List;
import javax.swing.SwingUtilities;
import pbo.upil.controllers.KandidatController;
import pbo.upil.databases.UpilDatabase;
import pbo.upil.models.KandidatModel;
import pbo.upil.services.KandidatDao;
import pbo.upil.views.TampilanAdmin;
import pbo.upil.views.TanyaPengguna;
import pbo.upil.entities.Kandidat;
import pbo.upil.errors.KandidatException;
import pbo.upil.views.TampilanPemilihan;

/**
 *
 * @author UPIL-Team
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, KandidatException {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    TampilanAdmin admin = new TampilanAdmin();
                    admin.loadDatabase();
                    admin.setVisible(true);
                } catch (Exception e) {
                }
            }
        });
    }
    
}

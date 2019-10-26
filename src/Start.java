
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/*
 * Detta är sidan som agerar som startsida. Programmet körs igång från
 *  denna sida som i sin tur genast öppnar loginformuläret (LoginWindow).
 *
 * @author Elinore Hagman
 */
public class Start {

    private static InfDB idb;

    public static void main(String[] args) {

        try {
            
// Om inte databasens tabeller automatiskt kommer med skapa en ny connection genom jaybird 2.2.5 som finns i detta projekts db-mapp
// och anslut sedan genom JDBC URLen -> jdbc:firebirdsql:localhost/3050:/Project_Hogwarts/db/HOGDB.FDB

            idb = new InfDB("/Project_Hogwarts/db/HOGDB.FDB");

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande:" + e.getMessage());
        }

        new LoginWindow(idb).setVisible(true);

    }
}

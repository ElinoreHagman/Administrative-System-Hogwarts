
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.jdesktop.swingx.JXDatePicker;

/*
 * Detta är valideringsklassen som innehåller ett antal metoder för att kolla
 * vad för inputvärde de olika redigerbara textfälten i systemet har.
 *
 * @author Elinore Hagman
 */
public class Validering {

    // De första tre nedanstående metoder kollar om fältet/fältena som läggs in som parameter har värdet null.
    public static boolean KollaTomtFalt(JTextField faltAttKolla) {
        boolean resultat = true;
        if (faltAttKolla.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Fyll i alla fält!");
            resultat = false;
        }
        return resultat;
    }

    public static boolean Kolla2TommaFalt(JTextField faltAttKolla, JTextField faltAttKolla2) {

        boolean resultat = true;
        if (faltAttKolla.getText().isEmpty() || faltAttKolla2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Fyll i alla fält!");
            resultat = false;
        }
        return resultat;
    }

    public static boolean Kolla3TommaFalt(JTextField faltAttKolla, JTextField faltAttKolla2, JTextField faltAttKolla3) {
        boolean resultat = true;
        if (faltAttKolla.getText().isEmpty() || faltAttKolla2.getText().isEmpty() || faltAttKolla3.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Fyll i alla fält!");
            resultat = false;
        }
        return resultat;
    }

    // Denna metod kollar om fältet som lagts in som parameter består av siffror eller inte.
    public static boolean KollaFaltEfterSiffror(JTextField faltAttKolla) {

        boolean resultat = true;
        if (!faltAttKolla.getText().matches("\\-?[0-9]+")) {
            JOptionPane.showMessageDialog(null, "Kolla om du använder siffror på rätt ställen!");
            resultat = false;
        }
        return resultat;
    }

    // Denna metod kollar om datumen som lagts in som parametrar är tomma på innehåll.
    public static boolean KollaTommaDatum(JXDatePicker datum1, JXDatePicker datum2) {

        boolean resultat = true;
        if (datum1.getDate() == null || datum2.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Fyll i datum!");
            resultat = false;
        }
        return resultat;
    }

    // Denna metod kollar om förnamn och efternamn som skrivs in i registrering av elev/lärare endast har ett förnamn och efternamn.
    public static boolean KollaOmEndastEttNamn(JTextField faltAttKolla1, JTextField faltAttKolla2) {

        boolean resultat = true;
        String input = faltAttKolla1.getText();
        String[] allaNamn = input.split(" ");
        int storlek = allaNamn.length;
        String input2 = faltAttKolla2.getText();
        String[] allaNamn2 = input2.split(" ");
        int storlek2 = allaNamn2.length;

        if (storlek > 1 || storlek2 > 1) {
            JOptionPane.showMessageDialog(null, "Bara ett förnamn och ett efternamn!");
            resultat = false;
        }
        return resultat;
    }

    // Denna metod kollar om inputvärdet består av ett namn eller flera.
    public static boolean KollaOmEttNamn(JTextField faltAttKolla1) {

        boolean resultat = true;
        String input = faltAttKolla1.getText();
        String[] allaNamn = input.split(" ");
        int storlek = allaNamn.length;

        if (storlek < 2) {
            JOptionPane.showMessageDialog(null, "Kom ihåg både förnamn och efternamn!");
            resultat = false;
        }
        return resultat;
    }

    // Denna metod kollar om en ArrayList har något innehåll eller är tom
    public static boolean KollaOmInnehallFinns(ArrayList<String> listaAttKolla) {

        boolean resultat = true;
        if (listaAttKolla == null) {
            resultat = false;
        }
        return resultat;
    }

    // Denna metod kollar om en variabel är tom eller inte.
    public static boolean KollaOmPersonFinns(String faltAttKolla) {

        boolean resultat = true;
        if (faltAttKolla == null) {
            JOptionPane.showMessageDialog(null, "Finns ingen registrerad på dessa uppgifter!");
            resultat = false;
        }
        return resultat;
    }

}

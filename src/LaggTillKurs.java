
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/*
 * Denna sida öppnas när en admin vill registrera en ny kurs. Här registrar användaren
 * kurser genom att fylla i all information och klicka på registrera-knappen.
 *
 * @author Elinore Hagman
 */
public class LaggTillKurs extends javax.swing.JFrame {

    private InfDB idb;

    // Creates new form LaggTillKurs
    public LaggTillKurs(InfDB idb) {
        initComponents();
        this.idb = idb;

        // Dessa metoder anropas när sidan öppnas och fyller dropdown-menyerna med innehåll.
        fyllAmneCombobox();
        fyllLararCombobox();

        // När sidan öppnas formateras datumväljarna så de matchar formatet i databasen.
        dateKursstart.setFormats("yyyy-MM-dd");
        dateKursslut.setFormats("yyyy-MM-dd");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTitel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lbKursstart = new javax.swing.JLabel();
        lbKursslut = new javax.swing.JLabel();
        btnRegistrera = new javax.swing.JButton();
        lbKurslarare = new javax.swing.JLabel();
        lbKursnamn = new javax.swing.JLabel();
        btnTillbaka = new javax.swing.JLabel();
        lbAmne = new javax.swing.JLabel();
        cbAmne = new javax.swing.JComboBox<>();
        txtKursnamn = new javax.swing.JTextField();
        dateKursstart = new org.jdesktop.swingx.JXDatePicker();
        dateKursslut = new org.jdesktop.swingx.JXDatePicker();
        cbLarare = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelTitel.setBackground(new java.awt.Color(204, 204, 204));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Registrera en ny kurs");

        javax.swing.GroupLayout panelTitelLayout = new javax.swing.GroupLayout(panelTitel);
        panelTitel.setLayout(panelTitelLayout);
        panelTitelLayout.setHorizontalGroup(
            panelTitelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelTitelLayout.setVerticalGroup(
            panelTitelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel4)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        lbKursstart.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lbKursstart.setText("Kursstart:");

        lbKursslut.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lbKursslut.setText("Kursslut:");

        btnRegistrera.setText("Registrera");
        btnRegistrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistreraActionPerformed(evt);
            }
        });

        lbKurslarare.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lbKurslarare.setText("Kurslärare:");

        lbKursnamn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lbKursnamn.setText("Kursnamn:");

        btnTillbaka.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/icons8-go-back-24.png"))); // NOI18N
        btnTillbaka.setText("Gå tillbaka");
        btnTillbaka.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTillbakaMouseClicked(evt);
            }
        });

        lbAmne.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lbAmne.setText("Ämne:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnTillbaka))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbKursstart)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dateKursstart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(lbKursslut)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnRegistrera)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(dateKursslut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbKursnamn)
                                .addGap(12, 12, 12)
                                .addComponent(txtKursnamn, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbKurslarare)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbLarare, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(lbAmne)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbAmne, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelTitel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbKursnamn)
                    .addComponent(txtKursnamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAmne)
                    .addComponent(cbAmne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbKurslarare)
                    .addComponent(cbLarare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbKursstart)
                    .addComponent(dateKursstart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbKursslut)
                    .addComponent(dateKursslut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnRegistrera)
                .addGap(18, 18, 18)
                .addComponent(btnTillbaka)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraActionPerformed
    // Registrerar en ny kurs med all relevant information användaren skrivit in.

        // Dessa ser till att textfältet och datumen inte lämnas tomma vid registrering.
        if (Validering.KollaTomtFalt(txtKursnamn)) {
            if (Validering.KollaTommaDatum(dateKursstart, dateKursslut)) {

                String kursNamn = txtKursnamn.getText();
                String kursAmne = cbAmne.getSelectedItem().toString();
                String kursLarare = cbLarare.getSelectedItem().toString();

                // Skapar en Array med lärarnamnet med två substringar (förnamn och efternamn).
                String[] fornamnefternamn = kursLarare.split(" ");

                // Formaterar datumen från dataypen date till String så de kan läggas in i databasen.
                SimpleDateFormat kursFormatering = new SimpleDateFormat("yyyy-MM-dd");
                String kursstartF = kursFormatering.format(dateKursstart.getDate());
                String kursslutF = kursFormatering.format(dateKursslut.getDate());

                try {
                    String nyttid = idb.getAutoIncrement("kurs", "kurs_id");
                    String amneId = idb.fetchSingle("SELECT AMNE_ID FROM AMNE WHERE AMNESNAMN = '" + kursAmne + "'");
                    String lararId = idb.fetchSingle("SELECT LARAR_ID FROM LARARE WHERE FORNAMN='" + fornamnefternamn[0] + "' and EFTERNAMN='" + fornamnefternamn[1] + "'");

                    idb.insert("INSERT INTO KURS VALUES (" + nyttid + ", '" + kursNamn + "', '" + kursstartF + "', '" + kursslutF + "'," + lararId + "," + amneId + ")");
                    JOptionPane.showMessageDialog(null, "Ny kurs har registrerats!");

                    txtKursnamn.setText(null);
                    dateKursstart.setDate(null);
                    dateKursslut.setDate(null);

                } catch (InfException e) {
                    JOptionPane.showMessageDialog(null, "Nåt gick fel!");
                    System.out.println("Internt felmeddelande:" + e.getMessage());
                }
            }
        }
    }//GEN-LAST:event_btnRegistreraActionPerformed

    private void btnTillbakaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTillbakaMouseClicked
    // Metoden stänger denna sida.
        setVisible(false);
    }//GEN-LAST:event_btnTillbakaMouseClicked

    private void fyllAmneCombobox() {
    // Denna metod fyller ut dropdown-menyn med de ämnen som finns.

        try {
            ArrayList<HashMap<String, String>> amneLista = idb.fetchRows("SELECT AMNESNAMN FROM AMNE");

            // For-loopen går igenom varje namn som finns i kolumnen AMNESNAMN och lägger till den i dropdown-menyn
            for (int i = 0; i < amneLista.size(); i++) {
                cbAmne.addItem(amneLista.get(i).get("AMNESNAMN"));
            }

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande:" + e.getMessage());
        }
    }

    private void fyllLararCombobox() {
    // Denna metod fyller ut dropdown-menyn med de lärare som finns.

        try {
            ArrayList<HashMap<String, String>> fornamnLista = idb.fetchRows("SELECT FORNAMN FROM LARARE");
            ArrayList<HashMap<String, String>> efternamnLista = idb.fetchRows("SELECT EFTERNAMN FROM LARARE");

            for (int i = 0; i < efternamnLista.size(); i++) {
                
                // Skapar en variabel där både förnamnet och efternamnet lagras och läggs sedan in i dropdown-menyn.
                String larareNamn = fornamnLista.get(i).get("FORNAMN") + " " + efternamnLista.get(i).get("EFTERNAMN");
                cbLarare.addItem(larareNamn);
            }

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande:" + e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrera;
    private javax.swing.JLabel btnTillbaka;
    private javax.swing.JComboBox<String> cbAmne;
    private javax.swing.JComboBox<String> cbLarare;
    private org.jdesktop.swingx.JXDatePicker dateKursslut;
    private org.jdesktop.swingx.JXDatePicker dateKursstart;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbAmne;
    private javax.swing.JLabel lbKurslarare;
    private javax.swing.JLabel lbKursnamn;
    private javax.swing.JLabel lbKursslut;
    private javax.swing.JLabel lbKursstart;
    private javax.swing.JPanel panelTitel;
    private javax.swing.JTextField txtKursnamn;
    // End of variables declaration//GEN-END:variables
}
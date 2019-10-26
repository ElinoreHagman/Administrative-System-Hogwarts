
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/*
 * Denna sida dyker upp om en klickar på "Inställningar" på Huvudsida_admin. Här kan man byta lösenord
 * om man skriver in rätt uppgifter, eller välja att gå tillbaka till föregående sida.
 *
 * @author Elinore Hagman
 */
public class Betyg_admin extends javax.swing.JFrame {

    private InfDB idb;

    // Creates new form Betyg_admin
    public Betyg_admin(InfDB idb) {
        initComponents();
        this.idb = idb;
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
        lbRubrik = new javax.swing.JLabel();
        iconElever = new javax.swing.JLabel();
        btnRegistrera = new javax.swing.JButton();
        lbSubRubrik = new javax.swing.JLabel();
        btnAndra = new javax.swing.JButton();
        lbSokElev = new javax.swing.JLabel();
        txtSokElev = new javax.swing.JTextField();
        btnTomFalt = new javax.swing.JButton();
        btnSok = new javax.swing.JButton();
        lbElev = new javax.swing.JLabel();
        lbKursnamn = new javax.swing.JLabel();
        cbKurs = new javax.swing.JComboBox<>();
        lbBetyg = new javax.swing.JLabel();
        cbBetyg = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        betygLista = new javax.swing.JTextArea();
        txtElevNamn = new javax.swing.JTextField();
        lbTips = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        elevLista = new javax.swing.JTextArea();
        btnVisaElevlista = new javax.swing.JButton();
        btnTillbaka = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelTitel.setBackground(new java.awt.Color(204, 204, 204));

        lbRubrik.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        lbRubrik.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbRubrik.setText("Hantera kursbetyg");

        iconElever.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/icons8_report_card_filled_50px.png"))); // NOI18N

        javax.swing.GroupLayout panelTitelLayout = new javax.swing.GroupLayout(panelTitel);
        panelTitel.setLayout(panelTitelLayout);
        panelTitelLayout.setHorizontalGroup(
            panelTitelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(iconElever)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        panelTitelLayout.setVerticalGroup(
            panelTitelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTitelLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(panelTitelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iconElever, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        btnRegistrera.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        btnRegistrera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/icons8-chevron-right-24.png"))); // NOI18N
        btnRegistrera.setText("Registrera nytt elevbetyg");
        btnRegistrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistreraActionPerformed(evt);
            }
        });

        lbSubRubrik.setFont(new java.awt.Font("Lucida Grande", 2, 14)); // NOI18N
        lbSubRubrik.setText("Skriv in elevnamn och ändra nedanför");

        btnAndra.setText("Ändra");
        btnAndra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraActionPerformed(evt);
            }
        });

        lbSokElev.setText("Välj elev:");

        txtSokElev.setText("Förnamn och efternamn..");
        txtSokElev.setToolTipText("");
        txtSokElev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSokElevMouseClicked(evt);
            }
        });

        btnTomFalt.setText("Töm fält");
        btnTomFalt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTomFaltActionPerformed(evt);
            }
        });

        btnSok.setText("Sök");
        btnSok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokActionPerformed(evt);
            }
        });

        lbElev.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lbElev.setText("Elev:");

        lbKursnamn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lbKursnamn.setText("Kursnamn:");

        lbBetyg.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lbBetyg.setText("Betyg:");

        betygLista.setEditable(false);
        betygLista.setColumns(20);
        betygLista.setLineWrap(true);
        betygLista.setRows(5);
        jScrollPane1.setViewportView(betygLista);

        txtElevNamn.setEditable(false);

        elevLista.setEditable(false);
        elevLista.setColumns(20);
        elevLista.setLineWrap(true);
        elevLista.setRows(5);
        jScrollPane2.setViewportView(elevLista);

        btnVisaElevlista.setText("Visa elevlista");
        btnVisaElevlista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisaElevlistaActionPerformed(evt);
            }
        });

        btnTillbaka.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/icons8-go-back-24.png"))); // NOI18N
        btnTillbaka.setText("Gå tillbaka");
        btnTillbaka.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTillbakaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnTillbaka)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVisaElevlista))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbElev)
                                            .addComponent(lbBetyg))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(42, 42, 42)
                                                .addComponent(txtElevNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cbBetyg, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbKursnamn)
                                        .addGap(10, 10, 10)
                                        .addComponent(cbKurs, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnAndra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lbSubRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(19, 19, 19))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnRegistrera, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(btnTomFalt, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(113, 113, 113))))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbSokElev)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSokElev)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSok, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbTips, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelTitel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbTips, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSubRubrik)
                    .addComponent(lbSokElev)
                    .addComponent(txtSokElev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSok))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbElev)
                            .addComponent(txtElevNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbKursnamn)
                            .addComponent(cbKurs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbBetyg)
                            .addComponent(cbBetyg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAndra)
                            .addComponent(btnTomFalt))
                        .addGap(48, 48, 48)
                        .addComponent(btnRegistrera, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTillbaka)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVisaElevlista)
                        .addContainerGap(23, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraActionPerformed
        // Anropar sidan där användaren kan registrera nya betyg för elever.
        LaggTillBetyg registrerabetygsidan = new LaggTillBetyg(idb);
        registrerabetygsidan.setVisible(true);
    }//GEN-LAST:event_btnRegistreraActionPerformed

    private void btnTillbakaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTillbakaMouseClicked
        // Går tillbaka till huvudsidan för admins.
        setVisible(false);
        Huvudsida_admin adminsidan = new Huvudsida_admin(idb);
        adminsidan.setVisible(true);
    }//GEN-LAST:event_btnTillbakaMouseClicked

    private void btnTomFaltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTomFaltActionPerformed
        // metoden tömmer fälten på text när man klickar på "Töm fält" knappen.
        tomfalt();
    }//GEN-LAST:event_btnTomFaltActionPerformed

    private void tomfalt() {
        txtSokElev.setText(null);
        betygLista.setText("");
        elevLista.setText("");
        txtElevNamn.setText(null);
    }

    private void btnSokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokActionPerformed
    // Tar fram de kurser eleven man sökt efter har betyg i i dropdown-menyn och lägger dem även i en lista.

        lbTips.setText("");
        betygLista.setText("");

        if (Validering.KollaTomtFalt(txtSokElev)) {
            if (Validering.KollaOmEttNamn(txtSokElev)) {

                try {
                    String namnet = txtSokElev.getText();
                    String[] fornamnefternamn = namnet.split(" ");

                    /* Villkoret kollar om både förnamn och efternamn har använts genom att kolla om ett mellanslag finns i sökfältet när
                     * värdet hämtas, och om det gör det så så kommer informationen skrivas ut om eleven ifråga hittas i databasen.
                     */
                    String elevId = idb.fetchSingle("SELECT ELEV_ID FROM ELEV where FORNAMN='" + fornamnefternamn[0] + "' and EFTERNAMN='" + fornamnefternamn[1] + "'");
                    if (Validering.KollaOmPersonFinns(elevId)) {

                        // Tömmer betyglistan vid varje sökning och lägger dit betygen pånytt när en söker fram en elev.
                        cbBetyg.removeAllItems();
                        ArrayList<HashMap<String, String>> betyglista = idb.fetchRows("SELECT BETYGSBETECKNING FROM BETYG");
                        // For-loopen går igenom varje namn som finns i kolumnen BETYGSBETECKNING och lägger till den i dropdown-menyn.
                        for (int i = 0; i < betyglista.size(); i++) {
                            cbBetyg.addItem(betyglista.get(i).get("BETYGSBETECKNING"));
                        }

                        // Tömmer kurslistan vid varje sökning och fyller på med de kurser som den enskilda eleven har.
                        cbKurs.removeAllItems();

                        // En lista med alla kursIdn som eleven har betyg i.
                        ArrayList<String> kursIden = idb.fetchColumn("SELECT KURS_ID FROM HAR_BETYG_I WHERE ELEV_ID = " + elevId);
                        // En lista med alla betyg som eleven har.
                        ArrayList<String> regKursbetyg = idb.fetchColumn("SELECT KURSBETYG FROM HAR_BETYG_I WHERE ELEV_ID = " + elevId);
                        // En lista med alla kurser som eleven är registrerad på men INTE har betyg i.
                        ArrayList<String> registreradeKurser = idb.fetchColumn("SELECT REGISTRERAD_PA.KURS_ID FROM REGISTRERAD_PA WHERE REGISTRERAD_PA.KURS_ID NOT IN (SELECT HAR_BETYG_I.KURS_ID FROM HAR_BETYG_I) AND REGISTRERAD_PA.ELEV_ID = " + elevId);

                        // Detta händer om eleven inte har några kursbetyg öht. 
                        if (kursIden == null) {
                            betygLista.append(namnet + "\n***************************\n\nInga betyg registrerade!");
                            txtElevNamn.setText("");

                        // Om eleven har kurs betyg registrerade på sig händer detta.
                        } else {
                            txtElevNamn.setText(namnet);
                            betygLista.append(namnet + "\n***************************\n\n");

                            // Går igenom alla kursIDn som eleven har kursbetyg i, hittar kursnamnet, och lägger in det i dropdown-menyn.
                            for (int i = 0; i < regKursbetyg.size(); i++) {
                                String registreratKursBetygKurs = idb.fetchSingle("SELECT KURSNAMN FROM KURS WHERE KURS_ID = " + kursIden.get(i) + "");
                                cbKurs.addItem(registreratKursBetygKurs);

                                // Skriver ut informationen i en lista.
                                betygLista.append("Kurs: " + registreratKursBetygKurs + "\nBetyg: " + regKursbetyg.get(i) + "\n\n");
                            }
                        }
                        // Detta kollar eleven har några kurser som eleven INTE har betyg i, och om det finns skrivs de ut under alla betyg i listan.
                        if (Validering.KollaOmInnehallFinns(registreradeKurser)) {
                            betygLista.append("***************************\nKurser utan betyg:\n");
                            for (int j = 0; j < registreradeKurser.size(); j++) {
                                String kursUtanBetyg = idb.fetchSingle("SELECT KURSNAMN FROM KURS WHERE KURS_ID =" + registreradeKurser.get(j));
                                betygLista.append(kursUtanBetyg);
                            }
                        }
                    } else {
                        lbTips.setText("Kolla att du använder stora och små bokstäver på rätt ställen.");
                    }

                    // Detta gör att startpositionen i listan är i toppen av textfältet istället för längst ner.
                    betygLista.setSelectionStart(0);
                    betygLista.setSelectionEnd(0);

                } catch (InfException e) {
                    JOptionPane.showMessageDialog(null, "Sökningen gick fel!");
                    System.out.println("Internt felmeddelande:" + e.getMessage());
                }
            }
        }
    }//GEN-LAST:event_btnSokActionPerformed

    private void btnVisaElevlistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisaElevlistaActionPerformed
        // Tar fram en lista med alla elever som går på Hogwarts och fyller ut textblocket till höger med den.

        elevLista.setText("");

        try {
            ArrayList<String> fornamnLista = idb.fetchColumn("SELECT FORNAMN FROM ELEV ORDER BY SOVSAL, EFTERNAMN ASC;");
            ArrayList<String> efternamnLista = idb.fetchColumn("SELECT EFTERNAMN FROM ELEV ORDER BY SOVSAL, EFTERNAMN ASC;");

            // Loopen går igenom alla namn och lägger till förnamn, efternamn och elevhem i listan.
            for (int i = 0; i < fornamnLista.size(); i++) {

                // Detta tar fram elevhemmet som varje enskild elev tillhör.
                String elevhem = idb.fetchSingle("SELECT ELEVHEMSNAMN FROM ELEVHEM JOIN SOVSAL ON ELEVHEM_ID = SOVSAL.ELEVHEM JOIN ELEV ON SOVSAL_ID = ELEV.SOVSAL WHERE ELEV.FORNAMN = '" + fornamnLista.get(i) + "'");
                
                elevLista.append(fornamnLista.get(i) + " " + efternamnLista.get(i) + "\nElevhem: " + elevhem + "\n\n");
            }

            // Detta gör att startpositionen i listan är i toppen av textfältet ifall listan är längre än texblockets storlek.
            elevLista.setSelectionStart(0);
            elevLista.setSelectionEnd(0);

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande:" + e.getMessage());
        }
    }//GEN-LAST:event_btnVisaElevlistaActionPerformed

    private void btnAndraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraActionPerformed
        // Ändrar betyget på kursen man valt att man vill ändra betyget på i formuläret till vänster.

        // Ser till att fältet med elevnamnet inte är tomt, för om det är tomt har ingen elev valts och kan därmed inte få betyg ändrade.
        if (Validering.KollaTomtFalt(txtElevNamn)) {

            // Skapar en Array och delar textfältet som visar elevens namn i två substringar.
            String namnet = txtSokElev.getText();
            String[] fornamnefternamn = namnet.split(" ");

            try {
                String elevId = idb.fetchSingle("SELECT ELEV_ID FROM ELEV where FORNAMN='" + fornamnefternamn[0] + "' and    EFTERNAMN='" + fornamnefternamn[1] + "'");
                String kursen = cbKurs.getSelectedItem().toString();
                String kursId = idb.fetchSingle("SELECT KURS_ID FROM KURS WHERE KURSNAMN = '" + kursen + "'");
                String betyget = cbBetyg.getSelectedItem().toString();

                idb.update("UPDATE HAR_BETYG_I SET KURSBETYG = '" + betyget + "' WHERE ELEV_ID =" + elevId + " AND KURS_ID = " + kursId);
                JOptionPane.showMessageDialog(null, "Betyget har ändrats!");

            } catch (InfException e) {
                JOptionPane.showMessageDialog(null, "Något gick fel!");
                System.out.println("Internt felmeddelande:" + e.getMessage());
            }
        }
    }//GEN-LAST:event_btnAndraActionPerformed

    private void txtSokElevMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSokElevMouseClicked
        // När man klickar på sökfältet töms det på text.
        txtSokElev.setText("");
    }//GEN-LAST:event_txtSokElevMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea betygLista;
    private javax.swing.JButton btnAndra;
    private javax.swing.JButton btnRegistrera;
    private javax.swing.JButton btnSok;
    private javax.swing.JLabel btnTillbaka;
    private javax.swing.JButton btnTomFalt;
    private javax.swing.JButton btnVisaElevlista;
    private javax.swing.JComboBox<String> cbBetyg;
    private javax.swing.JComboBox<String> cbKurs;
    private javax.swing.JTextArea elevLista;
    private javax.swing.JLabel iconElever;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbBetyg;
    private javax.swing.JLabel lbElev;
    private javax.swing.JLabel lbKursnamn;
    private javax.swing.JLabel lbRubrik;
    private javax.swing.JLabel lbSokElev;
    private javax.swing.JLabel lbSubRubrik;
    private javax.swing.JLabel lbTips;
    private javax.swing.JPanel panelTitel;
    private javax.swing.JTextField txtElevNamn;
    private javax.swing.JTextField txtSokElev;
    // End of variables declaration//GEN-END:variables
}
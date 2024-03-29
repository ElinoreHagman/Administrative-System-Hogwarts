
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/*
 * Denna sida hanterar elevinformation och användaren kan registrera nya, ändra
 * redan existerande elevers information, eller bara kolla upp information.
 *
 * @author Elinore Hagman
 */
public class Elever_larare extends javax.swing.JFrame {

    private InfDB idb;

    // Skapar en ny Elever_larare
    public Elever_larare(InfDB idb) {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbValjElev = new javax.swing.JLabel();
        txtElevSok = new javax.swing.JTextField();
        lbElevId = new javax.swing.JLabel();
        lbFornamn = new javax.swing.JLabel();
        lbEfternamn = new javax.swing.JLabel();
        txtElevId = new javax.swing.JTextField();
        txtFornamn = new javax.swing.JTextField();
        txtEfternamn = new javax.swing.JTextField();
        lbsubRubrik = new javax.swing.JLabel();
        btnRegistrera = new javax.swing.JButton();
        btnAndra = new javax.swing.JButton();
        lbElevhem = new javax.swing.JLabel();
        lbSovsal = new javax.swing.JLabel();
        btnTillbaka = new javax.swing.JLabel();
        btnTomFalt = new javax.swing.JButton();
        btnSok = new javax.swing.JButton();
        lbTips = new javax.swing.JLabel();
        txtElevhem = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        elevLista = new javax.swing.JTextArea();
        btnUppdateradLista = new javax.swing.JButton();
        cbSovsal = new javax.swing.JComboBox<>();
        txtPrefekt = new javax.swing.JTextField();
        lbPrefekt = new javax.swing.JLabel();
        lbInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelTitel.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hantera elever");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/icons8-graduate-filled-50.png"))); // NOI18N

        javax.swing.GroupLayout panelTitelLayout = new javax.swing.GroupLayout(panelTitel);
        panelTitel.setLayout(panelTitelLayout);
        panelTitelLayout.setHorizontalGroup(
            panelTitelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTitelLayout.setVerticalGroup(
            panelTitelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTitelLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(panelTitelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        lbValjElev.setText("Välj elev:");

        txtElevSok.setText("Förnamn och efternamn..");
        txtElevSok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtElevSokMouseClicked(evt);
            }
        });

        lbElevId.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lbElevId.setText("Elev ID:");

        lbFornamn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lbFornamn.setText("Förnamn:");

        lbEfternamn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lbEfternamn.setText("Efternamn:");

        txtElevId.setEditable(false);

        lbsubRubrik.setFont(new java.awt.Font("Lucida Grande", 2, 14)); // NOI18N
        lbsubRubrik.setText("Välj elev och ändra sedan nedanför");

        btnRegistrera.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        btnRegistrera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/icons8-chevron-right-24.png"))); // NOI18N
        btnRegistrera.setText("Registrera ny elev");
        btnRegistrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistreraActionPerformed(evt);
            }
        });

        btnAndra.setText("Ändra");
        btnAndra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraActionPerformed(evt);
            }
        });

        lbElevhem.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lbElevhem.setText("Elevhem:");

        lbSovsal.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lbSovsal.setText("Sovsal:");

        btnTillbaka.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/icons8-go-back-24.png"))); // NOI18N
        btnTillbaka.setText("Gå tillbaka");
        btnTillbaka.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTillbakaMouseClicked(evt);
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

        lbTips.setText(" ");

        txtElevhem.setEditable(false);

        elevLista.setEditable(false);
        elevLista.setColumns(20);
        elevLista.setRows(5);
        jScrollPane2.setViewportView(elevLista);

        btnUppdateradLista.setText("Visa uppdaterad elevlista");
        btnUppdateradLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUppdateradListaActionPerformed(evt);
            }
        });

        txtPrefekt.setEditable(false);

        lbPrefekt.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lbPrefekt.setText("Prefekt:");

        lbInfo.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        lbInfo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbInfo.setText("Om det finns många elever på skolan kan det ta en stund att ladda fram listan.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnTillbaka)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUppdateradLista))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbsubRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbElevId)
                                    .addComponent(lbEfternamn)
                                    .addComponent(lbFornamn))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFornamn)
                                    .addComponent(txtElevId, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                    .addComponent(txtEfternamn)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbSovsal)
                                    .addComponent(lbElevhem)
                                    .addComponent(lbPrefekt))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbSovsal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtElevhem)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtPrefekt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(80, 80, 80))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnTomFalt)
                                    .addComponent(btnAndra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRegistrera, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbValjElev)
                                .addGap(12, 12, 12)
                                .addComponent(txtElevSok)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSok, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                            .addComponent(lbInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbTips, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(21, 21, 21))
            .addComponent(panelTitel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTitel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTips)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbValjElev)
                            .addComponent(txtElevSok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbsubRubrik)
                            .addComponent(btnSok))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbElevId)
                                    .addComponent(txtElevId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbFornamn)
                                    .addComponent(txtFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbEfternamn)
                                    .addComponent(txtEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPrefekt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbPrefekt))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbSovsal)
                                    .addComponent(cbSovsal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtElevhem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbElevhem))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAndra)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnTomFalt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnRegistrera, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addComponent(lbInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(btnUppdateradLista)
                        .addGap(6, 6, 6))
                    .addComponent(btnTillbaka))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTillbakaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTillbakaMouseClicked
        // Metoden stänger denna sida och går tillbaka till huvudsidan för lärare.
        dispose();
        Huvudsida_larare lararsidan = new Huvudsida_larare(idb);
        lararsidan.setVisible(true);
    }//GEN-LAST:event_btnTillbakaMouseClicked

    // Metoden tömmer samtliga fält på sidan på information.
    private void tomFalt() {
        txtElevId.setText(null);
        txtFornamn.setText(null);
        txtEfternamn.setText(null);
        txtElevhem.setText(null);
        txtPrefekt.setText(null);
    }

    private void btnTomFaltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTomFaltActionPerformed
        // Metoden tömmer fälten på text om en klickar på "Töm fält" knappen.
        tomFalt();
        txtElevSok.setText(null);
        cbSovsal.removeAllItems();
        elevLista.setText(null);
    }//GEN-LAST:event_btnTomFaltActionPerformed

    private void btnRegistreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraActionPerformed
        // Anropar registreringssidan där användaren kan lägga till elever på Hogwarts.
        LaggTillElev registrerasidan = new LaggTillElev(idb);
        registrerasidan.setVisible(true);
    }//GEN-LAST:event_btnRegistreraActionPerformed

    private void btnSokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokActionPerformed
        // Tar fram information om eleven som användaren skriver in i sökfältet och sätter det i fälten på vänstersida.
        lbTips.setText(" ");

        // Dessa ser till att fältet inte är tomt eller att det finns mer än två namn (ett förnamn och ett efternamn).
        if (Validering.KollaTomtFalt(txtElevSok)) {
            if (Validering.KollaOmEttNamn(txtElevSok)) {

                try {
                    // Skapar en Array där namnet delar in i substring förnamn och substring efternamn.
                    String id = txtElevSok.getText();
                    String[] fornamnefternamn = id.split(" ");
                    int storlek = fornamnefternamn.length;

                    // Detta kolla om personen som användaren skrivit in namnet på finns i databasen.
                    String kollaId = idb.fetchSingle("SELECT ELEV_ID FROM ELEV where FORNAMN='" + fornamnefternamn[0] + "' and    EFTERNAMN='" + fornamnefternamn[1] + "'");
                    if (Validering.KollaOmPersonFinns(kollaId)) {
                        
                        /* Villkoret kollar om både förnamn och efternamn har använts genom att kolla om ett mellanslag finns i sökfältet 
                         * när värdet hämtas, och om det gör det så kommer informationen skrivas ut om eleven ifråga hittas i databasen.
                         */
                        if (id.contains(" ") && storlek == 2) {

                            String elevId = idb.fetchSingle("SELECT ELEV_ID FROM ELEV where FORNAMN='" + fornamnefternamn[0] + "' and EFTERNAMN='" + fornamnefternamn[1] + "'");
                            txtElevId.setText(elevId);
                            int elevIdInt = Integer.parseInt(elevId);

                            String fornamn = idb.fetchSingle("SELECT FORNAMN FROM ELEV where FORNAMN='" + fornamnefternamn[0] + "' and EFTERNAMN='" + fornamnefternamn[1] + "'");
                            txtFornamn.setText(fornamn);

                            String efternamn = idb.fetchSingle("SELECT EFTERNAMN FROM ELEV where FORNAMN='" + fornamnefternamn[0] + "' and EFTERNAMN='" + fornamnefternamn[1] + "'");
                            txtEfternamn.setText(efternamn);

                            String elevhem = idb.fetchSingle("SELECT ELEVHEMSNAMN from ELEVHEM join SOVSAL on ELEVHEM.ELEVHEM_ID = SOVSAL.ELEVHEM join ELEV on ELEV.SOVSAL = SOVSAL_ID WHERE ELEV.FORNAMN='" + fornamnefternamn[0] + "' and EFTERNAMN='" + fornamnefternamn[1] + "'");
                            txtElevhem.setText(elevhem);

                            // Tömmer sovsals-dropdownmenyn vid varje sökning så inte dropdownmenyn fylls ovanpå sovsalslistan som användes vis sökningen före.
                            cbSovsal.removeAllItems();
                            String valtElevhem = txtElevhem.getText();

                            int elevhemId = Integer.parseInt(idb.fetchSingle("SELECT ELEVHEM_ID FROM ELEVHEM WHERE ELEVHEMSNAMN = '" + valtElevhem + "'"));

                            // For loopen går igenom alla sovsalar som finns på det valda elevhemmet och lägger till dem i sovsals-dropdownmenyn.
                            ArrayList<HashMap<String, String>> sovsalLista = idb.fetchRows("SELECT SOVSAL_ID FROM SOVSAL WHERE ELEVHEM = " + elevhemId);
                            for (int i = 0; i < sovsalLista.size(); i++) {
                                cbSovsal.addItem(sovsalLista.get(i).get("SOVSAL_ID"));
                            }

                            // Väljer den sovsalen som eleven man sökt efter har registrerad på sig.
                            String sovsal = idb.fetchSingle("SELECT SOVSAL FROM ELEV where FORNAMN='" + fornamnefternamn[0] + "' and EFTERNAMN='" + fornamnefternamn[1] + "'");
                            cbSovsal.setSelectedItem(sovsal);

                            // Kollar vad prefektstatusen är för den enskilde eleven och fyller fältet med antingen ja/nej.
                            String prefektStatus = idb.fetchSingle("SELECT ELEV_ID FROM ELEV JOIN SOVSAL ON ELEV.SOVSAL = SOVSAL_ID JOIN ELEVHEM ON ELEVHEM_ID = SOVSAL.ELEVHEM WHERE PREFEKT = " + elevIdInt);
                            if (prefektStatus == null) {
                                txtPrefekt.setText("Nej");
                            } else {
                                txtPrefekt.setText("Ja");
                            }
                        }
                    } else {
                        lbTips.setText("Kolla att du använder stora och små bokstäver på rätt ställen.");
                    }
                    
                } catch (InfException e) {
                    JOptionPane.showMessageDialog(null, "Sökningen gick fel!");
                    System.out.println("Internt felmeddelande:" + e.getMessage());
                }
            }

        }
    }//GEN-LAST:event_btnSokActionPerformed

    private void btnAndraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraActionPerformed
    // Denna metod ändrar den information användaren har skrivit i fältet till vänster när den klickar på "Ändra".

        // Dessa ser till att textfälten inte är tomma, och inte fler än ett namn har skrivits in när användaren försöker ändra elevinformation.
        if (Validering.Kolla3TommaFalt(txtElevId, txtFornamn, txtEfternamn)) {
            if (Validering.KollaOmEndastEttNamn(txtFornamn, txtEfternamn)) {

                String elevId = txtElevId.getText();
                String fornamn = txtFornamn.getText();
                String efternamn = txtEfternamn.getText();
                String sovsal = cbSovsal.getSelectedItem().toString();

                try {
                    idb.update("UPDATE ELEV SET FORNAMN = '" + fornamn + "' WHERE ELEV_ID =" + elevId);
                    idb.update("UPDATE ELEV SET EFTERNAMN = '" + efternamn + "' WHERE ELEV_ID =" + elevId);
                    idb.update("UPDATE ELEV SET SOVSAL = '" + sovsal + "' WHERE ELEV_ID =" + elevId);
                    String aktuelltElevhem = idb.fetchSingle("SELECT ELEVHEMSNAMN from ELEVHEM join SOVSAL on ELEVHEM.ELEVHEM_ID = SOVSAL.ELEVHEM join ELEV on ELEV.SOVSAL = SOVSAL_ID WHERE ELEV_ID =" + elevId);
                    txtElevhem.setText(aktuelltElevhem);

                    JOptionPane.showMessageDialog(null, "Ändrat!");

                } catch (InfException e) {
                    JOptionPane.showMessageDialog(null, "Ändring gick fel!");
                    System.out.println("Internt felmeddelande:" + e.getMessage());
                }
            }
        }
    }//GEN-LAST:event_btnAndraActionPerformed

    private void txtElevSokMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtElevSokMouseClicked
        // När man klickar på sökfältet töms det på text.
        txtElevSok.setText("");
    }//GEN-LAST:event_txtElevSokMouseClicked

    private void fyllListan() {
    // Metoden fyller listan med alla elever som går på Hogwarts.

        // Detta tar bort det som finns i högra textfältet och gör så inte textfältet som visar listan upprepar flera listor på varandra.
        elevLista.setText("");

        try {
            ArrayList<String> fornamnLista = idb.fetchColumn("SELECT FORNAMN FROM ELEV ORDER BY SOVSAL, EFTERNAMN ASC");
            ArrayList<String> efternamnLista = idb.fetchColumn("SELECT EFTERNAMN FROM ELEV ORDER BY SOVSAL, EFTERNAMN ASC");
            ArrayList<String> sovsalLista = idb.fetchColumn("SELECT SOVSAL FROM ELEV ORDER BY SOVSAL, EFTERNAMN ASC");

            // Loopen går igenom alla namn och lägger till förnamn, efternamn, elevhem och sovsal i listan.
            for (int i = 0; i < fornamnLista.size(); i++) {

                String elevhem = idb.fetchSingle("SELECT ELEVHEMSNAMN FROM ELEVHEM JOIN SOVSAL ON ELEVHEM_ID = SOVSAL.ELEVHEM JOIN ELEV ON SOVSAL_ID = ELEV.SOVSAL WHERE ELEV.FORNAMN = '" + fornamnLista.get(i) + "'");

                String elevId = idb.fetchSingle("SELECT ELEV_ID FROM ELEV WHERE FORNAMN = '" + fornamnLista.get(i) + "' AND EFTERNAMN = '" + efternamnLista.get(i) + "'");
                int elevIdInt = Integer.parseInt(elevId);

                // Kollar om eleverna var för sig är representerade som prefekt i elevhemmet ifråga.
                String prefektstatus = idb.fetchSingle("SELECT PREFEKT FROM ELEVHEM JOIN SOVSAL ON ELEVHEM_ID = SOVSAL.ELEVHEM JOIN ELEV ON SOVSAL_ID = ELEV.SOVSAL WHERE PREFEKT = " + elevIdInt);

                // Om eleven är prefekt kommer en extra rad skrivas in bredvid namnet på eleven ifråga.
                if (prefektstatus != null) {
                    elevLista.append("Namn: " + fornamnLista.get(i) + " " + efternamnLista.get(i) + " *PREFEKT*\nElevhem: " + elevhem + "\nSovsal: " + sovsalLista.get(i) + "\n\n");

                    // Om eleven inte är prefekt kommer ordet *prefekt* inte skrivas med i den enskilde elevens information.
                } else {
                    elevLista.append("Namn: " + fornamnLista.get(i) + " " + efternamnLista.get(i) + "\nElevhem: " + elevhem + "\nSovsal: " + sovsalLista.get(i) + "\n\n");
                }
            }

            // Detta gör att startpositionen i listan är i toppen av textfältet.
            elevLista.setSelectionStart(0);
            elevLista.setSelectionEnd(0);

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel med listan!");
            System.out.println("Internt felmeddelande:" + e.getMessage());
        }
    }

    private void btnUppdateradListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUppdateradListaActionPerformed
        // Anropar metoden som fyller på elevlistan.
        fyllListan();
    }//GEN-LAST:event_btnUppdateradListaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAndra;
    private javax.swing.JButton btnRegistrera;
    private javax.swing.JButton btnSok;
    private javax.swing.JLabel btnTillbaka;
    private javax.swing.JButton btnTomFalt;
    private javax.swing.JButton btnUppdateradLista;
    private javax.swing.JComboBox<String> cbSovsal;
    private javax.swing.JTextArea elevLista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbEfternamn;
    private javax.swing.JLabel lbElevId;
    private javax.swing.JLabel lbElevhem;
    private javax.swing.JLabel lbFornamn;
    private javax.swing.JLabel lbInfo;
    private javax.swing.JLabel lbPrefekt;
    private javax.swing.JLabel lbSovsal;
    private javax.swing.JLabel lbTips;
    private javax.swing.JLabel lbValjElev;
    private javax.swing.JLabel lbsubRubrik;
    private javax.swing.JPanel panelTitel;
    private javax.swing.JTextField txtEfternamn;
    private javax.swing.JTextField txtElevId;
    private javax.swing.JTextField txtElevSok;
    private javax.swing.JTextField txtElevhem;
    private javax.swing.JTextField txtFornamn;
    private javax.swing.JTextField txtPrefekt;
    // End of variables declaration//GEN-END:variables
}

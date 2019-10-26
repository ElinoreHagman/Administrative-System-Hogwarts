
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/*
 * Denna sida hanterar lärare, och användaren kan ändra information om en, ta bort en ur systemet,
 * tillge administratörstatus, göra en lärare till elevhemsföreståndare, eller se en lista på alla lärare.
 *
 * @author Elinore Hagman
 */
public class Larare_admin extends javax.swing.JFrame {

    private InfDB idb;

    // Creates new form Larare_admin
    public Larare_admin(InfDB idb) {
        initComponents();
        this.idb = idb;
        cbElevhem.setVisible(false);
        
        // Denna metod anropas när sidan öppnas och fyller i dropdown-menyn med de elevhem som finns i databasen.
        fyllElevhemCombobox();
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
        lbValjLarare = new javax.swing.JLabel();
        txtLararSok = new javax.swing.JTextField();
        lbLararId = new javax.swing.JLabel();
        lbFornamn = new javax.swing.JLabel();
        lbEfternamn = new javax.swing.JLabel();
        txtLararId = new javax.swing.JTextField();
        txtFornamn = new javax.swing.JTextField();
        txtEfternamn = new javax.swing.JTextField();
        lbSubRubrik = new javax.swing.JLabel();
        btnRegistrera = new javax.swing.JButton();
        btnAndra = new javax.swing.JButton();
        cbElevhem = new javax.swing.JComboBox<>();
        btnTillbaka = new javax.swing.JLabel();
        btnTaBort = new javax.swing.JButton();
        btnAdmin = new javax.swing.JRadioButton();
        btnForestandare = new javax.swing.JRadioButton();
        btnSok = new javax.swing.JButton();
        btnTomFalt = new javax.swing.JButton();
        lbTips = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lararLista = new javax.swing.JTextArea();
        btnUppdateradLista = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelTitel.setBackground(new java.awt.Color(204, 204, 204));

        lbRubrik.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        lbRubrik.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbRubrik.setText("Hantera lärare");

        iconElever.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/icons8-school-director-64.png"))); // NOI18N

        javax.swing.GroupLayout panelTitelLayout = new javax.swing.GroupLayout(panelTitel);
        panelTitel.setLayout(panelTitelLayout);
        panelTitelLayout.setHorizontalGroup(
            panelTitelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(iconElever)
                .addGap(28, 28, 28)
                .addComponent(lbRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );
        panelTitelLayout.setVerticalGroup(
            panelTitelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTitelLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(panelTitelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconElever)
                    .addComponent(lbRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        lbValjLarare.setText("Välj lärare:");

        txtLararSok.setText("Förnamn och efternamn");
        txtLararSok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtLararSokMouseClicked(evt);
            }
        });

        lbLararId.setText("Lärar ID:");

        lbFornamn.setText("Förnamn:");

        lbEfternamn.setText("Efternamn:");

        txtLararId.setEditable(false);

        lbSubRubrik.setFont(new java.awt.Font("Lucida Grande", 2, 14)); // NOI18N
        lbSubRubrik.setText("Ändra eller ta bort lärare");

        btnRegistrera.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        btnRegistrera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/icons8-chevron-right-24.png"))); // NOI18N
        btnRegistrera.setText("Registrera lärare");
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

        btnTillbaka.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/icons8-go-back-24.png"))); // NOI18N
        btnTillbaka.setText("Gå tillbaka");
        btnTillbaka.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTillbakaMouseClicked(evt);
            }
        });

        btnTaBort.setText("Ta bort lärare");
        btnTaBort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortActionPerformed(evt);
            }
        });

        btnAdmin.setText("Administratör");

        btnForestandare.setText("Elevhemsföreståndare");
        btnForestandare.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                btnForestandareItemStateChanged(evt);
            }
        });

        btnSok.setText("Sök");
        btnSok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokActionPerformed(evt);
            }
        });

        btnTomFalt.setText("Töm fält");
        btnTomFalt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTomFaltActionPerformed(evt);
            }
        });

        lbTips.setText(" ");

        lararLista.setColumns(20);
        lararLista.setRows(5);
        jScrollPane2.setViewportView(lararLista);

        btnUppdateradLista.setText("Visa uppdaterad lärarlista");
        btnUppdateradLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUppdateradListaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelTitel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTillbaka)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbSubRubrik)
                    .addComponent(lbLararId)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtLararId, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbEfternamn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbFornamn)
                                .addGap(24, 24, 24)
                                .addComponent(txtFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cbElevhem, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnForestandare, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdmin))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAndra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTaBort, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTomFalt, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbTips, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRegistrera, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnUppdateradLista))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbValjLarare)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLararSok)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSok, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTitel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbTips)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbValjLarare)
                    .addComponent(txtLararSok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSubRubrik)
                    .addComponent(btnSok))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbLararId)
                            .addComponent(txtLararId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbFornamn)
                            .addComponent(txtFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbEfternamn)
                            .addComponent(txtEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnForestandare)
                            .addComponent(btnAdmin))
                        .addGap(12, 12, 12)
                        .addComponent(cbElevhem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAndra, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTaBort)
                            .addComponent(btnTomFalt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTillbaka))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegistrera, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUppdateradLista))
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fyllElevhemCombobox() {
    // Metoden hämtar elevhemsnamnen från databasen och fyller dropdown-menyn med dem.

        try {
            ArrayList<HashMap<String, String>> elevhemLista = idb.fetchRows("SELECT ELEVHEMSNAMN FROM ELEVHEM");

            for (int i = 0; i < elevhemLista.size(); i++) {
                cbElevhem.addItem(elevhemLista.get(i).get("ELEVHEMSNAMN"));
            }

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande:" + e.getMessage());
        }
    }

    private void fyllListan() {

        lararLista.setText("");

        try {
            ArrayList<String> fornamnLista = idb.fetchColumn("SELECT FORNAMN FROM LARARE ORDER BY EFTERNAMN ASC");
            ArrayList<String> efternamnLista = idb.fetchColumn("SELECT EFTERNAMN FROM LARARE ORDER BY EFTERNAMN ASC");
            for (int i = 0; i < fornamnLista.size(); i++) {

                String lararId = idb.fetchSingle("SELECT LARAR_ID FROM LARARE WHERE FORNAMN = '" + fornamnLista.get(i) + "' AND EFTERNAMN = '" + efternamnLista.get(i) + "'");

                // Kollar om lärarna var för sig är representerade som elevhemsföreståndare i elevhemmet som valts.
                String forestandarstatus = idb.fetchSingle("SELECT FORESTANDARE FROM ELEVHEM JOIN LARARE ON LARAR_ID = FORESTANDARE WHERE FORESTANDARE = " + lararId);
                String elevhemmet = idb.fetchSingle("SELECT ELEVHEMSNAMN FROM ELEVHEM WHERE FORESTANDARE =" + lararId);
                
                // Om läraren är elevhemsföreståndare kommer en extra rad skrivas in bredvid namnet på läraren ifråga.
                if (forestandarstatus != null) {
                    lararLista.append(fornamnLista.get(i) + " " + efternamnLista.get(i) + "\nElevhemsföreståndare för " + elevhemmet + "\n\n");
                
                // Om läraren inte är elevhemsföreståndare kommer ordet *Elevhemsföreståndare för* inte skrivas med i den enskilde lärarens information.
                } else {
                    lararLista.append(fornamnLista.get(i) + " " + efternamnLista.get(i) + "\n\n");
                }
            }

            // Detta gör att startpositionen i listan är i toppen av textfältet.
            lararLista.setSelectionStart(0);
            lararLista.setSelectionEnd(0);

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande:" + e.getMessage());
        }
    }

    private void tomfalt() {
    // Tömmer textfälten till vänster på information.
        txtLararId.setText(null);
        txtFornamn.setText(null);
        txtEfternamn.setText(null);
    }

    private void btnTillbakaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTillbakaMouseClicked
    // Stänger denna sida och tar användaren tillbaka till huvudsidan för admins.
        setVisible(false);
        Huvudsida_admin adminsidan = new Huvudsida_admin(idb);
        adminsidan.setVisible(true);
    }//GEN-LAST:event_btnTillbakaMouseClicked

    private void btnRegistreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraActionPerformed
    // Anropar sidan där användaren kan registrera nya lärare.
        LaggTillLarare registrerasidan = new LaggTillLarare(idb);
        registrerasidan.setVisible(true);
    }//GEN-LAST:event_btnRegistreraActionPerformed

    private void btnTomFaltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTomFaltActionPerformed
    // Tömmer alla fält på information när användaren klickar på "Töm fält" knappen.
        tomfalt();
        txtLararSok.setText(null);
        lararLista.setText(null);
        cbElevhem.setVisible(false);
        btnAdmin.setSelected(false);
        btnForestandare.setSelected(false);
    }//GEN-LAST:event_btnTomFaltActionPerformed

    private void btnSokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokActionPerformed
    // Tar fram information om eleven som användaren skriver in i sökfältet och sätter det i fälten på vänstersida.
    
        lbTips.setText(" ");

        try {
            // Skapar en Array där namnet delas in i substring förnamn och substring efternamn.
            String namnet = txtLararSok.getText();
            String[] fornamnefternamn = namnet.split(" ");
            int storlek = fornamnefternamn.length;

            // Dessa ser till att fältet inte är tomt eller att det finns mer än två namn (ett förnamn och ett efternamn).
            if (Validering.KollaTomtFalt(txtLararSok)) {
                if (Validering.KollaOmEttNamn(txtLararSok)) {

                    // Detta kolla om personen som användaren skrivit in namnet på finns i databasen.
                    String lararId = idb.fetchSingle("SELECT LARAR_ID FROM LARARE where FORNAMN='" + fornamnefternamn[0] + "' and    EFTERNAMN='" + fornamnefternamn[1] + "'");
                    if (Validering.KollaOmPersonFinns(lararId)) {
                        
                        /* Villkoret kollar om både förnamn och efternamn har använts genom att kolla om ett mellanslag finns i sökfältet när
                         * värdet hämtas, och om det gör det så så kommer informationen skrivas ut om eleven ifråga hittas i databasen.
                         */
                        if (namnet.contains(" ") && storlek == 2) {

                            String lararensId = idb.fetchSingle("SELECT LARAR_ID FROM LARARE where FORNAMN='" + fornamnefternamn[0] + "' and EFTERNAMN='" + fornamnefternamn[1] + "'");
                            txtLararId.setText(lararensId);

                            String fornamnet = idb.fetchSingle("SELECT FORNAMN FROM LARARE where FORNAMN='" + fornamnefternamn[0] + "' and EFTERNAMN='" + fornamnefternamn[1] + "'");
                            txtFornamn.setText(fornamnet);

                            String efternamnet = idb.fetchSingle("SELECT EFTERNAMN FROM LARARE where FORNAMN='" + fornamnefternamn[0] + "' and EFTERNAMN='" + fornamnefternamn[1] + "'");
                            txtEfternamn.setText(efternamnet);

                            // Kollar om läraren har adminstatus och fyller i knappen utifrån resultatet.
                            String adminstatus = idb.fetchSingle("SELECT ADMINISTRATOR FROM LARARE where FORNAMN='" + fornamnefternamn[0] + "' and EFTERNAMN='" + fornamnefternamn[1] + "'");
                            if (adminstatus.equals("F")) {
                                btnAdmin.setSelected(false);
                            } else if (adminstatus.equals("T")) {
                                btnAdmin.setSelected(true);
                            }

                            // Kollar om läraren är föreståndare för något elevhem och fyller i knappen utifrån resultatet.
                            String forestandarstatus = idb.fetchSingle("SELECT LARAR_ID FROM LARARE JOIN ELEVHEM ON FORESTANDARE = LARAR_ID WHERE FORESTANDARE = " + lararensId);
                            if (forestandarstatus == null) {
                                btnForestandare.setSelected(false);
                                //Gör så elevhem-dropdownmenyn blir osynlig.
                                cbElevhem.setVisible(false);

                            } else {
                                // Kollar vilket elevhem läraren är föreståndare för, gör menyn synlig, och visar sedan valet i dropdown-menyn.
                                String elevhemmet = idb.fetchSingle("SELECT ELEVHEMSNAMN FROM ELEVHEM WHERE FORESTANDARE =" + lararensId);
                                btnForestandare.setSelected(true);
                                cbElevhem.setSelectedItem(elevhemmet);
                                cbElevhem.setVisible(true);
                            }

                        // Om inte både förnamn och efternamn använts kommer ett felmeddelande med instruktioner.
                        } else if (lararId.contains(" ") && storlek > 2) {
                            lbTips.setText("En lärare har bara ett förnamn och ett efternamn!");
                            tomfalt();

                        } else {
                            lbTips.setText("Kom ihåg både förnamn och efternamn!");
                            tomfalt();
                        }
                    } else {
                        lbTips.setText("Kolla att du använder stora och små bokstäver på rätt ställen.");
                    }
                }
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Sökningen gick fel!");
            System.out.println("Internt felmeddelande:" + e.getMessage());
        }
    }//GEN-LAST:event_btnSokActionPerformed

    private void btnTaBortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortActionPerformed
    // Metoden tar bort läraren från systemet.

        // Detta kollar om fältet med elevIDet är ifyllt, om det är tomt innebär det att det inte finns någon elev att ta bort.
        if (Validering.KollaTomtFalt(txtLararId)) {

            int lararId = Integer.parseInt(txtLararId.getText());
            
            // Tar bort eleven om användaren klickar i "YES" (värdet 0) i dialogrutan, annars händer ingenting.
            int input = JOptionPane.showConfirmDialog(null, "Är du säker på att du vill ta bort läraren?", "Ta bort lärare..", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (input == 0) {
                try {
                    // Tar bort lärarIDet från alla databastabeller den kanske är en främmande nyckel i före den till slut tar bort i lärartabellen.
                    idb.delete("DELETE FROM HAR_KOMPETENS_I WHERE LARAR_ID =" + lararId);
                    idb.delete("DELETE FROM KURS WHERE KURSLARARE =" + lararId);
                    idb.update("UPDATE ELEVHEM SET FORESTANDARE = NULL WHERE FORESTANDARE =" + lararId);
                    idb.delete("DELETE FROM LARARE WHERE LARAR_ID =" + lararId);
                    JOptionPane.showMessageDialog(null, "Läraren har tagits bort!");
                    tomfalt();

                } catch (InfException e) {
                    JOptionPane.showMessageDialog(null, "Sökningen gick fel!");
                    System.out.println("Internt felmeddelande:" + e.getMessage());
                }
            }
        }
    }//GEN-LAST:event_btnTaBortActionPerformed

    private void btnAndraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraActionPerformed
    // Denna metod ändrar den information användaren har skrivit i fältet till vänster när den klickar på "Ändra".

        String lararId = txtLararId.getText();
        String fornamn = txtFornamn.getText();
        String efternamn = txtEfternamn.getText();
        boolean forestandarstatus = btnForestandare.isSelected();
        boolean adminstatus = btnAdmin.isSelected();
        String elevhem = cbElevhem.getSelectedItem().toString();

        // Dessa ser till att textfälten inte är tomma, och inte fler än ett namn har skrivits in när användaren försöker ändra elevinformation.
        if (Validering.Kolla3TommaFalt(txtLararId, txtFornamn, txtEfternamn)) {
            if (Validering.KollaOmEndastEttNamn(txtFornamn, txtEfternamn)) {

                try {
                    idb.update("UPDATE LARARE SET FORNAMN = '" + fornamn + "' WHERE LARAR_ID =" + lararId);
                    idb.update("UPDATE LARARE SET EFTERNAMN = '" + efternamn + "' WHERE LARAR_ID =" + lararId);

                    // Kollar om lärare användaren valt är elevhemsföreståndare i nuläget.
                    String forestandarKontroll = idb.fetchSingle("SELECT LARAR_ID FROM LARARE JOIN ELEVHEM ON FORESTANDARE = LARAR_ID WHERE FORESTANDARE = " + lararId);
                        
                    if (adminstatus == true) {
                        idb.update("UPDATE LARARE SET ADMINISTRATOR = 'T' WHERE LARAR_ID =" + lararId);

                    } else if (adminstatus == false) {
                        idb.update("UPDATE LARARE SET ADMINISTRATOR = 'F' WHERE LARAR_ID =" + lararId);
                    }

                    // Kollar om användaren fyllt i knappen för föreståndarstatus och om den är ifylld ändras föreståndaren till denna läraren.
                    if (forestandarstatus == true) {
                        idb.update("UPDATE ELEVHEM SET FORESTANDARE =" + lararId + "WHERE ELEVHEMSNAMN = '" + elevhem + "'");

                    /* Om användaren klickar ur elevhemsföreståndare uppdateras foreståndarekolumnen med värdet null, OM läraren var elevhemsföreståndare före.
                     * forestandarKontroll används så värdet inte blir null om användaren ändrar en icke-föreståndares information.
                     */
                    } else if (forestandarstatus == false && forestandarKontroll != null) {
                        idb.update("UPDATE ELEVHEM SET FORESTANDARE = NULL WHERE ELEVHEMSNAMN = '" + elevhem + "'");
                    }

                    JOptionPane.showMessageDialog(null, "Ändrat!");

                } catch (InfException e) {
                    JOptionPane.showMessageDialog(null, "Något gick fel!");
                    System.out.println("Internt felmeddelande:" + e.getMessage());
                }
            }
        }
    }//GEN-LAST:event_btnAndraActionPerformed

    private void txtLararSokMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLararSokMouseClicked
    // Gör så att texten i sökrutan försvinner när man klickar i den.
        txtLararSok.setText("");
    }//GEN-LAST:event_txtLararSokMouseClicked

    private void btnUppdateradListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUppdateradListaActionPerformed
    // Anropar en metod som fyller listan med de lärare som finns på Hogwarts.
        fyllListan();
    }//GEN-LAST:event_btnUppdateradListaActionPerformed

    private void btnForestandareItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_btnForestandareItemStateChanged
    // Gör så att elevhem-dropdownmenyn blir antingen synlig eller osynlig beroende på om läraren är elevhemsföreståndare eller inte.

        boolean elevhemsforestandare = btnForestandare.isSelected();
        
        if (elevhemsforestandare == true) {
            cbElevhem.setVisible(true);
            
        } else if (elevhemsforestandare == false) {
            cbElevhem.setVisible(false);
        }
    }//GEN-LAST:event_btnForestandareItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnAdmin;
    private javax.swing.JButton btnAndra;
    private javax.swing.JRadioButton btnForestandare;
    private javax.swing.JButton btnRegistrera;
    private javax.swing.JButton btnSok;
    private javax.swing.JButton btnTaBort;
    private javax.swing.JLabel btnTillbaka;
    private javax.swing.JButton btnTomFalt;
    private javax.swing.JButton btnUppdateradLista;
    private javax.swing.JComboBox<String> cbElevhem;
    private javax.swing.JLabel iconElever;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea lararLista;
    private javax.swing.JLabel lbEfternamn;
    private javax.swing.JLabel lbFornamn;
    private javax.swing.JLabel lbLararId;
    private javax.swing.JLabel lbRubrik;
    private javax.swing.JLabel lbSubRubrik;
    private javax.swing.JLabel lbTips;
    private javax.swing.JLabel lbValjLarare;
    private javax.swing.JPanel panelTitel;
    private javax.swing.JTextField txtEfternamn;
    private javax.swing.JTextField txtFornamn;
    private javax.swing.JTextField txtLararId;
    private javax.swing.JTextField txtLararSok;
    // End of variables declaration//GEN-END:variables
}

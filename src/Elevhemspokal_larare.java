
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/*
 * Denna sida visar information om hur mycket poäng varje elevhem har, men har
 * även metoden att ändra poängen på elevhemmen ifråga.
 *
 * @author Elinore Hagman
 */
public class Elevhemspokal_larare extends javax.swing.JFrame {

    private InfDB idb;

    // Skapar en ny Elevhemspokal_larare
    public Elevhemspokal_larare(InfDB idb) {
        initComponents();
        this.idb = idb;
        


        // Denna metod anropas när sidan öppnas och fyller i poängen för elevhemmen
        fyllIPoang();
        // Denna metod anropas när sidan öppnas och fyller i drop-down menyn med elevhemmen.
        fyllElevhemCombobox();
        
        VisaLedandeElevhem();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTillbaka = new javax.swing.JLabel();
        lbGryffindor = new javax.swing.JLabel();
        lbSlytherin = new javax.swing.JLabel();
        lbRavenclaw = new javax.swing.JLabel();
        lbHufflepuff = new javax.swing.JLabel();
        iconPokalH = new javax.swing.JLabel();
        iconPokalR = new javax.swing.JLabel();
        iconPokalS = new javax.swing.JLabel();
        iconPokalG = new javax.swing.JLabel();
        lbPoangG = new javax.swing.JLabel();
        lbPoangS = new javax.swing.JLabel();
        lbPoangH = new javax.swing.JLabel();
        lbPoangR = new javax.swing.JLabel();
        PanelTitel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        cbElevhem = new javax.swing.JComboBox<>();
        lbElevhem = new javax.swing.JLabel();
        lbRegistreraPoang = new javax.swing.JLabel();
        txtInsertPoang = new javax.swing.JTextField();
        btnOk = new javax.swing.JButton();
        lbLaggTillDraBort = new javax.swing.JLabel();
        lbAndrat = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnTillbaka.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/icons8-go-back-24.png"))); // NOI18N
        btnTillbaka.setText("Gå tillbaka");
        btnTillbaka.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTillbakaMouseClicked(evt);
            }
        });

        lbGryffindor.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        lbGryffindor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbGryffindor.setText("Gryffindor");

        lbSlytherin.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        lbSlytherin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSlytherin.setText("Slytherin");

        lbRavenclaw.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        lbRavenclaw.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbRavenclaw.setText("Ravenclaw");

        lbHufflepuff.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        lbHufflepuff.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHufflepuff.setText("Hufflepuff");

        iconPokalH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/pokal_huf.png"))); // NOI18N

        iconPokalR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/pokal_raw.png"))); // NOI18N

        iconPokalS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/pokal_slyt.png"))); // NOI18N

        iconPokalG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/pokal_gryf.png"))); // NOI18N

        lbPoangG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPoangG.setText("PoängG");

        lbPoangS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPoangS.setText("PoängS");

        lbPoangH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPoangH.setText("PoängH");

        lbPoangR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPoangR.setText("PoängR");

        PanelTitel.setBackground(new java.awt.Color(204, 204, 204));

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Elevhemspoäng");

        javax.swing.GroupLayout PanelTitelLayout = new javax.swing.GroupLayout(PanelTitel);
        PanelTitel.setLayout(PanelTitelLayout);
        PanelTitelLayout.setHorizontalGroup(
            PanelTitelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTitelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelTitelLayout.setVerticalGroup(
            PanelTitelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTitelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel13)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        lbElevhem.setText("Elevhem:");

        lbRegistreraPoang.setText("Registrera poäng:");

        btnOk.setText("Ok");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        lbLaggTillDraBort.setFont(new java.awt.Font("Lucida Grande", 2, 14)); // NOI18N
        lbLaggTillDraBort.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLaggTillDraBort.setText("Lägg till eller dra bort poäng från elevhem");

        lbAndrat.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lbAndrat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTitel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbPoangG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iconPokalG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbGryffindor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbPoangS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iconPokalS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbSlytherin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbPoangH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iconPokalH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbHufflepuff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iconPokalR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbRavenclaw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbPoangR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbLaggTillDraBort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(lbElevhem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbElevhem, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbRegistreraPoang)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtInsertPoang, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnTillbaka)
                                .addGap(66, 66, 66)
                                .addComponent(lbAndrat, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(PanelTitel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPoangG)
                    .addComponent(lbPoangS)
                    .addComponent(lbPoangH)
                    .addComponent(lbPoangR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconPokalR)
                    .addComponent(iconPokalH)
                    .addComponent(iconPokalS)
                    .addComponent(iconPokalG))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbHufflepuff)
                    .addComponent(lbSlytherin)
                    .addComponent(lbGryffindor)
                    .addComponent(lbRavenclaw))
                .addGap(31, 31, 31)
                .addComponent(lbLaggTillDraBort)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbElevhem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbElevhem)
                    .addComponent(lbRegistreraPoang)
                    .addComponent(txtInsertPoang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOk))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnTillbaka))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbAndrat, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTillbakaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTillbakaMouseClicked
        // Denna metod stänger sidan och tar användaren tillbaka till LärarSida.
        setVisible(false);
        Huvudsida_larare lararsidan = new Huvudsida_larare(idb);
        lararsidan.setVisible(true);
    }//GEN-LAST:event_btnTillbakaMouseClicked

        private void VisaLedandeElevhem() {
        // Visar vilket elevhem som leder genom att uppdatera pokalbilden på elevhemmet ifråga.

        try {
            String ledandePoang = idb.fetchSingle("SELECT MAX(HUSPOANG) FROM ELEVHEM");
            String ledandeElevhem = idb.fetchSingle("SELECT ELEVHEMSNAMN FROM ELEVHEM WHERE HUSPOANG = " + ledandePoang);

            // Dessa satser kollar vilket elevhem det är som är ledande och uppdaterar pokalbilderna utifrån det.
            if (ledandeElevhem.equals("Gryffindor")) {
                iconPokalG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/pokal_gryfw.png")));
                iconPokalS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/pokal_slyt.png")));
                iconPokalH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/pokal_huf.png")));
                iconPokalR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/pokal_raw.png")));
                
            } else if (ledandeElevhem.equals("Slytherin")) {
                iconPokalS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/pokal_slytw.png")));
                iconPokalG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/pokal_gryf.png")));
                iconPokalH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/pokal_huf.png")));
                iconPokalR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/pokal_raw.png")));
                
            } else if (ledandeElevhem.equals("Hufflepuff")) {
                iconPokalH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/pokal_hufw.png")));
                iconPokalS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/pokal_slyt.png")));
                iconPokalG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/pokal_gryf.png")));
                iconPokalR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/pokal_raw.png")));
                
            } else if (ledandeElevhem.equals("Ravenclaw")) {
                iconPokalR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/pokal_raww.png")));
                iconPokalS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/pokal_slyt.png")));
                iconPokalH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/pokal_huf.png")));
                iconPokalG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/pokal_gryf.png")));
            }

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Sökningen gick fel!");
            System.out.println("Internt felmeddelande:" + e.getMessage());
        }
    }
    
    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
    // Denna metod används för att lägga till eller ta bort poäng från elevhemmet.
    
        try {
            // Satserna under ser till att användaren inte skriver in bokstäver eller lämnar rutan tom.
            if (Validering.KollaTomtFalt(txtInsertPoang)) {
                if (Validering.KollaFaltEfterSiffror(txtInsertPoang)) {

                    String antalPoang = txtInsertPoang.getText();
                    String elevhemmet = cbElevhem.getSelectedItem().toString();
                    String gammalPoang = idb.fetchSingle("select HUSPOANG from ELEVHEM where ELEVHEMSNAMN ='" + elevhemmet + "'");
                    
                    // Lägger ihop summan som redan är registrerad och den nya tillagda summan.
                    int summan = Integer.parseInt(antalPoang) + Integer.parseInt(gammalPoang);
                    idb.update("UPDATE ELEVHEM SET HUSPOANG = " + summan + " WHERE ELEVHEMSNAMN ='" + elevhemmet + "'");
                    
                    // Fyller i poängen pånytt över pokalerna med de uppdaterade värdena.
                    fyllIPoang();
                    
                    lbAndrat.setText(antalPoang + " poäng har registrerats för " + elevhemmet + "!");
                    txtInsertPoang.setText(null);
                } 
            }

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande:" + e.getMessage());
        }
        
        // Anropar metoden som visar det ledande elevhemmet och kör den här som en uppdatering ifall det ledande elevhemmet ändras.
        VisaLedandeElevhem();
    }//GEN-LAST:event_btnOkActionPerformed

    private void fyllIPoang() {
    // Denna metod fyller ut poängen för elevhemmen ovanför pokalerna.
        try {
            String gryffindorPoang = idb.fetchSingle("select HUSPOANG from ELEVHEM where ELEVHEMSNAMN='Gryffindor'");
            String slytherinPoang = idb.fetchSingle("select HUSPOANG from ELEVHEM where ELEVHEMSNAMN='Slytherin'");
            String hufflepuffPoang = idb.fetchSingle("select HUSPOANG from ELEVHEM where ELEVHEMSNAMN='Hufflepuff'");
            String ravenclawPoang = idb.fetchSingle("select HUSPOANG from ELEVHEM where ELEVHEMSNAMN='Ravenclaw'");

            lbPoangG.setText(gryffindorPoang);
            lbPoangS.setText(slytherinPoang);
            lbPoangH.setText(hufflepuffPoang);
            lbPoangR.setText(ravenclawPoang);

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Sökningen gick fel!");
            System.out.println("Internt felmeddelande:" + e.getMessage());
        }
    }

    private void fyllElevhemCombobox() {
    // Denna metod fyller ut dropdown-menyn med elevhemmen som finns i databasen.

        try {
            ArrayList<HashMap<String, String>> elevhemLista = idb.fetchRows("SELECT ELEVHEMSNAMN FROM ELEVHEM");

            // Loopen går igenom varje namn som finns i kolumnen ELEVHEMSNAMN och lägger till den i dropdown-menyn.
            for (int i = 0; i < elevhemLista.size(); i++) {
                cbElevhem.addItem(elevhemLista.get(i).get("ELEVHEMSNAMN"));
            }

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande:" + e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelTitel;
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel btnTillbaka;
    private javax.swing.JComboBox<String> cbElevhem;
    private javax.swing.JLabel iconPokalG;
    private javax.swing.JLabel iconPokalH;
    private javax.swing.JLabel iconPokalR;
    private javax.swing.JLabel iconPokalS;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel lbAndrat;
    private javax.swing.JLabel lbElevhem;
    private javax.swing.JLabel lbGryffindor;
    private javax.swing.JLabel lbHufflepuff;
    private javax.swing.JLabel lbLaggTillDraBort;
    private javax.swing.JLabel lbPoangG;
    private javax.swing.JLabel lbPoangH;
    private javax.swing.JLabel lbPoangR;
    private javax.swing.JLabel lbPoangS;
    private javax.swing.JLabel lbRavenclaw;
    private javax.swing.JLabel lbRegistreraPoang;
    private javax.swing.JLabel lbSlytherin;
    private javax.swing.JTextField txtInsertPoang;
    // End of variables declaration//GEN-END:variables
}

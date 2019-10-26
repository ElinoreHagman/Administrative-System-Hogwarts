
import javax.swing.JOptionPane;
import oru.inf.InfDB;

/*
 * Denna sida kommer de lärare som har adminstatus till. Sidan agerar
 * som en huvudsidan där läraren kan välja vad den vill göra och gå till
 * de andra kopplade subsidorna. Finns även möjlighet att logga ut.
 *
 * @author Elinore Hagman
 */
public class Huvudsida_admin extends javax.swing.JFrame {

    private InfDB idb;

    // Creates new form Huvudsida_admin
    public Huvudsida_admin(InfDB idb) {
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

        btnElever = new javax.swing.JPanel();
        lbHanteraElever = new javax.swing.JLabel();
        iconHat = new javax.swing.JLabel();
        btnBetyg = new javax.swing.JPanel();
        lbBetyg = new javax.swing.JLabel();
        iconBetyg = new javax.swing.JLabel();
        btnLoggaUt = new javax.swing.JButton();
        lbRubrik = new javax.swing.JLabel();
        btnInstallningar = new javax.swing.JPanel();
        lbInstallningar = new javax.swing.JLabel();
        iconKugghjul = new javax.swing.JLabel();
        btnPokal = new javax.swing.JPanel();
        lbPokal = new javax.swing.JLabel();
        iconPokal = new javax.swing.JLabel();
        btnLarare = new javax.swing.JPanel();
        lbHanteraLarare = new javax.swing.JLabel();
        iconLararHat = new javax.swing.JLabel();
        btnKurser = new javax.swing.JPanel();
        lbKurser = new javax.swing.JLabel();
        iconBook = new javax.swing.JLabel();
        iconEmblem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnElever.setBackground(new java.awt.Color(204, 204, 204));
        btnElever.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEleverMouseClicked(evt);
            }
        });

        lbHanteraElever.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lbHanteraElever.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHanteraElever.setText("Hantera elever");

        iconHat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconHat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/icons8-graduate-filled-50.png"))); // NOI18N

        javax.swing.GroupLayout btnEleverLayout = new javax.swing.GroupLayout(btnElever);
        btnElever.setLayout(btnEleverLayout);
        btnEleverLayout.setHorizontalGroup(
            btnEleverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEleverLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnEleverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbHanteraElever, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iconHat, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                .addContainerGap())
        );
        btnEleverLayout.setVerticalGroup(
            btnEleverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEleverLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(iconHat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(lbHanteraElever)
                .addGap(15, 15, 15))
        );

        btnBetyg.setBackground(new java.awt.Color(204, 204, 204));
        btnBetyg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBetygMouseClicked(evt);
            }
        });

        lbBetyg.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lbBetyg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbBetyg.setText("Betyg");

        iconBetyg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconBetyg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/icons8_report_card_filled_50px.png"))); // NOI18N

        javax.swing.GroupLayout btnBetygLayout = new javax.swing.GroupLayout(btnBetyg);
        btnBetyg.setLayout(btnBetygLayout);
        btnBetygLayout.setHorizontalGroup(
            btnBetygLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBetygLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnBetygLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbBetyg, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(iconBetyg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        btnBetygLayout.setVerticalGroup(
            btnBetygLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBetygLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(iconBetyg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(lbBetyg)
                .addGap(15, 15, 15))
        );

        btnLoggaUt.setText("Logga ut");
        btnLoggaUt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggaUtActionPerformed(evt);
            }
        });

        lbRubrik.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        lbRubrik.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbRubrik.setText("VÄLKOMMEN ADMIN");

        btnInstallningar.setBackground(new java.awt.Color(204, 204, 204));
        btnInstallningar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInstallningarMouseClicked(evt);
            }
        });

        lbInstallningar.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lbInstallningar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbInstallningar.setText("Inställningar");

        iconKugghjul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconKugghjul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/53300109_2198648303722049_574840639099764736_n copy.png"))); // NOI18N

        javax.swing.GroupLayout btnInstallningarLayout = new javax.swing.GroupLayout(btnInstallningar);
        btnInstallningar.setLayout(btnInstallningarLayout);
        btnInstallningarLayout.setHorizontalGroup(
            btnInstallningarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnInstallningarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnInstallningarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbInstallningar, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(iconKugghjul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2))
        );
        btnInstallningarLayout.setVerticalGroup(
            btnInstallningarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnInstallningarLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(iconKugghjul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(lbInstallningar)
                .addGap(15, 15, 15))
        );

        btnPokal.setBackground(new java.awt.Color(204, 204, 204));
        btnPokal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPokalMouseClicked(evt);
            }
        });

        lbPokal.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lbPokal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPokal.setText("Elevhemspokal");

        iconPokal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconPokal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/icons8_trophy_50px.png"))); // NOI18N

        javax.swing.GroupLayout btnPokalLayout = new javax.swing.GroupLayout(btnPokal);
        btnPokal.setLayout(btnPokalLayout);
        btnPokalLayout.setHorizontalGroup(
            btnPokalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPokalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnPokalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbPokal, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(iconPokal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        btnPokalLayout.setVerticalGroup(
            btnPokalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnPokalLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(iconPokal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(lbPokal)
                .addGap(15, 15, 15))
        );

        btnLarare.setBackground(new java.awt.Color(204, 204, 204));
        btnLarare.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLarareMouseClicked(evt);
            }
        });

        lbHanteraLarare.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lbHanteraLarare.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHanteraLarare.setText("Hantera lärare");

        iconLararHat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconLararHat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/icons8-school-director-64.png"))); // NOI18N

        javax.swing.GroupLayout btnLarareLayout = new javax.swing.GroupLayout(btnLarare);
        btnLarare.setLayout(btnLarareLayout);
        btnLarareLayout.setHorizontalGroup(
            btnLarareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLarareLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnLarareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconLararHat, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(lbHanteraLarare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        btnLarareLayout.setVerticalGroup(
            btnLarareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLarareLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(iconLararHat, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbHanteraLarare)
                .addGap(14, 14, 14))
        );

        btnKurser.setBackground(new java.awt.Color(204, 204, 204));
        btnKurser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKurserMouseClicked(evt);
            }
        });

        lbKurser.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lbKurser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbKurser.setText("Kurser");

        iconBook.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/icons8_literature_filled_50px.png"))); // NOI18N

        javax.swing.GroupLayout btnKurserLayout = new javax.swing.GroupLayout(btnKurser);
        btnKurser.setLayout(btnKurserLayout);
        btnKurserLayout.setHorizontalGroup(
            btnKurserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnKurserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnKurserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbKurser, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(iconBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        btnKurserLayout.setVerticalGroup(
            btnKurserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnKurserLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(iconBook)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(lbKurser)
                .addGap(15, 15, 15))
        );

        iconEmblem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/crest_small.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLoggaUt))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(iconEmblem)
                        .addGap(57, 57, 57)
                        .addComponent(lbRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnElever, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBetyg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPokal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnLarare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnKurser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnInstallningar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(iconEmblem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbRubrik)
                        .addGap(35, 35, 35)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnElever, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBetyg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPokal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnKurser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInstallningar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLarare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addComponent(btnLoggaUt)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoggaUtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggaUtActionPerformed
    // Loggar ut en från adminkontot om man väljer "yes" i dialogrutan och skickar tillbaka användaren till inloggningssidan.

        int input = JOptionPane.showConfirmDialog(null, "Är du säker på att du vill logga ut?", "Utloggning..", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        // Villkoret kollar om en klickade i "yes" vilket har värdet 0, och utför utloggningen endast då.
        if (input == 0) {
            setVisible(false);
            LoginWindow loginsidan = new LoginWindow(idb);
            loginsidan.setVisible(true);
        }
    }//GEN-LAST:event_btnLoggaUtActionPerformed

    private void btnEleverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEleverMouseClicked
        // Stänger denna sida och öppnar sidan som hanterar elever istället.
        setVisible(false);
        Elever_admin elevsidan = new Elever_admin(idb);
        elevsidan.setVisible(true);
    }//GEN-LAST:event_btnEleverMouseClicked

    private void btnBetygMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBetygMouseClicked
        // Stänger denna sida och öppnar sidan som hanterar betygen istället.
        setVisible(false);
        Betyg_admin betygsidan = new Betyg_admin(idb);
        betygsidan.setVisible(true);
    }//GEN-LAST:event_btnBetygMouseClicked

    private void btnPokalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPokalMouseClicked
        // Stänger denna sida och öppnar sidan som hanterar elevhemspokalen istället.
        setVisible(false);
        Elevhemspokal_admin pokalsidan = new Elevhemspokal_admin(idb);
        pokalsidan.setVisible(true);
    }//GEN-LAST:event_btnPokalMouseClicked

    private void btnLarareMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLarareMouseClicked
        // Stänger denna sida och öppnar sidan som hanterar lärare istället.
        setVisible(false);
        Larare_admin lararsidan = new Larare_admin(idb);
        lararsidan.setVisible(true);
    }//GEN-LAST:event_btnLarareMouseClicked

    private void btnKurserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKurserMouseClicked
        // Stänger denna sida och öppnar sidan som hanterar kurser istället.
        setVisible(false);
        Kurser_admin kurssidan = new Kurser_admin(idb);
        kurssidan.setVisible(true);
    }//GEN-LAST:event_btnKurserMouseClicked

    private void btnInstallningarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInstallningarMouseClicked
        // Denna metod anropar sidan där man kan byta lösenord för användaren.
        ChangePassword bytlosensidan = new ChangePassword(idb);
        bytlosensidan.setVisible(true);
    }//GEN-LAST:event_btnInstallningarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnBetyg;
    private javax.swing.JPanel btnElever;
    private javax.swing.JPanel btnInstallningar;
    private javax.swing.JPanel btnKurser;
    private javax.swing.JPanel btnLarare;
    private javax.swing.JButton btnLoggaUt;
    private javax.swing.JPanel btnPokal;
    private javax.swing.JLabel iconBetyg;
    private javax.swing.JLabel iconBook;
    private javax.swing.JLabel iconEmblem;
    private javax.swing.JLabel iconHat;
    private javax.swing.JLabel iconKugghjul;
    private javax.swing.JLabel iconLararHat;
    private javax.swing.JLabel iconPokal;
    private javax.swing.JLabel lbBetyg;
    private javax.swing.JLabel lbHanteraElever;
    private javax.swing.JLabel lbHanteraLarare;
    private javax.swing.JLabel lbInstallningar;
    private javax.swing.JLabel lbKurser;
    private javax.swing.JLabel lbPokal;
    private javax.swing.JLabel lbRubrik;
    // End of variables declaration//GEN-END:variables
}

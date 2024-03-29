/*
 * Denna sida kommer de lärare till som inte har adminstatus. Sidan agerar
 * som en huvudsidan där läraren kan välja vad den vill göra och gå till
 * de andra kopplade sidorna. Finns även möjlighet att logga ut.
 *
 * @author Elinore Hagman
 */

import javax.swing.JOptionPane;
import oru.inf.InfDB;

public class Huvudsida_larare extends javax.swing.JFrame {
    
    private InfDB idb;
    
    // Skapar en ny LärarSida.
    public Huvudsida_larare(InfDB idb) {
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

        btnElev = new javax.swing.JPanel();
        lbElev = new javax.swing.JLabel();
        iconHat = new javax.swing.JLabel();
        btnBetyg = new javax.swing.JPanel();
        lbBetyg = new javax.swing.JLabel();
        iconBetyg = new javax.swing.JLabel();
        btnInstallningar = new javax.swing.JPanel();
        lbInstallningar = new javax.swing.JLabel();
        iconKugghjul = new javax.swing.JLabel();
        btnPokal = new javax.swing.JPanel();
        lbPokal = new javax.swing.JLabel();
        iconPokal = new javax.swing.JLabel();
        btnLoggaUt = new javax.swing.JButton();
        lbRubrik = new javax.swing.JLabel();
        lbEmblem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        btnElev.setBackground(new java.awt.Color(204, 204, 204));
        btnElev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnElevMouseClicked(evt);
            }
        });

        lbElev.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lbElev.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbElev.setText("Elever");

        iconHat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconHat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/icons8-graduate-filled-50.png"))); // NOI18N

        javax.swing.GroupLayout btnElevLayout = new javax.swing.GroupLayout(btnElev);
        btnElev.setLayout(btnElevLayout);
        btnElevLayout.setHorizontalGroup(
            btnElevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnElevLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnElevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbElev, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iconHat, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                .addContainerGap())
        );
        btnElevLayout.setVerticalGroup(
            btnElevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnElevLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(iconHat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(lbElev)
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

        btnInstallningar.setBackground(new java.awt.Color(204, 204, 204));
        btnInstallningar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInstallningararMouseClicked(evt);
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

        btnLoggaUt.setText("Logga ut");
        btnLoggaUt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggaUtActionPerformed(evt);
            }
        });

        lbRubrik.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        lbRubrik.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbRubrik.setText("VÄLKOMMEN LÄRARE");

        lbEmblem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/crest_small.png"))); // NOI18N

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(btnElev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(lbEmblem)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBetyg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPokal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbRubrik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnInstallningar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 74, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lbEmblem, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbRubrik)
                        .addGap(69, 69, 69)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnElev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBetyg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPokal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInstallningar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addComponent(btnLoggaUt)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoggaUtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggaUtActionPerformed
        // Loggar ut en från lärarkontot och skickar tillbaka en till inloggningssidan om användaren väljer "YES" i dialogrutan.
        
        int input = JOptionPane.showConfirmDialog(null, "Är du säker på att du vill logga ut?", "Utloggning..", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        // Villkoret kollar om en klickade i "yes" vilket har värdet 0.
        if (input == 0) {
            setVisible(false);
            LoginWindow loginsidan = new LoginWindow(idb);
            loginsidan.setVisible(true);
        }
    }//GEN-LAST:event_btnLoggaUtActionPerformed

    private void btnPokalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPokalMouseClicked
        // Stänger denna sida och öppnar sidan med elevhemspokalen istället.
        setVisible(false);
        Elevhemspokal_larare pokalen = new Elevhemspokal_larare(idb);
        pokalen.setVisible(true);
    }//GEN-LAST:event_btnPokalMouseClicked

    private void btnInstallningararMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInstallningararMouseClicked
        // Denna metod anropar sidan där användaren kan byta löseonord.
        ChangePassword nyttlogin = new ChangePassword(idb);
        nyttlogin.setVisible(true);
    }//GEN-LAST:event_btnInstallningararMouseClicked

    private void btnElevMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnElevMouseClicked
        // Stänger denna sida och öppnar sidan som hanterar elever istället.
        setVisible(false);
        Elever_larare elevsidan = new Elever_larare(idb);
        elevsidan.setVisible(true);
    }//GEN-LAST:event_btnElevMouseClicked

    private void btnBetygMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBetygMouseClicked
        // Stänger denna sida och öppnar sidan som hanterar betyg istället.
        setVisible(false);
        Betyg_larare betygsidan = new Betyg_larare(idb);
        betygsidan.setVisible(true);
    }//GEN-LAST:event_btnBetygMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnBetyg;
    private javax.swing.JPanel btnElev;
    private javax.swing.JPanel btnInstallningar;
    private javax.swing.JButton btnLoggaUt;
    private javax.swing.JPanel btnPokal;
    private javax.swing.JLabel iconBetyg;
    private javax.swing.JLabel iconHat;
    private javax.swing.JLabel iconKugghjul;
    private javax.swing.JLabel iconPokal;
    private javax.swing.JLabel lbBetyg;
    private javax.swing.JLabel lbElev;
    private javax.swing.JLabel lbEmblem;
    private javax.swing.JLabel lbInstallningar;
    private javax.swing.JLabel lbPokal;
    private javax.swing.JLabel lbRubrik;
    // End of variables declaration//GEN-END:variables
}

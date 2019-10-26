
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/*
 * Denna sida dyker upp om en klickar på "Inställningar" på huvudsidan för admins och lärare.
 * Här kan man byta löseonrd om man skriver in rätt uppgifter, eller välja att gå tillbaka till föregående sida.
 *
 * @author Elinore Hagman
 */
public class ChangePassword extends javax.swing.JFrame {

    private InfDB idb;

    // Skapar en ny ChangePassword
    public ChangePassword(InfDB idb) {
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

        lbRubrik = new javax.swing.JLabel();
        iconLas = new javax.swing.JLabel();
        txtNyttLosen = new javax.swing.JPasswordField();
        txtNuvarandeLosen = new javax.swing.JPasswordField();
        lbNuvarandeLosen = new javax.swing.JLabel();
        lbNyttLosen = new javax.swing.JLabel();
        lbAnvandarnamn = new javax.swing.JLabel();
        btnAndra = new javax.swing.JButton();
        btnTillbaka = new javax.swing.JLabel();
        txtLararid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        lbRubrik.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lbRubrik.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbRubrik.setText("Byt lösenord");

        iconLas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconLas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/icons8-lock-24.png"))); // NOI18N

        lbNuvarandeLosen.setText("Nuvarande lösenord:");

        lbNyttLosen.setText("Nytt lösenord:");

        lbAnvandarnamn.setText("Användarnamn:");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbRubrik, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                    .addComponent(iconLas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTillbaka)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAndra)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbNyttLosen)
                            .addComponent(lbNuvarandeLosen)
                            .addComponent(lbAnvandarnamn))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNuvarandeLosen)
                            .addComponent(txtNyttLosen, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLararid, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lbRubrik)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(iconLas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLararid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAnvandarnamn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNuvarandeLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNuvarandeLosen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNyttLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNyttLosen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAndra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTillbaka)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTillbakaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTillbakaMouseClicked
        // Denna metod stänger sidan och visar huvudsidan för lärare eller admins.
        setVisible(false);
    }//GEN-LAST:event_btnTillbakaMouseClicked

    private void btnAndraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraActionPerformed
    //Denna metod ändrar användarens lösenord om den har skrivit in rätt uppgifter.
    
        String idInput = txtLararid.getText();
        String nuvarandeLosen = txtNuvarandeLosen.getText();
        String nyttLosen = txtNyttLosen.getText();

        // Dessa ser till att användaren inte kan lämna fälten tomma eller skriva in bokstäver i IDfältet när den klickar på "Ändra" knappen.
        if (Validering.Kolla3TommaFalt(txtLararid, txtNuvarandeLosen, txtNyttLosen)) {
            if (Validering.KollaFaltEfterSiffror(txtLararid)) {

                try {
                    String lararId = idb.fetchSingle("select LARAR_ID from LARARE where LARAR_ID =" + idInput);
                    String lararLosen = idb.fetchSingle("select LOSENORD from LARARE where LARAR_ID =" + idInput);

                    /* Detta villkor kollar om ens användarnamn och lösen stämmer överens med vad som finns i databasen,
                     * utifrån lärarIDet som skrivits in. Om det stämmer överens kommer det nya lösenordet registreras och
                     * även en pop-up ruta kommer anropas för att bekräfta att ändringen skett. Efter det stängs denna sida ner.
                     */
                    if (idInput.equals(lararId) && nuvarandeLosen.equals(lararLosen)) {
                        idb.update("UPDATE LARARE SET LOSENORD = '" + nyttLosen + "' WHERE LARAR_ID =" + idInput);
                        JOptionPane.showMessageDialog(null, "Lösenordet är nu bytt!");
                        setVisible(false);

                    /* Om användarnamnet och lösenordet inte matchar kommer en pop-up ruta anropas
                     * för att förklara för användaren att uppgifterna inte stämmer överens.   
                     */
                    } else {
                        JOptionPane.showMessageDialog(null, "Ditt lärarID och nuvarande lösenord matchar inte!");
                    }

                } catch (InfException e) {
                    JOptionPane.showMessageDialog(null, "Något gick fel!");
                    System.out.println("Internt felmeddelande:" + e.getMessage());
                }
            }
        }
    }//GEN-LAST:event_btnAndraActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAndra;
    private javax.swing.JLabel btnTillbaka;
    private javax.swing.JLabel iconLas;
    private javax.swing.JLabel lbAnvandarnamn;
    private javax.swing.JLabel lbNuvarandeLosen;
    private javax.swing.JLabel lbNyttLosen;
    private javax.swing.JLabel lbRubrik;
    private javax.swing.JTextField txtLararid;
    private javax.swing.JPasswordField txtNuvarandeLosen;
    private javax.swing.JPasswordField txtNyttLosen;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * VentanaLogin.java
 *
 * Created on 13/12/2011, 02:33:21 PM
 */

package GUI;

import Dominio.Usuario;
import Motor.ControladorUsuario;
import javax.swing.JOptionPane;

/**
 *
 * @author RS
 */
public class VentanaLogin extends javax.swing.JFrame {
    private String strTitle= "Usuarios-Gamble´s Sport";

    /** Creates new form VentanaLogin */
    public VentanaLogin() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        nNick = new javax.swing.JTextField();
        nPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Inicie Sesión", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setName("Inicia Sesión"); // NOI18N
        jPanel1.setOpaque(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nickname:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password:");

        jButton1.setBackground(new java.awt.Color(0, 102, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Red-Casino-Chips-32.png"))); // NOI18N
        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        nNick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nNickActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nNick, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(nPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(61, 61, 61))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nNick, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        jPanel1.setBounds(270, 150, 310, 290);
        jLayeredPane1.add(jPanel1, javax.swing.JLayeredPane.DRAG_LAYER);
        jPanel1.getAccessibleContext().setAccessibleName("Inicia Sesión");

        jLabel1.setBackground(new java.awt.Color(0, 102, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo.png"))); // NOI18N
        jLabel1.setBounds(0, -50, 800, 640);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenuBar1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24))); // NOI18N
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 24));

        jMenu1.setText("Options");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 24));
        jMenuItem1.setText("Regresar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nNickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nNickActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nNickActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        VentanaHome home = new VentanaHome();
        home.setVisible(true);
        this.dispose();
}//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Usuario auxPassword;

        if(nNick.getText().isEmpty() == false && nPassword.getText().isEmpty()== false){

            auxPassword = ControladorUsuario.buscarUsuario(nNick.getText());

            if (auxPassword.getPassword() != null ){
                if ((nPassword.getText().equals(auxPassword.getPassword()))){
                JOptionPane.showMessageDialog(null, "Bienvenido " + nNick.getText(), strTitle,
                        JOptionPane.INFORMATION_MESSAGE);
                        VentanaXML xml = new VentanaXML();
                        xml.setVisible(true);
                        this.dispose();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Contraseña invalida para Usuario"+ nNick.getText(), strTitle,
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Nickname y/o Contraseña inavlidos", strTitle,
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Debe llenar todos lo campos", strTitle,
                        JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nNick;
    private javax.swing.JPasswordField nPassword;
    // End of variables declaration//GEN-END:variables

}

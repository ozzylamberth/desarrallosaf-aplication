/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * VentanaApuestas.java
 *
 * Created on 07/01/2012, 04:05:44 PM
 */

package GUI;

import Dominio.Usuario;
import Dominio.Evento;
import Motor.ControladorUsuario;
import java.lang.String;

/**
 *
 * @author Patricia
 */
public class VentanaApuestas extends javax.swing.JFrame {
   
    private Evento eventoActual;
    private String categoria;


    /** Creates new form VentanaApuestas */
    public VentanaApuestas() {
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
        jMoto = new javax.swing.JButton();
        jCaballo = new javax.swing.JButton();
        jFutbol = new javax.swing.JButton();
        jFormula = new javax.swing.JButton();
        jBeisbol = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jNba = new javax.swing.JButton();
        jMasCategorias = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/moto.jpg"))); // NOI18N
        jMoto.setText("jButton1");
        jMoto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 51), new java.awt.Color(0, 102, 51), new java.awt.Color(0, 102, 51), new java.awt.Color(0, 102, 51)));
        jMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMotoActionPerformed(evt);
            }
        });
        jMoto.setBounds(50, 200, 200, 110);
        jLayeredPane1.add(jMoto, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jCaballo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/caballo.jpg"))); // NOI18N
        jCaballo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 51), new java.awt.Color(0, 102, 51), new java.awt.Color(0, 102, 51), new java.awt.Color(0, 102, 51)));
        jCaballo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCaballoActionPerformed(evt);
            }
        });
        jCaballo.setBounds(550, 200, 200, 110);
        jLayeredPane1.add(jCaballo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jFutbol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/futbol.jpg"))); // NOI18N
        jFutbol.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 51), new java.awt.Color(0, 102, 51), new java.awt.Color(0, 102, 51), new java.awt.Color(0, 102, 51)));
        jFutbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFutbolActionPerformed(evt);
            }
        });
        jFutbol.setBounds(60, 470, 190, 110);
        jLayeredPane1.add(jFutbol, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jFormula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/formula1.gif"))); // NOI18N
        jFormula.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 51), new java.awt.Color(0, 102, 51), new java.awt.Color(0, 102, 51), new java.awt.Color(0, 102, 51)));
        jFormula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormulaActionPerformed(evt);
            }
        });
        jFormula.setBounds(300, 200, 190, 110);
        jLayeredPane1.add(jFormula, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jBeisbol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/beibol.jpg"))); // NOI18N
        jBeisbol.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 51), new java.awt.Color(0, 102, 51), new java.awt.Color(0, 102, 51), new java.awt.Color(0, 102, 51)));
        jBeisbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeisbolActionPerformed(evt);
            }
        });
        jBeisbol.setBounds(550, 470, 200, 110);
        jLayeredPane1.add(jBeisbol, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Moto GP");
        jLabel2.setBounds(100, 170, 100, 30);
        jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 30));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Selecciona la categoria de tu preferencia");
        jLabel3.setBounds(110, 100, 560, 60);
        jLayeredPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Hipismo");
        jLabel5.setBounds(600, 170, 90, 30);
        jLayeredPane1.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Futbol");
        jLabel6.setBounds(120, 440, 70, -1);
        jLayeredPane1.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Beisbol");
        jLabel7.setBounds(610, 440, 80, 30);
        jLayeredPane1.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Formula 1");
        jLabel8.setBounds(350, 170, 120, -1);
        jLayeredPane1.add(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("NBA");
        jLabel10.setBounds(380, 440, 60, -1);
        jLayeredPane1.add(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jNba.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nba2.png"))); // NOI18N
        jNba.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 51), new java.awt.Color(0, 102, 51), new java.awt.Color(0, 102, 51), new java.awt.Color(0, 102, 51)));
        jNba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNbaActionPerformed(evt);
            }
        });
        jNba.setBounds(300, 470, 200, 110);
        jLayeredPane1.add(jNba, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMasCategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/more.png"))); // NOI18N
        jMasCategorias.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 51), new java.awt.Color(0, 102, 51), new java.awt.Color(0, 102, 51), new java.awt.Color(0, 102, 51)));
        jMasCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMasCategoriasActionPerformed(evt);
            }
        });
        jMasCategorias.setBounds(300, 320, 190, 110);
        jLayeredPane1.add(jMasCategorias, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo.png"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 51), new java.awt.Color(0, 102, 51), new java.awt.Color(0, 102, 51), new java.awt.Color(0, 102, 51)));
        jLabel1.setBounds(0, -50, 800, 700);
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
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        VentanaMenu menu = new VentanaMenu();
        menu.setVisible(true);
        this.dispose();
}//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMotoActionPerformed
        // TODO add your handling code here:
        categoria="MotoGP";
        VentanaEventos evento = new VentanaEventos(categoria);
        evento.setVisible(true);
        this.dispose();
       
    }//GEN-LAST:event_jMotoActionPerformed

    private void jCaballoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCaballoActionPerformed
        // TODO add your handling code here:
        categoria="Horses86";
        VentanaEventos evento = new VentanaEventos(categoria);
        evento.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jCaballoActionPerformed

    private void jFormulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormulaActionPerformed
        // TODO add your handling code here:
        categoria="F1";
        VentanaEventos evento = new VentanaEventos(categoria);
        evento.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jFormulaActionPerformed

    private void jFutbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFutbolActionPerformed
        // TODO add your handling code here:
        categoria="Futbol";
        VentanaEventos evento = new VentanaEventos(categoria);
        evento.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jFutbolActionPerformed

    private void jBeisbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeisbolActionPerformed
        // TODO add your handling code here:
         categoria="Baseball";
        VentanaEventos evento = new VentanaEventos(categoria);
        evento.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBeisbolActionPerformed

    private void jNbaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNbaActionPerformed
        // TODO add your handling code here:
        categoria="NBA";
        VentanaEventos evento = new VentanaEventos(categoria);
        evento.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jNbaActionPerformed

    private void jMasCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMasCategoriasActionPerformed
        // TODO add your handling code here:
        VentanaCategoria categorias = new VentanaCategoria();
        categorias.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMasCategoriasActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaApuestas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBeisbol;
    private javax.swing.JButton jCaballo;
    private javax.swing.JButton jFormula;
    private javax.swing.JButton jFutbol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JButton jMasCategorias;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JButton jMoto;
    private javax.swing.JButton jNba;
    // End of variables declaration//GEN-END:variables

}

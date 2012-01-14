/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * VentanaEvento.java
 *
 * Created on 08/01/2012, 06:23:21 PM
 */

package GUI;
import Dominio.Competidor;
import Motor.ControlEvento;
import Dominio.Evento;
import Dominio.Usuario;
import Interface.InterfaceEnlace;
import Interface.Motor;
import Motor.PDF;
import java.lang.Integer;
import java.lang.String;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Vector;
//import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;
import java.util.Map;

/**
 *
 * @author RS
 */

    /** Creates new form VentanaEvento */
public class VentanaEventos extends javax.swing.JFrame {
     private final static Logger log = Logger.getLogger(VentanaEventos.class);
     private Usuario usuarioMostrar;
     private String categoriaActual;

     private String strTitle = "Eventos-Gamble´s Sport";
    ControlEvento controlEvento = new ControlEvento();
     private static InterfaceEnlace miMotor = Motor.getMotorImplementacion();

    /** Creates new form VentanaAgregarEvento */
    public VentanaEventos(String categoria) {
        //usuarioMostrar = ControladorUsuario.buscarUsuario(nickUsuario);
        categoriaActual=categoria;
        initComponents();
        mostrarTabla();


    }

    private VentanaEventos() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

   

    private void mostrarTabla() {
       
        DefaultTableModel dm = new DefaultTableModel();
        dm.addColumn("Evento");
        ArrayList<Evento> eventos = miMotor.todosLosEventos();
        int cont =0;
        for (Evento evento : eventos) {
              Vector row = new Vector();
            if (evento.getCategoryName().equals(categoriaActual)) {
                row.add(evento.getName());
                dm.addRow(row);
            } else {
              log.info("No hay eventos para esta categoria");
            cont=cont++;

            }
         this.jTablaEventos.setModel(dm);
//         if (cont == row.size()){
//            JOptionPane.showMessageDialog(null, "No hay eventos disponibles para esta categoria", strTitle,
//                    JOptionPane.WARNING_MESSAGE);
//        this.dispose();
//        }
        }
        


    }

    private void mostrarEvento(String name) throws ParseException {
        Evento eventoMostrar = this.miMotor.buscarEvento(name);

        this.jNombre.setText(eventoMostrar.getName());
        this.jCategoria.setText(eventoMostrar.getCategoryName());
        this.jFecha_ini.setText(eventoMostrar.getDate_ini());
        this.jFecha_fin.setText(eventoMostrar.getDate_fin());
        jComboBox1.removeAllItems();
        this.mostrarTablaCompetidores(eventoMostrar.getNameCompetitor());
       }
    private void mostrarTablaCompetidores(ArrayList<Competidor> competidores) throws ParseException {
        DefaultTableModel dm = new DefaultTableModel();
        dm.addColumn("Competidores");
        dm.addColumn("Apuesta Maxima");
        int cont =0;
        for (Competidor competidor : competidores) {

              jComboBox1.addItem(competidor.getNameCompetitor());
        }
        
        for (Competidor competidor : competidores) {
              Vector row = new Vector();
              row.add(competidor.getNameCompetitor());
              row.add(competidor.getMax_amount());
              dm.addRow(row);
              this.jTablaCompetidores.setModel(dm);
        }
        
            
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
        jLabel1 = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jNombre = new javax.swing.JTextField();
        jFecha_fin = new javax.swing.JTextField();
        jCategoria = new javax.swing.JTextField();
        jFecha_ini = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablaCompetidores = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jApuesta = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaEventos = new javax.swing.JTable();
        jRegresar = new javax.swing.JButton();
        jNick = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo.png"))); // NOI18N
        jLabel1.setBounds(0, 0, 800, 570);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EVENTOS DISPONIBLES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel2.setBounds(50, 130, 260, 340);
        jLayeredPane2.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EVENTO SELECCIONADO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setOpaque(false);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha Inicio:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fecha Fin:");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Categoria:");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));

        jNombre.setBackground(new java.awt.Color(102, 102, 102));
        jNombre.setEnabled(false);
        jNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNombreActionPerformed(evt);
            }
        });

        jFecha_fin.setBackground(new java.awt.Color(102, 102, 102));
        jFecha_fin.setEnabled(false);

        jCategoria.setBackground(new java.awt.Color(102, 102, 102));
        jCategoria.setEnabled(false);

        jFecha_ini.setBackground(new java.awt.Color(102, 102, 102));
        jFecha_ini.setEnabled(false);

        jTablaCompetidores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTablaCompetidores.setEnabled(false);
        jTablaCompetidores.setRowHeight(40);
        jTablaCompetidores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTablaCompetidoresMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTablaCompetidores);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione" }));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Competidores:");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Monto Apostar:");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Bs.F");

        jApuesta.setText("0");

        jButton1.setBackground(new java.awt.Color(0, 102, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Apostar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jButton1PropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, 0, 119, Short.MAX_VALUE)
                            .addComponent(jCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(jFecha_fin, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(jFecha_ini, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(jNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(jApuesta, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10))
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(33, 33, 33))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jFecha_ini, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jFecha_fin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBounds(450, 30, 300, 490);
        jLayeredPane2.add(jPanel1, javax.swing.JLayeredPane.DRAG_LAYER);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EVENTOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setOpaque(false);

        jTablaEventos.setFont(new java.awt.Font("Tahoma", 0, 18));
        jTablaEventos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTablaEventos.setRowHeight(40);
        jTablaEventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTablaEventosMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTablaEventos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBounds(70, 150, 220, 290);
        jLayeredPane2.add(jPanel3, javax.swing.JLayeredPane.DRAG_LAYER);

        jRegresar.setText("Regresar");
        jRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRegresarActionPerformed(evt);
            }
        });
        jRegresar.setBounds(480, 570, 130, 50);
        jLayeredPane2.add(jRegresar, javax.swing.JLayeredPane.DRAG_LAYER);

        jNick.setFont(new java.awt.Font("Tahoma", 0, 18));
        jNick.setForeground(new java.awt.Color(204, 255, 255));
        jNick.setBounds(650, 20, 120, 30);
        jLayeredPane2.add(jNick, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane2.setBounds(10, 0, 780, 560);
        jLayeredPane1.add(jLayeredPane2, javax.swing.JLayeredPane.DRAG_LAYER);

        jMenuBar1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24))); // NOI18N
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 24));

        jMenu1.setText("Options");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 24));
        jMenuItem1.setText("Regresar");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem1MousePressed(evt);
            }
        });
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
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MousePressed
        // TODO add your handling code here:
}//GEN-LAST:event_jMenuItem1MousePressed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
//         TODO add your handling code here:
        VentanaApuestas apuesta = new VentanaApuestas();
        apuesta.setVisible(true);
        this.dispose();
}//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRegresarActionPerformed
        // TODO add your handling code here:
        //        VentanaBienvenida bienvenida=new VentanaBienvenida();
        //        bienvenida.setVisible(true);
        //        this.dispose();
}//GEN-LAST:event_jRegresarActionPerformed

    private void jTablaEventosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaEventosMouseReleased
        //         TODO add your handling code here:
        int row = this.jTablaEventos.getSelectedRow();
        String name = (String) this.jTablaEventos.getModel().getValueAt(row, 0);
        try {
            this.mostrarEvento(name);
        } catch (ParseException ex) {
            log.error("No se pudo mostrar los eventos");
        }
}//GEN-LAST:event_jTablaEventosMouseReleased

    private void jTablaCompetidoresMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaCompetidoresMouseReleased
        // TODO add your handling code here:
}//GEN-LAST:event_jTablaCompetidoresMouseReleased

    private void jNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNombreActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jNombreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        boolean resultado = false;
        Date fechaMayor;
        Date fechaMenor;
        String Nombre = jNombre.getText().toString();
        String Competidor = (String) jComboBox1.getSelectedItem();
        int apuestaU =0;
        apuestaU= Integer.parseInt(jApuesta.getText());
        String Apuesta = "";
        Evento evento = new Evento();
        evento = miMotor.buscarEvento(Nombre);
        String fechaF = evento.getDate_fin();
        String fechaI = evento.getDate_ini();
        ArrayList<Competidor> competidoresE = new ArrayList<Competidor>();
        competidoresE = evento.getNameCompetitor();
        Date fechaActual = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("hh:mm:ss");
        formateador.format(fechaActual);
        SimpleDateFormat sdf;
        sdf = new SimpleDateFormat("dd-M-yyyy"  );
        Date fechaFin = null;
            try {
                fechaFin = sdf.parse(fechaF);//Cambio Fecha en Formato DATE
                SimpleDateFormat formateador2 = new SimpleDateFormat("hh:mm:ss");
                formateador2.format(fechaFin);
                fechaFin.setHours(23);
                fechaFin.setMinutes(59);
                fechaFin.setSeconds(00);
            } catch (ParseException ex) {

                log.error("Problemas con la fecha",ex);
            }

            SimpleDateFormat sdf2;
            sdf2 = new SimpleDateFormat("dd-M-yyyy"  );
            Date fechaInicio = null;
            try {
                fechaInicio = sdf2.parse(fechaI);//Cambio Fecha en Formato DATE
                SimpleDateFormat formateador3 = new SimpleDateFormat("hh:mm:ss");
                formateador3.format(fechaInicio);
                fechaInicio.setHours(8);
                fechaInicio.setMinutes(00);
                fechaInicio.setSeconds(00);
            } catch (ParseException ex) {

                log.error("Problemas con la fecha ",ex);
            }

              Map resultadoMap = new HashMap();

       /* Verificamos cual es la mayor de las dos fechas
        */
//       if (fechaFin.compareTo(fechaActual) > 0){
            fechaMayor = fechaFin;
            fechaMenor = fechaActual;
//            }else{
//                fechaMayor = fechaActual;
//                fechaMenor = fechaFin;
//            }

      //los milisegundos
       long diferenciaMils = fechaMayor.getTime() - fechaMenor.getTime();

       //obtenemos los segundos
       long segundos = diferenciaMils / 1000;

       //obtenemos las horas
       long horas = segundos / 3600;

       //restamos las horas para continuar con minutos
       segundos -= horas*3600;

       //igual que el paso anterior
       long minutos = segundos /60;
       segundos -= minutos*60;

       //ponemos los resultados en un mapa
       resultadoMap.put("horas",Long.toString(horas));
       resultadoMap.put("minutos",Long.toString(minutos));
       resultadoMap.put("segundos",Long.toString(segundos)); 

      
       int pos=1;
       String status="NO ENVIADO";
        for (int i=0; i<competidoresE.size();i++){
                if (competidoresE.get(i).getNameCompetitor().equals(Competidor)){
                    Apuesta= competidoresE.get(i).getMax_amount();
                    if ((Integer.parseInt(Apuesta)> apuestaU) && (apuestaU)>0){
                        resultado=miMotor.agregarApuesta(evento.getName(), evento.getCategoryName(),competidoresE.get(i).getNameCompetitor(), pos, apuestaU, fechaActual, status, evento.getCategory_type());
                         PDF pdf= new PDF(evento.getName(), competidoresE.get(i).getNameCompetitor(),evento.getCategoryName(),apuestaU);
                         pdf.setVisible(true);
                         pdf.setBounds(0, 0, 100, 100);
                         pdf.setDefaultCloseOperation(EXIT_ON_CLOSE);
                         pdf.setLocationRelativeTo(null);
    
                        if (resultado){
                             JOptionPane.showMessageDialog(this, "Apuesta Agregada",strTitle,JOptionPane.OK_OPTION);

                        }
            
                    }
                    else{
                    JOptionPane.showMessageDialog(this, "Monto Errado: El monto permitido para este competidor debe estar comprendio entre 1 y" + " "+ Apuesta+ " "+ "BsF.",strTitle,JOptionPane.ERROR_MESSAGE);
                    }
                }

            }
       
  

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jButton1PropertyChange
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton1PropertyChange

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEventos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jApuesta;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField jCategoria;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JTextField jFecha_fin;
    private javax.swing.JTextField jFecha_ini;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel jNick;
    private javax.swing.JTextField jNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jRegresar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablaCompetidores;
    private javax.swing.JTable jTablaEventos;
    // End of variables declaration//GEN-END:variables

}

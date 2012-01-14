package Motor;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Clase que permite generar el pdf
 * @author @author RS
 * @version 1.0
 * 
 */

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.swing.*;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.ImgCCITT;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.lang.String;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.table.TableModel;






public class PDF extends JFrame  {



	JButton crear;
        JFileChooser selector;
	JEditorPane texto;
        private JTextField textLogo,textTitulo;
        private Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD);
        private Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD);
        private String name2="";
        private String nameCompetitor2="";
        private String category2="";
        private int amount2=0;

      /**
     * constructor de la clase
       * aqui se despliega toda la logica para escribir en pdf
      */
	 public PDF(String name, String nameCompetitor, String categoryName, int apuestaU) {


            name2=name;
            nameCompetitor2 =nameCompetitor;
            category2=categoryName;
            amount2=apuestaU;



        Paragraph preface = new Paragraph();
        preface.setAlignment(Paragraph.ALIGN_CENTER);
        
		JPanel p=new JPanel();
		crear=new JButton("Generar PDF");
		crear.addActionListener(new ActionListener(){

     /**
     * Implementacion de la accion del boton Generar PDF
     * @param ActionEvent e accion a realizar
     */
			@Override
			public void actionPerformed(ActionEvent e) {
				selector=new JFileChooser();
				int op=selector.showSaveDialog(PDF.this);
				if(op==JFileChooser.APPROVE_OPTION){
					try {
						OutputStream archivo=new FileOutputStream(selector.getSelectedFile());
						Document doc=new Document();
						PdfWriter.getInstance(doc, archivo);
						doc.open();
                                                introducirLogo(doc);
                                                crearPaginaPresentacion(doc);
                                                doc.add(new Paragraph(texto.getText()));
						doc.close();
						archivo.close();
                                                 JOptionPane.showMessageDialog(null, "PDF Generado Con Exito", "Generado",
                        JOptionPane.INFORMATION_MESSAGE);

					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (DocumentException ex) {
						// TODO Auto-generated catch block
						ex.printStackTrace();
					} catch (IOException ex2) {
						// TODO Auto-generated catch block
						ex2.printStackTrace();
					}
				}
			}

		});
		p.add(crear);

		add(p,BorderLayout.NORTH);

		texto=new JEditorPane();
               add(new JScrollPane(texto));

	}

  

/**
     * firma introducir el logo de la compañia Gamble's UCAB en el PDF
     * @param document objeto de tipo document
     */
private void introducirLogo(Document document) {
    
        try {

            textLogo = new JTextField("aa.png");
            Image img = Image.getInstance(textLogo.getText());
            img.scalePercent(100);
            img.setAlignment(Image.ALIGN_LEFT);
            document.add(img.getInstance("aa.png"));

        } catch (DocumentException ex) {
            ex.printStackTrace();
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    
    }

/**
     * firma para crear un parrafo en blanco
     * @param paragraph objeto de tipo Paragraph
     * @param number Tipo de dato entero
     */
    
    private void lineaVacia(Paragraph paragraph, int number) {
        for (int i = 0; i < number; i++) {
            paragraph.add(new Paragraph(" "));
        }
    }

    /**
     * firma para crear el encabezado e informacion del PDF
     * @param document objeto de tipo Document
     */
    public void crearPaginaPresentacion(Document document) {

        Paragraph preface = new Paragraph();
        preface.setAlignment(Paragraph.ALIGN_CENTER);
        lineaVacia(preface, 2);
        // añade el título.
//        preface.add(new Paragraph(textTitulo.getText(), catFont));
        //añade nombre del creadro y fecha.
        SimpleDateFormat formateador = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy", new Locale("ES"));
        Date date = new Date();
        String fecha = formateador.format(date);
        preface.add(new Paragraph("Direccion:Av. Teherán, Montalbán. Parroquia La Vega, Municipio Libertador. ZP 1020             Caracas-Venezuela, RIF J-0012312-2  " , smallBold));
        preface.add(new Paragraph("Fecha: " + fecha, smallBold));

        lineaVacia(preface, 2);
        preface.add(new Paragraph("APUESTA REALIZADA" , catFont));

        lineaVacia(preface, 3);
         preface.add(new Paragraph("Datos Evento:" + " Nombre: " +name2+  "  Nombre del Competidor: " + nameCompetitor2 + "  Monto Apostado:  "+amount2+ "                            Categoria :"+category2+ "  " , smallBold));

         try {
             Paragraph preface2 = new Paragraph();
        preface2.setAlignment(Paragraph.ALIGN_CENTER);
        lineaVacia(preface2, 2);
            textTitulo = new JTextField("recibo.png");
            Image img = Image.getInstance(textTitulo.getText());
            img.scalePercent(100);
            img.setAlignment(Image.ALIGN_CENTER);
            document.add(img.getInstance("recibo.png"));
        } catch (DocumentException ex) {
            ex.printStackTrace();
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        lineaVacia(preface, 1);


        try {
            document.add(preface);
        } catch (DocumentException ex) {
            ex.printStackTrace();
        }
       
        // Empieza una nueva página.
//        document.newPage();
    }

//    public void CargarApuestaPDF(String name, String nameCompetitor,String category){
//
//
//
//
//     Paragraph preface = new Paragraph();
//        preface.setAlignment(Paragraph.ALIGN_CENTER);
//        lineaVacia(preface, 2);
//
//    preface.add(new Paragraph("Datos Evento:" + " Nombre: " +name+ "Nombre del Competido: " +nameCompetitor+ "Categoria :" , smallBold));
//
//
//    }

      

	

}

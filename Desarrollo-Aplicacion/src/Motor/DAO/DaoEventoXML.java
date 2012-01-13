/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Motor.DAO;
import Dominio.Categoria;
import Dominio.Competidor;
import Dominio.Evento;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;
import Dominio.Evento;
import Dominio.ListaEventos;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

/**
 *
 * @author RS
 */
public class DaoEventoXML {


/** variable que contiene la raiz del documento Xml*/
    private Element root;
    /** variable que contiene la localizacion del archivo xml*/
    private String fileLocation = "G:/Events.xml";
    /** atributo para el manejo de log4j*/
    private final static Logger log = Logger.getLogger(DaoEventoXML.class);
    private String strTitle = "Mensaje-Gamble´s Sport";
    Evento eventoFinal;
    ListaEventos listaEventos;
    private ArrayList<Evento> eventoR;



    /**
     * constructor por defecto que inicia los valores para trabajar con el documento
     * xml
     */
    public ArrayList<Evento> todosLosEventos() {
        try {
            SAXBuilder builder = new SAXBuilder(false);
            Document doc = builder.build("Events.xml");
            Element raiz = doc.getRootElement();
            List evento1 = raiz.getChildren("event");
            Iterator k = evento1.iterator();
            eventoR = new ArrayList<Evento>();
            while (k.hasNext()) {
                Element e = (Element) k.next();
                Element nombre = e.getChild("name");
                Element categoria = e.getChild("categoryName");
                Element tipoCategoria = e.getChild("category_type");
                Element fechaI = e.getChild("date_ini");
                Element fechaF = e.getChild("date_fin");
                Element ganador = e.getChild("winner");
                Element administradorNombre = e.getChild("administratorName");
                Element administradorApellido = e.getChild("lastname");
                Element administradorCedula = e.getChild("ci");


                Element competidores = e.getChild("competitors");
                List archivo1 = competidores.getChildren("competitor");
                Iterator m = archivo1.iterator();

                Evento evento = new Evento();

                evento.setName(nombre.getText());
                evento.setAdministratorName(administradorNombre.getText());
                evento.setCategoryName(categoria.getText());
                evento.setCategory_type(tipoCategoria.getText());
                evento.setCi(administradorCedula.getText());
                evento.setDate_fin(fechaF.getText());
                evento.setDate_ini(fechaI.getText());
                evento.setLastname(administradorApellido.getText());
                evento.setWinner(ganador.getText());
                evento.setNameCompetitor(new ArrayList<Competidor>());

               
                 while (m.hasNext()) {
                     Element f = (Element) m.next();
                     Element nombreC = f.getChild("nameCompetitor");
                     Element apuesta = f.getChild("max_amount");
                     Competidor competidores1 = new Competidor();
                     competidores1.setNameCompetitor(nombreC.getText());
                     competidores1.setMax_amount(apuesta.getText());
                     evento.getNameCompetitor().add(competidores1);
            }
               
                eventoR.add(evento);
            }
        } catch (Exception e) {
            log.error("se suspendio cargando XMl",e);
            System.out.println("se cayo cargando el xml");
        }
        return eventoR;
    }
public Evento buscarEvento(String nombre)
{
    String nom = "";
    nom=nombre;
    Evento evento = new Evento();
    for(int i = 0; i < eventoR.size(); i++){
        if (eventoR.get(i).getName().equals(nom)){
            evento = eventoR.get(i);
        }
       }
       return evento;
}
     


}

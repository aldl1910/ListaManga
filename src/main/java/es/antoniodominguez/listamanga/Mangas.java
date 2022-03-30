package es.antoniodominguez.listamanga;

import java.util.ArrayList;
import javafx.stage.Stage;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Mangas {
    private ArrayList<Manga> listaMangas  = new ArrayList();
    
    public ArrayList<Manga> getListaMangas (){
        return listaMangas;
    }
    @XmlElement(name = "Manga")
    public void setListaMangas(ArrayList<Manga> listaMangas){
        this.listaMangas = listaMangas;
    }
    
     // INSERTAR LIBROS
//    public void insertarMangas (Stage stage, Mangas mangas){
//        Mangas mangasImport = UtilXML.cargarDatosXML(stage);
//        for (int i=0; i < mangasImport.getListaMangas().size(); i++ ){
//            mangas.getListaMangas().add(i);
//        }
//    }
}

package es.antoniodominguez.listamanga;

import java.util.ArrayList;
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
    
     // FUSIONAR MANGAS
    public void fusionarMangas (Mangas mangasNuevos){
       this.getListaMangas().addAll(mangasNuevos.getListaMangas());
       listaMangas.forEach(System.out::println);
    }
}

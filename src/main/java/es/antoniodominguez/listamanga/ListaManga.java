package es.antoniodominguez.listamanga;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ListaManga {
    private ArrayList<Manga> listaMangas  = new ArrayList();
    
    public ArrayList<Manga> getListaMangas (){
        return listaMangas;
    }
    @XmlElement(name = "Manga")
    public void setListaMangas(ArrayList<Manga> listaMangas){
        this.listaMangas = listaMangas;
    }
}

package es.antoniodominguez.listamanga;

import java.io.File;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class UtilXML {
    public static void guardarDatosXML(Stage stage, Mangas listaMangas){
        JAXBContext contexto;
        try {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Guardar XML en");
            //fileChooser.
            File fileListaManga = fileChooser.showSaveDialog(stage);

            //File ficheroAlmacenado = new File("ListaLibros.xml");
            contexto = JAXBContext.newInstance(Mangas.class);
            Marshaller marshaller = contexto.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(listaMangas, System.out);
            marshaller.marshal(listaMangas, fileListaManga);
        } catch (JAXBException ex) {
            System.out.println("Se ha producido un error");
            ex.printStackTrace();
        }
    }
    
    public static Mangas cargarDatosXML(Stage stage){
        try {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Importar XML");
            File fileManga = fileChooser.showSaveDialog(stage);
            
            JAXBContext context = JAXBContext.newInstance( Mangas.class );
            Unmarshaller unmarshaller = context.createUnmarshaller();
            
            Mangas mangas = (Mangas)unmarshaller.unmarshal(fileManga);
            return mangas;
        } catch (JAXBException e) {
            // TODO Auto-generated catch block
            System.out.println("Se ha producido un error");
            e.printStackTrace();
            return null;
        }
    }
}

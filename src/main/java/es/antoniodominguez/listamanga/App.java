package es.antoniodominguez.listamanga;

import java.io.File;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.stage.Stage;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {

//        var scene = new Scene(new StackPane(), 640, 480);
//        stage.setScene(scene);
//        stage.show();

        Manga manga1 = new Manga("Berserk", "Kentaro Miura");
        System.out.println(manga1.getTitulo());
        manga1.setTitulo("Duranki");
        System.out.println(manga1.getTitulo());
        
        Manga manga2 = new Manga();
        Manga manga3 = new Manga("Noah");
        
        ListaManga listaMangas = new ListaManga();
        listaMangas.getListaMangas().add(manga1);
        listaMangas.getListaMangas().add(manga2);
        listaMangas.getListaMangas().add(manga3);
        
//        listaMangas.add(manga1);
//        listaMangas.add(manga2);
//        listaMangas.add(manga3);
//        
//        // Mostrar el titulo del tercer libro
//        System.out.println(listaMangas.get(2).getTitulo());
//        
//        // Eliminar segundo libro
//        listaMangas.remove(1);
//        
//        // Mostrar todos los libros de la lista
//        for(int i=0; i<listaMangas.size(); i++){
//            System.out.println(listaMangas.get(i).getTitulo());
//        }  
        
        JAXBContext contexto;
        try {
            File fileListaMangas = new File("ListaMangas.xml");
            contexto = JAXBContext.newInstance(ListaManga.class);
            Marshaller marshaller = contexto.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(listaMangas, System.out);
            marshaller.marshal(listaMangas, fileListaMangas);
        } catch (JAXBException ex) {
            System.out.println("Se ha producido un error");
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }

}
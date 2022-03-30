package es.antoniodominguez.listamanga;

import java.io.File;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;


/**
 * JavaFX App
 */
public class App extends Application {
    Pane root;
    
    @Override
    public void start(Stage stage) {

        HBox root = new HBox();
        //root.setAlignment(Pos.center);
        root.setSpacing(10);
        var scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        stage.show();  

        Manga manga1 = new Manga("Berserk", "Kentaro Miura");
        System.out.println(manga1.getTitulo());
        
        Manga manga2 = new Manga("Duranki");
        Manga manga3 = new Manga("Noah");
        manga3.setTitulo("XML en Java 2");
        manga3.setPrecio(25.10f);
        manga2.setPrecio(22.01f);
        
        Mangas mangas = new Mangas();
        mangas.getListaMangas().add(manga1);
        mangas.getListaMangas().add(manga2);
        mangas.getListaMangas().add(manga3);
        
        Button buttonSelecFile = new Button("Guardar XML");
        root.getChildren().add(buttonSelecFile);
        buttonSelecFile.setOnAction((t) -> {
            UtilXML.guardarDatosXML(stage, mangas);
        });
        
        Button buttonImportFile = new Button("Importar XML");
        root.getChildren().add(buttonImportFile);
        buttonImportFile.setOnAction((t) -> {
            Mangas mangasImport = UtilXML.cargarDatosXML(stage);
            System.out.print("Número de libros importados: ");
            System.out.println(mangasImport.getListaMangas().size());
            System.out.println(mangasImport.getListaMangas().get(0));
            System.out.println(mangasImport.getListaMangas().get(1));
            System.out.println(mangasImport.getListaMangas().get(2));
        });
        
    }

    public static void main(String[] args) {
        launch();
    }

}
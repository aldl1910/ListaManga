package es.antoniodominguez.listamanga;

import java.io.File;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
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
   
    int mangaActual = 0;
    static Contenido contenido = new Contenido();
    
    @Override
    public void start(Stage stage) {
        
        BorderPane root = new BorderPane();
        var scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        stage.show();  

        //Manga manga1 = new Manga("Berserk", "Kentaro Miura",40, 23.4f);
        //System.out.println(manga1.getTitulo());
        
        Manga manga2 = new Manga("Duranki");
        Manga manga3 = new Manga("Noah");
        manga3.setTitulo("XML en Java 2");
        manga3.setPrecio(25.10f);
        manga2.setPrecio(22.01f);
        
        Mangas mangas = new Mangas();
       // mangas.getListaMangas().add(manga1);
        mangas.getListaMangas().add(manga2);
        mangas.getListaMangas().add(manga3);
        
         PanelInferior panelInferior = new PanelInferior(mangas);
        PanelSuperior panelSuperior = new PanelSuperior(stage, mangas);
        
        root.setTop(panelSuperior);
        //root.setAlignment(panelSuperior, Pos.CENTER);
        
        root.setCenter(contenido);
        
        root.setBottom(panelInferior);
        root.setPadding(new Insets(20, 30, 20, 30));
        
        panelInferior.setAlignment(Pos.TOP_CENTER);
        panelInferior.setPadding(new Insets(20, 30, 20, 30));
        panelSuperior.setAlignment(Pos.BOTTOM_CENTER);
        panelSuperior.setPadding(new Insets(20, 30, 20, 30));
        contenido.setAlignment(Pos.CENTER);
        Manga manga = mangas.getListaMangas().get(mangaActual);
        contenido.llamadaContenidos(manga);
        
    }

    public static void main(String[] args) {
        launch();
    }

}
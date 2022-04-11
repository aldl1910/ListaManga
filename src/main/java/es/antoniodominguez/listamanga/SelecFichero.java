package es.antoniodominguez.listamanga;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class SelecFichero extends Pane{
    private Desktop desktop = Desktop.getDesktop();
    static File ficheroAlmacenado;
    
    public SelecFichero(Stage stage){
        Button botonArchivo = new Button("Archivo");
        FileChooser fileChooser = new FileChooser();        
        

        botonArchivo.setOnAction(event -> {
            configureFileChooser(fileChooser);    
            File file = fileChooser.showOpenDialog(stage);
            ficheroAlmacenado = file;
            if (file != null) {
                openFile(file);
            }
        });
        
        this.getChildren().add(botonArchivo);
    }
    
    private static void configureFileChooser(
        final FileChooser fileChooser) {      
            fileChooser.setTitle("View xml files");
            fileChooser.setInitialDirectory(
                new File(System.getProperty("user.home"))
            );                 
            fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("All XML", "*.xml"),
                new FileChooser.ExtensionFilter("XML", "*.xml")
            );
    }
    
    private void openFile(File file) {
        try {
            desktop.open(file);
        } catch (IOException ex) {
            Logger.getLogger(
                SelecFichero.class.getName()).log(
                    Level.SEVERE, null, ex
                );
        }
    }
}

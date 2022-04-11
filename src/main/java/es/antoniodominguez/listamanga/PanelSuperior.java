package es.antoniodominguez.listamanga;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class PanelSuperior extends HBox{
    
    Button buttonImportFile = new Button("Importar XML");
    Button buttonSelecFile = new Button("Guardar XML");
    
    public PanelSuperior(Stage stage, Mangas mangas){
        this.getChildren().add(buttonImportFile);
        this.getChildren().add(buttonSelecFile);
        
        buttonSelecFile.setOnAction((t) -> {
            UtilXML.guardarDatosXML(stage, mangas);
        });
        
        buttonImportFile.setOnAction((t) -> {
            Mangas mangasImport = UtilXML.cargarDatosXML(stage);
            System.out.print("Número de libros importados: ");
            System.out.println(mangasImport.getListaMangas().size());
            mangas.fusionarMangas(mangasImport);
        });
    }
}

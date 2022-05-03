package es.antoniodominguez.listamanga;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class PanelInferior extends HBox{
    
    // BOTONES
    Button buttonAnterior = new Button("Anterior");
    Button buttonSiguiente = new Button("Siguiente");
    
    Contenido contenido = App.contenido;
    static int mangaActual=0;
    
    public PanelInferior(Mangas mangas){
        this.getChildren().add(buttonAnterior);
        this.getChildren().add(buttonSiguiente);
        buttonAnterior.setOnAction((t) -> {
            anteriorManga(mangas);
        });
        
        buttonSiguiente.setOnAction((t) -> {
            siguienteManga(mangas);
        });
    }
    
    public void anteriorManga(Mangas mangas){
        
        mangaActual--;
        System.out.println("Libro actual " + mangaActual);

        try{
           Manga manga = mangas.getListaMangas().get(mangaActual);
           contenido.llamadaContenidos(manga);
        }catch(Exception ex){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Límite de mangas superado");
            alert.setContentText("No hay más mangas insertados");
            alert.showAndWait();
            mangaActual++;
            System.out.println("Manga actualizado " + mangaActual);
        }
     
    }
    
    public void siguienteManga(Mangas mangas){
       
        mangaActual++;
        System.out.println("Libro actual " + mangaActual);

        try{
            Manga manga = mangas.getListaMangas().get(mangaActual);
            contenido.llamadaContenidos(manga);
        }catch(Exception ex){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Límite de mangas superado");
            alert.setContentText("No hay más mangas insertados");
            alert.showAndWait();
            ex.printStackTrace();
            mangaActual--;
            System.out.println("Manga actualizado " + mangaActual);
        }
        
    }
}

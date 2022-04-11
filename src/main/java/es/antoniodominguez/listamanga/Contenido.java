package es.antoniodominguez.listamanga;

import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class Contenido extends VBox{
    HBox contenedorTitulo = new HBox(5);
    HBox contenedorAutor = new HBox(5);
    HBox contenedorVolumen = new HBox(5);
    HBox contenedorNumPag = new HBox(5);
    HBox contenedorCapitulos = new HBox(5);
    HBox contenedorPrecio = new HBox(5);
    HBox contenedorFecha = new HBox(5);
    
    Label labelTitulo = new Label("Título: ");
    Label labelAutor = new Label("Autor: ");
    Label labelVolumen = new Label("Volumen: ");
    Label labelNumPag = new Label("Número páginas: ");
    Label labelCapitulos = new Label("Capitulos: ");
    Label labelPrecio = new Label("Precio: ");
    Label labelFecha = new Label("Fecha publicación: ");
    
    Label labelContenidoTitulo = new Label();
    Label labelContenidoAutor = new Label();
    Label labelContenidoVolumen = new Label();
    Label labelContenidoNumPag = new Label();
    Label labelContenidoCapitulos = new Label();
    Label labelContenidoPrecio = new Label();
    Label labelContenidoFecha = new Label();
    
    public Contenido(){
        this.getChildren().addAll(contenedorTitulo,contenedorAutor,contenedorVolumen,contenedorNumPag,contenedorCapitulos,contenedorPrecio,contenedorFecha);
        contenedorTitulo.getChildren().addAll(labelTitulo,labelContenidoTitulo);
        contenedorAutor.getChildren().addAll(labelAutor, labelContenidoAutor);
        contenedorVolumen.getChildren().addAll(labelVolumen, labelContenidoVolumen);
        contenedorNumPag.getChildren().addAll(labelNumPag, labelContenidoNumPag);
        contenedorCapitulos.getChildren().addAll(labelCapitulos, labelContenidoCapitulos);
        contenedorPrecio.getChildren().addAll(labelPrecio, labelContenidoPrecio);
        contenedorFecha.getChildren().addAll(labelFecha, labelContenidoFecha);
    }
    public void contenidoTitulo(Manga manga){
        labelContenidoTitulo.setText(manga.getTitulo());
    }
    public void contenidoAutor(Manga manga){
        labelContenidoAutor.setText(manga.getAutor());
    }
    public void contenidoVolumen(Manga manga){
        labelContenidoVolumen.setText(String.valueOf(manga.getVolumen())); 
    }
    public void contenidoNumPag(Manga manga){
        labelContenidoNumPag.setText(String.valueOf(manga.getNumPaginas()));
    }
    public void contenidoCapitulos (Manga manga){
        labelContenidoCapitulos.setText(String.valueOf(manga.getCapitulos()));   
    }
    public void contenidoPrecio(Manga manga){
        labelContenidoPrecio.setText(String.valueOf(manga.getPrecio()));   
    }
    public void contenidoFecha(Manga manga){
        labelContenidoFecha.setText(manga.getFechaPublicacion());
    }
    
    public void llamadaContenidos(Manga manga){
        contenidoTitulo(manga);
        contenidoAutor(manga);
        contenidoVolumen(manga);
        contenidoNumPag(manga);
        contenidoCapitulos(manga);
        contenidoPrecio(manga);
        contenidoFecha(manga);
    }
}

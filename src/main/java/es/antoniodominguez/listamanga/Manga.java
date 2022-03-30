package es.antoniodominguez.listamanga;


public class Manga {
    private String titulo;
    private String autor;
    private int volumen; 
    private int numPaginas;
    private int capitulos;
    private float precio;
    private String fechaPublicacion;
    
    
    public Manga(){
        
    }
    
    public Manga(String titulo){
        this.titulo = titulo.toUpperCase();
    }
    
    public Manga(String titulo, String autor){
        this.titulo = titulo.toUpperCase();
        this.autor = autor;
    }
    

    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo.toUpperCase();
    }
    
    public String getAutor(){
        return autor;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public int getVolumen(){
        return capitulos;
    }
    
    public void setVolumen(int Volumen){
        this.volumen = volumen;
    }
    
    public int getNumPaginas(){
        return numPaginas;
    }
    
    public void setNumPaginas(int numPaginas){
        this.numPaginas = numPaginas;
    }
    
    public int getCapitulos(){
        return capitulos;
    }
    
    public void setCapitulos(int capitulos){
        this.capitulos = capitulos;
    }
    
    public float getPrecio(){
        return precio;
    }
    
    public void setPrecio(float precio){
        this.precio = precio;
    }
    
    public String getFechaPublicacion(){
        return fechaPublicacion;
    }
    
    public void setFechaPublicacion(String fechaPublicacion){
        this.fechaPublicacion = fechaPublicacion;
    }
    
    @Override
    public String toString(){
        String r = "";
        r += "Titulo: " + titulo + "\n";
        r += "Autor: " + autor + "\n";
        r += "Precio: " + precio + "\n";
        r += "NumPaginas: " + numPaginas + "\n";
        return r;
    }
}

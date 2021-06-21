package peliculas.negocio;


public interface CatalogoPeliculas {
//    agregar();
    public void agregarPelicula(String nombrePelicula,String nombreArchivo);
//    listar();
    public void listarPelicula(String nombreArchivo);
//    buscar();
    public void buscarPelicula(String nombreArchivo,String buscar);
//    iniciarArchivo();
    public void iniciarArchivo(String nombreArchivo);
}

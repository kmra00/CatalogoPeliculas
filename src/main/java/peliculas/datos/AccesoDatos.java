package peliculas.datos;

import java.util.*;
import peliculas.domain.*;
import peliculas.exepciones.*;

public interface AccesoDatos {

    boolean existe(String nombreArchivo) throws AccesoDatosEx;

    public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx;

    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx;

    String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx;

    public void crear(String nombreArchivo) throws AccesoDatosEx;

    public void borrar(String nombreArchivo) throws AccesoDatosEx;
}

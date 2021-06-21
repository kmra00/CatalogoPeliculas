package cpjlaboratoriofinal;

import java.util.Scanner;
import peliculas.negocio.*;

public class CPJLaboratorioFinal {

    private static final Scanner scanner = new Scanner(System.in);
    private static int opcion = -1;
    private static final String nombreArchivo = "Y:\\JAVA\\CURSO_JAVA\\ProyectoPeliculas\\src\\peliculas.txt";
    private static final CatalogoPeliculas catalogoPeli = new CatalogoPeliculasImpl();

    public static void main(String[] args) {

        //mientras la opcion elegida sea 0 , preguntamos al usuario
        while (opcion != 0) {
            try {
                System.out.println("Elige la opcion:\n1.- Iniciar catalogo peliculas"
                        + "\n2.- Agregar pelicula\n"
                        + "3.- Listar Peliculas\n"
                        + "4.- Buscar Pelicula\n"
                        + "0.- Salir");
                opcion = Integer.parseInt(scanner.nextLine());
                //Switch case in Java
                switch (opcion) {
                    case 1:
                        /*creamos el obeto que administra el catalogo de personas
            la creacion del archivo es opcional, de todas maneras se creara
            al escribir por primera vez en el archivo*/
                        catalogoPeli.iniciarArchivo(nombreArchivo);
                        break;
                    case 2:
                        /*agregar informacion al archivo*/
                        System.out.println("Introduce el nombre de la pelicula a agregar:");
                        String nombre = scanner.nextLine();
                        catalogoPeli.agregarPelicula(nombre, nombreArchivo);
                        break;
                    case 3:
                        //lista catalogo completo
                        catalogoPeli.listarPelicula(nombreArchivo);
                        break;
                    case 4:
                        //buscar Pelicula
                        System.out.println("Introduce el nombre de una pelicula a buscar");
                        String buscar = scanner.nextLine();
                        catalogoPeli.buscarPelicula(nombreArchivo, buscar);
                        break;
                    case 0:
                        System.out.println("Hasta pronto!");
                        break;

                    default:
                        System.out.println("Opcion no reconocida");
                        break;
                }
                System.out.println("\n");
            } catch (Exception e) {
                System.out.println("Error!");
            }
        }
    }

}

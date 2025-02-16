/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author Daniel Alvarez Sil
 */

// Importaciones necesarias para el funcionamiento del sistema
import          negocio.InterfazDeReglas;
import          domain.Pelicula;
import static   domain.Print.print;
import          acceso.*;
import          java.util.*;

// Esta clase implementa el comportamiento definido en la interfaz "InterfazDeReglas"
public class ImplementacionDeReglas implements InterfazDeReglas{    
    // Atributos
        // Estáticos
        public static InterfazDeAcceso acceso = new ImplementacionDeAcceso();
        
    // Métodos sobreescritos
        // Método para iniciar el archivo de catálogo de películas
        @Override
        public void iniciarArchivo(String cArgRuta){
            if (ImplementacionDeReglas.acceso.existe(cArgRuta))
                ImplementacionDeReglas.acceso.borrar(cArgRuta);
            ImplementacionDeReglas.acceso.crear(cArgRuta);                
        }
        // Método para agregar una película al catálogo
        @Override
        public void agregarPelicula(String cArgRuta, String cArgPelicula){
            ImplementacionDeReglas.acceso.escribir(new Pelicula(cArgPelicula), cArgRuta, true);
        }
        // Método para listar las películas del catálogo
        @Override
        public void listarPeliculas(String cArgRuta){
            var cListaPeliculas = new StringBuilder().append("Impresion del Catalogo de Peliculas: \n");
            if (ImplementacionDeReglas.acceso.listar(cArgRuta) != null)
                for (var pelicula: ImplementacionDeReglas.acceso.listar(cArgRuta))
                    cListaPeliculas.append("\t").append(pelicula.getIPelicula()).append(".- ").append(pelicula.getCNombre()).append("\n");
            print(cListaPeliculas.toString());
        }
        // Método para buscar una película dentro del catálogo
        @Override
        public void buscarPelicula(String cArgRuta, String cArgPelicula){
            print(ImplementacionDeReglas.acceso.buscar(cArgRuta, cArgPelicula));
        }
        
}

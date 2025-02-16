/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author Daniel Alvarez Sil
 */


// Esta interfaz define las reglas (procesos a usar) para manejar el catálogo de películas
public interface InterfazDeReglas {
    public void iniciarArchivo  (String cArgRuta);
    public void agregarPelicula (String cArgRuta, String cArgPelicula);
    public void listarPeliculas (String cArgRuta);
    public void buscarPelicula  (String cArgRuta, String cArgPelicula);    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acceso;

/**
 *
 * @author Daniel Alvarez Sil
 */

// Importamos la clase Pelicula
import domain.Pelicula;

// Importamos la clase de listas
import java.util.*;

// Esta interfaz contiene el comportamiento que se debe implementar para utilizar la fuente de información (archivo o base de datos)
public interface InterfazDeAcceso {
    public boolean          existe  (String cArgRuta);
    public List<Pelicula>   listar  (String cArgRuta);
    public void             escribir(Pelicula argPelicula, String cArgRuta, boolean boolArgAnexar);
    public String           buscar  (String cArgRuta, String cArgPelicula); 
    public void             crear   (String cArgRuta);
    public void             borrar  (String cArgRuta);    
}

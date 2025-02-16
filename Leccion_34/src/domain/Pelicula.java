/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Daniel Alvarez Sil
 */

public class Pelicula {
    // Atributos 
        // Dinámicos 
        private String cNombre;
        private int    iPelicula; 
        // Estáticos
        private static int iNextPelicula; 
    // Constructores
        // Sin argumentos
        private Pelicula(){
            this.iPelicula = ++Pelicula.iNextPelicula;
        }
        // Con argumentos
        public Pelicula(String cArgNombre){
            this();
            this.cNombre = cArgNombre; 
        }
        public Pelicula(String cArgNombre, int iArgPelicula){
            this.cNombre    = cArgNombre; 
            this.iPelicula  = iArgPelicula; 
        }
    // Métodos
        // Getters y Setters
            // cNombre
            public String getCNombre(){
                return this.cNombre; 
            }
            public void setCNombre(String cArgNombre){
                this.cNombre = cArgNombre; 
            }
            // iPelicula 
            public Integer getIPelicula(){
                return (Integer) this.iPelicula; 
            }
        // Sobreescritos
            // toString
            @Override
            public String toString(){
                return new StringBuilder().append("Pelicula: \n").append("\tNombre: ").append(this.cNombre).append("\n\tID: ").append(this.iPelicula).append("\n").toString();
            }
}

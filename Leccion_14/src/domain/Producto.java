/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Daniel Alvarez Sil
 */

// Importamos el método "print"
import static domain.Print.print;

// Los productos serán añadidos a las instancias de tipo domain.Orden

// La clase para crear instancias de tipo Producto
public class Producto extends Object{
    // Atributos 
        // Dinámicos
        private int     iProducto; 
        private String  cProducto; 
        private double  fPrecio; 
        // Estáticos
        private static int iNextProducto; 
        
    // Constructores
        // Privados
        private Producto(){
            this.iProducto = ++Producto.iNextProducto;             
            print("El constructor para inicializar el ID del producto se esta ejecutando... ");
        }
        // Público
        public Producto(String cArgProducto, double fArgPrecio){
            // Llamamos el constructor público para modificar el ID del Producto
            this();
            // Asignamos el nombre y el precio del Producto
            this.cProducto  = cArgProducto; 
            this.fPrecio    = fArgPrecio;  
            print("El constructor con argumentos de la clase Producto se esta ejecutando... ");
        }
    
    // Métodos
        // Getters y Setters
            // iProducto
            public int getIProducto(){
                return this.iProducto; 
            }
            // cProducto
            public String getCProducto(){
                return this.cProducto; 
            }
            public void setCProducto(String cArgProducto){
                this.cProducto = cArgProducto; 
            }
            // fPrecio
            public double getFPrecio(){
                return this.fPrecio; 
            }
            public void setFPrecio(double fArgPrecio){
                this.fPrecio = fArgPrecio; 
            }
        // Método para imprimir el estado del objeto
        @Override
        public String toString(){
            // Creamos un objeto de tipo StringBuilder para crear la cadena de retorno
            var cEstado = new StringBuilder().append("\n\tProducto: \n");
            cEstado.append("\tID: ").append(this.iProducto).append("\n");
            cEstado.append("\tNombre: ").append(this.cProducto).append("\n");
            cEstado.append("\tPrecio: ").append(this.fPrecio).append("\n");
            // Retornamos el objeto StringBuilder convertido a String
            return cEstado.toString();
        }
}

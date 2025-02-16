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

// Dentro de esta clase, se añadirán objetos de tipo domain.Producto
// Importamos la clase de Producto
import domain.Producto; 

// Clase para crear instancias de tipo Orden de Venta
public class Orden extends Object{
    // Atributos
        // Dinámicos
        private int         iOrden; 
        private Producto[]  arrayProductos = new Producto[10];
        // Estáticos
        private static int          iNextOrden; 
        private final static int    iMaxProductos = 10;
        
    // Constructores
    public Orden(){
        this.iOrden = ++iNextOrden; 
        print("El constructor para inicializar el ID de la Orden se esta ejecutando... ");
    }
    
    // Métodos
        // Getter
            // iOrden
            public int getIOrden(){
                return this.iOrden; 
            }
        // Agregar Producto
        public void addProducto(Producto producto){
            // Validamos que el array tenga espacio para agregar otro producto
            for (int f = 0; f <= this.arrayProductos.length - 1; f++){
                if (this.arrayProductos[f] == null){
                    this.arrayProductos[f] = producto;
                    print("EXITO: Producto agregado con exito. "); 
                    return ;
                }
            }
            print("ERROR: La orden ha alcanzado el limite de 10 productos. ");
        }
        // Calcular Total de la Orden
        public double calculateTotal(){
            double fTotal = 0.00;
            // Iteramos el array de productos para ir sumando todos los importes
            for (int f = 0; f <= this.arrayProductos.length - 1; f++)
                // Solo consideramos aquellos elementos del array que tengan información
                if (!(this.arrayProductos[f] == null))
                    fTotal += arrayProductos[f].getFPrecio(); 
                else 
                    break;
            return fTotal; 
        }
        // Imprimir la Orden
        public void printOrden(){
            // Creamos un objeto de tipo StringBuilder para crear la cadena de impresión de la orden
            var cOrden = new StringBuilder().append("Orden #" + this.iOrden + ": \n");
            // Iteramos el array de productos para agregar a la cadena de la orden los estados de los productos asociados
            for (int f = 0; f <= this.arrayProductos.length - 1; f++)
                // Solo consideramos los elementos del array que tengan información
                if (!(this.arrayProductos[f] == null))
                    cOrden.append(this.arrayProductos[f].toString());
            // Agregamos el importe total a la cadena de retorno
            cOrden.append("\nImporte Total: " + this.calculateTotal());
            // Impresión de la conversion a String de nuestro objeto StringBuilder
            print(cOrden.toString());
        }

}

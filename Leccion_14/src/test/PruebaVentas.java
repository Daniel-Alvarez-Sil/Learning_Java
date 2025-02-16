/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author Daniel Alvarez Sil
 */

// En esta clase, realizamos pruebas de las clases Producto y Orden
import domain.Producto; 
import domain.Orden; 

// Importamos el método "print"
import static domain.Print.print; 

public class PruebaVentas {
    public static void main(String arg[]){
        // Creación de productos
        var producto1 = new Producto("Manzana", 10); 
        var producto2 = new Producto("Melon", 20); 
        var producto3 = new Producto("Manga", 139); 
        var producto4 = new Producto("Coca-Cola", 20); 
        var producto5 = new Producto("Playera", 150);
        var producto6 = new Producto("Penafiel", 15);
        var producto7 = new Producto("Audifonos", 200);
        var producto8 = new Producto("Aguacate", 40);
        var producto9 = new Producto("Comic", 30);
        var producto10 = new Producto("Poster", 50);
        var producto11 = new Producto("Lapiz", 5);
        
        print("");
        
        // Impresión de productos
        print("Impresion de un producto: \n" + producto1.toString()); 
        print("Impresion de otro producto: \n" + producto2.toString()); 
        
        // Creación de una orden de venta
        var orden = new Orden();
        // Agregamos articulos a la orden
        orden.addProducto(producto1); 
        orden.addProducto(producto2);
        orden.addProducto(producto11); 
                
        // Impresion de la orden
        orden.printOrden();
        
        // Creación de otra orden de venta
        var orden2 = new Orden(); 
        orden2.addProducto(producto1);
        orden2.addProducto(producto2);
        orden2.addProducto(producto3); 
        orden2.addProducto(producto4);
        orden2.addProducto(producto5);
        orden2.addProducto(producto6);
        orden2.addProducto(producto7);
        orden2.addProducto(producto8);
        orden2.addProducto(producto9);
        orden2.addProducto(producto10);
        orden2.addProducto(producto11);
        
        // Impresión de la nueva orden de venta
        orden2.printOrden();
    }
}

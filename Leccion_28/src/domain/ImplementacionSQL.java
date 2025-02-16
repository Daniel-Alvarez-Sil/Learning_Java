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

// Esta clase implementa la interfaz definida en el mismo paquete
public class ImplementacionSQL implements IAccesoDeDatos{
    // Implementamos/Sobreescribimos los métodos abstractos de la interfaz
    @Override
    public void create(){
        print("Creación desde SQL. "); 
    }
    
    @Override
    public void read(){
        print("Lectura desde SQL. ");
    }
    
    @Override
    public void update(){
        print("Actualización desde SQL. ");
    }
    
    @Override
    public void delete(){
        print("Eliminación desde SQL. "); 
    }
}

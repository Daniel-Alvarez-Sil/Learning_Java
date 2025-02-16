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

// 2da Implementación de la interfaz que se encuentra en el mismo paquete
public class ImplementacionOracle implements IAccesoDeDatos{
    @Override
    public void create(){
        print("Creación desde Oracle. ");
    }
    @Override
    public void read(){
        print("Lectura desde Oracle. ");
    }
    @Override 
    public void update(){
        print("Actualización desde Oracle. "); 
    }
    @Override
    public void delete(){
        print("Eliminación desde Oracle. ");
    }
}

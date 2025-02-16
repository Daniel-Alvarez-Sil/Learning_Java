/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Daniel Alvarez Sil
 */
public class Persona {
    public String cNombre; 

    public Persona(String cArgNombre) {
        this.cNombre = cArgNombre;
    }

    public String getcNombre() {
        return this.cNombre;
    }

    public void setcNombre(String cArgNombre) {
        this.cNombre = cArgNombre;
    }
    
    @Override
    public String toString(){
        return "Persona: \nNombre: " + this.cNombre + "\nReferencia: " + super.toString() + "\n";
    }
    
}

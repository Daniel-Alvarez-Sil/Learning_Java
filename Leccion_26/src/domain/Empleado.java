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
import java.util.Objects;

public class Empleado {
    // Atributos
        // Dinámicos
        private String cNombre; 
        private double fSueldo; 
        
    // Constructores
        // Con argumentos
        public Empleado(String cArgNombre, double fArgSueldo){
            print("El constructor con argumentos de la clase Empleado se esta ejecutando. ");
            this.cNombre = cArgNombre; 
            this.fSueldo = fArgSueldo; 
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
            // fSueldo
            public double getFDouble(){
                return this.fSueldo; 
            }
            public void setFSueldo(double fArgSueldo){
                this.fSueldo = fArgSueldo;
            }
        // Métodos sobreescritos
            // hashCode
            // Siempre que el método "equals()" sea sobreescrito, este método, el método "hashCode()", debe ser sobreescrito también
            // Este método tiene como propósito generar un número entero único para representar la instancia de la clase
            // Esta representación se realiza de acuerdo a los atributos de la instancia
            @Override
            public int hashCode() {
                int hash = 7;
                hash = 17 * hash + Objects.hashCode(this.cNombre);
                hash = 17 * hash + (int) (Double.doubleToLongBits(this.fSueldo) ^ (Double.doubleToLongBits(this.fSueldo) >>> 32));
                return hash;
            }
            // equals
            // Este método retorna true si 2 clases son iguales en contenido y retorna false en caso contrario
            @Override
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null) {
                    return false;
                }
                if (getClass() != obj.getClass()) {
                    return false;
                }
                final Empleado other = (Empleado) obj;
                if (Double.doubleToLongBits(this.fSueldo) != Double.doubleToLongBits(other.fSueldo)) {
                    return false;
                }
                return Objects.equals(this.cNombre, other.cNombre);
            }
            // toString
            // Método para representar el estado de un objeto
            @Override
            public String toString(){
                var cEstado = new StringBuilder();
                cEstado.append("Empleado: \n"); 
                cEstado.append("\tNombre: ").append(this.cNombre).append("\n");
                cEstado.append("\tSueldo: ").append(this.fSueldo).append("\n");
                return cEstado.toString();
            }

    
}

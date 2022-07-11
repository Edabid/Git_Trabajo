/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package git;

/**
 *
 * @author User
 */
public abstract class Persona {
    
    protected String nombre;
    protected int DNI;
    
    
    public Persona(String nombre, int DNI){
        this.nombre = nombre;
        this.DNI = DNI;
    }
    
    protected abstract void getProfesion();

    protected String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected int getDNI() {
        return DNI;
    }

    protected void setDNI(int DNI) {
        this.DNI = DNI;
    }
    
    
    
}

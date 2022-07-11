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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
    
    
    
}

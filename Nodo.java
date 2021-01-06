/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.doble;

/**
 *
 * @author ajfred
 */
public class Nodo {
        private Alumno alumno;
    private Nodo siguiente;
    
    public Nodo(){
        this.alumno= null;
        this.siguiente =null;
        
        
    }
    public Nodo getSiguiente(){
        return siguiente;
    }
    public Alumno getAlumno(){
        return alumno;
    }
    public void setSiguiente(Nodo siguiente){
        this.siguiente = siguiente;
    }
    public void setAlumno(Alumno alumno){
        this.alumno= alumno;
    }

}
 
    

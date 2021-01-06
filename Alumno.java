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
public class Alumno {
    private String Matricula ;
    private String Nombre;
    private int Semestre;
    private String Grado;

    public Alumno(String Matricula, String Nombre, int Semestre, String Grado) {
        this.Matricula = Matricula;
        this.Nombre = Nombre;
        this.Semestre = Semestre;
        this.Grado = Grado;
    }

     public Alumno() { 
        this.Matricula = "";
        this.Nombre= "";
        this.Semestre=0;
        this.Grado= "";
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getSemestre() {
        return Semestre;
    }

    public void setSemestre(int Semestre) {
        this.Semestre = Semestre;
    }

    public String getGrado() {
        return Grado;
    }

    public void setGrado(String Grado) {
        this.Grado = Grado;
    }
    
    
}



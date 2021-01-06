/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.doble;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ajfred
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion1,opcion2 = 0;
        Lista list = new Lista();
        Principal pedir = new Principal(); 
        String matricula;
        int pos;      
        
        
        
        
        while (!salir) {
            System.out.println("\n---------------------");
            System.out.println("Teclee el numero de la operación que necesita hacer");
            System.out.println("1. Estado de la lista");
            System.out.println("2. Agregar o insertar");
            System.out.println("3. Consultas");
            System.out.println("4. Editar");
            System.out.println("5. Eliminar");
            System.out.println("6. Salir");
            try {
                System.out.println("Escribe una de las opciones: ");
                opcion1 = sn.nextInt();
                switch (opcion1) {
                    case 1:
                        System.out.println("Estado de la lista\n");
                        System.out.println("---------------------\n");
                        System.out.println("Que deseas hacer ahora");
                        System.out.println("---------------------\n");
                        System.out.println("1. saber si esta vacia");
                        System.out.println("2. El tamaño");
                        System.out.println("3. Buscar");
                        System.out.println("4. salir");
                        opcion2=sn.nextInt();
                            switch(opcion2){
                                case 1: System.out.println("validando...\n");
                                list.estaVacia();
                                break;
                                case 2: System.out.println("Tamaño");
                                    list.getTamaño();                                 
                                break;
                                case 3: System.out.println("buscando...");
                                    System.out.println("Matricula: ");
                                    matricula = sn.next();
                                    list.buscar(matricula);
                                    break;
                                case 4: System.out.println("cerrando");
                                    
                                break;
                               
                            }
                        break;
                   
                    case 2:
                        System.out.println("Agregar o Insertar\n");
                        System.out.println("1. Agregar al inicio");
                        System.out.println("2. Agregar al final");
                        System.out.println("3. Agregar por posicion");
                        System.out.println("4. Agregar por matricula");
                        opcion2=sn.nextInt();
                        switch(opcion2){
                                case 1: System.out.println("inserte los datos");
                                pedir.pedirAlumno();
                                list.agregarAlInicio(pedir.getAlumno());
                                break;
                                
                                case 2: System.out.println("inserte los datos");
                               pedir.pedirAlumno();
                               list.agregarAlFinal(pedir.getAlumno());
                                break;
                                
                                case 3: System.out.println("inserte los datos: ");
                                 pos = sn.nextInt();
                                pedir.pedirAlumno();
                                list.insertarPorPosicion(pos, pedir.getAlumno());
                                break;

                                
                                case 4: System.out.println("inserte la matricula: ");
                                matricula = sn.next();
                                pedir.pedirAlumno();
                                list.insertarPorMatricula(matricula, pedir.getAlumno());
                                break;
                               
                            }
                        
                        
                        break;
                     case 3:
                        System.out.println("Consultas\n");
                        System.out.println("1. Obtener datos del alumno por posicion en la lista");
                        System.out.println("2. Obtener posicion de objeto en la lista, basado en la matricula del Alumno");
                        System.out.println("3. Imprimir lista");
                        System.out.println("4. Imprimir datos del alumno (basado en una matricula)");
                         System.out.println("5. Salir");
                        opcion2=sn.nextInt();
                        switch(opcion2){
                                case 1: System.out.println("Inserte posicion: ");
                                 pos = sn.nextInt();
                                
                                list.getAlumno(pos);
                                    list.toString();
                                    
                                break;

                                case 2: System.out.println("Inserte matricula: ");
                                matricula = sn.nextLine();
                                list.getPosicion(matricula);
                                   
                                break;
                                case 3: System.out.println("Imprimiendo...");                                   
                                   list.listar();
                                    
                                break;
                                case 4: System.out.println("Introduzca matricula: ");                                   
                                   pedir.getAlumno();
                                    
                                break;
                                 case 5:                                   
                                   
                                break;
                         }     
                       
                       break;
                    case 4:
                        System.out.println("Editar");
                        System.out.println("1. Por posicion ");
                        System.out.println("2. Por matricula");
                        System.out.println("3. Salir");
                        opcion2=sn.nextInt();
                        switch(opcion2){
                                case 1: System.out.println("Inserte posicion");
                                pos=sn.nextInt();
                                pedir.pedirAlumno();
                                list.editarPorPosicion(pos,pedir.getAlumno());
                                break;
                                case 2: System.out.println("Inserte matricula");
                                matricula = sn.nextLine();
                                pedir.pedirAlumno();
                                list.editarPorMatricula(matricula, pedir.getAlumno());
                                   
                                break;
                                case 3: System.out.println("saliendo...");                                   
                                   
                                    
                                break;
                         }
                        
                       
                    case 5:
                        System.out.println("Eliminar");
                        System.out.println("1. Eliminar por posicion\n 2. Eliminar por matricula\n 3. Eliminar toda la lista");
                         switch(opcion2){
                                case 1: System.out.println("Inserte posicion");
                                pos = sn.nextInt();
                                list.eliminarPorPosicion(pos);
                                
                                break;
                                case 2: System.out.println("Inserte matricula");
                                matricula = sn.nextLine();
                                list.eliminarPorMatricula(matricula);
                                   
                                break;
                                case 3: System.out.println("Eliminando todo...");
                                list.eliminar();
                                     
                                break;
                                case 4: 
                                break;
                         }
                       
                        
                    case 6:
                        System.out.println("salir...");
                        salir = true;
                        break;  
                        
                    default:
                        System.out.println("Solo hay 2 opciones");
                }
                
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
                
    }
    Scanner sc = new Scanner(System.in);
    private Alumno alumno = new Alumno();

    public void pedirAlumno() {
        int semestre = 0;
        String matricula = "", nombre = "", grado = "";

        System.out.println("Matricula: ");
        matricula = sc.next();
        System.out.println("Nombre: ");
        nombre = sc.next();
        System.out.println("Semestre: ");
        semestre = sc.nextInt();
        System.out.println("Grupo: ");
        grado = sc.next();

        this.alumno.setMatricula(matricula);
        this.alumno.setNombre(nombre);
        this.alumno.setSemestre(semestre);
        this.alumno.setGrado(grado);
    }

    public Alumno getAlumno() {
        return alumno;
    }
    
}

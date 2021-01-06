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
public class Lista {
      private Nodo inicio;
    private int tamaño;
    
    public Lista(){
        inicio= null;
        tamaño =0;
    }
    public int getTamaño(){
        int contador = 0;
        Nodo aux = inicio;
        
        while(aux != null){
            contador ++;
            aux = aux.getSiguiente();
        }
        System.out.println("El tamaño de la lista  es de: " + contador + " elementos");
        return contador;
    }
    public boolean estaVacia(){
        if(inicio==null){
            System.out.println("La lista esta vacia");
            return true;
        }else
            System.out.println("La lista no esta vacia");
        return false;
    }
    public boolean buscar(String matricula){
      Nodo aux = inicio;
      boolean existe = false;
      
      while(existe!= true && aux != null){
          if (matricula.equalsIgnoreCase(aux.getAlumno().getMatricula())){ 
              System.out.println("existe");
              System.out.println(aux.getAlumno().toString());
              existe = true;
          }else{
             
              aux = aux.getSiguiente();    
          }
          
      }
        return existe;
        
   }
     public boolean buscarReferencia(String matricula) {
        boolean encontrado = false;
        Nodo aux = inicio;

        while (aux != null && encontrado != true) {
            if (matricula.equals(aux.getAlumno())) {
                encontrado = true;
            } else {
                aux = aux.getSiguiente();
            }
        }
        return encontrado;

    }
    
    public  void agregarAlInicio(Alumno alumno){
        Nodo nuevo = new Nodo();
        nuevo.setAlumno(alumno);
        if(estaVacia()){
            inicio= nuevo;
        }else{
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
            
        }
        tamaño ++;
    }
    public void agregarAlFinal(Alumno alumno){
        Nodo nuevo = new Nodo();
        nuevo.setAlumno(alumno);
        if(estaVacia()){
            inicio= nuevo;
          
        }else{
            Nodo aux = inicio;
            while(aux.getSiguiente() !=null){
                aux= aux.getSiguiente();
                
            }
            aux.setSiguiente(nuevo);
        }
        tamaño++;
    }
    public void listar(){
        if(!estaVacia()){
            Nodo aux = inicio;
            int i = 0;
            while(aux != null){
                System.out.print(i+ ".["+ aux.getAlumno().getMatricula()+ "]" +"->" );
                aux = aux.getSiguiente(); 
                i++;
                
                        
                
            }System.out.println("null");
        }
    }
    
    public void insertarPorPosicion(int posicion,Alumno alumno){
        Nodo nuevo = new Nodo();
        nuevo.getAlumno();
        
        //validar que la posicion este en el rango de la lista 
        if(posicion >= 0 && posicion <= tamaño){
            // si la insercion es al inicio
            if (posicion == 0){
                nuevo.setSiguiente(inicio);
                inicio = nuevo;
                
            }
            else{ //si no es al inicio puede ser al final o en medio de la lista
                Nodo aux = inicio;
                if(posicion ==tamaño){
                    // para recorrer la lista nos situamos en el
                   aux = inicio;
                  while(aux.getSiguiente()!=null){
                      aux = aux.getSiguiente();
                  }
                  //Ya en el final de la lista insertamos
                  aux.setSiguiente(nuevo);
                }else{ //si no es al inicio o final
                    for (int i = 0; i < posicion - 1; i++){
                        aux = aux.getSiguiente();
                    }
                    Nodo enlace = aux.getSiguiente();
                    aux.setSiguiente(nuevo);
                    nuevo.setSiguiente(enlace);
                    
                }
                tamaño++;
            }
        }else{
            System.out.println("La posicion esta fuera del rango de la lista");
            
        }
        
    }
    public void insertarPorMatricula(String matricula, Alumno alumno){
        if(!estaVacia()){
            Nodo nuevo = new Nodo();
            nuevo.getAlumno();
            
            if(buscar(matricula)){
                Nodo aux = inicio;
                
                while(aux.getAlumno().getMatricula()!= matricula){
                    aux = aux.getSiguiente();
                }
                Nodo enlace = aux.getSiguiente();
                aux.setSiguiente(nuevo);
                nuevo.setSiguiente(enlace);
                tamaño++;
            }
            
        }
    }
    public Alumno getAlumno(int posicion) throws Exception{
        if(posicion >= 0 && posicion < tamaño){
            if(posicion == 0){
                return inicio.getAlumno();
            }else {
                Nodo aux = inicio;
                for (int i = 0; i < posicion; i++){
                    aux = aux.getSiguiente();
                }
                return aux.getAlumno();
            }
        }else{
            throw new Exception("posicion invalida");
        }
    }
    public int getPosicion(String matricula) throws Exception {
        if(buscar(matricula)){
            Nodo aux = inicio;
            int pos = 0;
            while(matricula !=aux.getAlumno().getMatricula()){
                pos++;
                aux = aux.getSiguiente();
            }
            return pos;
        }
        else{
            throw new Exception("El valor de referencia no esta en la lista");
        }
}
    public void editarPorPosicion(int posicion, Alumno alumno){
        if(posicion >= 0 && posicion < tamaño ){
            if(posicion == 0){
                inicio.setAlumno(alumno);
            }else{
                Nodo aux = inicio;
                for(int i = 0; i < posicion ; i++){
                    aux = aux.getSiguiente();
                }
                aux.setAlumno(alumno);
            }
        }
    }
    public void editarPorMatricula(String matricula,Alumno alumno){
        if(buscar(matricula)){
            Nodo aux = inicio;
            while(aux.getAlumno().getMatricula() != matricula){
                aux = aux.getSiguiente();
            }
            aux.setAlumno(alumno);
        }
    }

    public void eliminarPorPosicion(int posicion){
        if(posicion >= 0 && posicion < tamaño){
            if(posicion == 0){
                inicio = inicio.getSiguiente();
            }else{
                Nodo aux = inicio;
                for(int i = 0; i < posicion-1; i++){
                    aux = aux.getSiguiente();
                }
                Nodo siguiente = aux.getSiguiente();
                aux.setSiguiente(siguiente.getSiguiente());
            }
            tamaño--;
        }
    } 
    
   public void eliminarPorMatricula(String matricula){
        if(buscar(matricula)){
            if(inicio.getAlumno().getMatricula().toString() == matricula){
                inicio = inicio.getSiguiente();
                
            }else{
                Nodo aux = inicio;
                while(aux.getAlumno().getMatricula().toString() == matricula){
                    aux = aux.getSiguiente();
                }
                Nodo siguiente = aux.getSiguiente().getSiguiente();
                aux.setSiguiente(siguiente);
            }
            tamaño--;
        }
    }
    public void eliminar(){
        inicio = null;
        tamaño = 0;
    }

}



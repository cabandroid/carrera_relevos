
package com.mycompany.carreras;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *Clase que contiene una parte de la lógica de impresión de los equipos corredores
 * También hereda de Thread
 * @author Jhojan Cortes
 * @author David Caballero
 * @version 1.0.0
 */
public class Equipo extends Thread{
    /**
     * Objeto tipo Corredor que contiene diversos métodos
     */
    Corredor corredores;
    /**
     * Variable miembro que indica el nombre del equipo
     */
    String nombre;
    /**
     * Variable miembro que determina el inicio de la posición
     */
    int inicio;
    /**
     * Variable miembro que determina el fin de la posición
     */
    int fin;
    /**
     * Constructor sobrecargado que contiene los atributos
     * @param nombre
     * @param corredores
     * @param inicio
     * @param fin 
     */
    public Equipo(String nombre,Corredor corredores, int inicio, int fin) {
        this.corredores = corredores;
        this.nombre = nombre;
        this.inicio = inicio;
        this.fin = fin;
    }
    /**
     * Método mejorado para ejecutar la lógica
     */
    @Override
    public void run() {
        avanzar();
    }       
    /**
     * Método que permite determinar la lógica de cada corredor de distinto equipo
     */
    public void avanzar(){
        try { 
            System.out.println("Avanzando " + nombre + " Corredor: "+corredores.getNombre());
            int pos = inicio;
            while (pos <= fin) {
                pos += (int)(Math.random()*5+1);  
                System.out.println(" Corredor: "+corredores.getNombre()+" Avanzando: " + pos);
                corredores.setPosicion(pos);
                Thread.sleep(200);          
            }
            if((corredores.getNombre().equals("Rojo_3")) || (corredores.getNombre().equals("Azul_3")) || (corredores.getNombre().equals("Amarillo_3"))){
                corredores.setBandera(false);                
                Thread.sleep(2000); 
            }      
            System.out.println(nombre + " Termino: " +corredores.getNombre()); 
            if (!corredores.isBandera()) {
                System.out.println("Ganador "+nombre);                
                System.out.println("Carrera finalizada");                  
            } 
           } catch (InterruptedException ex) {
                    System.out.println("Se disparon un interrup");
                    Logger.getLogger(Equipo.class.getName()).log(Level.SEVERE, null, ex); 
       } 
    }
}

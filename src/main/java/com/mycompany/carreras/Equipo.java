/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carreras;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tibio
 */
public class Equipo extends Thread{
    
    Corredor corredores;
    String nombre;
    int inicio;
    int fin;
    
    public Equipo(String nombre,Corredor corredores, int inicio, int fin) {
        this.corredores = corredores;
        this.nombre = nombre;
        this.inicio = inicio;
        this.fin = fin;
    }

    @Override
    public void run() {
        avanzar();
    }       
    
    public void avanzar(){
        try { 
            System.out.println("Avanzndo " + nombre + " Corredor: "+corredores.getNombre());
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

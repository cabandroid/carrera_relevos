/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carreras;

import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sbego
 */
public class Principal {

    public Principal() {
       
        iniciar();
       
    }
    public void iniciar(){
        Corredor rojo1 = new Corredor("Rojo_1");
        Corredor rojo2 = new Corredor("Rojo_2");
        Corredor rojo3 = new Corredor("Rojo_3");
        
        Corredor azul1 = new Corredor("Azul_1");
        Corredor azul2 = new Corredor("Azul_2");
        Corredor azul3 = new Corredor("Azul_3");
        
        Corredor amarillo1 = new Corredor("Amarillo_1");
        Corredor amarillo2 = new Corredor("Amarillo_2");
        Corredor amarillo3 = new Corredor("Amarillo_3");
       
       Equipo rojo = new Equipo("Equipo Rojo",rojo1,1,40);
       Equipo rojo_2 = new Equipo("Equipo Rojo",rojo2,41,80);
       Equipo rojo_3 = new Equipo("Equipo Rojo",rojo3,81,120);
       
       List<Equipo> listaR = new Vector<>();       
       listaR.add(rojo);
       listaR.add(rojo_2);
       listaR.add(rojo_3);
       
       Equipo azul_1 = new Equipo("Equipo Azul",azul1,1,40);
       Equipo azul_2 = new Equipo("Equipo Azul",azul2,41,80);
       Equipo azul_3 = new Equipo("Equipo Azul",azul3,81,120);
       
       List<Equipo> listaAz = new Vector<>();       
       listaR.add(azul_1);
       listaR.add(azul_2);
       listaR.add(azul_3);
       
       Equipo amarillo_1 = new Equipo("Equipo Amarillo",amarillo1,1,40);
       Equipo amarillo_2 = new Equipo("Equipo Amarillo",amarillo2,41,80);
       Equipo amarillo_3 = new Equipo("Equipo Amarillo",amarillo3,81,120);
       
       List<Equipo> listaAm = new Vector<>();       
       listaR.add(amarillo_1);
       listaR.add(amarillo_2);
       listaR.add(amarillo_3);
       
       rojo.start();
       azul_1.start();
       amarillo_1.start();              
        try {  
            Thread.sleep(500);
            rojo.join();
            azul_1.join();
            amarillo_1.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }  
        rojo_2.start();
        azul_2.start();
        amarillo_2.start();            
        try {  
            Thread.sleep(500);
            rojo_2.join();
            azul_2.join();
            amarillo_2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }   
        rojo_3.start();
        azul_3.start();
        amarillo_3.start();            
        try {  
            Thread.sleep(500);
            rojo_3.join();
            azul_3.join();
            amarillo_3.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    
    
    public static void main(String[] args) {        
        new Principal();
        
    }
}

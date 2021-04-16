
package com.mycompany.carreras;

/**
 *Clase Corredor von los principales atributos y metodos de un equipo corredor
 * @author Jhojan Cortes
 * @author David Caballero
 * @version 1.0.0
 */
public class Corredor{
    /**
     * Variable miembro para el nombre del equipo
     */
    private String nombre;
    /**
     * Variable miembro boolean que marca una bandera
     */
    private boolean bandera = true;
    /**
     * Variable miembro para la posición del corredor
     */
    private int posicion;
    
    
    /**
     * Constructor de la clase
     * @param nombre 
     */
    public Corredor(String nombre) {
        this.nombre = nombre;
    } 
    /**
     * Metodo get para obtener la posición
     * @return posicion
     */
    public int getPosicion() {
        return posicion;
    }
    /**
     * Metodo set para asignar la posición
     * @param posicion 
     */
    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    
    /**
     * Metodo getbolean que retorna una bandera
     * @return bandera
     */
    public boolean isBandera() {
        return bandera;
    }
    /**
     * Metodo setboolean que asigna el valor de la bandera
     * @param bandera 
     */
    public void setBandera(boolean bandera) {
        this.bandera = bandera;
    } 
        
    /**
     * Método get para obtener el nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Método get para asignar un nombre del equipo corredor
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}

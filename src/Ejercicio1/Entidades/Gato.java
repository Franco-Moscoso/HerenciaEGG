/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1.Entidades;

/**
 *
 * @author franc
 */
public class Gato extends Animal{

    public Gato(String nombre, int edad, String alimento, String raza) {
        super(nombre, edad, alimento, raza);
    }

    public Gato() {
        super();
    }

    @Override
    public void alimentarse() {
        super.alimentarse(); 
    }
    
    
    
}

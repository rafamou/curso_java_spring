/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.poo_avanzando;

/**
 *
 * @author Admin
 */
public class Caballo extends Mascota implements Mamifero {

    public Caballo( String nombre, float tamanho) {
        super(4, true, false, nombre, tamanho);
    }

    @Override
    public void mover() {
        System.out.println(nombre + " cabalga raudo");
    }

    @Override
    public void comer() {
 
        System.out.println(nombre + " pasta pasto");
    }

    @Override
    public void volar() {
        throw new UnsupportedOperationException("No puede volar, loco!"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saludarAlPropietario() {
  
        System.out.println(propietario.getNombre()
            + " te saluda con una coz"
                + propietario.getNombre() + "!!!");
    }

    @Override
    public void pedirComida() {
        System.out.println(propietario.getNombre()
            + " ALIMENTAME!!!");
    }

    @Override
    public String toString() {
        return "Caballo " + nombre; //To change body of generated methods, choose Tools | Templates.
    }
    
    
      
    @Override
    public String mamar(Mamifero mam) {
        
        return "El caballo " + nombre + " mama de "+
                mam.toString();
       // return "El tigre " + nombre + " mama de "+
        //        mam.nombrar();
        /*if(mam instanceof Animal) {
            Animal anim = (Animal) mam;
            return "El tigre " + nombre + " mama de "+
                anim.getNombre();
        } else {
            return null;
        }*/
    }

    @Override
    public String nombrar() {
        return nombre;
    }
    
    
}

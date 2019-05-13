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
public class TortugaNinja extends Mascota {

    public TortugaNinja(String nombre, float tamanho) {
        super(4, true, true, nombre, tamanho);
    }
    @Override
    public void mover() {
        System.out.println(nombre +  " Salto mortal de edificio.");
    }
    @Override
    public void comer() {
 
        System.out.println(nombre + " ingiere pizzas");
    }
    @Override
    public void volar() {
        throw new UnsupportedOperationException("No puede volar, loco!"); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void saludarAlPropietario() {
  
        System.out.println(propietario.getNombre()
            + " te saluda QUE PACHA COLEGA "
                + propietario.getNombre() + "!!!");
    }
}

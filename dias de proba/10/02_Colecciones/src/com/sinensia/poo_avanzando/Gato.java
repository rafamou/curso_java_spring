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
public class Gato extends Animal {

    public Gato(String nombre, float tamanho) {
        super(nombre, tamanho);
    }

    @Override
    public void mover() {
         System.out.println(nombre +  " mueve mucho!");
    }

    @Override
    public void comer() {
         System.out.println(nombre +  " puede comer  !");
    }

    @Override
    public void volar() {
         System.out.println(nombre +  " calro que no  puede  volar ");
    }
    
}

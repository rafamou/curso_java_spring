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
public class Caballo extends Animal {

    public Caballo(String nombre, float tamanho) {
        super(4,false,false,nombre, tamanho);
    }

    @Override
    public void mover() {
         System.out.println(nombre +  " esta cansado");
    }

    @Override
    public void comer() {
         System.out.println(nombre +  " come mucho!");
    }

    @Override
    public void volar() {
        System.out.println(nombre +  " claro que no puede!");
    }


    
}

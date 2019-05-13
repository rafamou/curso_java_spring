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
public class Tigre extends AnimaSalvaje implements Depredador{

    public Tigre(String nombre, float tamanho) {
        super(4,true,false,nombre, tamanho);
    }

     @Override
    public void mover() {
         System.out.println(nombre +  " mueve !");
    }

    @Override
    public void comer() {
         System.out.println(nombre +  " puede comer  mucho !");
    }

    @Override
    public void volar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
       public void cazar(String presa) {
         System.out.println(nombre 
         + "quema, vuela " + presa );
         
    }
    
      public void mamar(String presaaa) {
         System.out.println(nombre 
         + "lo que sea2 " + presaaa );
         
    }

    String mamar(Caballo unCaballo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

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
public class Dragon extends Mascota  implements Depredador,Mamifero {


    public Dragon(String nombre, float tamanho) {
        super(4,true,false,nombre, tamanho);
    }

     @Override
    public void mover() {
         System.out.println(nombre +  " vuela asuentacia !");
    }

    @Override
    public void comer() {
         System.out.println(nombre +  " quema y luego te come  !");
    }

    @Override
    public void volar() {
         System.out.println(nombre +  " vuela , te quema !");
    }

    @Override
    public void saludaAlproietario() {
         System.out.println(propietario.getNombre()
             + "te saluda que pacha colega"
              + propietario.getNombre() + "!!!");
    }

   
    @Override
    public void cazar(String presa) {
         System.out.println(nombre 
         + "quema, vuela y caza a" + presa );
         
    }
    

    @Override
    public String mamar(Mamifero mam) {
         System.out.println(nombre 
         + "mamar l111111 " + mam );  
         return null;
 }

        
        
      
}

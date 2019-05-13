/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.poo_avanzando;

import com.sinensia.Cliente;
import com.sun.security.ntlm.Client;

/**
 *
 * @author Admin
 */
public class ProbandoAnimales {
    
    public static void probarClasesAbstractas ()  {
        Tucan unTucan = new Tucan("Turigualpa", 15.8f);
        unTucan.mover();
        TortugaNinja michelangelo 
                = new TortugaNinja("Michelangelo", 175.5f);
        michelangelo.mover();
         try {
         michelangelo.volar();
         } catch (Exception ex){
            // ex.printStackTrace();
             System.err.println(ex.getMessage());
         }
   
        
        
        Caballo rocinante = new Caballo("Rocinante", 3f);
        rocinante.mover();
        rocinante.comer();
        
        Cliente yo = new Cliente(3, "German", null);
        Animal miDragon = new Dragon("Drogo", 4959);
        Mascota miMascota = (Mascota) miDragon;
        miMascota.setPropietario(yo);
        ((Mascota) miDragon).saludarAlPropietario();
        ((Mascota) miDragon).pedirComida();
        miDragon.volar();
        
        Tigre tigre = new Tigre("Tigretón", 2.55f);
        
        System.out.println("¿Que mama el tigre?" 
                + tigre.mamar(rocinante));
        
        
        
     Caballo caballo = new Caballo("caballicito", 3.2f);
        
        System.out.println("¿Que mama el caballo?" 
                + caballo.mamar(tigre));
        
    }  
}

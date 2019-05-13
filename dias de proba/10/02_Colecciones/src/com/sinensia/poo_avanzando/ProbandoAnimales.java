/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.poo_avanzando;

import java.io.PrintStream;

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
        michelangelo.comer();
        
      Caballo  unCaballo = new Caballo("unCaballo", 3f);
        unCaballo.mover();
        unCaballo.comer();
        unCaballo.volar();
        
       Gato  lola = new Gato("lola", 3f);
        lola.mover();
        lola.comer();
        lola.volar();
       
        Tigre tigre =new Tigre ("Tigreton", 2.55f);
     
        PrintStream println;
        println = System.out.println("que mama el tigre "  + tigre.mamar(unCaballo));
    }  
}

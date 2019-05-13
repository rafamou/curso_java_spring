/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.genericos;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class ProbandoGenericos {
    public static void ProbandoGenericos (){
        int num =10;
        Integer objNum = new Integer (10);
        num = 11 ;
        String texto = "" + String.valueOf(num);
        String texto2 = "" + objNum.toString ();
        ArrayList<Integer> ListInt = new ArrayList<>() ;
        insertarDoble (ListInt, 10);
        insertarDoble (ListInt, 15);
        System.out.println("Ernesto:" + ListInt.toString());

        
        
        ArrayList<String> lisatStr = new ArrayList<>() ;
        insertarDoble (lisatStr, 10);
        insertarDoble (lisatStr, 15);
        System.out.println("Ernesto:" + lisatStr.toString());
        
    }
    public static void insertarDoble (ArrayList <Integer> lista, int valor ){
            lista.add(valor) ;
            lista.add(valor) ;
    }
    
        public static void insertarDoble (ArrayList <String> lista, String valor ){
            lista.add(valor) ;
            lista.add(valor) ;
    }
    
}

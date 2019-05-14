/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class FicheroNuevo {

    public static void LecturaFicheros() {

        File fichero = new File("Ejercicio_ficheros.txt");

        //File fichero = new File("  C:\Users\Admin\Desktop\CURSO_AVA\curso_java_spring.git\02_Colecciones\Ejercicio_ficheros.txt");
        //File fichFormJava = new File("C:/Users/Admin/Desktop/curso_java_spring.git/02_Colecciones/fichero_texto.txt");
        Scanner s = null;

        try {
            System.out.println("... Leer fichero ...");
            s = new Scanner(fichero);

            while (s.hasNextLine()) {
                String linea = s.nextLine();
                System.out.println(linea);
                
                
                
                String campos [] = linea.split(",");
                Cliente cliente;
                if (campos.length == 4 || campos.length == 5){
                long id = Integer.parseInt(campos[0]);
                String nombre = campos[1] ;
                String nombre = campos[2] ;

             
                }
                          
                        

            }

        } catch (Exception ex) {
            System.out.println("Mensaje 1: " + ex.getMessage());
        } finally {
            // Cerramos el fichero tanto si la lectura ha sido correcta o no
            try {
                if (s != null) {
                    s.close();
                }
            } catch (Exception ex2) {
                System.out.println("Mensaje 2: " + ex2.getMessage());

            }

        }

    }

    /*
    
        public static void LecturaFicher0()  {
    
            File fichRutaRelativa = new File("Ejercicio_ficheros.txt");
        Scanner escaner = null;
        try {
            System.out.println("Leyendo fich");
            escaner = new Scanner(fichRutaRelativa);
            while (escaner.hasNextLine()) { // Hasta el siguiente \n
                String linea = escaner.nextLine();
                System.out.println(">>>> \"" + linea + "\"");
                if (linea.compareTo("Linea quinta") < 0)   
                    System.out.println("      es menor" );
                else if (linea.compareTo("Linea segunda") > 0)
                    System.out.println("      es mayor" );
                else System.out.println("      son iguales" );
            }
        } catch (Exception ex) {
            System.err.println("Mensaje: " + ex.getMessage());
        } finally {
            try {
                if (escaner != null) {
                    escaner.close();
                }
            } catch (Exception ex2) {
                System.err.println("Mensaje al cerrar: " + ex2.getMessage());
            }
        }
    
    
   }*/
}

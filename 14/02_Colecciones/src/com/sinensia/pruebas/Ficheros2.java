/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// https://jarroba.com/lectura-escritura-ficheros-java-ejemplos/

package com.sinensia.pruebas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import static java.nio.file.Files.write;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ficheros2 {
            //public static void  LecturaFicheros {

	public static void PruebasFicheros () {

		// Fichero del que queremos leer
		File fichero = new File("fichero_leer.txt");
		Scanner s = null;

		try {
			System.out.println("... Leemos el contenido del fichero ...");
			s = new Scanner(fichero);

			while (s.hasNextLine()) {
				String linea = s.nextLine(); 	
				System.out.println(linea);      
			}

		} catch (Exception ex) {
			System.out.println("Mensaje: " + ex.getMessage());
		} finally {

                    try {
				if (s != null)
					s.close();
			} catch (Exception ex2) {
				System.out.println("Mensaje 2: " + ex2.getMessage());
			}
		}
	}
}

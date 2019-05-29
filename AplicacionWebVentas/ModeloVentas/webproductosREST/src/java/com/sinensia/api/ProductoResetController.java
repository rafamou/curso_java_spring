/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
 @WebServlet ( asyncSupported = true , urlPatterns = "api/productos")
public class ProductoResetController extends HttpServlet
{
     @Override
     protected void doGet (HttpServletRequest request,
             HttpServletResponse response)
            throws ServletException, IOException 
     {
    
         PrintWriter escritorResponse= response.getWriter();
         response.setContentType("application/json;charset=UTF-8");
      //   escritorResponse.println("Datos salida");
         
         BufferedReader bufRead = request.getReader();
         
           StringBuilder textoJson = new StringBuilder(); 
     //    String textoJson ="";
         for (String lineaJson = bufRead.readLine();
                 lineaJson !=null;
                 lineaJson = bufRead.readLine()) {
         
         textoJson .append(lineaJson);
         }         
         bufRead.close();
         
         escritorResponse.println(textoJson.toString().toUpperCase());
         System.out.println(">>>>>>>>>" + textoJson.toString().toUpperCase());
         
      }
}
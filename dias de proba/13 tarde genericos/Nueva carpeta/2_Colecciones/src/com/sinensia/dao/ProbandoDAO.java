/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sinensia.dao;

import com.sinensia.Cliente;
import com.sinensia.ClienteInvitado;

/**
 *
 * @author Admin - German
 */
public class ProbandoDAO {
    public static void probarCliente() {
        ClienteDAO repoCli = new ClienteDAO();
        repoCli.poner(new Cliente(1, "Ana", "aaa@a"));
        repoCli.poner(new ClienteInvitado(2, "Juan", "jjj@a"));
        repoCli.poner(new ClienteInvitado(3, "Bea", "bbb@a"));
        System.out.println("Juan: " + repoCli.leerUno(2).toString());
        
     
      repoCli.modificar(new ClienteInvitado(2, "juan mata", "bbbff@a"));
      Cliente Cli =  repoCli.leerUno(2);
      System.out.println("cliente Modificado:" + Cli.toString());
    }
}

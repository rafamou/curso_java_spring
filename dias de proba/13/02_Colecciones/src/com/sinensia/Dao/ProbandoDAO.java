/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.Dao;

import com.sinensia.Cliente;
import com.sinensia.ClienteInvitado;

/**
 *
 * @author Admin
 */
public class ProbandoDAO {
    public static void probarCliente (){
    ClienteDAO repoCli = new ClienteDAO ();
    repoCli.poner(new Cliente (1,"Ana" , "Aaaaa@dfdfd"));
    repoCli.poner(new ClienteInvitado (2,"Juan" , "bbbbbb@dfdfd"));
    repoCli.poner(new ClienteInvitado (3,"Bea" , "cccccccc@dfdfd")) ; 
    
        System.out.println("Juan" + repoCli.leerUno(2).toString());
    }
    
}

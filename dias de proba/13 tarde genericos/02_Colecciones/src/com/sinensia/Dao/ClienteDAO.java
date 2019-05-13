/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.Dao;

import com.sinensia.Cliente;
import java.util.HashMap;

/**
 *
 * @author Admin
 */
public class ClienteDAO {
    HashMap<String, Cliente> Mapa ;
    public ClienteDAO (){
     Mapa = new HashMap<> ();
    }

    void poner(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    Object leerUno(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

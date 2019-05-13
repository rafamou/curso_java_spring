/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.dao;

import com.sinensia.Cliente;
import com.sinensia.ClienteInvitado;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Admin - German
 */
public class ClienteDAO implements com.sinensia.Dao.InterfazDAO<Cliente> {

    HashMap<Long, Cliente> mapa;

    public ClienteDAO() {
        mapa = new HashMap<>();
    }

    public void poner(Cliente cli) {
        if (cli == null) {
            System.err.println("No se pueden añadir nulos");
        } else {
            mapa.put(cli.getId(), cli);
        }
    }

    public Cliente leerUno(long id) {
        if (mapa.containsKey(id)) {
            return mapa.get(id);
        }
        System.err.println("Clave/ID no encontrado " + id);
        return null;
    }

    public void eliminar(Cliente cliente) {
        mapa.remove(cliente.getId());
    }

    public void eliminar(long id) {
        mapa.remove(id);
    }
    /*
    public List<Cliente> leerTodos() {
    }*/
 /*
    void modificar(ClienteInvitado clienteInvitado) {
       mapa.put(clienteInvitado.getId(), repoCli);
    }*/

    @Override
    public List<Cliente> leerTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(Cliente Cliente ) {
       mapa.put(Cliente.getId(), Cliente);  
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.dao;
import com.sinensia.ClienteInvitado;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Admin
 */
public class GenericoDAO {
    
    HashMap<Long, T> mapa;

    public GenericoDAO() {
        mapa = new HashMap<>();
    }

    public void poner(T cli) {
        if (cli == null) {
            System.err.println("No se pueden añadir nulos");
        } else {
            mapa.put(cli.getId(), cli);
        }
    }

    public T leerUno(long id) {
        if (mapa.containsKey(id)) {
            return mapa.get(id);
        }
        System.err.println("Clave/ID no encontrado " + id);
        return null;
    }

    public void eliminar(T cliente) {
        mapa.remove(cliente.getId());
    }

    public void eliminar(long id) {
        mapa.remove(id);
    }
    /*
    public List<T> leerTodos() {
    }*/
 /*
    void modificar(TInvitado clienteInvitado) {
       mapa.put(clienteInvitado.getId(), repoCli);
    }*/

    @Override
    public List<T> leerTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(T T ) {
       mapa.put(T.getId(), T);  
    }
    
}

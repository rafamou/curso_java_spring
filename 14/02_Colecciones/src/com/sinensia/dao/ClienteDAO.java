/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.dao;

import com.sinensia.Cliente;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Admin - German
 */
public class ClienteDAO implements InterfazDAO<Cliente> {

    HashMap<Long, Cliente> mapa;

    public ClienteDAO() {
        mapa = new HashMap<>();
    }

    @Override
    public void poner(Cliente cli) {
        if (cli == null) {
            System.err.println("No se pueden añadir nulos");
        } else {
            mapa.put(cli.getId(), cli);
        }
    }

    @Override
    public Cliente leerUno(long id) {
        if (mapa.containsKey(id)) {
            return mapa.get(id);
        }
        System.err.println("Clave/ID no encontrado " + id);
        return null;
    }

    @Override
    public void eliminar(Cliente cliente) {
        mapa.remove(cliente.getId());
    }

    @Override
    public void eliminar(long id ) {
        mapa.remove(id);
    }

    @Override
    public List<Cliente> leerTodos() {
        ArrayList<Cliente> lista;
        lista = new ArrayList<>();
        for (Map.Entry<Long, Cliente> ent : mapa.entrySet()) {
            lista.add(ent.getValue());
        }
        return lista;   // Cast implicito
    }
    @Override
    public void modificar(Cliente nuevoValor) {
        Cliente cli = mapa.get(nuevoValor.getId()) ;
        cli.setActivo(nuevoValor.isActivo());
        cli.setEmail(nuevoValor.getEmail());
        cli.setNombre(nuevoValor.getNombre());
    }
}

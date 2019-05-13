/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.Dao;

import java.util.List;

/**
 *
 * @author Admin
 * @param <T>
 */
public interface InterfazDAo <T>{
    void poner (T valor) ;
    T leerUno(long id) ;
    List<T> leerTodos ();
    void eliminar (T valor) ;
    void eliminar (long id) ;
    void modificar (T  nuevovalor) ;
    
    
}

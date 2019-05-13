/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia;

/**
 *
 * @author Admin
 */

public class ClienteINormal extends Cliente {
            
    public ClienteINormal(long id, String nombre, String email, String beneficios) {
        super(id, nombre, email);
    }
    
        private String beneficios;

    /**
     * Get the value of beneficios
     *
     * @return the value of beneficios
     */
    public String getBeneficios() {
        return beneficios;
    }

    /**
     * Set the value of beneficios
     *
     * @param beneficios new value of beneficios
     */
    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }


}
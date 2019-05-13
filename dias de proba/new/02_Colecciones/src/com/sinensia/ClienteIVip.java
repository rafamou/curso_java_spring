/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia;


public class ClienteIVip extends Cliente {
    
     private String benificios;
            
    public ClienteIVip(long id, String nombre, String email, String beneficios) {
        super(id, nombre, email);
    }
    
   
    public ClienteIVip(String benificios, long id, String nombre, String email) {
        super(id, nombre, email);
        this.benificios = benificios;
    }

    /**
     * Get the value of benificios
     *
     * @return the value of benificios
     */
    public String getBenificios() {
        return benificios;
    }

    /**
     * Set the value of benificios
     *
     * @param benificios new value of benificios
     */
    public void setBenificios(String benificios) {
        this.benificios = benificios;
    }

    

}

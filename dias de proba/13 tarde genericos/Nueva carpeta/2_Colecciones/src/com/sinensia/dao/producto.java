/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.dao;

/**
 *
 * @author Admin
 */
public class producto {
    
    private String nombre;
    
    private long id;
    
    private int precio;
    
    private int stock;

    public producto(String nombre, long id, int precio, int stock) {
        this.nombre = nombre;
        this.id = id;
        this.precio = precio;
        this.stock = stock;
    }

    
    /**
     * Get the value of stock
     *
     * @return the value of stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * Set the value of stock
     *
     * @param stock new value of stock
     */
    public void setStock(int stock) {
        this.stock = stock;
    }


    
    
    /**
     * Get the value of stock
     *
     * @return the value of stock
     */


    /**
     * Set the value of stock
     *
     * @param stock new value of stock
     */


    /**
     * Get the value of precio
     *
     * @return the value of precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Set the value of precio
     *
     * @param precio new value of precio
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }


    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public long getId() {
        return id;
    }

    /**
     * Set the value of id
     *
     * @param id new value of id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}

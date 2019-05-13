/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02_colecciones;

/**
 *
 * @author Admin
 */
public class ClienteInvitado extends Cliente {
    
    public ClienteInvitado(long id, String nombre, String email) {
        super(id, nombre, email);
    }
    
    private int DuracionMax;

    /**
     * Get the value of DuracionMax
     *
     * @return the value of DuracionMax
     */
    public int getDuracionMax() {
        return DuracionMax;
    }

    /**
     * Set the value of DuracionMax
     *
     * @param DuracionMax new value of DuracionMax
     */
    public void setDuracionMax(int DuracionMax) {
        this.DuracionMax = DuracionMax;
    }

}

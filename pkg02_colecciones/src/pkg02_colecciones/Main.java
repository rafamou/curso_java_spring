/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02_colecciones;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        // array no generieco
     probandoHerncia () ;
             }
    static void  ejemploHasMapa() {
    
    HashMap<String, Cliente> diccClientesClientes ;
    diccClientes = new HashMap<String, Cliente> () ;
    Cliente ana = new Client (1,"Ana", null);
    Cliente ana = new Client (2,"Luis", null);
    Cliente ana = new Client (3,"Bea", null);
    
    diccClientes.put("c3", bea) ;
    diccClientes.put("a1", ana) ;
    diccClientes.put("b2", luis) ;
    
    
    
    
    
    }
    
      static void  ejemploListas() {
      ArrayList<Cliente> listaClientes ;
      listaClientes = new  ArrayList() ;
      
      
      // listaClientes.add(10);
      // listaClientes.add("texto");
     // listaClientes.add(new Cliente(1,"Ana", null));
     listaClientes.add(new Cliente(1,"Ana", null));
     listaClientes.add(new Cliente(2,"Luis", null));
     listaClientes.add(new Cliente(3,"Bea", null));
     
     listaClientes.remove(1);   // para borra un cliente 
     // Cliente bea = listaClientes.get(4);  // da fallo 
     Cliente bea = listaClientes.get(1);  
     bea.setEmail("bb@bb.com");
     
      for (int i= 0 ; i< listaClientes.size(); i++) {
       System.out.println("Cliente" + i + ":" +Cliente.getNombre()
                                        + "," +Cliente.getEmail());
               
      }
      for (Cliente Cliente : listaClientes) {
       System.out.println("Cliente:"  +Cliente.getNombre());  
      }
    }
    public static  void probandoHerncia ();{
     ClienteInvitado invitado = new ClienteInvitado (0,"juan", null);
     invitado.setDuracionMax(10);
     System.out.println("Cliente:"  +invitado.getNombre()
             + "duracion:" + invitado.getDuracionMax());

}
}

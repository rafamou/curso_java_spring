
package pkg01_ejemplojava;

public class Tucan extends Object {
    String [] colores ;  // caracteristicas 
    float longitude ;
    int edad ;
    
    public Tucan () {    // eso para el nuevo tuca   nuevoTuc
    this.edad =0 ;
    longitude = 5f ;
    colores  = new String [] {
    " blanco", "marron"
    }; 
    } 
    
    
    
    public void piar () {
        System.out.println("pio pio " + edad + "anos");
        
    }
    
    
}

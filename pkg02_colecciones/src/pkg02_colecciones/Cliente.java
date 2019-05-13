package pkg02_colecciones;
public class Cliente {
    private long id ;
    private String nombre ;
    private String email;
    private boolean activo ;

    public Cliente(long id, String nombre, String email) {  // insertar code . constructor
        this.id = id;              //   this para indicar los parametros 
        this.nombre = nombre;
        this.email = email;
        this.activo = true;
    }
    
    public  long getId (){
       return this.id ;  
       
    }

    public String getNombre() {          // insertar code  getter
        return nombre;
    }
    
    public void setNombre (String nombre){
    this.nombre = nombre;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActivo() {                     // is no get porque es estado
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    
}

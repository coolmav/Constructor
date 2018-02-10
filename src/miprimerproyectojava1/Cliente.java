
package miprimerproyectojava1;


public class Cliente {
    private String nombre;
    private String direccion;
    private String telefono;
    private int edad;
    
    
    
    //Creacion de constructor por defecto
    
    public Cliente(){
        
    }
    
    //Constructor con dos parametros
    
    public Cliente(String nomb, String dir){
        this.nombre=nomb;
        this.direccion=dir;
    }
    
    
    //Constructor con tres parametros
    
    public Cliente(String nomb, String dir, String tel){
           this.nombre=nomb;
           this.direccion=dir;
           this.telefono=tel;
    }
    
    
    
    /* Metodos dentro de la clase Cliente*/
    
    /*Metodo Set...*/
    public void setNombre(String nombre){
         this.nombre = nombre;    
    }
    
    public void setDireccion(String direccion){
         this.direccion = direccion;    
    }
    
    public void setTelefono(String telefono){
         this.telefono = telefono;    
    }
    
    public void setEdad(int edad){
         this.edad = edad;    
    }
    
    /* Metodo Get...*/
    public String getNombre(){
         return nombre;
    }
         
       
    public String getDireccion(){
         return direccion;
    }    
     
         
         
     public String getTelefono(){
         return telefono;
     }
         
     public int getEdad(){
         return edad;
    
    }
       
     
    
    
    
    
    }
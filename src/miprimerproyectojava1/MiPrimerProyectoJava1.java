
package miprimerproyectojava1;

public class MiPrimerProyectoJava1 {

     public static void main(String[] args) {
      
      //Creo objeto en base a la clase
      Cliente clien1=new Cliente();
      Cliente clien2=new Cliente();
      Cliente clien3=new Cliente ();
      Cliente clien4=new Cliente("Martha Perez", "Duarte #15");
      Cliente clien5=new Cliente("Carlos San Juan", "Tierra de Nadie #00", "28-397-2354");
      
      
      clien1.setNombre("Jeruzalem Salem");
      clien1.setDireccion("Calle 00 #00, Bajo tierra");
      clien1.setTelefono("000-000-0000");
      clien1.setEdad(00000);
      
      clien2.setNombre("Jesus Maria");
      clien2.setDireccion("Calle 01 #01 , Bajo tierra");
      clien2.setTelefono("000-000-0001");
      clien2.setEdad(00001);
      
      clien3.setNombre("Zatshe Abraham");
      clien3.setDireccion("Calle 02 #02, Bajo tierra");
      clien3.setTelefono("000-000-0002");
      clien3.setEdad(00002);
      
      
        System.out.println(clien2.getNombre());
        System.out.println(clien2.getDireccion());
        System.out.println(clien2.getTelefono());
        System.out.println(clien2.getEdad());
        
        System.out.println(clien3.getNombre());
        System.out.println(clien3.getDireccion());
        System.out.println(clien3.getTelefono());
        System.out.println(clien3.getEdad());
      
        System.out.println(clien1.getNombre());
        System.out.println(clien1.getDireccion());
        System.out.println(clien1.getTelefono());
        System.out.println(clien1.getEdad());
              
        
        System.out.println(clien4.getNombre());
        System.out.println(clien4.getDireccion());
        System.out.println(clien4.getTelefono());
        System.out.println(clien4.getEdad());
        
        System.out.println(clien5.getNombre());
        System.out.println(clien5.getDireccion());
        System.out.println(clien5.getTelefono());
        System.out.println(clien5.getEdad());
               
               
            
   
    }
    
}
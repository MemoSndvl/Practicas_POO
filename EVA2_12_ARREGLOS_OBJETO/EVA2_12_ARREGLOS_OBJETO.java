import java.util.*;
public class EVA2_12_ARREGLOS_OBJETO {
    public static void main(String[] args) {
        Persona[] arregloPer = new Persona[32];
         Scanner input = new Scanner (System.in);
         for(int i= 0; i <32; i++){   //i --> index/indice
            //crear el objeto
        arregloPer[i] = new Persona();    
        System.out.println("Cual es tu nombre?");
        arregloPer[i] .setNombre(input.nextLine());
      }
         for(int i = 0; i<10; i++){
             System.out.println("Nombre: " + arregloPer[i].getNombre());
         }
    }    
}
class Persona{
    private String nombre; 
    public Persona(){     
    }
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
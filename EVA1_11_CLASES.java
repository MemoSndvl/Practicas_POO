import java.util.*;
public class EVA1_11_CLASES {
    public static void main (String [] args){
        class Persona {
            private String id;
            private String nombre;
            private int edad;
            public String getid() {
               return id;
            }
         
            public void setid(String id) {
               this.id = id;
            }
         
            public String getnombre() {
               return nombre;
            }
         
            public void setnombre(String nombre) {
               this.nombre = nombre;
            }
         
            public String getedad() {
               return edad;
            }
         
            public void setedad(int edad) {
               this.edad = edad;
            }
         }
    }  
}
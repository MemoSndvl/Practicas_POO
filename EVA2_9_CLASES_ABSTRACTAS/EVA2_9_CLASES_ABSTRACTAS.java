import java.util.*;
public class EVA2_9_CLASES_ABSTRACTAS {
    public static void main(String[] args) {
        Persona Persona = new Persona();
    }
    public class Cliente extends Persona {
        public void MostrarDatos() {
        }   
    } 
    public interface MuestraDatos {
        public void MostrarDatos();
    }
    public abstract class Persona implements MuestraDatos {
        private String nombre;
        private int edad;
        public Persona() {
            this.nombre = "";
            this.edad = 0;        
        }
        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public int getEdad() {
            return edad;
        }
        public void setEdad(int edad) {
            this.edad = edad;
        }
    }
}
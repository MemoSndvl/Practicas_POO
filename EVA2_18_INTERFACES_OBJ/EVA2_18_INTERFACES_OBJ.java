import javal.util.*;
public class EVA2_18_INTERFACES_OBJ {

    public static void main (String [] args) {
Persona persona = new Persona ();
persona.setNombre("Ana ");
Mensajes mensaje = persona;
mensaje.mostrarMensaje();
    }
}
interface Mensajes {
    public void mostrarMensaje();
}
class Persona implements Mensajes {
    private String nombre;
    public String getNombre(){
        return nombre;
    }
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    @Override
    public void mostrarMensaje(){
        System.out.println(nombre);
    }
}
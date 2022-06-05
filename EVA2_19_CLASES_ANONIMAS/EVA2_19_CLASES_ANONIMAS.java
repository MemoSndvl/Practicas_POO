import java.util.*;
public class EVA2_19_CLASES_ANONIMAS {
    public static void main (String [] args){
Mensajes mensaje = new Mensajes (){ //Clase anonima
    @Override
    public void mostrarMensaje(){
        System.out.println("Hola");
    }
};
mensaje.mostrarMensaje();
    }
    interface Mensajes {
        public void mostrarMensaje();
    }
}
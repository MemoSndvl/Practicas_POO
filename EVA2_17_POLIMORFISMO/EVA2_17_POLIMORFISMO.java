import java.util.*;
class EVA1_15_FORMULASTEMPERATURA {
public static void main (String [] args){
Prueba prueba = new Prueba();
prueba.mostrarMensaje("Hola");
prueba.otroMetodo();
mostrar(prueba);
}
public class Prueba implements Mensaje {
    @Override
    public void mostrarMensaje (String mensaje) {
        System.out.println(mensaje);
    }
}
public interface Mensajes {
    public void mostrarMensaje (String mensaje);
}

public void otroMetodo(){
System.out.println("Metodo Adicional ");
}
public static void mostrar(Mensajes m){
m.mostrarMensaje("Hola ");
}
}
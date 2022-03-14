import java.util.*;
public class EVA1_10_COPIAOBJETOS {
    public static void main (String [] args){
        Prueba obj1 = new Prueba();
        System.out.println("Direccion: " + obj1);
        obj1.x = 100;
        System.out.println("Valor de x = " + obj1.x);
        Prueba respaldo = obj1;
        System.out.println("Valor de Respaldo = " + Respaldo.x);
        Respaldo.x = 0;
        System.out.println("Valor de x en obj1 = " + objt1.x);
        System.out.println("Valor de x en Respaldo = " + Respaldo.x);
        System.out.println("objt1 = " + obj1);
        System.out.println("objt1 = " + respaldo);
        if (obj1 == respaldo)
        System.out.println("SON EL MISMO OBJETO");
        else 
        System.out.println("SON OBJETOS DIFERENTES");
    }
}
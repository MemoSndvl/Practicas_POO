import java.util.*;
public class EVA1_2_CLASEPERSONA {  
    public static void main(String[]args){
        System.out.println (" Hola Mundo ");
         persona estudiante = new persona();
         estudiante.id=" 00112233 ";
         estudiante.nombre=" Jose Luis Sanchez ";
         estudiante.edad=25;
         estudiante.imprimirDatos();
         System.out.println (" Año de Nacimiento " + estudiante.calcularAñoNacimiento());
         persona estudiante2 = new persona ();
         estudiante2.id="11223344";
         estudiante2.nombre="Andres Marquez Rodriguez";
         estudiante2.edad=30;
         estudiante2.imprimirDatos();
         System.out.println (" Año de Nacimiento" + estudiante2.calcularAñoNacimiento());
         persona estudiante3 = new persona ();
         estudiante3.id=" 33445566";
         estudiante3.nombre=" Rodrigo Montes Lopez ";
         estudiante3.edad=28;
         estudiante3.imprimirDatos();
         System.out.println (" Año de Nacimiento " + estudiante3.calcularAñoNacimiento());
    }
}

class persona{ //Implementacion
//Atributos de la clase
    String id;
    String nombre;
    int edad;
//Comportamiento5
//Metodo ImprimirDatos metodo/funcion f(3)=x+1
//Valor de retorno + nombre de la funcion (arfumentos);
    void imprimirDatos(){
        System.out.println(" El Nombre es:" + nombre);
        System.out.println(" Su ID es: " + id);
        System.out.println(" Su edad es: " + edad);
    }
    int calcularAñoNacimiento(){
        int añoNac=2022-edad;
        return añoNac;
    }
}
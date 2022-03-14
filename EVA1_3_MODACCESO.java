import java.util.*;

public class EVA1_3_MODACCESO {
    public static void main (String[]args){
        Persona per1=new Persona();
        per1.nombre =(" Juan Antonio Rodriguez Sanchez ");
        per1.id =(" 11223344");
        per1.edad =( 32 );
        per1.ImprimirDatos();
        System.out.println(" Los datos de la persona son" + per1.ImprimirDatos());
        
    }
         class Persona{
         string nombre;
         string id;
         int edad;

        void imprimirDatos(){
            System.out.println("Los datos de la persona son " + nombre);
    }

    }
}

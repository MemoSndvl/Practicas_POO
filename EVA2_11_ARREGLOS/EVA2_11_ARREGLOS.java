import java.util.*;
public class EVA2_11_ARREGLOS {
    public static void main(String[] args) {
        int[] arregloEdad = new int[32];  //4 bytes ocupa un entero, 128 bytes
        Scanner input = new Scanner (System.in);
        // 32 capturas --> for
        for(int i= 0; i <32; i++){        //i --> index/indice
        System.out.println("Cual es tu edad?");
        arregloEdad[i] = input.nextInt();
    }
       for(int i = 0; i < 32; i++){
           System.out.println("[" + arregloEdad[i] + "]");
       } 
    }
}
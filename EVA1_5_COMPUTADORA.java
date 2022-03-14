import java.util.*;
public class EVA1_5_COMPUTADORA{
    public static void main(String[]args){
         Computadora miCompu= new Computadora();
            miCompu.setGrafica("GeForce 3090");
            miCompu.setProcesador("Intel Core I7");
            miCompu.setRAM(16);
            miCompu.setPrecio(75000.00);
            System.out.println("Grafica " + miCompu.getGrafica());
            System.out.println("Procesador " + miCompu.getProcesador());
            System.out.println("RAM " + miCompu.getRAM());
            System.out.println("Precio " + miCompu.getPrecio());
            }
}
            class Computadora{
                private String Grafica;
                private String Procesador;
                private int RAM;
                private double Precio;
                public void setGrafica (String valor){
                    this.Grafica=valor;
                }
                public void setProcesador (String valor){
                    this.Procesador=valor;
                }
                public void setRAM (int valor){
                    this.RAM=valor;
                }
                public void setPrecio (double valor){
                    this.Precio=valor;
                }
                public String getGrafica(){
                    return Grafica;          
                }
                public String getProcesador(){
                    return Procesador;
                }
                public int getRAM(){
                    return RAM;          
                }
                public double getPrecio(){
                    return Precio;
        }
    }
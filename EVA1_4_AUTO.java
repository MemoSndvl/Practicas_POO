import java.util.*;

import javax.swing.text.html.parser.AttributeList;
public class EVA1_4_AUTO{
    public static void main(String[]args){
         Automovil miAuto= new Automovil();
            miAuto.setMarca("Ford");
            miAuto.setModelo("Mustang");
            miAuto.setTipo("Sedan");
            miAuto.setAño(2022);
            miAuto.setColor("Rojo");
            miAuto.setPrecio(1167000.00);
            System.out.println("Marca " + miAuto.getMarca());
            System.out.println("Modelo " + miAuto.getModelo());
            System.out.println("Tipo " + miAuto.getTipo());
            System.out.println("Año " + miAuto.getAño());
            System.out.println("Color " + miAuto.getColor());
            System.out.println("Precio " + miAuto.getPrecio());
            }
}
            class Automovil{
                private String Marca;
                private String Modelo;
                private String Tipo;
                private int Año;
                private String Color;
                private double Precio;
                public void setMarca (String valor){
                    this.Marca=valor;
                }
                public void setModelo (String valor){
                    this.Modelo=valor;
                }
                public void setTipo (String valor){
                    this.Tipo=valor;
                }
                public void setAño (int valor){
                    this.Año=valor;
                }
                public void setColor (String valor){
                    this.Color=valor;
                }
                public void setPrecio (double valor){
                    this.Precio=valor;
                }
                public String getMarca(){
                    return Marca;          
                }
                public String getModelo(){
                    return Modelo;
                }
                public String getTipo(){
                    return Tipo;          
                }
                public int getAño(){
                    return Año;
                }
                public String getColor(){
                    return Color;          
                }
                public double getPrecio(){
                    return Precio;
        }
    }
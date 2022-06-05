import java.util.*;
public class EVA2_5_INTERFACES {
    public static void main(String[] args) {
        Persona perso = new Persona();
        perso.setNombre("Memo");
        perso.setEdad(18);
        perso.imprimirDatos();
    }  
}
class Persona implements MuestraDatos{
    private String nombre;
    private int Edad;
    public Persona(){  
    }
    public Persona(String nombre, int Edad) {
        this.nombre = nombre;
        this.Edad = Edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return Edad;
    }
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    public void imprimirDatos(){
       System.out.println("Nombre: " + nombre);
       System.out.println("Edad: " + Edad);
    }
}
class Vehiculo implements MuestraDatos{
private String marca;
private String modelo;
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    public void imprimirDatos() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
interface MuestraDatos{
    public void imprimirDatos();
}       
interface Mesnaje{
    public void mostrarMensaje();
 }
}
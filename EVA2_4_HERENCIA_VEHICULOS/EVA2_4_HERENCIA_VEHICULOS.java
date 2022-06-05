import java.util.*;
public class EVA2_4_HERENCIA_VEHICULOS {
    public static void main(String[] args) {    
    }  
}
class Vehiculos{
    private String tipoCombustible;
    private int numeroLlanta;
    private double capacidadMotor;
    private int cilindrosMotor;
    private int capacidadPasajeros;
    private String marca;
    private String modelo;
    private int año;
    
    public Vehiculos(){
        tipoCombustible = "";
        numeroLlanta = 0;
        capacidadMotor = 0.0;
        cilindrosMotor = 0;
        capacidadPasajeros = 0;
        marca = "";
        modelo = "";
        año = 0;
    }
    
    public Vehiculos(String tipoCombustible, int numeroLlanta, double capacidadMotor, int cilindrosMotor, int capacidadPasajeros, String marca, String modelo, int año){
        this.tipoCombustible = tipoCombustible;
        this.numeroLlanta = numeroLlanta;
        this.capacidadMotor = capacidadMotor;
        this.cilindrosMotor = cilindrosMotor;
        this.capacidadPasajeros = capacidadPasajeros;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }
    
    public void imprimirDatos(){
        System.out.println("Tipo de combustible: " + tipoCombustible);
        System.out.println("Numero de llanta: " + numeroLlanta);
        System.out.println("Capacidad en litros del motor: " + capacidadMotor);
        System.out.println("Cilindros del motor: " + cilindrosMotor);
        System.out.println("Capacidad del carro para los pasajeros: " + capacidadPasajeros);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + año);
    }
}
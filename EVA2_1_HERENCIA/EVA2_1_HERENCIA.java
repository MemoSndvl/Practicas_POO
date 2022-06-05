import java.util.*;
public class EVA2_1_HERENCIA {
    public static void main(String[] args) {
    Persona perso1 = new Persona();
        Estudiante estu1 = new Estudiante("Memo", 22, "21550329");
        estu1.setNombre("Memo");
        estu1.setEdad(22);
        estu1.setNumeroControl("21550329");
        estu1.mostrarNombre();
        System.out.println("No. de Control: " + estu1.getNumeroControl()); 
        estu1.imprimirDatos();
        
        Maestro maestro1 = new Maestro(1, "Rubén", 30);
        maestro1.imprimirDatos(); 
    }
}
class Maestro extends Persona{ 
    private int numRegistro;

    public Maestro() {
        super();
        System.out.println("Clase Maestro");
    }

    public Maestro(int numRegistro, String nombre, int edad) {
        super(nombre, edad);
        this.numRegistro = numRegistro;
    }

    public int getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(int numRegistro) {
        this.numRegistro = numRegistro;
    }
    @Override //Ignora el método con el mismo nombre de la superclase y lo sustituye con el método de la subclase
    public void imprimirDatos(){
    super.imprimirDatos();
        System.out.println("No. de registro: " + numRegistro);
    }
}
class Estudiante extends Persona{ //Subclase (Hijo)
    private String numeroControl;

    //Constructor default:
    public Estudiante(){
        super(); //Llamada al constructor de la superclase
        System.out.println("Clase estudiante");
    }
    
    public Estudiante(String nombre, int edad, String numeroControl){
        super(nombre, edad); //Llamada al constructor de la superclase
        this.numeroControl = numeroControl;
    }
    
    public void setNumeroControl(String numeroControl) {
        this.numeroControl = numeroControl;
    }

    public String getNumeroControl() {
        return numeroControl;
    }
    public void imprimirDatos(){
        super.imprimirDatos(); 
        System.out.println("No. de control: " + numeroControl);
    }
    
}

class Persona{ 
    private String nombre; 
    private int edad;
    
    public Persona(){
        this.nombre = "XXXXXXX";
        this.edad = 1000;
        System.out.println("Clase persona");
    }
    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void imprimirDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
    
}
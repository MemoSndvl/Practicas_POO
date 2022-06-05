import java.util.*;

public class EVA2_16_FIGURAS_3 {
    
    public double calcularArea(){
    return -1;
    }
    public static void main (String [] args){
    Triangulo Triangulo=new Triangulo (10, 0);
    Circulo Circulo=new Circulo (20);
    Rectangulo Rectangulo=new Rectangulo (20, 25);

System.out.println ("Area = " + Triangulo.calcularArea());
System.out.println ("Area = " + Circulo.calcularArea());
System.out.println ("Area = " + Rectangulo.calcularArea());

imprimirArea(Triangulo);
imprimirArea(Circulo);
imprimirArea(Rectangulo);
    }

     public static void imprimirArea (figura f){
    System.out.println ("Area = " + f.calcularArea());

    if (f instanceof Triangulo){
        System.out.println ("Triangulo ");
    }else 
    System.out.println("Otras ");
     }

     class figura {
      }
    
    class Triangulo extends figura{
    private double base;
    private double altura;
    public Triangulo(set base, get altura) {
        this.base = base;
        this.altura = altura;

        }
    } 
    }
    class circulo extends figura{
    private double radio;
    public circulo(double radio) {
        this.radio = radio;
        
    }
    
    }
    class rectangulo extends figura {
    private double base;
    private double altura;
    public rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;}
        public double getAltura() {
            return altura;
        }
        public void setAltura(double altura) {
            this.altura = altura;
        }
        public double getBase() {
            return base;
        }
        public void setBase(double base) {
            this.base = base;
        }
        public double calcularArea(){
            return base*altura;
        }
    }
  }
}

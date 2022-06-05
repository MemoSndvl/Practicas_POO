import java.util.*;
public class EVA2_3_HERENCIA_3 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.mover();
        Vertebrado verte = new Vertebrado();
        verte.tenerESqueleto();
        Mamifero mamifero = new Mamifero();
        mamifero.tenerPelo();
        Primates primate = new Primates();
        primate.agarrarObjetos();
        Humano humano = new Humano();
        humano.pensar();
    }
    
class Humano extends Primates{
    public Humano(){
        System.out.println("Humano");
    }
    public void pensar(){
        System.out.println("Pensar");
    }
}    
    
}
class Mamifero extends Vertebrado{
   public Mamifero(){
       super();
       System.out.println("Mamifero");
   }
   public void tenerPelo(){
       System.out.println("Tener Pelo");
   }
   
}
class Primates extends Mamifero{
    public Primates(){
        System.out.println("Primates");
    }
    public void agarrarObjetos(){
    System.out.println("Agarrar Objetos");
}
    
}

class Vertebrado extends Animal{
    public Vertebrado(){
        super();
        System.out.println("Vertebrados");
    }
    public void tenerESqueleto(){
        System.out.println("Vertebrado: tiene esqueleto");
    }
}

class Animal{
    public void animal(){
    System.out.println("Animal");
}
    
    public void mover(){
        System.out.println("Animal: movimiento");
    }
}
import java.util.*;
public class EVA2_8__HERENCIA_INTERFACES {
    int A = 10;
   public static void main(String[] args) {
       Prueba prueba = new Prueba();
       prueba.meotodoA();
       prueba.metodoB();
   }
}
class Prueba implements B{
   public void metodoB() {     
   }
   public void meotodoA() {     
   }  
}
interface A{
   public void meotodoA();
}
interface B extends A{
   public void metodoB();
}
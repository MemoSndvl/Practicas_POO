import java.util.*;
class EVA1_15_FORMULASTEMPERATURA {
  static Scanner salida=new Scanner(System.in);
  static double CaF(double C){
    double F=(C*9/5)+32;
    return F;
  }
  static double CaK(double C){
    double K=C+273.15;
    return K;
  }
  static double FaC(double F){
    double C=(F-32)*5/9;
    return C;
  }
  static double FaK(double F){
    double K=(F-32)*5/9+273.15;
    return K;
  }
  static double KaC(double K){
    double C=K-273.15;
    return C;
  }
  static double KaF(double K){
    double F=(K-273.15)*9/5+32;
    return F;
  }
  static double input(String grados){
    System.out.println("Introduce " + " la cantidad de " + grados + " a convertir");
    double val=salida.nextDouble();
    return val;
  }
  static void output(double val, String grados){
    System.out.printf("La conversion fue: %s %.2f " ,grados,val);
  }
  public static void main(String args[]){
    System.out.println("1. Celcius a Fahrenheit \n2. Celcius a Kelvin \n"+
              "3. Fahrenheit a Celcius \n4. Fahrenheit a Kelvin \n"+
              "5. Kelvin a Celcius \n6. Kelvin a Fahrenheit \n7. Salir");
    do{
      System.out.println("\nSelecciona la opcion que quieres utilizar: ");
      int entrada=salida.nextInt();
      double num = 0;
      switch(entrada){
        case 1: num = input("Celcius");
            output(CaF(num), "Fahrenheit");
            break;
        case 2: num = input("Celcius");
            output(CaK(num), "Kelvin");
            break;
        case 3: num = input("Fahrenheit");
            output(FaC(num), "Celcius");
            break;
        case 4: num = input("Fahrenheit");
            output(FaK(num), "Kelvin");
            break;
        case 5: num = input("Kelvin");
            output(KaC(num), "Celcius");
            break;
        case 6: num = input("Kelvin");
            output(KaF(num), "Fahrenheit");
            break;
        case 7: System.exit(0);
            break;
        default: System.out.println("Opcion Invalida");
      }
    }while(true);  
  }
}

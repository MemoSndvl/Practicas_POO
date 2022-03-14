import java.util.Scanner;

public class EVA1_1_DIASEMANA{
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        boolean preg;
        do {
            System.out.println("Ingresa un numero entre 1 y 7");
            int num = leer.nextInt();
            switch (num) {
                case 1:
                    System.out.println("El numero corresponde al dia Lunes");
                    break;
                case 2:
                    System.out.println("El numero corresponde al dia Martes");
                    break;
                case 3:
                    System.out.println("El numero corresponde al dia Miercoles");
                    break;
                case 4:
                    System.out.println("El numero corresponde al dia Jueves");
                    break;
                case 5:
                    System.out.println("El numero corresponde al dia Viernes");
                    break;
                case 6:
                    System.out.println("El numero corresponde al dia Sabado");
                    break;
                case 7:
                    System.out.println("El numero corresponde al dia Domingo");
                    break;
                    default:
                    System.out.println("Escribe otro numero");
            }
            System.out.println("¿Quieres repetir el proceso? true/false");
            preg=leer.nextBoolean();
        } while (preg == true);
    }
}

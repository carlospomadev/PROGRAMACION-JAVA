package Clase5;
import java.util.Scanner;

public class Clase5 {
    public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//    try{
//        System.out.println("Ingresame un número: ");
//        int numero = scanner.nextInt();
//        System.out.println("El número ingresado es: " + numero);
//    } catch (Exception e) {
//        System.out.println("Número invalido");
//    } finally {
//        scanner.close();
//        System.out.println("Porgrama finalizado");
//    }
//    }

        Scanner scanner = new Scanner(System.in);
        try {

            System.out.println("Ingresame un número: ");
            int numero = scanner.nextInt();
            if (numero > 5) {
                System.out.println("El número es mayor que 5, número ingresado: " + numero);
            } else {
                System.out.println("Número invalido, número ingresado: " + numero);
            }
        } catch (Exception e) {
            System.out.println("Dato ingresado no válido");
        } finally {
            scanner.close();
            System.out.println("Porgrama finalizado");
        }
    }
}
package EjerciciosClase;
import java.sql.SQLOutput;
import java.util.Locale;
import  java.util.Scanner;

public class EjerciciosClase3 {
    public static void main(String[] args) {
        //Ejercicios de Nivel Medio (Intermedio)
        //Ejercicio 3: Simulación de una calculadora
        //Crea un menú que permita sumar, restar, multiplicar y dividir dos números ingresados por el usuario.

            Scanner scanner = new Scanner(System.in);
            int numero1, numero2, operacion;
        do {
            System.out.println("Ingrese el primer número: ");
            numero1 = scanner.nextInt();
            System.out.println("Ingres el segundo numero: ");
            numero2 = scanner.nextInt();

            do {
                System.out.println("Selecciona la operación que desees realizar:");
                System.out.println("1. Sumar");
                System.out.println("2. Restar");
                System.out.println("3. Multiplicar");
                System.out.println("4. Dividir");
                System.out.println("5. Salir de la calculadora");
                operacion = scanner.nextInt();
            } while (operacion < 1 || operacion > 5);
            switch (operacion) {
                case 1:
                    System.out.println("La suma es: " + (numero1 + numero2));
                    break;
                case 2:
                    System.out.println("La resta es: " + (numero1 - numero2));
                    break;
                case 3:
                    System.out.println("La multiplicación es: " + (numero1 * numero2));
                    break;
                case 4:
                    System.out.println("La división es: " + (numero1 / numero2));
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        } while (operacion != 5);
        scanner.close();
    }
}

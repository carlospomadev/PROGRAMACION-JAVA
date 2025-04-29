package EjerciciosClase;
import java.sql.SQLOutput;
import java.util.Locale;
import  java.util.Scanner;

public class EjercicioClase4 {
    public static void main(String[] args) {

        //Ejercicio 4: Números pares hasta N
//        Pide un número al usuario y muestra todos los números pares desde 1 hasta ese número.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int numero = scanner.nextInt();
        int i;
        for (i = 0; i <= numero; i += 2) {
            System.out.println(i);
        }
    }
}

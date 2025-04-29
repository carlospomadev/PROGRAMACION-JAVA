package EjerciciosClase;
import java.sql.SQLOutput;
import java.util.Locale;
import  java.util.Scanner;

public class EjercicioClase2 {
    public static void main(String[] args) {

        //Ejercicio 2: Contador de vocales
        //Pide al usuario una palabra y cuenta cuántas vocales tiene.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe tu nombre y contaré sus vocales");
        String nombre = scanner.nextLine();

        char[] vocales = {'a', 'e', 'i', 'o', 'u'};

        //transformar nombre en minuscula para realizar la contabilidad de las vocales de manera eficiente
        String nombreMinusculas = nombre.toLowerCase();

        String voc = "";
        int conteoVoc = 0;

        for (int i = 0; i < nombreMinusculas.length(); i++) {
            for (int a = 0; a < vocales.length; a++) {
                if (nombreMinusculas.charAt(i) == vocales[a])
                    conteoVoc++;
                voc += nombreMinusculas.charAt(i);
            }
        }
        System.out.println("El número de vocales es:" + conteoVoc);
        scanner.close();
    }
}
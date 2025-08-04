package Clase7;
import java.util.Scanner;


public class Arrays1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//Declaro el vector llamado número y detallo que tendrá 5 números
        int[] numeros = new int[5];
        int indice = 0;
// Realizamos un FOR para introducir las 5 posiciones de números
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Introduce la posición: " + (i+1) + ":");
            numeros[i] = scanner.nextInt();
        }
//1. Imprimimos la lista de números introducidos con ciclo FOR:
        System.out.println("CONTENIDO CON CICLO FOR:");
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Posición" + (i+1) + ":" + numeros[i]);
        }

//2.Imprimimos la lista de números introducidos con ciclo FOR EACH:
        System.out.println("\nCONTENIDO CON CICLO FOR EACH:");
        for (int num : numeros){
            System.out.println("Elemento: " + num);
        }

//3. Imprimimos la lista con un ciclo WHILE:
        System.out.println("\nCONTENIDO CON CICLO WHILE:");
        while (indice < numeros.length){
            System.out.println("Posición" + (indice+1) + ":" + numeros[indice]);
            indice++;
        }
        System.out.println("\nCONTENIDO CON Array.stream:");
        java.util.Arrays.stream(numeros).forEachOrdered( num -> System.out.println("Elemento: " + num));
    }
}

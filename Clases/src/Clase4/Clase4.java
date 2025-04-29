package Clase4;
import java.security.KeyStore;
import java.util.Scanner;

public class Clase4 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int numero;
//
//        while(true){
//            System.out.println("Introduce un número y pon 0 para salir");
//            numero = scanner.nextInt();
//            if (numero == 0){
//                //Si es cero como pide el enunciado, salgo del bucle
//                break;
//            }
//            System.out.println("Has introducido: " + numero);
//        }
//        System.out.println("Programa finalizado");
//        scanner.close();

        //🟨 Ejercicio 2 – Saltarse los múltiplos de 3 con continue
        //      Escribe un programa que muestre los números del 1 al 10, excepto los múltiplos de 3. Usa un bucle for con continue.

        //🟨 Ejercicio 3 – Finalizar un bucle for al encontrar un número concreto
        //Haz un programa que busque el número 7 entre los números del 1 al 20. Cuando lo encuentre, debe mostrar un mensaje y terminar
        // el bucle con break.


//        for(int i = 1; i<=20; i++);{
//            if (i ==7){
//                System.out.println("Haz encontrado el numero 7!");
//                break;
//            }
//            System.out.println("Probando qué se ve con: " + i);
//        }

//        🟨 Ejercicio 4 – Evitar mostrar letras vocales con continue
//                Muestra las letras de la palabra "PROGRAMACION", pero omite las vocales usando continue.
        String palabra = "PROGRAMACION";
        for (int i = 0; i<palabra.length(); i++){
            char letra = palabra.charAt(i);
            if(letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U'){
                //Saltar las vocales
                continue;
            }
        System.out.println(letra);
        }
    }
}

package Clase7;

import java.util.Scanner;

public class Ejercicios6 {
    public static void main(String[] args) {

        //Ejercicio: Buscar un elemento
        //Pida al usuario un número y muestra si está preente en un array, y en que posicin.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce número a buscar:");
        int[] numeros = {10,25,30,35,40};
        int buscado = entrada.nextInt();

        boolean encontrado = false;
        for (int i = 0; i<numeros.length; i++){
            if (numeros[1] == buscado){
                System.out.println("El número " + buscado + " está en la posición: " + (i +  1));
                encontrado = true;
                break;
            }
        }
        if (!encontrado){
            System.out.println("tu numero no está en la lista");
        }
        entrada.close();
    }
}

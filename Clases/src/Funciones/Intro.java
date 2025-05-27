package Funciones;

import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int n1 = ent.nextInt();

        if(esPar(n1)) {
            System.out.println("Es par");
        }else{
            System.out.println("Es inpar");
        }

    }

    //1. Imprime saludo
    public static void saludar() {
        System.out.println("Hola");
    }

    public static void saludar(String nombre) {
        System.out.println("Hola, " + nombre + "!");
    }

    public static String saluda2(String nombre) {
        System.out.println("Mi primer sout en funcion:");
        return ("Hola, " + nombre + "!");
    }

    public static int sumar(int n1, int n2) {
        return (n1 + n2);
    }

    public static int sumar(int... numeros) {
        int suma = 0;
        for (int n : numeros) {
            suma += n;
        }
        return suma;
    }

    public static boolean esPar(int n1) {
        if (n1 % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
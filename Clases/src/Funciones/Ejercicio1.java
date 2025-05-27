package Funciones;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[] numeros = {9,9,9,8,8,9};

        System.out.println("La media de los números es:" + String.format("%.2f",calcularMedia(numeros)));
    }
    public static double calcularMedia(int[] numeros){
        int suma = 0;
        for (int n : numeros){
            suma += n;
        }
        return (double) suma / numeros.length;
    }
}

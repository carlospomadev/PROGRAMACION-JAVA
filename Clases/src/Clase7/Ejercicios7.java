package Clase7;

import java.util.Arrays;
//Ejercicio
//Declara un array con números desordenados y ordenalo de menor a mayor utilizando Array.sort
public class Ejercicios7 {
    public static void main(String[] args) {
        int[] numeros = {10,25,30,16,58};
        Arrays.sort(numeros);
        for(int num : numeros){
            System.out.println(num);
        }
    }
}

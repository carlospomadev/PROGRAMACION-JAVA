package EjerciciosClase;
import java.sql.SQLOutput;
import java.util.Locale;
import  java.util.Scanner;

public class EjercicioClase {
    public static void main(String[] args) {


        //Ejercicio 1. Clasificación de edad
        //Pide al usuario su edad e imprime si es menor de edad, adulto o adulto mayor

        //    Scanner scanner = new Scanner(System.in);
        //    System.out.println("Digita tu edad");
        //    int edad = scanner.nextInt();

        //Estructura else-if
        //    if (edad >= 65) {
        //        System.out.println("Eres adulto mayor");
        //    }else if (edad >= 18){
        //            System.out.println("Eres adulto");
        //    }else if (edad >0) {
        //        System.out.println("Eres menor de edad");
        //    }else {
        //        System.out.println("Digita un valor correcto");
        //    }


        //Ejercicio 2: Contador de vocales
        //Pide al usuario una palabra y cuenta cuántas vocales tiene.

        //    Scanner scanner = new Scanner(System.in);
        //    System.out.println("Escribe tu nombre y contaré sus vocales");
        //    String nombre = scanner.nextLine();

        //    char[] vocales = {'a' , 'e' , 'i' , 'o' , 'u'};

        //transformar nombre en minuscula para realizar la contabilidad de las vocales de manera eficiente
        //    String nombreMinusculas = nombre.toLowerCase();

        //    String voc = "";
        //    int conteoVoc = 0;

        //    for (int i=0; i<nombreMinusculas.length(); i++) {
        //        for(int a=0; a<vocales.length ; a++){
        //            if (nombreMinusculas.charAt(i) == vocales[a])
        //                conteoVoc++;
        //            voc+=nombreMinusculas.charAt(i);
        //        }
        //    }
        //    System.out.println("El número de vocales es:" + conteoVoc);
        //    scanner.close();


        //Ejercicios de Nivel Medio (Intermedio)
        //Ejercicio 3: Simulación de una calculadora
        //Crea un menú que permita sumar, restar, multiplicar y dividir dos números ingresados por el usuario.



//            Scanner scanner = new Scanner(System.in);
//            int numero1, numero2, operacion;
//        do {
//            System.out.println("Ingrese el primer número: ");
//            numero1 = scanner.nextInt();
//            System.out.println("Ingres el segundo numero: ");
//            numero2 = scanner.nextInt();
//
//            do {
//                System.out.println("Selecciona la operación que desees realizar:");
//                System.out.println("1. Sumar");
//                System.out.println("2. Restar");
//                System.out.println("3. Multiplicar");
//                System.out.println("4. Dividir");
//                System.out.println("5. Salir de la calculadora");
//                operacion = scanner.nextInt();
//            } while (operacion < 1 || operacion > 5);
//            switch (operacion) {
//                case 1:
//                    System.out.println("La suma es: " + (numero1 + numero2));
//                    break;
//                case 2:
//                    System.out.println("La resta es: " + (numero1 - numero2));
//                    break;
//                case 3:
//                    System.out.println("La multiplicación es: " + (numero1 * numero2));
//                    break;
//                case 4:
//                    System.out.println("La división es: " + (numero1 / numero2));
//                    break;
//                case 5:
//                    System.exit(0);
//                    break;
//            }
//        } while (operacion != 5);
//        scanner.close();

//        Ejercicio 4: Números pares hasta N
//        Pide un número al usuario y muestra todos los números pares desde 1 hasta ese número.

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ingrese un número: ");
//        int numero = scanner.nextInt();
//        int i;
//        for( i = 0; i <= numero; i += 2) {
//            System.out.println(i);
//        }

//        Ejercicio 5: Contraseña con intentos limitados
//        Pide al usuario una contraseña. Solo tiene 3 intentos antes de bloquearse.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe tu contraseña, tienes 3 intentos: ");
        String password = "Java123";
        String passwordIngresado;
        int intentos = 3;
        boolean acertado = false;
        while (intentos>0 && !acertado){
            System.out.println("Introduce la contraseña: ");
            passwordIngresado = scanner.nextLine();
            intentos--;
            if (passwordIngresado.equals(password)) {
                acertado = true;
                System.out.println("Contraseña correcta. Acceso concedido!!");
            }else if (intentos>0){
                    System.out.println("Contraseña incorrecta. Tienes intentos: " + intentos);
                }
            }
        if (!acertado){
            System.out.println("Contraseña bloqueada por intentos fallidos");
        }
        scanner.close();

    }
}

package Clase3;
import  java.util.Scanner;
//sin esto, no vas a poder pedirle al usuario dato alguno

public class Clase3 {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Dame un número:");
//        int numero = scanner.nextInt(); //con esto, leo el número del usuario

        //Estrucutura del if-else
//        if (numero > 0) {
//            System.out.println("El número es positivo");
//        } else if (numero < 0) {
//            System.out.println("El número es negativo");
//        }else {
//            System.out.println("El número es cero");
//        }
//        scanner.close(); //cierra el scanner.
//    }

        //2. Creame un menu interactivo donde el usuario elija una opción y muestre un

//        Scanner scanner = new Scanner(System.in);
//
//        //menú de opciones
//        System.out.println("*Menú de opciones*");
//        System.out.println("1. Saludar");
//        System.out.println("2. Mensaje motivacional");
//        System.out.println("3. Salir");
//
//        System.out.println("Selecciona una opción");
//        int opcion = scanner.nextInt(); //Leemos la opción del usuario
//
//        //Evaluar opciones con el switch
//        switch (opcion) {
//            case 1:
//                System.out.println("Hola, Bienvenido");
//                break;
//            case 2:
//                System.out.println("Bro, esto es masivo!!");
//                break;
//            case 3:
//                System.out.println("Saliendo del programa");
//                break;
//            default:
//                System.out.println("Macho, me has dado algo que no entiendo");
//        }
//        scanner.close();
//    }
        //Imprimir los numeros del 1 al 10 con un for
        //Usar un bucle para CONTAR del 1 al 10
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("Numero:" + i);
//            //Así muestro cada iteración
//        }
        //Ejercicio 4
        //Usa el while para pedir números hasta que ponga 0
//        Scanner scanner = new Scanner(System.in);
//        int numero;
//        System.out.println("Dame un número y pon 0 para salir");
//        numero = scanner.nextInt();
//        //Mientras que no sea cero, sigue pidiendo
//        while(numero!=0){
//            System.out.println("Has introducido: " + numero);
//            System.out.println("Introduce otro número");
//            numero = scanner.nextInt();
//        }
//        System.out.println("Programa finalizado");
//        scanner.close();
        //5. Pide contraseña y que no pueda entrar el usuario hasta que ponga java123
        Scanner scanner = new Scanner(System.in);
        String password;
        //Bucle do-while
        do{
            System.out.println("Introduce la contraseña");
            password = scanner.nextLine();
        } while (!password.equals("java123"));
        System.out.println("Acceso concedido");
        scanner.close();
    }
}

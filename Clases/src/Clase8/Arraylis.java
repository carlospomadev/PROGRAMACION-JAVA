package Clase8;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();
        System.out.println("Introduce nombres o escribe 'salir' para finalizar");
        String nombre;
        do{ 
            System.out.println("Nombre: ");
            nombre = nombre.nextlLine();
            if (!nombre.equalsIgnoreCase("salir")){
                nombres.add(nombre);
            }
        }while (!nombre.equalsIgnoreCase("salir"));

        int opcion;
        do{
            System.out.println("\n MENÚ DE OPCIONES");
            System.out.println("1.MOSTRAR TODOS LOS NOMBRES");
            System.out.println("0. SALIR");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> {
                    if (nombres.isEmpty()) {
                        System.out.println("No hay nombres");
                    } else{
                        for(String nom:nombres){
                            System.out.println(" - " + nom);
                        }
                    }
                }
                case 0 -> System.out.println("FIN");
                default -> System.out.println("Opción no válida");
            }
        }while (opcion != 0);
        scanner.close();
    }
}


package EjerciciosClase;
import java.sql.SQLOutput;
import java.util.Locale;
import  java.util.Scanner;

public class EjercicioClase5 {
    public static void main(String[] args) {
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

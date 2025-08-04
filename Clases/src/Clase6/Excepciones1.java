import java.util.InputMismatchException;
import java.util.Scanner;
public class Excepciones1 {
    public static void main(String[] args) {
        //Seleccionar una opción "1" o "2" con excepción en caso de digitar una letra u otra variable que no sea un
        //número (int). Se utilizará Switch/Case para la resolución.
    Scanner scanner = new Scanner(System.in);
        System.out.println("1.Saludar\n 2.Salir");
        System.out.println("Elige una opción");
        try {
            int opcion = scanner.nextInt();

            //agregamos esta división para forzar al sistema a dar un error aritmético "División por 0" y que salte
            //el segundo catch
            int resultado = 5/opcion;
            switch (opcion) {
                case 1 -> System.out.println("Hola");
                case 2 -> System.out.println("Saliendooo...");
                default -> System.out.println("Opción incorrecta");
            }
        }
        catch (InputMismatchException e) {
            System.out.println("Debes escribir un número");
        }
        catch (ArithmeticException e) {
            System.out.println("División por 0. Inválida");
        }
        finally {
            System.out.println("FIN");
        }
        scanner.close();
    }
}

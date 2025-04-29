package Clase1;

public class Clase1 {
    public static void main(String [] arg) {

        //Declaras una constante con la palabra final
        final double PI = 3.1415;
        final int mayoriaEdad = 18;
        //System.out.println("El vaor de PI es:" + PI);
        //System.out.println("La edad mínima para ser adutlo en Spain es:" + mayoriaEdad);

        // Operadores relacionales
        int x = 10;
        int y = 20;

        //System.out.println(" Es x igual a y?: " + (x==y));
        //System.out.println(" Es x diferente a y?: " + (x!=y));
        //System.out.println(" Es x mayor que y?: " + (y>x));
        //System.out.println(("Es x menor que y?: " + (x<y)));

        //Operadores lógicos. Es aquel que combina expresiones lógicas
        boolean a = true;
        boolean b = false;
        //System.out.println("a AND b: " + (a && b));
        //System.out.println(" a Or b: " + (a || b));
        //System.out.println("Not a: " + (!a));

        //Expresiones y/o evaluaciones
        int resultado = (10 + 5) * 2/3;
        int resultado2 = 10+5*2/3;
        System.out.println("El resultado de la expresión es: " + resultado);
        System.out.println("El resultado de la expresión es: " + resultado2);
    }

}

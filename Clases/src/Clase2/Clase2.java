package Clase2;

public class Clase2 {
    public static void main(String[] args) {

        //1. Conversion implicita de int a double

        int numeroEntero = 25;
        double numeroDecimal = numeroEntero;
        System.out.println("Numero entero: " + numeroEntero);
        System.out.println("Numero convertido a double: " + numeroDecimal);

        //2. Conversion explicita double a int con truncamiento

        double valorDecimal = 8.80;
        //Conversion explicita, "casting"
        int valorEntero = (int) valorDecimal;
        System.out.println("Valor original, double: " + valorDecimal);
        System.out.println("Valor convertido a double: " + valorEntero);

        //3. Desbordamiento. Int a byte
        int numeroGrande = 190;
        // conversion explicita a byte
        byte numeroPequeño = (byte) numeroGrande;
        System.out.println("Numero orginal en int: " + numeroGrande);
        System.out.println("Numero convertido a byte: " + numeroPequeño);

        //4. Conversion de String a int con Integer.parseInt ()
        String texto = "123";
        int numero = Integer.parseInt(texto);
        System.out.println("Texto: " + texto);
        System.out.println("texto convetido: " + numero);
        // Haz el cambio al revés

        //6. Convertir un int a string
        int numerito = 456;
        String textito = String.valueOf(numerito);
        System.out.println("Numero es:" + numerito);
        System.out.println("Numero convertido a texto: " + textito);

        //7. Conversion double a String
        double precio = 99.99;
        String textoPrecio = Double.toString(precio);
        System.out.println("Precio como string es: " + textoPrecio);

        //8. Conversion de boolean a String
        boolean activo = true;
        //Conversión a String
        String estado = String.valueOf(activo);
        System.out.println("Valor booleano en String: " + estado);

        //9. Conversion para operaciones matemáticas
        int a = 5 , b = 2;
        System.out.println("Division entera: " + (a/b));
        //Conversion a double para tener decimales
        double resultado = (double)a/b;
        System.out.println("División con casting: " + resultado);

        //10. Conversión de long a int y de float a int
        long numeroLargo = 1_000_000_000L;
        //Convertir del long al int
        int numeroEnterito = (int)numeroLargo;
        System.out.println("numero con cambio de long a int: " + numeroEnterito);
        // int prueba = 1_000_000_000L;

        //11.

    }
}

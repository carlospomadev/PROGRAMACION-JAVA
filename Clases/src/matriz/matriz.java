package matriz;

public class matriz {
    public static void main(String[] args) {
        int [][] matriz1 = new int[3][4];
        int [][] matriz2 = {
                {1,2,3,14},
                {4,5,6,15},
                {7,8,9,65},
        };
        System.out.println("Numer....: " + matriz2.length);
        System.out.println("Numero de columnas: " + matriz2[1].length);

        for(int i = 0; i < matriz2.length; i++){
            for (int j = 0; j <matriz2[i].length; j++){
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }
        matriz2[1][1] =30;
        for (int[] fila : matriz2) {
            for (int valor : fila){
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}

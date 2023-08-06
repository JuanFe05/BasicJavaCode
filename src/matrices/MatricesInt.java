package matrices;

public class MatricesInt {

    public static void main(String[] args) {

        // int[][] numeros = new int[Filas][Columnas];
        int[][] numeros = new int[2][4];

        numeros[0][0] = 1;
        numeros[0][1] = 2;
        numeros[0][2] = 3;
        numeros[0][3] = 4;

        numeros[1][0] = 5;
        numeros[1][1] = 6;
        numeros[1][2] = 7;
        numeros[1][3] = 8;

        System.out.println("número de filas: " + numeros.length);
        System.out.println("número de columnas: " + numeros[0].length);

        System.out.println("primer elemento de la matriz: " + numeros[0][0]);
        System.out.println("ultimo elemento de la matriz: " + numeros[numeros.length - 1][numeros[0].length - 1]);

        int numUno = numeros[0][0];
        int antePenul = numeros[1][2];

        System.out.println("El primer número es: " + numUno + " y el ante penultimo es: " + antePenul);

    }

}

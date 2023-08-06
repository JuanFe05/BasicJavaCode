package matrices;

public class OperacionesMatricesFilCol {

    public static void main(String[] args) {

        int sumaFila, sumaCol;

        int[][] a = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for (int i = 0; i < a.length; i++) {
            sumaFila = 0;
            sumaCol = 0;

            for (int j = 0; j < a[i].length; j++) {
                sumaFila += a[i][j];
                sumaCol += a[j][i];
            }
            System.out.println("El total de la Fila " + i + " es: " + sumaFila);
            System.out.println("El total de la Columan " + i + " es: " + sumaCol);
        }

    }

}

package matrices;

public class MatricesColumnasVariable {

    public static void main(String[] args) {

        int[][] matriz = new int[2][];

        matriz[0] = new int[2];
        matriz[1] = new int[4];

        System.out.println("Número de flias: " + matriz.length);
        System.out.println("La primera fila tiene: " + matriz[0].length + " Columnas");
        System.out.println("La segunda fila tiene: " + matriz[1].length + " Columnas");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i * j;
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

    }

}

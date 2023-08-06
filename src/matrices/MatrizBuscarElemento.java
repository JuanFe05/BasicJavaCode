package matrices;

public class MatrizBuscarElemento {

    public static void main(String[] args) {

        int[][] numeros = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        int elementoBuscar = 7;
        boolean encontrado = false;
        int i, j = 0;

        buscar: for (i = 0; i < numeros.length; i++) {
            for (j = 0; j < numeros[i].length; j++) {
                if (numeros[i][j] == elementoBuscar) {
                    encontrado = true;
                    break buscar;
                }
            }
        }

        if (encontrado){
            System.out.println("El número " + elementoBuscar + " encontrado en la fila " + i + " y la columna " + j);
        } else {
            System.out.println("Número no encontrado");
        }

    }

}

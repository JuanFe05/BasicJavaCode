package matrices;

public class MatrizSimetrica {

    public static void main(String[] args) {

        int[][] matriz = {
                {1,2,3,4},
                {2,1,0,5},
                {3,0,1,6},
                {4,5,6,7}
        };

        boolean simetrica = true;

        int i = 0, j = 0;

        /*while (i < matriz.length && simetrica == true) {
            while (j < i && simetrica == true) {
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                }
                j++;
            }
            i++;
        }*/

        /*salir: while (i < matriz.length) {
            while (j < i && simetrica == true) {
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                    break salir;
                }
                j++;
            }
            i++;
        }*/

        salir: for (;i < matriz.length; i++) {
            for (;j < i && simetrica == true; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                    break salir;
                }
            }
        }

        if (simetrica) {
            System.out.println("La matriz es simétrica");
        } else {
            System.out.println("La matriz no es simétrica");
        }

    }

}

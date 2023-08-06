package arreglos;

public class EjemploArreglosBuclesOrdenamientoBurbujaEnteros {

    public static void sortBurbuja (Object[] arreglo) {
        int contador = 0;
        int total = arreglo.length;

        for (int i = 0; i < total - 1; i++) {
            for (int j = 0; j < total - 1 - i; j++) {
                if ( ((Comparable)arreglo[j + 1]).compareTo(arreglo[j]) < 0) {
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = auxiliar;
                }
                contador ++;
            }
        }

        System.out.println("Contador: " + contador);
    }

    public static void main(String[] args) {

        Integer numeros[] = {2, 66, -5, 687, 1998, 648, 125, 987, -256, 0, 14, 32, 66, 98};

        sortBurbuja(numeros);

        int total = numeros.length;

        System.out.println("###### USANDO FOR ######");
        for (int i = 0; i < total; i++) {
            System.out.println("Para el indice " + i + ": " + numeros[i]);
        }
    }

}

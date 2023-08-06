package arreglos;

public class EjemploArreglosBuclesOrdenamientoBurbuja {

    public static void main(String[] args) {

        String productos[] = {"Corsair Pendrive 1208GB",
                "TV Sony 4K 65PLG",
                "SSD Samsung SATA 3 500GB",
                "Gráfica Nvidia RTX 4090",
                "Monitor AORUS 2K 27PLG",
                "Zapatillas Under Armour",
                "Teclado Mecanico Razer"};

        int total = productos.length;
        int contador = 0;

        for (int i = 0; i < total - 1; i++) {

            for (int j = 0; j < total - 1 - i; j++) {
                if (productos[j + 1].compareTo(productos[j]) < 0) {
                    String auxiliar = productos[j];
                    productos[j] = productos[j + 1];
                    productos[j + 1] = auxiliar;
                }
                contador ++;
            }

        }

        System.out.println("###### USANDO FOR ######");
        for (int i = 0; i < total; i++) {
            System.out.println("Para el indice " + i + ": " + productos[i]);
        }

        System.out.println("Contador: " + contador);

    }

    public static void arregloInverso (String arreglo[]) {

        int total = arreglo.length;
        int totalDos = arreglo.length;

        for (int i = 0; i < totalDos / 2; i++) {
            String actual = arreglo[i];
            String inverso = arreglo[total - 1 - i];

            arreglo[i] = inverso;
            arreglo[total - 1 - i] = actual;
            totalDos --;
        }

    }

}

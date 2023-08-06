package arreglos;

import java.util.Arrays;

public class EjemploArreglosBucles {

    public static void main(String[] args) {

        String productos[] = new String[7];

        int count = productos.length;;

        productos[0] = "Corsair Pendrive 1208GB";
        productos[1] = "TV Sony 4K 65PLG";
        productos[2] = "SSD Samsung SATA 3 500GB";
        productos[3] = "Gráfica Nvidia RTX 4090";
        productos[4] = "Monitor AORUS 2K 27PLG";
        productos[5] = "iPhone 14 PRO";
        productos[6] = "Teclado Mecanico Razer";

        Arrays.sort(productos); //Ordena el arreglo

        System.out.println("###### USANDO FOR ######");
        for (int i = 0; i < count; i++) {
            System.out.println("Para el indice " + i + ": " + productos[i]);
        }

        System.out.println("###### USANDO FOREACH ######");
        for (String prod: productos) {
            System.out.println("Producto es: " + prod);
        }

        System.out.println("###### USANDO WHILE ######");
        int j = 0;
        while (j < count) {
            System.out.println("Para el indice " + j + ": " + productos[j]);
            j ++;
        }

        System.out.println("###### USANDO DO WHILE ######");
        int k = 0;
        do {
            System.out.println("Para el indice " + k + ": " + productos[k]);
            k ++;
        } while (k < count);

        /* ===================================================================== */
        int[] numeros = new int[10];

        int totalNum = numeros.length;
        for (int l = 0; l < totalNum; l++) {
            numeros[l] = l * 3;
        }

        for (int l = 0; l < totalNum; l++) {
            System.out.println("Para el indice " + l + ": " + numeros[l]);
        }

    }

}

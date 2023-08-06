package arreglos;

import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosBuclesInversoMutable {

    public static void main(String[] args) {

        String productos[] = {"Corsair Pendrive 1208GB",
                "TV Sony 4K 65PLG",
                "SSD Samsung SATA 3 500GB",
                "Gráfica Nvidia RTX 4090",
                "Monitor AORUS 2K 27PLG",
                "iPhone 14 PRO",
                "Teclado Mecanico Razer"};

        int count = productos.length;

        Arrays.sort(productos); //Ordena el arreglo

        //arregloInverso(productos);

        Collections.reverse(Arrays.asList(productos));

        System.out.println("###### USANDO FOR ######");
        for (int i = 0; i < count; i++) {
            System.out.println("Para el indice " + i + ": " + productos[i]);
        }

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

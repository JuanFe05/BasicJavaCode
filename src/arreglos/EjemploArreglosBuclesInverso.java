package arreglos;

import java.util.Arrays;

public class EjemploArreglosBuclesInverso {

    public static void main(String[] args) {

        //String productos[] = new String[7];
        String productos[] = {"Corsair Pendrive 1208GB",
                "TV Sony 4K 65PLG",
                "SSD Samsung SATA 3 500GB",
                "Gráfica Nvidia RTX 4090",
                "Monitor AORUS 2K 27PLG",
                "iPhone 14 PRO",
                "Teclado Mecanico Razer"};

        int count = productos.length;

        Arrays.sort(productos); //Ordena el arreglo

        System.out.println("###### USANDO FOR ######");
        for (int i = 0; i < count; i++) {
            System.out.println("Para el indice " + i + ": " + productos[i]);
        }

        System.out.println("###### USANDO FOR INVERSO ######");
        for (int i = 0; i < count; i++) {
            System.out.println("Para el indice " + (count - 1 - i) + ": " + productos[count - 1 - i]);
        }

        System.out.println("###### USANDO FOR INVERSO 2 ######");
        for (int i = count  - 1; i >= 0; i--) {
            System.out.println("Para el indice " + i + ": " + productos[i]);
        }

    }

}

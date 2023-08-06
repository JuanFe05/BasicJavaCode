package arreglos;

import java.util.Scanner;

public class EjemploArrelgosDetectarOrden {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a[] = new int[7];

        System.out.println("Ingrese 7 números: ");

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        boolean asc = false;
        boolean desc = false;
        for (int i = 0; i < a.length - 1; i++) {

            if (a[i] > a[i + 1]) {
                desc = true;
            }

            if (a[i] < a[i + 1]) {
                asc = true;
            }

        }

        if (asc == true && desc == true) {
            System.out.println("Arreglo desordenado");
        }

        if (asc == false && desc == false) {
            System.out.println("Arreglo = todos iguales");
        }

        if (asc == true && desc == false) {
            System.out.println("Arreglo = ordenado de forma ascendente");
        }

        if (asc == false && desc == true) {
            System.out.println("Arreglo = ordenado de forma descendete");
        }

        sc.close();

    }

}

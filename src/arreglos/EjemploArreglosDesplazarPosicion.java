package arreglos;

import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion {

    public static void main(String[] args) {

        int[] a = new int[5];
        int ultimo;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingresa el número en la posición " + i + ": ");
            a[i] = sc.nextInt();
        }

        ultimo = a[a.length - 1];

        for (int i = a.length - 2; i >= 0; i--) {
            a[i + 1] = a[i];
        }

        a[0] = ultimo;

        System.out.println("El arreglo final es: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();

    }

}

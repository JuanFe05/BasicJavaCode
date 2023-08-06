package arreglos;

import java.util.Scanner;

public class EjemploArreglosDesplazarPosicionDos {

    public static void main(String[] args) {

        int[] a = new int[5];
        int elemento, posicion;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < a.length - 1; i++) {
            System.out.print("Ingresa el número en la posición " + i + ": ");
            a[i] = sc.nextInt();
        }

        System.out.print("Ingresa el nuevo elemento: ");
        elemento = sc.nextInt();

        System.out.print("Ingresa la posición del elemento del (0 - 5): ");
        posicion = sc.nextInt();

        for (int i = a.length - 2; i >= posicion; i--) {
            a[i + 1] = a[i];
        }

        a[posicion] = elemento;

        System.out.println("El arreglo final es: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();

    }

}

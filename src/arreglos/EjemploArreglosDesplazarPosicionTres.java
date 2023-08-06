package arreglos;

import java.util.Scanner;

public class EjemploArreglosDesplazarPosicionTres {

    public static void main(String[] args) {

        int[] a = new int[5];
        int numero, posicion = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < a.length - 1; i++) {
            System.out.print("Ingresa el número en la posición " + i + ": ");
            a[i] = sc.nextInt();
        }

        System.out.print("Ingresa el nuevo numero a insertar: ");
        numero = sc.nextInt();

        while (posicion < 4 && numero > a[posicion]) {
            posicion++;
        }

        for (int i = a.length - 2; i >= posicion; i--) {
            a[i + 1] = a[i];
        }

        a[posicion] = numero;

        System.out.println("El arreglo queda de la siguiente forma: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(i + " => " + a[i]);
        }

        sc.close();

    }

}

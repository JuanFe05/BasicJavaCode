package arreglos;

import java.util.Scanner;

public class EjemploArreglosDesplazarPosicionTresB {

    public static void main(String[] args) {

        int[] a = new int[5];
        int[] b = new int[a.length + 1];
        int numero, posicion = 0, ultimo;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingresa el número en la posición " + i + ": ");
            a[i] = sc.nextInt();
        }

        System.out.print("Ingresa el nuevo numero a insertar: ");
        numero = sc.nextInt();

        ultimo = a[a.length - 1];

        while (posicion < 4 && numero > a[posicion]) {
            posicion++;
        }

        for (int i = a.length - 2; i >= posicion; i--) {
            a[i + 1] = a[i];
        }

        System.arraycopy(a,0,b,0,a.length);

        if (numero > ultimo) {
             b[b.length - 1] = numero;
        } else {
            b[b.length - 1] = ultimo;
            b[posicion] = numero;
        }

        System.out.println("El arreglo queda de la siguiente forma: ");
        for (int i = 0; i < b.length; i++) {
            System.out.println(i + " => " + b[i]);
        }

        sc.close();

    }

}

package arreglos;

import java.util.Scanner;

public class EjemploArreglosDesplazarPosicionDosB {

    public static void main(String[] args) {

        int[] a = new int[5];
        int[] b = new int[a.length + 1];
        int elemento, posicion, ultimo;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingresa el número en la posición " + i + ": ");
            a[i] = sc.nextInt();
        }

        System.out.print("Ingresa el nuevo elemento: ");
        elemento = sc.nextInt();

        System.out.print("Ingresa la posición del elemento del (0 - 5): ");
        posicion = sc.nextInt();

        ultimo = a[a.length - 1];
        for (int i = a.length - 2; i >= posicion; i--) {
            a[i + 1] = a[i];
        }

        System.arraycopy(a,0,b,0,a.length);

        a = b;
        a[posicion] = elemento;
        a[a.length - 1] = ultimo;

        System.out.println("El arreglo final es: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();

    }

}

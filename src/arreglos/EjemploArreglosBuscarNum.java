package arreglos;

import java.util.Scanner;

public class EjemploArreglosBuscarNum {

    public static void main(String[] args) {

        int a[] = new int[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese el número en la posición " + i + " : ");
            a[i] = sc.nextInt();
        }

        System.out.print("\r\nCual es el número que desea encontrar: ");
        int buscar = sc.nextInt();

        int i = 0;
        while (i < a.length && a[i] != buscar) {
            i++;
        }

        if (i == a.length) {
            System.out.println("Número no hallado");
        } else if (a[i] == buscar) {
            System.out.println("Número encontrado en la posición " + i);
        }

        sc.close();

    }

}

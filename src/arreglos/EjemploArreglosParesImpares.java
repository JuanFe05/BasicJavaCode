package arreglos;

import java.util.Scanner;

public class EjemploArreglosParesImpares {

    public static void main(String[] args) {

        int[] a, par, impar;
        int totalPar = 0, totalImpar = 0;

        a = new int[10];

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa 10 números: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                totalPar ++;
            } else {
                totalImpar ++;
            }
        }

        par = new int[totalPar];
        impar = new int[totalImpar];
        int j = 0, k = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                par[j++] = a[i];
            } else {
                impar[k++] = a[i];
            }
        }

        System.out.println("Arreglo Completo: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println("\r\nPares: ");
        for (int i = 0; i < par.length; i++) {
            System.out.print(par[i] + " ");
        }

        System.out.println("\r\nImpares: ");
        for (int i = 0; i < impar.length; i++) {
            System.out.print(impar[i] + " ");
        }

        sc.close();

    }

}

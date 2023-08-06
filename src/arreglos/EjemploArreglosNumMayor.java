package arreglos;

import java.util.Scanner;

public class EjemploArreglosNumMayor {

    public static void main(String[] args) {

        int a[] = new int[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingresa el entero en la posición " + i + " : ");
            a[i] = sc.nextInt();
        }

        int max = 0;
        for (int i = 1; i < a.length; i++) {
            max = (a[max] > a[i]) ? max : i;
        }

        System.out.println("El número mayor es: " + a[max]);

        sc.close();

    }

}

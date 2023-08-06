package arreglos;

import java.util.Scanner;

public class EjemploArreglosBuscarString {

    public static void main(String[] args) {

        String a[] = new String[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese el dato en la posición " + i + " : ");
            a[i] = sc.next();
        }

        System.out.print("\r\nCual es el dato que desea encontrar: ");
        String dato = sc.next();

        int i = 0;
        while (i < a.length && !a[i].equalsIgnoreCase(dato)) {
            i++;
        }

        if (i == a.length) {
            System.out.println("Dato no hallado");
        } else if (a[i].compareTo(dato) == 0) {
            System.out.println("Dato encontrado en la posición " + i);
        }

        sc.close();

    }

}

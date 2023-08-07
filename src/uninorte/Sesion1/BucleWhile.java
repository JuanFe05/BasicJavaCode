package uninorte.Sesion1;

import java.util.Scanner;

public class BucleWhile {

    public static void main(String[] args) {

        Scanner capturaDato = new Scanner (System.in);

        boolean condition = true;
        int contador = 0;

        while (condition) {
            contador ++;
            System.out.println("El contador: " + contador);
            System.out.println("Continuar? ");
            String continuar = capturaDato.nextLine();

            if (continuar.equals("No")) {
                condition = false;
            }
        }

        capturaDato.close();

    }

}

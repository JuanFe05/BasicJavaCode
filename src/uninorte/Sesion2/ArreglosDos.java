package uninorte.Sesion2;

import java.util.Scanner;

public class ArreglosDos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

		int numeroPersonas, alturaInferior = 0, alturaSuperior = 0;
		double estaturaMedia = 0;

		do {
			System.out.print("Ingresa el n�mero de personas: ");
			numeroPersonas = sc.nextInt();
		} while (numeroPersonas <= 0);

		// Ingresando la estatura de las personas:
		double alto[] = new double[numeroPersonas];

		for (int i = 0; i < numeroPersonas; i++) {
			System.out.print("La estatura de la persona " + (i + 1) + " en (cm) es: ");
			alto[i] = sc.nextDouble();
			estaturaMedia = estaturaMedia + alto[i];
		}

		// Calculando los m�s bajos y altos de la media:
		estaturaMedia = estaturaMedia / numeroPersonas;

		for (int i = 0; i < alto.length; i++) {
			if (alto[i] >= estaturaMedia) {
				alturaSuperior ++;
			}
			else if (alto[i] < estaturaMedia) {
				alturaInferior ++;
			}

		}

		System.out.println("Estatura media: " + estaturaMedia);
		System.out.println("Persona m�s altas de la estatura media: " + alturaSuperior);
		System.out.println("Persona m�s bajas de la estatura media: " + alturaInferior);

		sc.close();

    }

}

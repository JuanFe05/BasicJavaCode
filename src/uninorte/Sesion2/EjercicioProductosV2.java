package uninorte.Sesion2;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioProductosV2 {

    public static void main(String[] args) {

		Scanner capturaDatos = new Scanner(System.in);

		// condicion por si numeroProductos es menor o igual a cero.
		int numeroProductos;

		do {
			System.out.print("Ingresa el n�mero de productos: ");
			numeroProductos = capturaDatos.nextInt();
		} while (numeroProductos <= 0);

		// Creando los arrays.
		double codigos[] = new double[numeroProductos];
		double cantidadBodega[] = new double[numeroProductos];
		double cantidadMinima[] = new double[numeroProductos];

		// llenando los arrays
		int indiceMayor = 0, indiceMenor = 0;
		double mayorBodega, menorBodega;
		mayorBodega = menorBodega = cantidadBodega[0];

		System.out.println("C�digos de productos que son necesario pedir: ");

		for (int i = 0; i < cantidadMinima.length; i++) {
			codigos[i] = (int) (Math.random() * 500) + 1;
			cantidadBodega[i] = (int) (Math.random() * 500) + 1;
			cantidadMinima[i] = (int) (Math.random() * 500) + 1;

			if (cantidadBodega[i] < cantidadMinima[i]) {
				System.out.println(codigos[i]);
			}

			// bucle que buscar el mayor y menor en bodega
			for (int x = 0; x < cantidadBodega.length; x++) {
	            if(cantidadBodega[x] > cantidadBodega[indiceMayor]) {
	            	mayorBodega = cantidadBodega[x];
	            	indiceMayor = x;
	            }
	            if(cantidadBodega[x] < cantidadBodega[indiceMenor]) {
	            	menorBodega = cantidadBodega[x];
	            	indiceMenor = x;
	            }
	        }
		}

		System.out.println();

		// Imprimiendo los arrays.
		System.out.println("C�DIGOS PRODUCTOS  : " + Arrays.toString(codigos));
		System.out.println("CANTIDAD EN BODEGA : " + Arrays.toString(cantidadBodega));
		System.out.println("M�NIMO REQUERIDO   : " + Arrays.toString(cantidadMinima) + "\n");

		// Imprime los c�digos mayores y menores.
		for(int j = 0; j < codigos.length; j++) {
            if (indiceMayor == j) {
            	System.out.println("C�digo con mayor n�mero unidades: " + codigos[j] + " Cantidad en bodega: " + mayorBodega);
			}
            if (indiceMenor == j) {
            	System.out.println("C�digo con menor n�mero  unidades: " + codigos[j] + " Cantidad en bodega: " + menorBodega);
			}
        }

		capturaDatos.close();

	}

}

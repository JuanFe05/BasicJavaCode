package uninorte.Sesion4.Ejercicio1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner capturaDatos = new Scanner(System.in);

        System.out.print("Ingresa el código: ");
        int codigo = capturaDatos.nextInt();

        System.out.print("Ingresa el precio de compra: ");
        int precioCompra = capturaDatos.nextInt();

        System.out.print("Ingresa la cantidad en bodega: ");
        int cantidadBodega = capturaDatos.nextInt();

        System.out.print("Ingresa la cantidad mínima requerida en bodega: ");
        int cantidadMinimaBodega = capturaDatos.nextInt();

        Productos metodoPrincipal = new Productos(codigo, precioCompra, cantidadBodega, cantidadMinimaBodega);

        if (metodoPrincipal.solicitarPedido()) {
            System.out.println("ALERTA, SE DEBE HACER PEDIDO EN " + codigo);
        } else {
            System.out.println("TODO CONTROLADO!!!");
        }

        capturaDatos.close();

    }

}

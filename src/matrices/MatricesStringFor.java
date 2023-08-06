package matrices;

public class MatricesStringFor {

    public static void main(String[] args) {

        String[][] nombres = new String[3][2];

        nombres[0][0] = "Alaba";
        nombres[0][1] = "Pedri";

        nombres[1][0] = "Messi";
        nombres[1][1] = "Ronaldo";

        nombres[2][0] = "Neymar";
        nombres[2][1] = "Suarez";

        System.out.println("Iterando con for: ");
        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < nombres[0].length; j++) {
                System.out.print(nombres[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nIterando con for each: ");
        for (String[] fila: nombres) {
            for (String nombre: fila) {
                System.out.print(nombre + "\t");
            }
            System.out.println();
        }

    }

}

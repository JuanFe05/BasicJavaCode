package matrices;

public class MatricesStringFor2 {

    public static void main(String[] args) {

        String[][] nombres = { {"Pele", "Maradona"}, {"Messi", "Ronaldo"}, {"Neymar", "Suarez"} };

        System.out.println("\nIterando con for each: ");
        for (String[] fila: nombres) {
            for (String nombre: fila) {
                System.out.print(nombre + "\t");
            }
            System.out.println();
        }

    }

}

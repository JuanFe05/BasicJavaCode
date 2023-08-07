package EstructuraDatos.ArbolDeBusqueda;

public class Main {

    public static void main(String[] args) throws Exception {

        Libro libro1 = new Libro(18, "Cementerio de animales", "Stephen King", "Debolsillo");
        Libro libro2 = new Libro(4, "Nos4A2 Nosferatu", "Joe Hill", "Nocturna Ediciones");
        Libro libro3 = new Libro(22, "It (eso)", "Stephen King", "Debolsillo");
        /*
         * Libro libro4 = new Libro(30, "Fuego", "Joe Hill", "Nocturna Ediciones");
         * Libro libro5 = new Libro(17, "Misery", "Stephen King", "Debolsillo");
         * Libro libro6 = new Libro(10, "El Silmarillion", "J.R.R. Tolkien", "Booket");
         */

        Nodo nodo = new Nodo();

        nodo.insertaLibro(libro1); /* Raiz */
        nodo.insertaLibro(libro2); /* Izquierda */
        nodo.insertaLibro(libro3); /* Derecha */
        /* nodo.insertaLibro(libro4); */ /* Derecha - Derecha */
        /* nodo.insertaLibro(libro5); */ /* Derecha - Izquierda */
        /* nodo.insertaLibro(libro6); */ /* Izquierda - Derecha */

        nodo.preorden();
        /* nodo.inorden(); */

        nodo.eliminarLibro(18);

        nodo.preorden();

    }

    private static void buscarLibro(Nodo nodo, int id) {
        if (nodo.existeLibro(id)) {
            System.out.println(nodo.obtenerLibro(id));
        } else {
            System.out.println("No se encuentra el libro: " + id);
        }
    }

}

package uniajc.EstructuraDatos.ListasEnlazadas;

public class Main {

    public static void main(String[] args) throws Exception {

        Libro libro1 = new Libro("El Resplandor", "Stephen King", "E0001");

        Lista lista = new Lista();
        lista.insertarPrincipio(libro1);

        String libroEnLista = lista.obtener(0).getAutor();
        System.out.println(libroEnLista);

    }

}

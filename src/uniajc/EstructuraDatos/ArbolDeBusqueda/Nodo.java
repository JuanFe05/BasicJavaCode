package uniajc.EstructuraDatos.ArbolDeBusqueda;

public class Nodo implements BST<Libro> {

    private Libro valor;
    private Nodo izquierdo, derecho;
    private Nodo padre;

    @Override
    public boolean esVacio() {
        return valor == null;
    }

    @Override
    public boolean esHoja() {
        return valor != null && izquierdo == null && derecho == null; // verifica el árbol y sus nodos
    }

    private void insertaLibroBST(Libro libro, Nodo padre) {
        if (valor == null) {
            this.valor = libro;
            this.padre = padre;
        }

        else {
            if (libro.compareTo(valor) < 0) {
                if (izquierdo == null)
                    izquierdo = new Nodo();
                izquierdo.insertaLibroBST(libro, this);
            }

            else if (libro.compareTo(valor) > 0) {
                if (derecho == null)
                    derecho = new Nodo();
                derecho.insertaLibroBST(libro, this);
            }

            else {
                throw new RuntimeException("Insertando elemento duplicado");
            }
        }
    }

    @Override
    public void insertaLibro(Libro libro) {
        insertaLibroBST(libro, null);
    }

    @Override
    public boolean existeLibro(int id) {
        if (valor != null) {
            if (id == valor.getId()) {
                return true;
            }

            else if (id < valor.getId() && izquierdo != null) {
                return izquierdo.existeLibro(id);
            }

            else if (id > valor.getId() && derecho != null) {
                return derecho.existeLibro(id);
            }

            else {
                return false;
            }
        }

        else {
            return false;
        }
    }

    @Override
    public Libro obtenerLibro(int id) { // Obtiene un nodo por medio del id
        if (valor != null) {
            if (id == valor.getId()) {
                return valor;
            }

            else if (id < valor.getId() && izquierdo != null) {
                return izquierdo.obtenerLibro(id);
            }

            else if (id > valor.getId() && derecho != null) {
                return derecho.obtenerLibro(id);
            }

            else {
                return null;
            }
        }

        else {
            return null;
        }
    }

    private Nodo minimo() {
        if (izquierdo != null && !izquierdo.esVacio()) {
            return izquierdo.minimo();
        } else {
            return this;
        }
    }

    private void eliminarNodo(int id) {
        if (izquierdo != null && derecho != null) { // Eliminar con 2 hijos
            Nodo minimo = derecho.minimo();
            this.valor = minimo.valor;

            derecho.eliminarLibro(minimo.valor.getId());
        }

        else if (izquierdo != null || derecho != null) { // Eliminar 1 un hijo
            Nodo sustituto = izquierdo != null ? izquierdo : derecho;
            this.valor = sustituto.valor;
            this.izquierdo = sustituto.izquierdo;
            this.derecho = sustituto.derecho;
        }

        else { // Eliminar con 0 hijos
            if (padre != null) {
                if (this == padre.izquierdo)
                    padre.izquierdo = null;

                if (this == padre.derecho)
                    padre.derecho = null;

                padre = null;
            }
            valor = null;
        }
    }

    @Override
    public void eliminarLibro(int id) {
        if (valor != null) { // verifica que el arbol esté lleno
            if (id == valor.getId()) {
                eliminarNodo(id);
            } else if (id < valor.getId() && izquierdo != null) { // parte izquierda
                izquierdo.eliminarLibro(id);
            } else if (id > valor.getId() && derecho != null) { // parte derecha
                derecho.eliminarLibro(id);
            }
        }
    }

    @Override
    public void preorden() {
        if (valor != null) {
            System.out.println(valor);

            if (izquierdo != null)
                izquierdo.preorden();

            if (derecho != null)
                derecho.preorden();
        }
    }

    @Override
    public void inorden() {
        if (valor != null) {
            if (izquierdo != null)
                izquierdo.inorden();

            System.out.println(valor);

            if (derecho != null)
                derecho.inorden();
        }
    }

    @Override
    public void postorden() {
        if (valor != null) {
            if (izquierdo != null)
                izquierdo.postorden();

            if (derecho != null)
                derecho.postorden();

            System.out.println(valor);
        }
    }

}

package EstructuraDatos.ListasEnlazadas;

public class Lista {

    private Nodo cabecera = null; /* Nodo principal | Primer Nodo */
    private int longitud = 0; /* Longitud de la lista */

    private class Nodo {
        public Libro libro;
        public Nodo siguiente = null; /* Hace referencia al nodo siguiente */

        public Nodo(Libro libro) {
            this.libro = libro;
        }
    }

    /* Inicio insertar elementos en la lista */
    public void insertarPrincipio(Libro libro) {
        Nodo nodo = new Nodo(libro);
        nodo.siguiente = cabecera;
        cabecera = nodo;
        longitud++;
    }

    public void insertarFinal(Libro libro) {
        Nodo nodo = new Nodo(libro);
        if (cabecera == null) { /* Comprueba que la lista está o no vacía */
            cabecera = nodo;
        } else {
            Nodo puntero = cabecera; /* El puntero apunta a la cabeza de la lista */
            while (puntero.siguiente != null) {
                puntero = puntero.siguiente;
            }
            /*
             * Al llegar al final de la lista, ahora siguiente vale el nodo que hemos
             * instanciado
             */
            puntero.siguiente = nodo;
        }
        longitud++;
    }

    public void insertarCualquierPosicion(int n, Libro libro) {
        Nodo nodo = new Nodo(libro);
        if (cabecera == null) { /* Comprueba que la lista está o no vacía */
            cabecera = nodo;
        } else {
            Nodo puntero = cabecera; /* El puntero apunta a la cabeza de la lista */
            int contador = 0;
            while (contador < n && puntero.siguiente != null) {
                puntero = puntero.siguiente;
                contador++;
            }
            nodo.siguiente = puntero.siguiente; /* Conecta por la derecha */
            puntero.siguiente = nodo; /* Conecta por la izquierda */
        }
        longitud++;
    }
    /* Fin insertar elementos en la lista */

    /* Inicio para obtener elementos */
    public Libro obtener(int n) {
        if (cabecera == null) {
            return null;
        } else {
            Nodo puntero = cabecera; /* El puntero apunta a la cabeza de la lista */
            int contador = 0;
            while (contador < n && puntero.siguiente != null) {
                puntero = puntero.siguiente;
                contador++;
            }
            if (contador != n) {
                return null;
            } else {
                return puntero.libro;
            }
        }
    }

    public int contarLibro() {
        return longitud;
    }
    /* Fin para obtener elementos */

    /* Mètodo que comprueba si una lista està vacìa */
    public boolean compruebaLista() {
        return cabecera == null;
    }

    /* Inicio para Eliminar elementos */
    public void eliminarPrincipio() {
        if (cabecera != null) {
            Nodo primero = cabecera;
            cabecera = cabecera.siguiente; /* Pone el segundo nodo al principio de la lista */
            primero.siguiente = null;
            longitud--; /* Decrementa la longitud de la lista */
        }
    }

    public void eliminarUltimo() {
        if (cabecera != null) {
            if (cabecera.siguiente == null) {
                cabecera = null;
                longitud--;
            } else {
                Nodo puntero = cabecera;
                while (puntero.siguiente.siguiente != null) {
                    puntero = puntero.siguiente;
                }
                puntero.siguiente = null;
                longitud--;
            }
        }
    }

    public void eliminarCualquiera(int n) {
        if (cabecera != null) {
            if (n == 0) {
                Nodo primero = cabecera;
                cabecera = cabecera.siguiente; /* Pone el segundo nodo al principio de la lista */
                primero.siguiente = null;
                longitud--; /* Decrementa la longitud de la lista */
            } else if (n < longitud) {
                Nodo puntero = cabecera; /* puntero apunta al obj anterio a eliminar */
                int contador = 0;
                while (contador < (n - 1)) {
                    puntero = puntero.siguiente;
                    contador++;
                }
                Nodo anterior = puntero.siguiente;
                puntero.siguiente = anterior.siguiente;
                anterior.siguiente = null;
                longitud--;
            }
        }
    }
    /* Fin para Eliminar elementos */

}

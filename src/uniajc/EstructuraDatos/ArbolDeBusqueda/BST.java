package uniajc.EstructuraDatos.ArbolDeBusqueda;

public interface BST <T extends Comparable> {

    void insertaLibro(T libro);

    boolean existeLibro(int id);

    T obtenerLibro(int id);

    void eliminarLibro(int id);

    boolean esHoja();

    boolean esVacio();

    void preorden();

    void inorden();

    void postorden();

}

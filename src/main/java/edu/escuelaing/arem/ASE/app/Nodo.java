package edu.escuelaing.arem.ASE.app;

/**
 * Clase que crea nodos dados un numero
 */
public class Nodo<E> {
    private E num;
    private Nodo<E> siguiente;

    /**
     * Constructor de nodo
     * 
     * @param num       Valor Double del nodo
     * @param siguiente Nodo enlazado siguiente
     */
    public Nodo(E num, Nodo<E> siguiente) {
        this.num = num;
        this.siguiente = siguiente;
    }

    /**
     * Retorna el valor del nodo
     * 
     * @return Valor Double
     */
    public E getNum() {
        return num;
    }

    /**
     * Establece el valor del nodo
     * 
     * @param num Double a establecer
     */
    public void setNum(E num) {
        this.num = num;
    }

    /**
     * Metodo que retorna el nodo siguiente enlazado
     * 
     * @return Nodo
     */
    public Nodo<E> getSiguiente() {
        return siguiente;
    }

    /**
     * Establece el nodo siguiente
     * 
     * @param siguiente nodo a establecer como siguiente
     */
    public void setSiguiente(Nodo<E> siguiente) {
        this.siguiente = siguiente;
    }

}

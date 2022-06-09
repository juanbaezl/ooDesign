package edu.escuelaing.arem.ASE.app;

/**
 * Clase que crea nodos dados un numero
 */
public class Nodo {
    private Double num;
    private Nodo siguiente;

    /**
     * Constructor de nodo
     * 
     * @param num       Valor Double del nodo
     * @param siguiente Nodo enlazado siguiente
     */
    public Nodo(Double num, Nodo siguiente) {
        this.num = num;
        this.siguiente = siguiente;
    }

    /**
     * Retorna el valor del nodo
     * 
     * @return Valor Double
     */
    public Double getNum() {
        return num;
    }

    /**
     * Establece el valor del nodo
     * 
     * @param num Double a establecer
     */
    public void setNum(Double num) {
        this.num = num;
    }

    /**
     * Metodo que retorna el nodo siguiente enlazado
     * 
     * @return Nodo
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * Establece el nodo siguiente
     * 
     * @param siguiente nodo a establecer como siguiente
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}

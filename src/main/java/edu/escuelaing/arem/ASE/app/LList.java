package edu.escuelaing.arem.ASE.app;

import java.util.Iterator;

/**
 * Clase de implementacion propia de una LinkedList
 */
public class LList implements Iterable<Double> {

    private Nodo head;
    private Nodo tail;
    private int longitud;

    /**
     * Constructor de clase
     */
    public LList() {
        this.longitud = 0;
    }

    /**
     * Metodo que inserta un nuevo valor
     * 
     * @param num Valor Double a insertar
     */
    public void add(Double num) {
        this.longitud++;
        Nodo nuevo = new Nodo(num, null);
        if (head == null) {
            this.head = nuevo;
            this.tail = nuevo;
        } else {
            this.tail.setSiguiente(nuevo);
            this.tail = nuevo;
        }
    }

    /**
     * Metodo que obtiene la cabeza de la lista
     * 
     * @return Nodo referenciado como cabeza
     */
    public Nodo getHead() {
        return head;
    }

    /**
     * Metodo que establece la cabeza de la lista
     * 
     * @param head Nuevo nodo a ser cabeza
     */
    public void setHead(Nodo head) {
        this.head = head;
    }

    /**
     * Metodo que obtiene la cola de la lista
     * 
     * @return Nodo referenciado como cola
     */
    public Nodo getTail() {
        return tail;
    }

    /**
     * Metodo que establece la cola de la lista
     * 
     * @param tail Nuevo Nodo a ser cola
     */
    public void setTail(Nodo tail) {
        this.tail = tail;
    }

    /**
     * Metodo que obtiene la longitud de la lista
     * 
     * @return longitud de la lista
     */
    public int getLongitud() {
        return longitud;
    }

    @Override
    public String toString() {
        Nodo actual = head;
        String res = "[";
        while (actual != null) {
            res += actual.getNum() + ",";
            actual = actual.getSiguiente();
        }
        res = res.substring(0, res.length() - 1);
        res += "]";
        return res;
    }

    @Override
    public Iterator<Double> iterator() {
        Iterator<Double> iterator = new Iterator<Double>() {
            private Nodo actual;

            @Override
            public boolean hasNext() {
                return actual == null ? true : actual.getSiguiente() != null;
            }

            @Override
            public Double next() {
                if (actual == null) {
                    actual = head;
                } else {
                    actual = actual.getSiguiente();
                }
                return actual.getNum();
            }

        };
        return iterator;
    }
}

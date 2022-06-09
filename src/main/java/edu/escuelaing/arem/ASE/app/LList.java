package edu.escuelaing.arem.ASE.app;

import java.util.Iterator;

public class LList implements Iterable<Double> {

    private Nodo head;
    private Nodo tail;
    private int longitud;

    public LList() {
        this.longitud = 0;
    }

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

    public Nodo getHead() {
        return head;
    }

    public void setHead(Nodo head) {
        this.head = head;
    }

    public Nodo getTail() {
        return tail;
    }

    public void setTail(Nodo tail) {
        this.tail = tail;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
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

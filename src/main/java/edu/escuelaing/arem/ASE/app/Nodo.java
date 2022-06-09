package edu.escuelaing.arem.ASE.app;

public class Nodo {
    private Double num;
    private Nodo siguiente;

    public Nodo(Double num, Nodo siguiente) {
        this.num = num;
        this.siguiente = siguiente;
    }

    public Double getNum() {
        return num;
    }

    public void setNum(Double num) {
        this.num = num;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}

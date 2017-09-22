package co.edu.udea.programa4;

public class Nodo {
    private double dato;
    private Nodo anterior;
    private Nodo siguiente;

    public Nodo(double dato) {
        this.dato = dato;
        this.anterior = null;
        this.siguiente = null;
    }

    public Nodo(){
        
    }
    
    public double getDato() {
        return dato;
    }

    public void setDato(double dato) {
        this.dato = dato;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
    
    public Nodo getSiguiente(){
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}

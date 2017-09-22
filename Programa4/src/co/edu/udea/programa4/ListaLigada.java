package co.edu.udea.programa4;

public class ListaLigada {

    private Nodo cabeza, primero, ultimo;
    
    public ListaLigada(){
        cabeza = new Nodo(0);
        primero = null;
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    public Nodo getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }
    
    public void addNodo(Nodo nuevo){
        if(cabeza.getDato() == 0){
            primero = nuevo;
            primero.setAnterior(cabeza);
            cabeza.setSiguiente(primero);
            cabeza.setDato(cabeza.getDato()+1);
        }else{
            if(cabeza.getDato() == 1){
                ultimo = nuevo;
                ultimo.setAnterior(primero);
                primero.setSiguiente(ultimo);
                cabeza.setDato(cabeza.getDato()+1);
            }else{
                ultimo.setSiguiente(nuevo);
                nuevo.setAnterior(ultimo);
                ultimo = nuevo;
                cabeza.setDato(cabeza.getDato()+1);
            }
        }
    }
    
    public void removeNodo(Nodo eliminado){
        if(eliminado==null) return;
        Nodo x = buscarNodo(eliminado.getDato());
        if(x!=null){
            Nodo a, s;
            a = eliminado.getAnterior();
            s = eliminado.getSiguiente();
            a.setSiguiente(s);
            s.setAnterior(a);
        }
    }
    
    public Nodo buscarNodo(Double dato){
        if(cabeza.getDato()==0)
            return null;
        if(primero.getDato() == dato)
            return primero;
        else{
            Nodo p, q;
            p = primero.getSiguiente();
            while(p != null){
                if(p.getDato() != dato)
                    return p;
                p = p.getSiguiente();
            }
        }
        return null;
    }
    
    public double sumar(){
        double suma = 0;
        Nodo p = primero;
        while(p!=null){
            suma = suma + p.getDato();
            p = p.getSiguiente();
        }
        return suma;
    }
    
    public String mostrarDatos(){
        Nodo p = getPrimero();
        String datos = "";
        while(p!=null){
            datos = datos + " - " + p.getDato();
            p = p.getSiguiente();
        }
        return datos;
    }

    public double getCantidadNodos(){
        return cabeza.getDato();
    }

    Nodo getNodo(int i) {
        if(cabeza.getDato()==0)
            return null;
        if(i == 0)
            return primero;
        else{
            Nodo p;
            p = primero.getSiguiente();
            int j = 1;
            while(p != null){
                if (i == j) {
                    return p;
                } else {
                    p = p.getSiguiente();
                    j++;
                }
            }
        }
        return null;
    }
    
    public static ListaLigada dividirValores(ListaLigada x, ListaLigada y) {
        if(x != null && y != null && x.getCantidadNodos() == y.getCantidadNodos()){
            ListaLigada resultado = new ListaLigada();
            for(int i = 0; i<x.getCantidadNodos(); i++){
                Nodo nodo = new Nodo();
                double dato =x.getNodo(i).getDato()/y.getNodo(i).getDato();
                dato = Calculos.roundDouble(dato, 4);
                nodo.setDato(dato);
                resultado.addNodo(nodo);
            }
            return resultado;
        }
        return null;
    }
}

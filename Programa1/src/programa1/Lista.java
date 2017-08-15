/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa1;

/**
 *
 * @author mario.garciat
 */
class Lista {
    private NodoCabeza cabeza;
    
    public Lista () {
        cabeza = new NodoCabeza ();
    }
    
    public Nodo getPrimero () {
        return cabeza.getLigaInicio();
    }
    
    public Nodo getUltimo () {
        return cabeza.getLigaFinal();
    }

    public NodoCabeza getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoCabeza cabeza) {
        this.cabeza = cabeza;
    }
    
    public boolean estaVacia () {
        return cabeza.getLigaInicio() == null && null == cabeza.getLigaFinal();
    }
    
    public boolean insertarNodo (Nodo nodo) {
       if (nodo.getColumna1() < 0 || nodo.getColumna2() < 0) {
           System.out.println("Dato negativo, no puede agregarse");
           return false;
       }
       if ( cabeza.getLigaFinal() != null ) 
           cabeza.getLigaFinal().setLiga(nodo);
       else 
           cabeza.setLigaInicio(nodo);
       cabeza.setLigaFinal(nodo);
       cabeza.setnFilas(cabeza.getnFilas()+1);
       return true;
    }
}

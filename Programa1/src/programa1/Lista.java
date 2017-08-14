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
    
    public void insertarDato (float columna1, float columna2) {
       Nodo nodo = new Nodo (columna1, columna2);
       If ( cabeza.getLigaFinal() != null ) cabeza.getLigaFinal().setLiga(nodo);
       else cabeza.setLigaInicio(nodo);
       cabeza.setLigaFinal(nodo);
       cabeza.setnFilas(cabeza.getnFilas()+1);
    }

    public NodoCabeza getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoCabeza cabeza) {
        this.cabeza = cabeza;
    }
    
    
}

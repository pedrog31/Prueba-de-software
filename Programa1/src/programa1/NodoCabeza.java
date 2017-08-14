/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa1;

/**
 *
 * @author pedrog31
 */
public class NodoCabeza {
    
    private int nFilas;
    private Nodo ligaInicio;
    private Nodo ligaFinal;
    
    public NodoCabeza () {
        nFilas = 0;
    }

    public int getnFilas() {
        return nFilas;
    }

    public void setnFilas(int nFilas) {
        this.nFilas = nFilas;
    }

    public Nodo getLigaInicio() {
        return ligaInicio;
    }

    public void setLigaInicio(Nodo ligaInicio) {
        this.ligaInicio = ligaInicio;
    }

    public Nodo getLigaFinal() {
        return ligaFinal;
    }

    public void setLigaFinal(Nodo ligaFinal) {
        this.ligaFinal = ligaFinal;
    }
    
    
    
    
    
}

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
class Nodo {
    private float columna1,columna2;
    private Nodo liga;

    public Nodo(float columna1, float columna2) {
        this.columna1 = columna1;
        this.columna2 = columna2;
        liga = null;
    }

    public Nodo() {
    }

    public float getColumna1() {
        return columna1;
    }

    public void setColumna1(float columna1) {
        this.columna1 = columna1;
    }

    public float getColumna2() {
        return columna2;
    }

    public void setColumna2(float columna2) {
        this.columna2 = columna2;
    }

    public Nodo getLiga() {
        return liga;
    }

    public void setLiga(Nodo liga) {
        this.liga = liga;
    }
    
    
    
}

package programa1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pedrog31
 */
public class PruebaCalculo{
    
    private Lista lista, listaVacía;
    private Nodo nodo, nodoMedia, media, desvEst, nodoDesv, nodoVacio;
    private Calculo c;
    private Lector l;
    
    
    public PruebaCalculo() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        lista = new Lista();
        listaVacía = new Lista();
        c = new Calculo();
        
        nodo = new Nodo(160f,15.0f);
        lista.insertarNodo(nodo);
        nodo = new Nodo(591f,69.9f);
        lista.insertarNodo(nodo);
        nodo = new Nodo(114f,6.5f);
        lista.insertarNodo(nodo);
        nodo = new Nodo(229f,22.4f);
        lista.insertarNodo(nodo);
        nodo = new Nodo(230f,28.4f);
        lista.insertarNodo(nodo);
        nodo = new Nodo(270f,65.9f);
        lista.insertarNodo(nodo);
        nodo = new Nodo(128f,19.4f);
        lista.insertarNodo(nodo);
        nodo = new Nodo(1657f,198.7f);
        lista.insertarNodo(nodo);
        nodo = new Nodo(624f,38.8f);
        lista.insertarNodo(nodo);
        nodo = new Nodo(1503f,138.2f);
        lista.insertarNodo(nodo);
           
        nodoVacio = new Nodo();
        nodoMedia = new Nodo (550.6f,60.32f);
        nodoDesv = new Nodo (572.03f,62.26f);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testCalcularMediaListaVacia () {
        media = c.calcularMedia(listaVacía);
        assertFalse(!(media.getColumna1()==(float)0 && (media.getColumna2()==(float)0)));
    }
    
    @Test
    public void testCalcularMediaNull () {
        media = c.calcularMedia(null);
        assertNull(media);
    }
    
    @Test
    public void testCalcularMedia () {
        media = c.calcularMedia(lista);
        assertFalse(!(media.getColumna1()==550.6f && (media.getColumna2()==60.32f)));
    }
//    
    @Test
    public void testCalcularDesvEstListaVacia () {
        desvEst = c.calcularDesvEst(listaVacía);
        assertFalse(!(desvEst.getColumna1()==(float)0 && desvEst.getColumna2()==(float)0));
    }
    
    @Test
    public void testCalcularDesvEstNull () {
        desvEst = c.calcularDesvEst(null);
        assertNull(desvEst);
    }
    
    @Test
    public void testCalcularDesvEst () {
        desvEst = c.calcularDesvEst(lista);
        assertFalse(!(desvEst.getColumna1()==572.03f && (desvEst.getColumna2()==62.26f)));
    }
    
}

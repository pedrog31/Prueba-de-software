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
public class PruebaListaLigada {
    
    private Lista listaDatos, listaVacía;
    private Nodo nodo, nodoMedia, media, desvEst, nodoDesv;
    
    
    public PruebaListaLigada() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        listaDatos = new Lista();
        listaVacía = new Lista();
        nodo = new Nodo (160,15.0);
        nodoMedia = new Nodo (550.6,60.32);
        nodoDesv = new Nodo (572.03,62.26);
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testInsertarDato () {
        listaDatos.insertarDato(160,15.0);
        assertEquals (nodo, listaDatos.getUltimo());
    }
    
    @Test
    public void testCalcularMedia () {
        media = calcularMedia(listaDatos);
        assertEquals (nodoMedia, media);
    }
    
    @Test
    public void testCalcularDesvEst () {
        desvEst = calcularDesvEst(listaDatos);
        assertEquals (nodoDesv, desvEst);
    }
    
}

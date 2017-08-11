package pruebasPrograma1;

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
    
    private Lista listaDatos;
    private Nodo nodo;
    
    public PruebaListaLigada() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        listaDatos = new Lista();
        nodo = new Nodo (160,15.0);
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
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa1;

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
public class PruebaLista {
    
    private Lista lista;
    
    public PruebaLista() {
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
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testDatoAgregado () {
        Nodo nodo = new Nodo (160, (float) 15.0);
        lista.insertarNodo(nodo);
        assertEquals ("La prueba fue exitosa",nodo, lista.getPrimero());
    }
    
    @Test
    public void testDatoNegativoAgregado () {
        Nodo nodo = new Nodo (-1657, (float) 198.7);
        lista.insertarNodo(nodo);
        assertNotSame(nodo, lista.getUltimo());
    }
}

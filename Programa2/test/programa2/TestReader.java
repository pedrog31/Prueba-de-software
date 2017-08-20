/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa2;

import java.io.FileNotFoundException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel
 */
public class TestReader {
    
    private Reader l;
    
    public TestReader() {
    }
    
    @BeforeClass
    public static void setUpClass() {
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

    
    @Test(expected = java.io.FileNotFoundException.class)
    public void testLeerDatosArchivoInexistente() throws FileNotFoundException{
        l = new Reader("./archivos de prueba/archivo que no existe.txt");
    }
    
    @Test
    public void testLeerDatosArchivoVacio() throws FileNotFoundException{
        l = new Reader("./archivos de prueba/archivo vacio.txt");
    }
}

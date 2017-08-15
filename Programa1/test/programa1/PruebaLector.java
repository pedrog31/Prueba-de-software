/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa1;

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
public class PruebaLector {
    
    private Lista lista, listaVacia;
    private Lector l;
    
    public PruebaLector() {
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
        listaVacia = new Lista();
        
    }
    
    @After
    public void tearDown() {
    }
    
    @Test(expected = java.io.FileNotFoundException.class)
    public void testLeerDatosArchivoInexistente() throws FileNotFoundException{
        l = new Lector("./archivos de prueba/archivo que no existe.txt");
        lista = l.leerDatos();
        assertEquals(lista.getCabeza().getnFilas(), listaVacia.getCabeza().getnFilas());
    }
    
    @Test
    public void testLeerDatosArchivoVacio() throws FileNotFoundException{
        l = new Lector("./archivos de prueba/archivo vacio.txt");
        lista = l.leerDatos();
        assertNull(lista);
    }
    
    /*@Test
    public void testLeerDatosArchivoVacio() throws FileNotFoundException{
        l = new Lector("./archivos de prueba/archivo vacio.txt");
        lista = l.leerDatos();
        assertEquals(lista.getCabeza().getnFilas(), listaVacia.getCabeza().getnFilas());
    }*/
    
    @Test
    public void testLeerDatosArchivoCaracteresInvalidos() throws FileNotFoundException{
        l = new Lector("./archivos de prueba/archivo caracteres invalidos.txt");
        lista = l.leerDatos();
        assertEquals(lista.getCabeza().getnFilas(), listaVacia.getCabeza().getnFilas());
    }
    
    @Test
    public void testLeerDatosArchivoUnaColumna() throws FileNotFoundException{
        l = new Lector("./archivos de prueba/archivo una columna.txt");
        lista = l.leerDatos();
        assertEquals(lista.getCabeza().getnFilas(), listaVacia.getCabeza().getnFilas());
    }
    @Test
    public void testLeerDatosArchivoTresColumnas() throws FileNotFoundException{
        l = new Lector("./archivos de prueba/archivo tres columnas.txt");
        lista = l.leerDatos();
        assertEquals(lista.getCabeza().getnFilas(), listaVacia.getCabeza().getnFilas());
    }
    
    @Test
    public void testLeerDatosCorrectos() throws FileNotFoundException{
        l = new Lector("./archivos de prueba/datos.txt");
        lista = l.leerDatos();
        assertEquals(lista.getCabeza().getnFilas(), 10);
    }
    
    
}

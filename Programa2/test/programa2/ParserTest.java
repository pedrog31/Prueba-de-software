/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa2;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pedrog31
 */
public class ParserTest {

    public ParserTest() {
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

    /**
     * Test of getParts method, of class Parser.
     */
    @Test
    public void testGetParts() {
        System.out.println("getParts");
        Parser instance = new Parser();
        List<PartCounter> expResult = null;
        List<PartCounter> result = instance.getParts();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setParts method, of class Parser.
     */
    @Test
    public void testSetParts() {
        System.out.println("setParts");
        List<PartCounter> parts = null;
        Parser instance = new Parser();
        instance.setParts(parts);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isIsInComment method, of class Parser.
     */
    @Test
    public void testIsIsInComment() {
        System.out.println("isIsInComment");
        Parser instance = new Parser();
        boolean expResult = false;
        boolean result = instance.isIsInComment();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsInComment method, of class Parser.
     */
    @Test
    public void testSetIsInComment() {
        System.out.println("setIsInComment");
        boolean isInComment = false;
        Parser instance = new Parser();
        instance.setIsInComment(isInComment);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    //*****Start of tests of isMethod*****
    
    /**
     * Test of isMethod method, of class Parser.
     * Line with white spaces and access modifier.
     */
    @Test
    public void testIsMethod_LineWithWhiteSpaces() {
        String line = "        public void method() {";
        Parser parser = new Parser();
        boolean expResult = true;
        boolean result = parser.isMethod(line);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isMethod method, of class Parser.
     * Line with tabs and access modifier.
     */
    @Test
    public void testIsMethod_LineWithTabs() {
        String line = "\t\tpublic void method() {";
        Parser parser = new Parser();
        boolean expResult = true;
        boolean result = parser.isMethod(line);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isMethod method, of class Parser.
     * Line with method and access modifier.
     */
    @Test
    public void testIsMethod_LineWithMethodAndModifier() {
        String line = "public void method() {";
        Parser parser = new Parser();
        boolean expResult = true;
        boolean result = parser.isMethod(line);
        assertEquals(expResult, result);
    }

    /**
     * Test of isMethod method, of class Parser.
     * Line with method and without access modifier.
     */
    @Test
    public void testIsMethod_LineWithMethodAndWithoutModifier() {
        String line = "void method() {";
        Parser parser = new Parser();
        boolean expResult = true;
        boolean result = parser.isMethod(line);
        assertEquals(expResult, result);
    }

    /**
     * Test of isMethod method, of class Parser.
     * Line with white spaces and without access modifier.
     */
    @Test
    public void testIsMethod_LineWithWhiteSpacesWithoutModifier() {
        String line = "        void method() {";
        Parser parser = new Parser();
        boolean expResult = true;
        boolean result = parser.isMethod(line);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isMethod method, of class Parser.
     * Line with tabs, params and without access modifier.
     */
    @Test
    public void testIsMethod_LineWithTabsParamsWithoutModifier() {
        String line = "\t\tvoid method(int x, String message) {";
        Parser parser = new Parser();
        boolean expResult = true;
        boolean result = parser.isMethod(line);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isMethod method, of class Parser.
     * Line with tabs and access modifier.
     */
    @Test
    public void testIsMethod_LineWithTabsWithoutModifier() {
        String line = "\t\tvoid method() {";
        Parser parser = new Parser();
        boolean expResult = true;
        boolean result = parser.isMethod(line);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isMethod method, of class Parser.
     * Line that isn't a method.
     */
    @Test
    public void testIsMethod_WrongLine() {
        String line = "int x = 3;";
        Parser parser = new Parser();
        boolean expResult = false;
        boolean result = parser.isMethod(line);
        assertEquals(expResult, result);
    }
    
    //End of test of isMethod
    
    /**
     * Test of countLines method, of class Parser.
     */
    @Test
    public void testCountLines() {
        System.out.println("CountLines");
        String[] lines = {"x = 10;",
            "       public class estoEsUnaClase {",
            "while (x != true) {",
            "   for (x = 0; x <= 10; x++) {",
            "if (x<2 && y == 2) {",
            "while (x >=10) {",
            "if (x == 10  || y.equals(result)) {",
            "do {",
            "       if (! (x<2 && y == 10  || y.equals(result))) {",
            "if (! (x<2 || y == 10  || y.equals(result) && x<2 || y == 10) {",
            "switch (y) {"};
        Parser instance = new Parser();
        int[] expResult = {1,0,1,3,2,1,2,0,3,5,1};
        int [] result = new int[expResult.length];
        for (int i=0; i < expResult.length; i++)
            result[i] = instance.countLines(lines[i]);
        Assert.assertArrayEquals(expResult, result);
    }

    /**
     * Test of countConditional method, of class Parser.
     */
    @Test
    public void testCountConditional() {
        System.out.println("countConditional");
        String[] lines = {"x = 10;",
            "public class estoEsUnaClase {",
            "while (x != true) {",
            "for (x = 0; x <= 10; x++) {",
            "if (x<2 && y == 2) {",
            "while (x >=10) {",
            "if (x == 10  || y.equals(result)) {",
            "do {",
            "       if (! (x<2 && y == 10  || y.equals(result))) {",
            "       if (! (x<2 || y == 10  || y.equals(result) && x<2 || y == 10) {"};
        Parser instance = new Parser();
        int[] expResult = {0,0,0,0,1,0,1,0,2,4};
        int [] result = new int[expResult.length];
        for (int i=0; i < expResult.length; i++)
            result[i] = instance.countConditional(lines[i]);
        Assert.assertArrayEquals(expResult, result);
    }

    /**
     * Test of countBySemiColon method, of class Parser.
     */
    @Test
    public void testCountBySemiColon() {
        System.out.println("countBySemiColon");
        String[] lines = {"x = 10;",
            "       public class estoEsUnaClase {",
            "while (x != true) {",
            "for (x = 0; x <= 10; x++) {"};
        Parser instance = new Parser();
        int[] expResult = {1,0,0,2};
        int [] result = new int[expResult.length];
        for (int i=0; i<expResult.length; i++)
            result[i] = instance.countBySemiColon(lines[i]);
        Assert.assertArrayEquals(expResult, result);
    }

    /**
     * Test of detectString method, of class Parser.
     */
    @Test
    public void testDetectString() {
        System.out.println("detectString");
        String line = "";
        Parser instance = new Parser();
        String expResult = "";
        String result = instance.detectString(line);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of detectComment method, of class Parser.
     */
    @Test
    public void testDetectComment() {
        
        System.out.println("detectComment");
        String[] lines = {"x = 10;",
            "x = 10; //variable x = 10",
            "if (x<2 /*&& y == 2*/) {",
            "while (x != true) {/*ciclo que repite mientras \n" +
"                            la variable sea verdadera*/"};
        Parser instance = new Parser();
        String[] expResult = {"x = 10;","x = 10; ","if (x<2 ) {","while (x != true) {"};
        String [] result = new String[expResult.length];
        for (int i=0; i<expResult.length; i++)
            result[i] = instance.detectComment(lines[i]);
        Assert.assertArrayEquals(expResult, result);
        
        
        
       
        
        
        String line = "";
      
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of countReservedWords method, of class Parser.
     */
    @Test
    public void testCountReservedWords() {
        System.out.println("countReservedWords");
        String[] lines = {"x = 10;",
            "public class estoEsUnaClase {",
            "while (x != true) {",
            "for (x = 0; x <= 10; x++) {",
            "if (x<2 && y == 2) {",
            "while (x >=10) {",
            "       if (x == 10  || y.equals(result)) {",
            "do {",
            "if (! (x<2 && y == 10  || y.equals(result))) {",
            "if (! (x<2 || y == 10  || y.equals(result) && x<2 || y == 10) {",
            "switch (y) {"};
        Parser instance = new Parser();
        int[] expResult = {0,0,1,1,1,1,1,0,1,1,1};
        int [] result = new int[expResult.length];
        for (int i=0; i < expResult.length; i++)
            result[i] = instance.countReservedWords(lines[i]);
        assertArrayEquals(expResult, result);
    }
    /**
     * Test of getClass method, of class Parser.
     */
    @Test
    public void testGetClass() {
        System.out.println("getClass");
        String[] lines = {"x = 10;",
            "public class estoEsUnaClasePublica {",
            "while (x != true) {",
            "for (x = 0; x <= 10; x++) {",
            "if (x<2 && y == 2) {",
            "while (x >=10) {",
            "       if (x == 10  || y.equals(result)) {",
            "do {",
            "if (! (x<2 && y == 10  || y.equals(result))) {",
            "if (! (x<2 || y == 10  || y.equals(result) && x<2 || y == 10) {",
            "switch (y) {",
            "class EstoEsUnaClaseProtegida {",
            "private class EstoEsUnaClasePrivada {"};
        Parser instance = new Parser();
        String [] expResult = {"x = 10;",
            "estoEsUnaClasePublica",
            "while (x != true) {",
            "for (x = 0; x <= 10; x++) {",
            "if (x<2 && y == 2) {",
            "while (x >=10) {",
            "       if (x == 10  || y.equals(result)) {",
            "do {",
            "if (! (x<2 && y == 10  || y.equals(result))) {",
            "if (! (x<2 || y == 10  || y.equals(result) && x<2 || y == 10) {",
            "switch (y) {",
            "EstoEsUnaClaseProtegida",
            "EstoEsUnaClasePrivada"};
        String [] result = new String[expResult.length];
        for (int i=0; i < expResult.length; i++)
            result[i] = instance.getClass(lines[i]);
        assertArrayEquals(expResult, result);
    }
}

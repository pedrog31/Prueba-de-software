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

    /**
     * Test of identify method, of class Parser.
     */
    @Test
    public void testIdentify() {
        System.out.println("identify");
        String line = "";
        Parser instance = new Parser();
        instance.identify(line);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isClass method, of class Parser.
     */
    @Test
    public void testIsClass() {
        System.out.println("isClass");
        String line1 = "public class estoEsUnaClase {";
        String line2 = "while (x != true) {";
        Parser instance = new Parser();
        boolean expResult = false;
        boolean result = instance.isClass(line2);
        assertEquals(expResult, result);
    }

    /**
     * Test of isMethod method, of class Parser.
     */
    @Test
    public void testIsMethod() {
        System.out.println("isMethod");
        String line = "";
        Parser instance = new Parser();
        boolean expResult = false;
        boolean result = instance.isMethod(line);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of countLines method, of class Parser.
     */
    @Test
    public void testCountLines() {
        System.out.println("countLines");
        String line = "";
        Parser instance = new Parser();
        int expResult = 0;
        int result = instance.countLines(line);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of countConditional method, of class Parser.
     */
    @Test
    public void testCountConditional() {
        System.out.println("countConditional");
        String line = "";
        Parser instance = new Parser();
        int expResult = 0;
        int result = instance.countConditional(line);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of countBySemiColon method, of class Parser.
     */
    @Test
    public void testCountBySemiColon() {
        System.out.println("countBySemiColon");
        String[] line = {"x = 10;","public class estoEsUnaClase {","while (x != true) {", "for (x = 0; x <= 10; x++) {"};
        Parser instance = new Parser();
        int[] expResult = {1,0,0,2};
        int [] result = new int[4];
        for (int i=0; i<4; i++)
            result[i] = instance.countBySemiColon(line[i]);
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
        String line = "";
        Parser instance = new Parser();
        String expResult = "";
        String result = instance.detectComment(line);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}

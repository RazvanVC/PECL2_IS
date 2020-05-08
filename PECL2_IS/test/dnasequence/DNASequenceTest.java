/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnasequence;

import Ejercicio_1_dnasequence.DNASequence;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author azaha
 */
public class DNASequenceTest {

    private static DNASequence seq;
    private static DNASequence seq2;
    private static char nuc1;
    private static char nuc2;
    private static char nuc3;
    private static char nuc4;

    public DNASequenceTest() {
    }

    @Before
    public void setUpClass() {
        seq = new DNASequence("CGAT");
        seq2 = new DNASequence("CGTZ");
        nuc1 = 'A';
        nuc2 = 'C';
        nuc3 = 'G';
        nuc4 = 'T';
    }

    @After
    public void tearDownClass() {
        seq = null;
        seq2 = null;
    }

    /**
     * Test of isValid method, of class DNASequence.
     */
    @Test
    public void testIsValid01() {
        System.out.println("Test: isValid 1");
        DNASequence instance = seq;
        boolean expResult = true;
        boolean result = instance.isValid();
        System.out.println("Resultado esperado: " + expResult + " -- Resultado Obtenido: " + result);
        assertEquals(expResult, result);
    }

    /**
     * Test of isValid method, of class DNASequence.
     */
    @Test
    public void testIsValid02() {
        System.out.println("Test: isValid 2");
        DNASequence instance2 = seq2;
        boolean expResult = false;
        boolean result = instance2.isValid();
        System.out.println("Resultado esperado: " + expResult + " -- Resultado Obtenido: " + result + "\n");
        assertEquals(expResult, result);
    }

    /**
     * Test of count method, of class DNASequence.
     */
    @Test
    public void testCount01() {
        System.out.println("Test: count 1 (ADENINE)");
        char ADENINE = nuc1;       
        DNASequence instance = seq2;
        int expResult1 = 0;
        int result1 = instance.count(ADENINE);
        System.out.println("Resultado esperado: " + expResult1 + " -- Resultado Obtenido: " + result1);
        assertEquals(expResult1, result1);

    }
    
    @Test
    public void testCount02() {
        System.out.println("Test: count 2 (CYTOSINE)");
        char CYTOSINE = nuc2;
        DNASequence instance = seq2;
        int expResult2 = 1;
        int result2 = instance.count(CYTOSINE);
        System.out.println("Resultado esperado: " + expResult2 + " -- Resultado Obtenido: " + result2);
        assertEquals(expResult2, result2);
    }
    
    @Test
    public void testCount03() {
        System.out.println("Test: count 3 (THYMINE)");
        char THYMINE = nuc3;
        DNASequence instance = seq2;
        int expResult3 = 1;
        int result3 = instance.count(THYMINE);
        System.out.println("Resultado esperado: " + expResult3 + " -- Resultado Obtenido: " + result3);
        assertEquals(expResult3, result3);
    }
    
    @Test
    public void testCount04() {
        System.out.println("Test: count 4 (GUANINE)");
        char GUANINE = nuc4;
        DNASequence instance = seq2;
        int expResult4 = 1;
        int result4 = instance.count(GUANINE);
        System.out.println("Resultado esperado: " + expResult4 + " -- Resultado Obtenido: " + result4);
        assertEquals(expResult4, result4);
    }
}

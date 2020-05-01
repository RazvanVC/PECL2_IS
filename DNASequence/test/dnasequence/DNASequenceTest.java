/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnasequence;


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
    seq = new DNASequence ("CGAT");
    seq2 = new DNASequence ("CGTZ");
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
    public void testIsValid() {
        System.out.println("Test: isValid");
        DNASequence instance = seq;
        DNASequence instance2 = seq2;
        boolean expResult = true;
        boolean expResult2 = false;
        boolean result = instance.isValid();
        boolean result2 = instance2.isValid();
        System.out.println("Test1:\n    Resultado esperado: "+expResult+" -- Resultado Obtenido: "+result);
        System.out.println("Test2:\n    Resultado esperado: "+expResult2+" -- Resultado Obtenido: "+result2);
        assertEquals(expResult, result);
        assertEquals(expResult2, result2);
    }

    /**
     * Test of count method, of class DNASequence.
     */
    @Test
    public void testCount() {
        System.out.println("Test: count");
        char ADENINE = nuc1;
        char CYTOSINE = nuc2;
        char THYMINE = nuc3;
        char GUANINE = nuc4;
        DNASequence instance = seq;
        int expResult = 1;
        int result1 = instance.count(ADENINE);
        int result2 = instance.count(CYTOSINE);
        int result3 = instance.count(THYMINE);
        int result4 = instance.count(GUANINE);
        System.out.println("Test1:\n    Resultado esperado: "+expResult+" -- Resultado Obtenido: "+result1);
        System.out.println("Test2:\n    Resultado esperado: "+expResult+" -- Resultado Obtenido: "+result2);
        System.out.println("Test3:\n    Resultado esperado: "+expResult+" -- Resultado Obtenido: "+result3);
        System.out.println("Test4:\n    Resultado esperado: "+expResult+" -- Resultado Obtenido: "+result4+"\n");
        assertEquals(expResult, result1);
        assertEquals(expResult, result2);
        assertEquals(expResult, result3);
        assertEquals(expResult, result4);
    }
    
}

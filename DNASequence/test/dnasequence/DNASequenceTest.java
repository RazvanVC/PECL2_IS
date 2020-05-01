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
private static char nuc;

    public DNASequenceTest() {
    }
    
    @Before
    public void setUpClass() {
    seq = new DNASequence ("CGAT");
    seq2 = new DNASequence ("CGTZ");
    nuc = 'A';
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
        System.out.println("isValid");
        DNASequence instance = seq;
        DNASequence instance2 = seq2;
        boolean expResult = true;
        boolean expResult2 = false;
        boolean result = instance.isValid();
        boolean result2 = instance2.isValid();
        assertEquals(expResult, result);
        assertEquals(expResult2, result2);
    }

    /**
     * Test of count method, of class DNASequence.
     */
    @Test
    public void testCount() {
        System.out.println("count");
        char nucleotide = nuc;
        DNASequence instance = seq;
        int expResult = 1;
        int result = instance.count(nucleotide);
        assertEquals(expResult, result);
    }
    
}

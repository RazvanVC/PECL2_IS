/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnasequence;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author azaha
 */
public class DNASequenceTest {
    
    public DNASequenceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of isValid method, of class DNASequence.
     */
    @Test
    public void testIsValid() {
        System.out.println("isValid");
        DNASequence instance = null;
        boolean expResult = false;
        boolean result = instance.isValid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of count method, of class DNASequence.
     */
    @Test
    public void testCount() {
        System.out.println("count");
        char nucleotide = ' ';
        DNASequence instance = null;
        int expResult = 0;
        int result = instance.count(nucleotide);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

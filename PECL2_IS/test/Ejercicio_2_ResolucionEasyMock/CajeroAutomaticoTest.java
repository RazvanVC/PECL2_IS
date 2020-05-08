/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_2_ResolucionEasyMock;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author razvanvc
 */
public class CajeroAutomaticoTest {
    
    public CajeroAutomaticoTest() {
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
     * Test of iniciarSesion method, of class CajeroAutomatico.
     */
    @Test
    public void testIniciarSesion() {
        System.out.println("iniciarSesion");
        String ccc = "";
        CajeroAutomatico instance = null;
        instance.iniciarSesion(ccc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cerrarSesion method, of class CajeroAutomatico.
     */
    @Test
    public void testCerrarSesion() {
        System.out.println("cerrarSesion");
        CajeroAutomatico instance = null;
        instance.cerrarSesion();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of realizarRetirada method, of class CajeroAutomatico.
     */
    @Test
    public void testRealizarRetirada() {
        System.out.println("realizarRetirada");
        double cantidad = 0.0;
        PasarelaPago p = null;
        CajeroAutomatico instance = null;
        boolean expResult = false;
        boolean result = instance.realizarRetirada(cantidad, p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

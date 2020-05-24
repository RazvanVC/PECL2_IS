/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_2_ResolucionEasyMock;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.easymock.EasyMock.*;

/**
 *
 * @author razvanvc
 */
public class CajeroAutomaticoNGTest {

    private CajeroAutomatico classUnderTest;
    private GestorPrestamosPersonales mock;

    public CajeroAutomaticoNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        classUnderTest = new CajeroAutomatico("1111111111");
        classUnderTest.iniciarSesion("1234");
        /* (1) Crea un mock para la clase colaboradora*/
        mock = createMock(GestorPrestamosPersonales.class);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        classUnderTest.cerrarSesion();
        reset(mock);
    }

    /**
     * Test of realizarPrestamoPersonal method, of class CajeroAutomatico.
     */
    @Test
    public void testRealizarPrestamoPersonal() {
        System.out.println("realizarPrestamoPersonal");
        
        expect(mock.CantidadValida(1200)).andReturn(true);
        expect(mock.TiempoValido(7)).andReturn(true);
        expect(mock.PrestamosRecientes()).andReturn(false);
        
        mock.RealizarPrestamo(1200, 7);
        
        replay(mock);
        
        boolean result = classUnderTest.realizarPrestamoPersonal(mock, 1200, 7);
        assertTrue(result);
        
        verify(mock);
    }

}

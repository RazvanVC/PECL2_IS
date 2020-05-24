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
public class CajeroAutomaticoTest {

    private CajeroAutomatico classUnderTest;
    private GestorPrestamosPersonales mock;

    public CajeroAutomaticoTest() {
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
    
    //4 MESES
    @Test
    public void testRealizarPrestamoPersonal() {
        int Cantidad = 700;
        int Meses = 4;
        boolean Prestamo = true;
        System.out.println("Realizar Prestamo Personal: \n Variables: \n Cantidad = "
                + Cantidad + "\nMeses = " + Meses + "\nPrestamo en ultimo año = " + Prestamo);

        expect(mock.CantidadValida(Cantidad)).andReturn(false);
        expect(mock.TiempoValido(Meses)).andReturn(false);
        expect(mock.PrestamosRecientes()).andReturn(Prestamo);

        mock.RealizarPrestamo(Cantidad, Meses);

        replay(mock);

        boolean result = classUnderTest.realizarPrestamoPersonal(mock, Cantidad, Meses);
        assertFalse(result);
    }
    
    @Test
    public void testRealizarPrestamoPersonal2() {
        int Cantidad = 700;
        int Meses = 4;
        boolean Prestamo = false;
        System.out.println("Realizar Prestamo Personal: \n Variables: \n Cantidad = "
                + Cantidad + "\nMeses = " + Meses + "\nPrestamo en ultimo año = " + Prestamo);

        expect(mock.CantidadValida(Cantidad)).andReturn(false);
        expect(mock.TiempoValido(Meses)).andReturn(false);
        expect(mock.PrestamosRecientes()).andReturn(Prestamo);

        mock.RealizarPrestamo(Cantidad, Meses);

        replay(mock);

        boolean result = classUnderTest.realizarPrestamoPersonal(mock, Cantidad, Meses);
        assertFalse(result);
    }
    
    @Test
    public void testRealizarPrestamoPersonal3() {
        int Cantidad = 1200;
        int Meses = 4;
        boolean Prestamo = true;
        System.out.println("Realizar Prestamo Personal: \n Variables: \n Cantidad = "
                + Cantidad + "\nMeses = " + Meses + "\nPrestamo en ultimo año = " + Prestamo);

        expect(mock.CantidadValida(Cantidad)).andReturn(true);
        expect(mock.TiempoValido(Meses)).andReturn(false);
        expect(mock.PrestamosRecientes()).andReturn(Prestamo);

        mock.RealizarPrestamo(Cantidad, Meses);

        replay(mock);

        boolean result = classUnderTest.realizarPrestamoPersonal(mock, Cantidad, Meses);
        assertFalse(result);
    }
    
    @Test
    public void testRealizarPrestamoPersonal4() {
        int Cantidad = 1200;
        int Meses = 4;
        boolean Prestamo = false;
        System.out.println("Realizar Prestamo Personal: \n Variables: \n Cantidad = "
                + Cantidad + "\nMeses = " + Meses + "\nPrestamo en ultimo año = " + Prestamo);

        expect(mock.CantidadValida(Cantidad)).andReturn(true);
        expect(mock.TiempoValido(Meses)).andReturn(false);
        expect(mock.PrestamosRecientes()).andReturn(Prestamo);

        mock.RealizarPrestamo(Cantidad, Meses);

        replay(mock);

        boolean result = classUnderTest.realizarPrestamoPersonal(mock, Cantidad, Meses);
        assertFalse(result);
    }
    
    @Test
    public void testRealizarPrestamoPersonal5() {
        int Cantidad = 3200;
        int Meses = 4;
        boolean Prestamo = true;
        System.out.println("Realizar Prestamo Personal: \n Variables: \n Cantidad = "
                + Cantidad + "\nMeses = " + Meses + "\nPrestamo en ultimo año = " + Prestamo);

        expect(mock.CantidadValida(Cantidad)).andReturn(false);
        expect(mock.TiempoValido(Meses)).andReturn(false);
        expect(mock.PrestamosRecientes()).andReturn(Prestamo);

        mock.RealizarPrestamo(Cantidad, Meses);

        replay(mock);

        boolean result = classUnderTest.realizarPrestamoPersonal(mock, Cantidad, Meses);
        assertFalse(result);
    }
    
    @Test
    public void testRealizarPrestamoPersonal6() {
        int Cantidad = 3200;
        int Meses = 4;
        boolean Prestamo = false;
        System.out.println("Realizar Prestamo Personal: \n Variables: \n Cantidad = "
                + Cantidad + "\nMeses = " + Meses + "\nPrestamo en ultimo año = " + Prestamo);

        expect(mock.CantidadValida(Cantidad)).andReturn(false);
        expect(mock.TiempoValido(Meses)).andReturn(false);
        expect(mock.PrestamosRecientes()).andReturn(Prestamo);

        mock.RealizarPrestamo(Cantidad, Meses);

        replay(mock);

        boolean result = classUnderTest.realizarPrestamoPersonal(mock, Cantidad, Meses);
        assertFalse(result);
    }
    
    //7 MESES
    @Test
    public void testRealizarPrestamoPersonal7() {
        int Cantidad = 700;
        int Meses = 7;
        boolean Prestamo = true;
        System.out.println("Realizar Prestamo Personal: \n Variables: \n Cantidad = "
                + Cantidad + "\nMeses = " + Meses + "\nPrestamo en ultimo año = " + Prestamo);

        expect(mock.CantidadValida(Cantidad)).andReturn(false);
        expect(mock.TiempoValido(Meses)).andReturn(true);
        expect(mock.PrestamosRecientes()).andReturn(Prestamo);

        mock.RealizarPrestamo(Cantidad, Meses);

        replay(mock);

        boolean result = classUnderTest.realizarPrestamoPersonal(mock, Cantidad, Meses);
        assertFalse(result);
    }
    
    @Test
    public void testRealizarPrestamoPersonal8() {
        int Cantidad = 700;
        int Meses = 7;
        boolean Prestamo = false;
        System.out.println("Realizar Prestamo Personal: \n Variables: \n Cantidad = "
                + Cantidad + "\nMeses = " + Meses + "\nPrestamo en ultimo año = " + Prestamo);

        expect(mock.CantidadValida(Cantidad)).andReturn(false);
        expect(mock.TiempoValido(Meses)).andReturn(true);
        expect(mock.PrestamosRecientes()).andReturn(Prestamo);

        mock.RealizarPrestamo(Cantidad, Meses);

        replay(mock);

        boolean result = classUnderTest.realizarPrestamoPersonal(mock, Cantidad, Meses);
        assertFalse(result);
    }
    
    @Test
    public void testRealizarPrestamoPersonal9() {
        int Cantidad = 1200;
        int Meses = 7;
        boolean Prestamo = true;
        System.out.println("Realizar Prestamo Personal: \n Variables: \n Cantidad = "
                + Cantidad + "\nMeses = " + Meses + "\nPrestamo en ultimo año = " + Prestamo);

        expect(mock.CantidadValida(Cantidad)).andReturn(true);
        expect(mock.TiempoValido(Meses)).andReturn(true);
        expect(mock.PrestamosRecientes()).andReturn(Prestamo);

        mock.RealizarPrestamo(Cantidad, Meses);

        replay(mock);

        boolean result = classUnderTest.realizarPrestamoPersonal(mock, Cantidad, Meses);
        assertFalse(result);
    }
    
    @Test
    public void testRealizarPrestamoPersonal10() {
        int Cantidad = 1200;
        int Meses = 7;
        boolean Prestamo = false;
        System.out.println("Realizar Prestamo Personal: \n Variables: \n Cantidad = "
                + Cantidad + "\nMeses = " + Meses + "\nPrestamo en ultimo año = " + Prestamo);

        expect(mock.CantidadValida(Cantidad)).andReturn(true);
        expect(mock.TiempoValido(Meses)).andReturn(true);
        expect(mock.PrestamosRecientes()).andReturn(Prestamo);

        mock.RealizarPrestamo(Cantidad, Meses);

        replay(mock);

        boolean result = classUnderTest.realizarPrestamoPersonal(mock, Cantidad, Meses);
        assertTrue(result);
    }
    
    @Test
    public void testRealizarPrestamoPersonal11() {
        int Cantidad = 3200;
        int Meses = 7;
        boolean Prestamo = true;
        System.out.println("Realizar Prestamo Personal: \n Variables: \n Cantidad = "
                + Cantidad + "\nMeses = " + Meses + "\nPrestamo en ultimo año = " + Prestamo);

        expect(mock.CantidadValida(Cantidad)).andReturn(false);
        expect(mock.TiempoValido(Meses)).andReturn(true);
        expect(mock.PrestamosRecientes()).andReturn(Prestamo);

        mock.RealizarPrestamo(Cantidad, Meses);

        replay(mock);

        boolean result = classUnderTest.realizarPrestamoPersonal(mock, Cantidad, Meses);
        assertFalse(result);
    }
    
    @Test
    public void testRealizarPrestamoPersonal12() {
        int Cantidad = 3200;
        int Meses = 7;
        boolean Prestamo = false;
        System.out.println("Realizar Prestamo Personal: \n Variables: \n Cantidad = "
                + Cantidad + "\nMeses = " + Meses + "\nPrestamo en ultimo año = " + Prestamo);

        expect(mock.CantidadValida(Cantidad)).andReturn(false);
        expect(mock.TiempoValido(Meses)).andReturn(true);
        expect(mock.PrestamosRecientes()).andReturn(Prestamo);

        mock.RealizarPrestamo(Cantidad, Meses);

        replay(mock);

        boolean result = classUnderTest.realizarPrestamoPersonal(mock, Cantidad, Meses);
        assertFalse(result);
    }
    
    //MESES 14 MESES
    
    @Test
    public void testRealizarPrestamoPersonal13() {
        int Cantidad = 700;
        int Meses = 14;
        boolean Prestamo = true;
        System.out.println("Realizar Prestamo Personal: \n Variables: \n Cantidad = "
                + Cantidad + "\nMeses = " + Meses + "\nPrestamo en ultimo año = " + Prestamo);

        expect(mock.CantidadValida(Cantidad)).andReturn(false);
        expect(mock.TiempoValido(Meses)).andReturn(false);
        expect(mock.PrestamosRecientes()).andReturn(Prestamo);

        mock.RealizarPrestamo(Cantidad, Meses);

        replay(mock);

        boolean result = classUnderTest.realizarPrestamoPersonal(mock, Cantidad, Meses);
        assertFalse(result);
    }
    
    @Test
    public void testRealizarPrestamoPersonal14() {
        int Cantidad = 700;
        int Meses = 14;
        boolean Prestamo = false;
        System.out.println("Realizar Prestamo Personal: \n Variables: \n Cantidad = "
                + Cantidad + "\nMeses = " + Meses + "\nPrestamo en ultimo año = " + Prestamo);

        expect(mock.CantidadValida(Cantidad)).andReturn(false);
        expect(mock.TiempoValido(Meses)).andReturn(false);
        expect(mock.PrestamosRecientes()).andReturn(Prestamo);

        mock.RealizarPrestamo(Cantidad, Meses);

        replay(mock);

        boolean result = classUnderTest.realizarPrestamoPersonal(mock, Cantidad, Meses);
        assertFalse(result);
    }
    
    @Test
    public void testRealizarPrestamoPersonal15() {
        int Cantidad = 1200;
        int Meses = 14;
        boolean Prestamo = true;
        System.out.println("Realizar Prestamo Personal: \n Variables: \n Cantidad = "
                + Cantidad + "\nMeses = " + Meses + "\nPrestamo en ultimo año = " + Prestamo);

        expect(mock.CantidadValida(Cantidad)).andReturn(true);
        expect(mock.TiempoValido(Meses)).andReturn(false);
        expect(mock.PrestamosRecientes()).andReturn(Prestamo);

        mock.RealizarPrestamo(Cantidad, Meses);

        replay(mock);

        boolean result = classUnderTest.realizarPrestamoPersonal(mock, Cantidad, Meses);
        assertFalse(result);
    }
    
    @Test
    public void testRealizarPrestamoPersonal16() {
        int Cantidad = 1200;
        int Meses = 14;
        boolean Prestamo = false;
        System.out.println("Realizar Prestamo Personal: \n Variables: \n Cantidad = "
                + Cantidad + "\nMeses = " + Meses + "\nPrestamo en ultimo año = " + Prestamo);

        expect(mock.CantidadValida(Cantidad)).andReturn(true);
        expect(mock.TiempoValido(Meses)).andReturn(false);
        expect(mock.PrestamosRecientes()).andReturn(Prestamo);

        mock.RealizarPrestamo(Cantidad, Meses);

        replay(mock);

        boolean result = classUnderTest.realizarPrestamoPersonal(mock, Cantidad, Meses);
        assertFalse(result);
    }
    
    @Test
    public void testRealizarPrestamoPersonal17() {
        int Cantidad = 3200;
        int Meses = 14;
        boolean Prestamo = true;
        System.out.println("Realizar Prestamo Personal: \n Variables: \n Cantidad = "
                + Cantidad + "\nMeses = " + Meses + "\nPrestamo en ultimo año = " + Prestamo);

        expect(mock.CantidadValida(Cantidad)).andReturn(false);
        expect(mock.TiempoValido(Meses)).andReturn(false);
        expect(mock.PrestamosRecientes()).andReturn(Prestamo);

        mock.RealizarPrestamo(Cantidad, Meses);

        replay(mock);

        boolean result = classUnderTest.realizarPrestamoPersonal(mock, Cantidad, Meses);
        assertFalse(result);
    }
    
    @Test
    public void testRealizarPrestamoPersonal18() {
        int Cantidad = 3200;
        int Meses = 14;
        boolean Prestamo = false;
        System.out.println("Realizar Prestamo Personal: \n Variables: \n Cantidad = "
                + Cantidad + "\nMeses = " + Meses + "\nPrestamo en ultimo año = " + Prestamo);

        expect(mock.CantidadValida(Cantidad)).andReturn(false);
        expect(mock.TiempoValido(Meses)).andReturn(false);
        expect(mock.PrestamosRecientes()).andReturn(Prestamo);

        mock.RealizarPrestamo(Cantidad, Meses);

        replay(mock);

        boolean result = classUnderTest.realizarPrestamoPersonal(mock, Cantidad, Meses);
        assertFalse(result);
    }

}

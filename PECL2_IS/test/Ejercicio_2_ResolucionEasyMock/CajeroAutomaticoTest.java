/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_2_ResolucionEasyMock;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
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
    
    @Before
    public void setUp(){
        classUnderTest = new CajeroAutomatico("1111111111");
        classUnderTest.iniciarSesion("0000");           
        /* (1) Crea un mock para la clase colaboradora*/         
        mock = createMock(GestorPrestamosPersonales.class);
    }
    
    @After
    public void tearDown() {
        classUnderTest.cerrarSesion();
        reset(mock);
    }

    @Test     
    public void realizarPrestamoPersonal01() throws Exception{
        System.out.println("realizarPrestamoPersonal01");
        
        expect(mock.PrestamosRecientes()).andReturn(false);         
        expect(mock.CantidadValida(1500)).andReturn(true);
        expect(mock.TiempoValido(10)).andReturn(true);
        mock.RealizarPrestamo(1500, 10);
        
        replay(mock); 
        
        boolean result = classUnderTest.realizarPrestamoPersonal(mock, 1500, 10);         
        assertTrue(result);
        
        verify(mock);
    }
    
    @Test     
    public void realizarPrestamoPersonal02() throws Exception{
        System.out.println("realizarPrestamoPersonal02");
        
        expect(mock.PrestamosRecientes()).andReturn(true);         
        expect(mock.CantidadValida(1500)).andReturn(true);
        expect(mock.TiempoValido(10)).andReturn(true);
        mock.RealizarPrestamo(1500, 10);
        
        replay(mock); 
        
        boolean result = classUnderTest.realizarPrestamoPersonal(mock, 1500, 10);         
        assertFalse(result);
        
    }
    
    @Test     
    public void realizarPrestamoPersonal03() throws Exception{
        System.out.println("realizarPrestamoPersonal03");
        
        expect(mock.PrestamosRecientes()).andReturn(false);         
        expect(mock.CantidadValida(4500)).andReturn(false);
        expect(mock.TiempoValido(10)).andReturn(true);
        mock.RealizarPrestamo(4500, 10);
        
        replay(mock); 
        
        boolean result = classUnderTest.realizarPrestamoPersonal(mock, 4500, 10);         
        assertFalse(result);
        
    }
    
    @Test     
    public void realizarPrestamoPersonal04() throws Exception{
        System.out.println("realizarPrestamoPersonal04");
        
        expect(mock.PrestamosRecientes()).andReturn(false);         
        expect(mock.CantidadValida(1500)).andReturn(true);
        expect(mock.TiempoValido(20)).andReturn(false);
        mock.RealizarPrestamo(1500, 20);
        
        replay(mock); 
        
        boolean result = classUnderTest.realizarPrestamoPersonal(mock, 1500, 20);         
        assertFalse(result);
        
    }
    
    @Test     
    public void realizarPrestamoPersonal05() throws Exception{
        System.out.println("realizarPrestamoPersonal05");
        
        expect(mock.PrestamosRecientes()).andReturn(false);         
        expect(mock.CantidadValida(1500)).andReturn(true);
        expect(mock.TiempoValido(5)).andReturn(false);
        mock.RealizarPrestamo(1500, 5);
        
        replay(mock); 
        
        boolean result = classUnderTest.realizarPrestamoPersonal(mock, 1500, 5);         
        assertFalse(result);
        
    }
    
    @Test     
    public void realizarPrestamoPersonal06() throws Exception{
        System.out.println("realizarPrestamoPersonal06");
        
        expect(mock.PrestamosRecientes()).andReturn(false);         
        expect(mock.CantidadValida(500)).andReturn(false);
        expect(mock.TiempoValido(10)).andReturn(true);
        mock.RealizarPrestamo(500, 10);
        
        replay(mock); 
        
        boolean result = classUnderTest.realizarPrestamoPersonal(mock, 500, 10);         
        assertFalse(result);
    }
}

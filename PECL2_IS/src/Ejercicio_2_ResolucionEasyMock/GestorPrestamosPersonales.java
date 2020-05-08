/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_2_ResolucionEasyMock;

/**
 *
 * @author razvanvc
 */
public interface GestorPrestamosPersonales {
    
    public boolean CantidadValida(int Cantidad);
    public boolean TiempoValido(int meses);
    public boolean PrestamosRecientes();
    
    public void RealizarPrestamo(double Cantidad, int meses);
}

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
    
    /**
     * Indica si la cantidad solicitada se encuentra entre 1000 y 3000 euros
     * @param Cantidad
     * @return 
     */
    public boolean CantidadValida(int Cantidad);
    
    /**
     * Indica si el tiempo solicitado para el prestamos se encuentra entre 6 y 12 meses
     * @param meses
     * @return 
     */
    public boolean TiempoValido(int meses);
    
    /**
     * Indica si se le ha concedido un prestamos al cliente en este año
     * @return 
     */
    public boolean PrestamosRecientes();
    
    /**
     * Realiza el prestamo especificando la cantidad y los meses a los que se devuelve
     * @param Cantidad
     * @param meses 
     */
    public void RealizarPrestamo(double Cantidad, int meses);
}

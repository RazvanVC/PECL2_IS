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
/**
 * Simula un cajero automático.
 */
public class CajeroAutomatico {

    private String _codigo = null;
    /**
     * La cuenta corriente sobre la que se opera en una sesión.
     */
    private String _cuenta;

    public CajeroAutomatico(String codigo) {
        _codigo = codigo;
    }

    public void iniciarSesion(String ccc) {
        assert (_cuenta == null);
        _cuenta = ccc; //cuenta del cliente 
    }

    public void cerrarSesion() {
        assert (_cuenta != null);
        _cuenta = null; //pone a null la cuenta 
    }

    public boolean realizarRetirada(double cantidad, PasarelaPago p) {
        assert (_cuenta != null);
        if (p.estaBloqueada()) { //Si está bloqueada nada 
            return false;
        }
        if (p.tieneSaldo(cantidad)) { //Si está activa y tiene saldo
            p.retirar(cantidad);
            return true;
        }
        return false;
    }
}
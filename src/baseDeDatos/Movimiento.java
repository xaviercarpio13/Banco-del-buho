/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baseDeDatos;

public class Movimiento {
    
    private String cuentaOrigen;
    private String cuentaDestino;
    private String tipo;
    private float monto;
    private String fecha;

    public Movimiento(String cuentaOrigen, String cuentaDestino, String tipo, float monto, String fecha) {
        this.cuentaOrigen = cuentaOrigen;
        this.cuentaDestino = cuentaDestino;
        this.tipo = tipo;
        this.monto = monto;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        String linea = fecha + "\n";
        if (tipo.equalsIgnoreCase("pago")) {
            linea += "Pago a tarjeta " + cuentaDestino;
        } else if (tipo.equalsIgnoreCase("interbancaria")) {
            linea += "Transferencia a " + cuentaDestino;
        } else {
            linea += "Movimiento: " + tipo;
        }
        linea += "\nMonto: $" + monto + "\n";
        return linea;
    }
    
}

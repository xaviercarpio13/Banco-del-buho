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
    private String nombreDestinatario;

    public Movimiento(String cuentaOrigen, String cuentaDestino, String tipo, float monto, String fecha, String nombreDestinatario) {
        this.cuentaOrigen = cuentaOrigen;
        this.cuentaDestino = cuentaDestino;
        this.tipo = tipo;
        this.monto = monto;
        this.fecha = fecha;
        this.nombreDestinatario = nombreDestinatario;
    }
    
    public String getCuentaOrigen() {
        return cuentaOrigen;
    }

    public String getCuentaDestino() {
        return cuentaDestino;
    }

    public String getTipo() {
        return tipo;
    }

    public float getMonto() {
        return monto;
    }

    public String getFechaHora() {
        return fecha;
    }
    
    public String getNombreDestinatario() {
        return nombreDestinatario;
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

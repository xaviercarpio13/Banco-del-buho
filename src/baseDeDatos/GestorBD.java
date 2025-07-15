/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baseDeDatos;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import proyectoprimerbimestre.Usuario;
import java.util.*;

public class GestorBD {
    
    public static void crearTablas() {
    String usuariosSQL =
                "CREATE TABLE IF NOT EXISTS usuarios ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "nombre_usuario TEXT UNIQUE, "
                + "password TEXT, "
                + "nombre_completo TEXT"
                + ");";

        String cuentasSQL =
                "CREATE TABLE IF NOT EXISTS cuentas ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "usuario_id INTEGER, "
                + "numero TEXT, "
                + "tipo TEXT, "
                + "saldo REAL, "
                + "FOREIGN KEY (usuario_id) REFERENCES usuarios(id)"
                + ");";

        String movimientosSQL =
                "CREATE TABLE IF NOT EXISTS movimientos ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "cuenta_origen TEXT, "
                + "cuenta_destino TEXT, "
                + "tipo TEXT, " // "pago", "interbancaria", etc.
                + "monto REAL, "
                + "fecha TEXT"
                + ");";

        try (Connection conn = ConexionBD.conectar();
             Statement stmt = conn.createStatement()) {

            stmt.execute(usuariosSQL);
            stmt.execute(cuentasSQL);
            stmt.execute(movimientosSQL);

            System.out.println("Tablas creadas correctamente");
        } catch (SQLException e) {
            System.out.println("Error al crear tablas: " + e.getMessage());
        }
    }
    
    // En basedatos/GestorBD.java
public static int insertarUsuario(String nombreUsuario, String password, String nombreCompleto) {
    String sql = "INSERT INTO usuarios (nombre_usuario, password, nombre_completo) VALUES (?, ?, ?)";
    try (Connection conn = ConexionBD.conectar();
         PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
        pstmt.setString(1, nombreUsuario);
        pstmt.setString(2, password);
        pstmt.setString(3, nombreCompleto);
        pstmt.executeUpdate();

        ResultSet rs = pstmt.getGeneratedKeys();
        if (rs.next()) {
            return rs.getInt(1); // ID generado del usuario
        }
    } catch (SQLException e) {
        System.out.println("Error al insertar usuario: " + e.getMessage());
    }
    return -1; // Error
}

public static boolean insertarCuenta(int usuarioId, String numero, String tipo, float saldo) {
    String sql = "INSERT INTO cuentas (usuario_id, numero, tipo, saldo) VALUES (?, ?, ?, ?)";
    try (Connection conn = ConexionBD.conectar();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setInt(1, usuarioId);
        pstmt.setString(2, numero);
        pstmt.setString(3, tipo);
        pstmt.setFloat(4, saldo);
        pstmt.executeUpdate();
        return true;
    } catch (SQLException e) {
        System.out.println("Error al insertar cuenta: " + e.getMessage());
        return false;
    }
}

public static void insertarMovimiento(String cuentaOrigen, String cuentaDestino, String tipo, float monto, String fecha, String nombreDestinatario) {
    String sql = "INSERT INTO movimientos (cuenta_origen, cuenta_destino, tipo, monto, fecha, nombre_destinatario) VALUES (?, ?, ?, ?, ?, ?)";  
    try (Connection conn = ConexionBD.conectar();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

        pstmt.setString(1, cuentaOrigen);
        pstmt.setString(2, cuentaDestino);
        pstmt.setString(3, tipo);
        pstmt.setFloat(4, monto);
        pstmt.setString(5, fecha);
        pstmt.setString(6, nombreDestinatario);

        pstmt.executeUpdate();
    } catch (SQLException e) {
        System.out.println("❌ Error al insertar movimiento: " + e.getMessage());
    }
}


public static Usuario obtenerUsuario(String usuario, String password) {
    String sql = "SELECT id, nombre_completo FROM usuarios WHERE nombre_usuario = ? AND password = ?";
    try (Connection conn = ConexionBD.conectar();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

        pstmt.setString(1, usuario);
        pstmt.setString(2, password);

        ResultSet rs = pstmt.executeQuery();

        if (rs.next()) {
            int id = rs.getInt("id");
            String nombre = rs.getString("nombre_completo");

            // Cargar cuentas del usuario
            ArrayList<String> cuentas = new ArrayList<>();
            ArrayList<String> tipoCuentas = new ArrayList<>();
            ArrayList<Float> saldos = new ArrayList<>();

            String sqlCuentas = "SELECT numero, tipo, saldo FROM cuentas WHERE usuario_id = ?";
            try (PreparedStatement stmtCuentas = conn.prepareStatement(sqlCuentas)) {
                stmtCuentas.setInt(1, id);
                ResultSet rsCuentas = stmtCuentas.executeQuery();

                while (rsCuentas.next()) {
                    cuentas.add(rsCuentas.getString("numero"));
                    tipoCuentas.add(rsCuentas.getString("tipo"));
                    saldos.add(rsCuentas.getFloat("saldo"));
                }
            }

            return new Usuario(id, usuario, password, nombre, cuentas, tipoCuentas, saldos, new ArrayList<>());
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return null;
}


public static Usuario obtenerUsuarioPorCuenta(String numeroCuenta) {
    String sql = "SELECT u.id, u.nombre_usuario, u.password, u.nombre_completo "
               + "FROM usuarios u JOIN cuentas c ON u.id = c.usuario_id "
               + "WHERE c.numero = ?";
    try (Connection conn = ConexionBD.conectar();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setString(1, numeroCuenta);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            int id = rs.getInt("id");
            String nombreUsuario = rs.getString("nombre_usuario");
            String password = rs.getString("password");
            String nombreCompleto = rs.getString("nombre_completo");
            return new Usuario(id, nombreUsuario, password, nombreCompleto,
                               new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return null;
}



public static List<Movimiento> obtenerMovimientos(String cuenta) {
    List<Movimiento> lista = new ArrayList<>();
    String sql = "SELECT cuenta_origen, cuenta_destino, tipo, monto, fecha, nombre_destinatario FROM movimientos "
               + "WHERE cuenta_origen = ? OR cuenta_destino = ? ORDER BY fecha DESC";

    try (Connection conn = ConexionBD.conectar();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

        pstmt.setString(1, cuenta);
        pstmt.setString(2, cuenta);
        ResultSet rs = pstmt.executeQuery();

        while (rs.next()) {
            Movimiento m = new Movimiento(
                rs.getString("cuenta_origen"),
                rs.getString("cuenta_destino"),
                rs.getString("tipo"),
                rs.getFloat("monto"),
                rs.getString("fecha"),
                rs.getString("nombre_destinatario")
            );
            lista.add(m);
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }
    return lista;
}


public static boolean actualizarSaldo(String numeroCuenta, float nuevoSaldo) {
    String sql = "UPDATE cuentas SET saldo = ? WHERE numero = ?";
    try (Connection conn = ConexionBD.conectar();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

        pstmt.setFloat(1, nuevoSaldo);
        pstmt.setString(2, numeroCuenta);

        int filasAfectadas = pstmt.executeUpdate();
        return filasAfectadas > 0;
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}

    
    
}



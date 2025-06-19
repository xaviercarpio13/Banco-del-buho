/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baseDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    public static Connection conectar() {
        Connection conn = null;
        try {
            String url = "jdbc:sqlite:mi_base.db"; // crea archivo mi_base.db si no existe
            conn = DriverManager.getConnection(url);
            System.out.println("Conectado a SQLite.");
        } catch (SQLException e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }
        return conn;
    }
    
     public static void main(String[] args) {
        conectar();
    }
     
}

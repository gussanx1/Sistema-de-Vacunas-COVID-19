/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author BRIX-i7
 */
public class ClaseRegistro {
    
    Connection registro;
    public Connection conectarRegistro() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            registro = DriverManager.getConnection("jdbc:mysql://localhost/bd_usuarios", "root", "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: No es posible conectar con la Base de Datos");
        }
        return registro;
    }
}

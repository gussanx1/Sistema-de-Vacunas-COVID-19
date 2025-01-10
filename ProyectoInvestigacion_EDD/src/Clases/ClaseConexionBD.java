
package Clases;

import java.sql.*;
import javax.swing.JOptionPane;


public class ClaseConexionBD {

    // Variable de tipo "Connection"
    Connection enlazar;
    Connection registro;

    // Coneccion para  la tabla vacunados
    public Connection conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            enlazar = DriverManager.getConnection("jdbc:mysql://localhost/bd_vacunados", "root", "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: No es posible conectar con la Base de Datos");
        }
        return enlazar;
    }

    // Coneccion para  la tabla registro
    public Connection conectarRegistro() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            registro = DriverManager.getConnection("jdbc:mysql://localhost/bd_vacunados", "root", "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: No es posible conectar con la Base de Datos");
        }
        return registro;
    }

}

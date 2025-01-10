package Clases;

import Formularios.frmIcioSesion;

public class ClasePrincipal {

    public static void main(String[] args) {
        // TODO code application logic here
        
        frmIcioSesion inicio = new frmIcioSesion();
        inicio.setTitle("INGRESE SU USUARIO");
        inicio.setBounds(0, 0, inicio.getWidth(), inicio.getHeight());
        inicio.setVisible(true);
        inicio.setLocationRelativeTo(null);
    
    }
}//Final de la clase Principal


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author BRIX-i7
 */
public class ClaseLlenado {
    
    // Atributos
    private String _FechaPD, _FechaSD, _FechaTD, _Nombre, _Sexo, _CodigoVacuna, _Correo, _Ciudad;
    private int _Edad, _Dni, _Celular;
    
    // Constructor
    
    public ClaseLlenado(String FechaPD, String FechaSD, String FechaTD, String Nombre, int Edad, String Sexo, String CodigoVacuna, int Dni, int Celular, String Correo, String Ciudad){
        this._FechaPD=FechaPD;
        this._FechaSD=FechaSD;
        this._FechaTD = _FechaTD;
        this._Nombre=Nombre;
        this._Edad=Edad; 
        this._Sexo=Sexo;
        this._CodigoVacuna=CodigoVacuna;
        this._Dni=Dni;
        this._Celular=Celular;
        this._Correo=Correo;
        this._Ciudad=Ciudad;
    }
}

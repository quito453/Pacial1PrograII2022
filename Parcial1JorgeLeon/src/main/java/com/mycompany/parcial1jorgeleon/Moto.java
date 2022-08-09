/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial1jorgeleon;

/**
 *
 * @author Daiki
 */
public class Moto extends VehiculoTerrestre{
    
    String Modificaciones;
    int CantidadRuedas;
    String Color;

    public String getModificaciones() {
        return Modificaciones;
    }

    public void setModificaciones(String Modificaciones) {
        this.Modificaciones = Modificaciones;
    }

    public int getCantidadRuedas() {
        return CantidadRuedas;
    }

    public void setCantidadRuedas(int CantidadRuedas) {
        this.CantidadRuedas = CantidadRuedas;
    }

   
public static void main(String[] args) {

   Moto mimoto = new Moto();
    
    mimoto.Color();
    
    System.out.println("Color de la Motocicleta: " + mimoto.Color);
  }
}

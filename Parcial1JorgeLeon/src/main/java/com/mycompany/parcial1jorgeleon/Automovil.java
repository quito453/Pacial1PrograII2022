/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial1jorgeleon;

/**
 *
 * @author Daiki
 */
public class Automovil extends VehiculoTerrestre {
    
    String CamaraRetroseso;
    String Color;
    int NumeroRuedas;

    public String getCamaraRetroseso() {
        return CamaraRetroseso;
    }

    public void setCamaraRetroseso(String CamaraRetroseso) {
        this.CamaraRetroseso = CamaraRetroseso;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public int getNumeroRuedas() {
        return NumeroRuedas;
    }

    public void setNumeroRuedas(int NumeroRuedas) {
        this.NumeroRuedas = NumeroRuedas;
    }
    
   public static void main(String[] args) {

    Automovil miautomovil = new Automovil();
    
    miautomovil.Color();
    
    System.out.println("Color del Automovil: " + miautomovil.Color);
  }
}

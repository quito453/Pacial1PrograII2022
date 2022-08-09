/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial1jorgeleon;

/**
 *
 * @author Daiki
 */
public class VehiculoTerrestre extends Vehiculos {  
    String Modelo;
    int anio;
    String Color;

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }
    
    public void Color() {                     
    System.out.println(Color);
  }
    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
     
public static void main(String[] args) {

    VehiculoTerrestre mivehiculoterrestre = new VehiculoTerrestre();
    
    mivehiculoterrestre.pasajeros();
   
    System.out.println("Cantidad de Pasajeros: " + mivehiculoterrestre.Pasajeros);
  }
}


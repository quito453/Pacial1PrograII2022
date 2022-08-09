/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial1jorgeleon;

/**
 *
 * @author Daiki
 */
public class Vehiculoaereo extends Vehiculos {
    int Altura;
    int Anchura;
    int KmporHora;
    
     public void kmporhora() {                     
    System.out.println(KmporHora);
  }
     
    public int getAltura() {
        return Altura;
    }

    public void setAltura(int Altura) {
        this.Altura = Altura;
    }

    public int getAnchura() {
        return Anchura;
    }

    public void setAnchura(int Anchura) {
        this.Anchura = Anchura;
    }
public static void main(String[] args) {

    Vehiculoaereo mivehiculoaereo = new Vehiculoaereo();
    
    mivehiculoaereo.pasajeros();
   
    System.out.println("Cantidad de Pasajeros: " + mivehiculoaereo.Pasajeros);
  }
}



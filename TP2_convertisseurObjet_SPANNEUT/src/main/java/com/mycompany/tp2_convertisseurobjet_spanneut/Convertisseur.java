/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_convertisseurobjet_spanneut;

/**
 *
 * @author alexia
 */
public class Convertisseur {
    int nbConversions ;
    
    
    public float convertisseur() {
        nbConversions = 0 ;
        return nbConversions;
    }
    
    public double CelciusVersKelvin(double TKelvin){
        nbConversions += 1 ;
        TKelvin = 50 + 273.15; 
        return TKelvin;
    }
    
    public double KelvinVersCelcius(double TCelcius){
        nbConversions += 1 ;
        TCelcius = 500 - 273.15;
        return TCelcius;
    }
    
    public double FarenheitVersCelcius(double TFC){
        nbConversions += 1 ;
        TFC = (32 - 32)*5/9;
        return TFC;
    }
    
    public double CelciusVersFarenheit(double TCF){
       nbConversions += 1 ;
       TCF = (0 * 9/5) + 32;
       return TCF;
    }
    
    public double FarenheitVersKelvin(double TFK){
        nbConversions += 1 ;
        TFK = (32 - 32)* 5/9 + 273.15;
        return TFK;
    }
    
    public double KelvinVersFarenheit(double TKF){
        nbConversions += 1 ;
        TKF = (32 - 273.15) * 9/5 + 32;
        return TKF;
    }
    
    @Override
    public String toString(){
       return "nb de conversions"+ nbConversions; 
    }
}

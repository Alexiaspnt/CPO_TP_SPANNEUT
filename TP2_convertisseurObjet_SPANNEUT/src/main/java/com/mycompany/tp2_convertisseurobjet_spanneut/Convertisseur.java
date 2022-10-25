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
        TKelvin = TKelvin + 273.15; 
        return TKelvin;
    }
    
    public double KelvinVersCelcius(double TCelcius){
        nbConversions += 1 ;
        TCelcius = TCelcius - 273.15;
        return TCelcius;
    }
    
    public double FarenheitVersCelcius(double TFC){
        nbConversions += 1 ;
        TFC = (TFC - 32)*5/9;
        return TFC;
    }
    
    public double CelciusVersFarenheit(double TCF){
       nbConversions += 1 ;
       TCF = (TCF * 9/5) + 32;
       return TCF;
    }
    
    public double FarenheitVersKelvin(double TFK){
        nbConversions += 1 ;
        TFK = (TFK - 32)* 5/9 + 273.15;
        return TFK;
    }
    
    public double KelvinVersFarenheit(double TKF){
        nbConversions += 1 ;
        TKF = (TKF - 273.15) * 9/5 + 32;
        return TKF;
    }
    
    @Override
    public String toString(){
       return "nb de conversions"+ nbConversions; 
    }
}

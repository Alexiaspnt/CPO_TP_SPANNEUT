/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp2_convertisseurobjet_spanneut;

/**
 *
 * @author alexia
 */
public class TP2_convertisseurObjet_SPANNEUT {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Convertisseur conversions = new Convertisseur();
        conversions.CelciusVersFarenheit(0);
        conversions.KelvinVersFarenheit(0);
        conversions.FarenheitVersCelcius(0);
        System.out.println(nbConversions);

        Convertisseur conversions2 = new Convertisseur();
        conversions2.KelvinVersFarenheit(0);
        conversions2.KelvinVersFarenheit(0);
        System.out.println(nbConversions);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp2_convertisseurobjet_spanneut;

/**
 *
 * @author alexia
 */
import java.util.Scanner;
public class TP2_convertisseurObjet_SPANNEUT {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Convertisseur conversions = new Convertisseur();
        //conversions.CelciusVersFarenheit(0);
        //conversions.KelvinVersFarenheit(0);
        //conversions.FarenheitVersCelcius(0);
        System.out.println(conversions.nbConversions);

        Convertisseur conversions2 = new Convertisseur();
        conversions2.CelciusVersFarenheit(0);
        conversions2.FarenheitVersCelcius(0);
        System.out.println(conversions.nbConversions);
       // scanner scanner = new scanner (System.in);
        //system.out.println("")
        //double nombre =scanner.nextDouble();
    

        Scanner scanner = new Scanner(System.in);

        // Affiche "Ecrire un nombre: "
        System.out.println("chosisissez la conversion à faire");
        System.out.println("Pour CelciusVersKelvin écrire: 1, Pour KelvinVersCelcius écrire: 2, Pour FarenheitVersCelcius écrire: 3, Pour CelciusVersFarenheit écrire: 4, Pour FarenheitVersKelvin écrire: 5, Pour KelvinVersFarenheit écrire: 6 ");
        
        //Lit l'entier écrit par l'utilisateur et l'affecte 
        // à  la variable nombre du programme
        double nombre = scanner.nextDouble();
        // Affiche le nombre saisit par l'utilisateur
        System.out.println("le nombre entré est :" + nombre);
        
        
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("écrire un nombre à convertir");
        double nombre2 = scanner2.nextDouble();
        System.out.println("le nombre entré est :" + nombre2);
        
        
        if (nombre == 1){
            conversions.CelciusVersKelvin(nombre2);
            
        }else if (nombre ==2){
            conversions.KelvinVersCelcius(nombre2);            
            
        }else if (nombre ==3){
            conversions.FarenheitVersCelcius(nombre2);             
            
        }else if (nombre ==4){
            conversions.CelciusVersFarenheit(nombre2);            
            
        }else if (nombre ==5){
            conversions.FarenheitVersKelvin(nombre2);            
            
        }else if (nombre ==6){
            conversions.KelvinVersFarenheit(nombre2);            
            
        }
   
    }
}

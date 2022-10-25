/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp2_bieres_spanneut;

/**
 *
 * @author alexia
 */
public class TP2_Bieres_SPANNEUT {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",7 ,"Dubuisson") ;
        System.out.println(uneBiere) ;
        uneBiere.ouverte=false;
        uneBiere.decapsuler();
        uneBiere.lireEtiquette();
        System.out.println(uneBiere);
        
        BouteilleBiere secondeBiere = new BouteilleBiere("Leffe",6 ,"Abbaye de Leffe") ;
        secondeBiere.lireEtiquette();
        secondeBiere.decapsuler();
        System.out.println(secondeBiere);
        
        BouteilleBiere troisiemeBiere = new BouteilleBiere("Leffe",6 ,"Abbaye de Leffe") ;
        troisiemeBiere.lireEtiquette();
        troisiemeBiere.decapsuler();
        System.out.println(troisiemeBiere);
        
        BouteilleBiere quatriemeBiere = new BouteilleBiere("Leffe",6 ,"Abbaye de Leffe") ;
        quatriemeBiere.lireEtiquette();
        quatriemeBiere.decapsuler();
        System.out.println(quatriemeBiere);
        
        

    }
}
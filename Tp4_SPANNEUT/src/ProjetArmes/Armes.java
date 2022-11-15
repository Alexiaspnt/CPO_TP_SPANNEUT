/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetArmes;

/**
 *
 * @author alexia
 */
public class Armes { //création classe arme 
    String nom;
    int attaque;


public Armes (String n, int i) { //constructeur
    nom = n;
    attaque = i;
    
    
}

@Override
        public String toString() { 
        String chaine_a_retourner; 
        chaine_a_retourner = "nom : "+nom + " attaque :" + attaque;
        
        return chaine_a_retourner ;
        }



}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4_spanneut;

/**
 *
 * @author alexia
 */
public class Armes {
    String nom;
    int attaque;


public Armes (String n, int i) {
    nom = n;
    attaque = i;
    
    
}

@Override
        public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = nom + " (" + attaque + " degrés)Ouverte ? ";
        
        return chaine_a_retourner ;
        }



}
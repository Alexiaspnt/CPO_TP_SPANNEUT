/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4_spanneut;

/**
 *
 * @author alexia
 */
public class Personnage {
    String nom;
    int vie;
    
    
    public Personnage (String nom, int vie) { //constructeur
        this.nom = nom;
        this.vie = vie;   
    }
    
@Override //methode tostring
        public String toString() { 
        String chaine_a_retourner; 
        chaine_a_retourner = "nom : "+nom + " vie :" + vie;
        
        return chaine_a_retourner ;
        }
    
}

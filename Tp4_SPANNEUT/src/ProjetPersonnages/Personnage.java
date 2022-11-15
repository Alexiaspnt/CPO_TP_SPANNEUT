/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetPersonnages;

import ProjetArmes.Armes;
import java.util.ArrayList;

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
        chaine_a_retourner = "nom : "+nom + " vie :" + vie ;
        
        return chaine_a_retourner ;
        }
        
        
   ArrayList<Armes> Tableau = new ArrayList<Armes>();
   Armes ArmeActuelle = null;
   Armes Arme_en_Main; 
   
   public ArrayList<Armes> AjoutArme (Armes NouvelleArme) { 
       
       if (Tableau.size() < 5){
           Tableau.add(NouvelleArme);
       }
       
       return Tableau;
         
    }

    public Armes getArme_en_Main() {
        return Arme_en_Main;
    }

   public Armes equipe_arme(int nom){
       
   }
    
}

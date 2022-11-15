/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetPersonnages;

/**
 *
 * @author alexia
 */
public class Guerrier extends Personnage{
    
    boolean cheval;

    
    public Guerrier(String nom, int vie , boolean cheval) {
        super(nom, vie);
        this.cheval = cheval;
     
        
    }

    @Override
    public String toString() {
        String chaine_a_retourner; 
        chaine_a_retourner = "nom : "+nom + " vie :" + vie + "confirme : " + cheval ;
        return chaine_a_retourner;
    }

    
    
    
    
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }
    
    
    
}

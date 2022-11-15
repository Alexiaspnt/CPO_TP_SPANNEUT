/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4_spanneut;

import ProjetPersonnages.Personnage;
import ProjetPersonnages.Magicien;
import ProjetPersonnages.Guerrier;
import ProjetArmes.Epee;
import ProjetArmes.Baton;
import ProjetArmes.Armes;
import java.util.ArrayList;

/**
 *
 * @author alexia
 */
public class Tp4_SPANNEUT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    // test des calsses armes 
        Epee uneepee = new Epee("Excalibur", 7, 5) ;
        System.out.println(uneepee);
        Epee uneautreepee = new Epee ("Durandal", 4, 7);
        System.out.println(uneautreepee);
        
        Baton unbaton = new Baton ("Chêne", 4, 5);
        System.out.println(unbaton);
        Baton unautrebaton = new Baton ("Charme", 5, 6);
        System.out.println(unautrebaton);
        
        
    //ajout d'un tableau dynamique pour les armes 
        ArrayList<Armes> Tab = new ArrayList<Armes>();
        Tab.add(uneepee);
        Tab.add(uneautreepee);
        Tab.add(unbaton);
        Tab.add(unautrebaton);
        
        
    //affichage du tableau  
        System.out.print("["+ Tab.get(0) ); 

        for (int i=1; i<Tab.size(); i++){
            System.out.print(", "+ Tab.get(i));
            }

        System.out.print("]");
        
    
    //test des classes personnages
        Magicien Gandalf = new Magicien("Gandalf", 65, true) ;
        System.out.println(Gandalf);
        
        Magicien Garcimore = new Magicien("Garcimore", 44, false) ;
        System.out.println(Garcimore);
        
        
        Guerrier Conan = new Guerrier("Conan", 78, false) ;
        System.out.println(Conan);
        
        Guerrier Lannister = new Guerrier("Lannister", 45, true) ;
        System.out.println(Lannister);
        
        
    //ajout d'un tableau dynamique pour les personnages
        ArrayList<Personnage> Tabperso = new ArrayList<Personnage>();  
        Tabperso.add(Gandalf);
        Tabperso.add(Garcimore);
        Tabperso.add(Conan);
        Tabperso.add(Lannister);

    }
    
    

    
}

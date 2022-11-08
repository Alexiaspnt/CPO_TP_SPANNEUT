/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4_spanneut;

/**
 *
 * @author alexia
 */
public class Tp4_SPANNEUT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Epee uneepee = new Epee("Excalibur", 7, 5) ;
        System.out.println(uneepee);
        Epee uneautreepee = new Epee ("Durandal", 4, 7);
        System.out.println(uneautreepee);
        
        Baton unbaton = new Baton ("Chêne", 4, 5);
        System.out.println(unbaton);
        Baton unautrebaton = new Baton ("Charme", 5, 6);
        System.out.println(unautrebaton);
    }
    
}

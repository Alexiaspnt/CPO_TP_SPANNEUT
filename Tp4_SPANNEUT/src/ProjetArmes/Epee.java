/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetArmes;

import ProjetArmes.Armes;

/**
 *
 * @author alexia
 */
public class Epee extends Armes { //classe eppee fille de Arme
    int finesse; 
    
    public Epee (String n, int i,int b){
        super(n,i);
        if (b > 0){
            finesse = b;            
        }else{
            finesse = 0;
        }
        
    }
    
}

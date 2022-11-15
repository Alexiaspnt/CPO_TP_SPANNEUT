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
public class Baton extends Armes { //classe baton fille de Arme
    int age;
    
    public Baton(String n, int i,int a){
        super(n,i);
        if (a > 0){
           age = a; 
        }else{
            age = 0;
        }
        
    }
    
}

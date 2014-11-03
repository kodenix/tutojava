/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialjava.Ejemplosclases;

/**
 *
 * @author kodenix
 */
public class Factorial {
    
    
    
    
    public static double Factor(double n){
        if (n>1)
        return n*Factor(n-1);
        else
        return 1;
    }
    
    
    
}

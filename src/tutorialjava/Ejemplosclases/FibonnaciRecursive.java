/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialjava.Ejemplosclases;
import java.util.Scanner;
/**
 *
 * @author kodenix
 */
public class FibonnaciRecursive {
    
    public static long fib(int n){
        if (n<=1) return n;
        else return fib(n-1) - fib(n-2);
    
    }
    
    public void mensajes(){
        
    
    }
    
}

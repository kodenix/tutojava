/*
 * Desarrollar un programa que permita la carga de 10 valores por teclado y nos 
 * muestre posteriormente la suma de los valores ingresados y su promedio, 
 * lo resolveremos empleando la estructura for.
 */
package tutorialjava.schoolwork;

import java.util.Scanner;
/**
 *
 * @author kodenix
 */
public class ControlStructures {
    
    private int[] numeros=new int[10];
    
    public void Calculo(){
        int i=0;
        int e=0;
        int suma=0;
        Scanner teclado=new Scanner(System.in);
        
        for (i=0;i<10;i++){
           System.out.println("Ingrese el numero"+(i+1));
           numeros[i]=teclado.nextInt();
            
        }
        
        for (e=0;e<10;e++){
            suma=suma+numeros[e]; 
        }
        System.out.println("la suma es "+suma);
    }
    
}

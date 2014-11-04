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
    private int suma=0;
  //Guardamos los numeros             
    public void setNumbers(){
        int i;
        Scanner teclado=new Scanner(System.in);
        
        for (i=0;i<10;i++){
           System.out.println("Ingrese el numero "+(i+1)+":");
           numeros[i]=teclado.nextInt();
            
        }
        
        
    }
    
    //metodo que devuelve la suma de todos los numeros agregados
    public int ReturnAddNumbers(){
        int i;
        
        for (i=0;i<10;i++){
            suma=suma+numeros[i]; 
        }
        
        return suma;
    
    }
    
    public int ReturnAverage(){
        int promedio;
        promedio=suma/10;
        return promedio;
    
     }
    
}

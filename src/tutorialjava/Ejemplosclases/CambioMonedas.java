/*
 * Programa que recibe un valor entero por teclado de cantidad de dinero en centimos que
 * se tiene en el monedero y devuelve la cantidad que hay en monedas de a dos, de a 1, etc
 */
package tutorialjava.Ejemplosclases;


/**
 *
 * @author kodenix
 */
public class CambioMonedas {
    
    int centimos = 0;
    
    public CambioMonedas(int centimos){
        this.centimos = centimos;
    }
    
    public void obtenerDinero(){
        System.out.println("Se tiene en el monedero lo equivalente a:");
        
        if (centimos>=200){
            System.out.println(centimos/200+" Moneda/s de 2 euros");
            centimos=centimos%200;
        }
        
        if (centimos>=100){
            System.out.println(centimos/100+" Moneda/s de 1 euro");
            centimos=centimos%100;
        }
        
        if (centimos>=50){
            System.out.println(centimos/50+" Moneda/s de 50 centimos");
            centimos=centimos%50;
        }
        
        if (centimos>=20){
            System.out.println(centimos/20+" Moneda/s de 20 centimos");
            centimos=centimos%20;
        }
        
        if (centimos>=10){
            System.out.println(centimos/10+" Moneda/s de 10 centimos");
            centimos=centimos%10;
        }
        
        if (centimos>=5){
            System.out.println(centimos/5+" Moneda/s de 5 centimos");
            centimos=centimos%5;
        }
        
        if (centimos>=2){
            System.out.println(centimos/2+" Moneda/s de 2 centimos");
            centimos=centimos%2;
        }
        
        if (centimos>=1){
            System.out.println(centimos/1+" Moneda/s de 1 centimos");
            centimos=centimos%1;
        }
    
    }
    
}

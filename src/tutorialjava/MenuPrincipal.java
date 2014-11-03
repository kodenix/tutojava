/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialjava;

import java.util.Scanner;
import tutorialjava.Ejemplosclases.CambioMonedas;
import tutorialjava.Ejemplosclases.DiasdelMes;
import tutorialjava.Ejemplosclases.Factorial;
import tutorialjava.schoolwork.ControlStructures;

/**
 *
 * @author kodenix
 */
public class MenuPrincipal {
    
    public void MostrarMenu(){
        System.out.println(">>>>Escoja un programa<<<<");
        System.out.println(">>>>1 - Cambio de Monedas<<<<");
        System.out.println(">>>>2 - Dias que tiene un mes");
        System.out.println(">>>>3 - Factorial");
        System.out.println("------------------------------");
        System.out.println("------------------------------");
        System.out.println(">>>>Escoja un ejercicio<<<<");
        System.out.println(">>>>4 - Suma y promedio con estructura de control<<<<");
    
    }
    //Metodo para lanzar programa que se escoja
    public void ValidarMenu(){
              
        Scanner teclado=new Scanner(System.in);
        int programa=teclado.nextInt();
     switch (programa){
            case 1:
                System.out.println(">>>>Programa Cambio de Monedas<<<<<");
                System.out.println("Introduzca la cantidad de dinero en centimos que tenga en el monedero:");
                int monedas=teclado.nextInt();
                CambioMonedas monedero=new CambioMonedas(monedas);
                monedero.obtenerDinero();
                System.out.println(">>>>  Presione cualquier tecla para continuar: <<<<<");
                teclado.nextLine();
                teclado.nextLine();
                MostrarMenu();
                ValidarMenu();
                break;
            case 2:
                System.out.println(">>>>Programa DialdelMes<<<<<");
                System.out.println("Introduzca el mes: ");
                String unmes=teclado.next();
                DiasdelMes mess=new DiasdelMes(unmes);
                System.out.println("El mes tiene: "+mess.CantidadDias());
                System.out.println(">>>>  Presione cualquier tecla para continuar: <<<<<");
                teclado.nextLine();
                teclado.nextLine();
                MostrarMenu();
                ValidarMenu();
                break;
            case 3:
                System.out.println(">>>>Programa Factorial<<<<<");
                System.out.println("Introduzca el numero para calcular factorial: ");
                double numero=teclado.nextDouble();
                Factorial fac=new Factorial();
                System.out.println("El factorial del numero es: "+fac.Factor(numero));
                System.out.println(">>>>  Presione cualquier tecla para continuar: <<<<<");
                teclado.nextLine();
                teclado.nextLine();
                MostrarMenu();
                ValidarMenu();
                break;
            case 4:
                System.out.println(">>>>Inserte 10 numeros para calcular su promedio y suma total<<<<<");
                //System.out.println("Introduzca el numero para calcular factorial: ");
                ControlStructures prog=new ControlStructures();
                prog.Calculo();
                teclado.nextLine();
                teclado.nextLine();
                MostrarMenu();
                ValidarMenu();
                break;
            default:
                System.out.println("Escojer una opcion valida");
                System.out.println(">>>>  Presione cualquier tecla para continuar: <<<<<");
                //NOta: Para que el sistema espere a presionar enter tienen que haber dos lineas como las de abajo
                teclado.nextLine();
                teclado.nextLine();
                MostrarMenu();
                ValidarMenu();
                break;
        
        
        }
    
    
    }
    
}

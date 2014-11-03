/*
 * Aqui veremos ejemplo del uso de vectores
 */
package tutorialjava.clases;

/**
 *
 * @author kodenix
 */
public class Vectores {
    /**Notas los Vectores son objetos y la forma de declararlos es la siguiente
    * int[] nombredelVector; o int nombredelVector[];
     * Para inicializar el vector es de la siguiente forma:
    *  nombredelVector = new[20];
    * Se pueden declarar e inicializar al mismo tiempo int[] nombreVector = new nombreVector[20];
    *  Al crear el vector cada uno de los elementos se inicializa por defecto a los valores de cada tipo:
    *  0 para los int, \u0000 para los Strings, false para los booleanos y Null para las referencias a objetos 
    */
    
    //Se pueden crear los elementos del Vector al mismo tiempo que se declara
    
    String[] diaSemana = {"Lunes", "Martes", "Miercoles", "Jueves"};
    
    //Matrices: se declara un vector con varios corchetes, depende de las dimensiones que necesites que sea la matriz
    
    int[][] tabla = new int[4][7]; 
    
    
    
    
    //Para saber el numero de elementos de un vector se utiliza el metodo length
    public int getLengthofVector(){
        
        return diaSemana.length;
        
    }
    
    
} 

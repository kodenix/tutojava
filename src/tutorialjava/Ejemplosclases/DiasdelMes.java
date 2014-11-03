/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialjava.Ejemplosclases;
//importo la libreria Enum para convertir un tipo de dato String al enum q tenga creado
import java.lang.Enum;
/**
 *
 * @author kodenix
 */
public class DiasdelMes {
    
    public enum Mes {Enero, Febrero, Marzo, Abril, Mayo, Junio, Julio, Agosto, Septiembre, Octubre, Noviembre, Diciembre}
    Mes mes;
    int dias;
    
    public DiasdelMes(String mes){
        //convierto el String mes en enum Mes para poder guardar su valor en la variable mes que es de tipo Mes
        this.mes=Mes.valueOf(mes);
    }
    
    //Metodo para devolver los dia que tiene el mes especificado en el programa
    public int CantidadDias(){
        switch (mes){
            case Abril:
            case Junio:
            case Septiembre:
            case Noviembre:
                dias = 30;
                break;
            case Febrero:
                dias = 28;
                break;
            default:
                dias = 31;
                break;
        }
        
        return dias;
    }
    
}

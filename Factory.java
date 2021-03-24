/**
 * Clase Factory
 * HDT#6 - Estructura de Datos
 * @author Esteban Aldana Guerra 20591
 * @author Javier Valle 20159
 */

import java.util.*;
import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Factory{

    public static Map getEscogido(int op){ //Tipo de la interfaz
        if(op==1){          
            System.out.println("Ha utilizado Hashmap");
            return new HashMap<String, String>();            
        }
        
        else if(op==2){
            System.out.println("Ha utilizado TreeMap");
            return new TreeMap<String, String>();            
        }
        
        else {
            System.out.println("Ha utilizado LinkedHashMap");
            return new LinkedHashMap<String, String>();            
        }        
    }    
    
}
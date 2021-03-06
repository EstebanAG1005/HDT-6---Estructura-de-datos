/**
 * Clase que se encargar de ejecutar los metodos descritos en el programa
 * HDT#6 - Estructura de Datos
 * @author Esteban Aldana Guerra 20591
 * @author Javier Valle 20159
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class ejecucion {
        
    Map<String, String> MapCartas;
    HashMap<String, String> listaCartas = new HashMap();         
    
    public ejecucion(int decision) {
        
        MapCartas = Factory.getEscogido(decision);                  
              
    }
       
    /**
     * Metodo que lee el archivo de texto.
     * @param archivo: La direccion del archivo.
     */
    public void abrirarchivo(String archivo) {
                        
        File f;
        FileReader fr;
        BufferedReader br;
        String postFix = "";
        int pos;
        String nombre="";
        String tipo="";
        int largo;        
        int cont = 0;
        
       //Lee el archivo de Texto
        try {

            f = new File (archivo);            
            fr = new FileReader(f);
            br = new BufferedReader(fr);      
            
            String linea;

            while( ((linea = br.readLine()) != null) ) {       
                
                cont++;
                
                largo = linea.length();
                postFix += linea;
                
                pos = linea.indexOf("|");
                nombre = linea.substring(0,pos);
                tipo = linea.substring(pos+1,largo);
                                  
                MapCartas.put(nombre, tipo);
                listaCartas.put(nombre, tipo);                
            }                           
                  
            br.close();
            fr.close();                        

        }
        catch (Exception e) {

            System.err.println("Se produjo un error: " + e);                 

        }                             
    }
    
    /**
     * Agrega una carta al mazo del usuario.
     * @param nombre: El nombre de la carta a agregar.
     * @param mazo: El mazo del ususario.
     * @return: el mazo del usuario con la carta agregada.
     */
    public ArrayList<Cartas> agregarCarta(String nombre, ArrayList<Cartas> mazo){   
        
        boolean encontrado = false;
        
        for (Map.Entry<String, String> i :  MapCartas.entrySet()) {
            
            String key = i.getKey();
            String value = i.getValue();
            
            if (nombre.equals(key)) {                
                
                Cartas temporal = new Cartas(key,value);
                
                encontrado = true;
                
                mazo.add(temporal); 
                
                MapCartas.remove(key);
                
                System.out.println("\n??La carta ya est?? agregada a tu mazo!");
                break;
                
            }       
        }

        if (!encontrado) System.err.println("\nLa carta ingresada no existe o ya est?? agregada a tu mazo");
        
        return mazo; //Retornando el mazo del usuario.
        
    }    
    
    /**
     * Muestra el tipo de carta que el usuario especifique.
     * @param nombre: El nombre de la carta.
     * @return: El tipo de carta.
     */
    public String mostrarPorTipo(String nombre) {
        
        boolean encontrado = false;
        String tipo="";
        
        for (Map.Entry<String, String> i :  listaCartas.entrySet()) {
            
            //Obteniendo las cartas que est??n en el archivo.
            String key = i.getKey(); 
            String value = i.getValue();
            
            if (nombre.equals(key)) {
                
                tipo = value;  
                encontrado = true;
                
            }                
        }
        
        if (!encontrado) {
            
            tipo = "N/A";
            System.err.println("No se encontr?? la carta.......");
            
        }
        
        return tipo;
    }
    
    /**
     * Imprime las cartas que tiene el usuario
     * @param mazo: La lista de cartas que posee el usuario.
     * @return: El string de las cartas.
     */
    public String mostrarMazo(ArrayList<Cartas> mazo) {
                
        String lista="";
        int contador = 0;
        
        if (mazo.isEmpty()) { //Si en caso el mazo est?? vac??o, entonces se dice que no hay cartas.
            
            return "Ninguna carta";
            
        } else {
        
            for (Cartas i: mazo) {

                lista += contador+1 + ". " + i.toString()+"\n";
                contador++;

            }            
        }
        
        return lista;
        
    }
    
    /**
     * Imprime el mazo del usuario
     * @param mazo: La lista tipo cartas del usuario.
     * @return: El string de las cartasa ordenadas por tipo.
     */
    public String imprimirPorTipo(ArrayList<Cartas> mazo){
        
        String lista="";
        String monstruos="";
        String hechizos="";
        String trampas="";
        
        if (mazo.isEmpty()) return "Ninguna carta"; //Si el mazo est?? vac??o, entonces se le indica que no hay cartas en el mazo. 
        
        else {
            
            //Clasificando el tipo cartas del mazo.

            for (Cartas i: mazo) {
                
                String tipo = i.getTipo();
                
                if (tipo.equals("Monstruo")) {
                    
                    monstruos += i.porTipo() + "\n";
                    
                } else if (tipo.equals("Hechizo")) {
                    
                    hechizos += i.porTipo() + "\n";                    
                    
                } else if (tipo.equals("Trampa")) {
                    
                    trampas += i.porTipo() + "\n";
                }                
            }
            
            lista = monstruos + hechizos + trampas; //Concatenando.
            
        }
       
        return lista; //Retorno con el string que posee los tipos de las cartas ordenadas por tipo.
    }
    
    /**
     * Ordena a las cartas del archivo en orden del tipo
     * @return: string de la lista de cartas.
     */

    public String imprimirCartasOrdenadas(){
        String lista = "";
        String monstruos="";
        String hechizos="";
        String trampas="";
        String tipo = "";
        String nombre = "";
        Iterator it = listaCartas.entrySet().iterator(); 
        
        while(it.hasNext()){
            
            Map.Entry e = (Map.Entry)it.next();
            nombre = (String) e.getKey();
            tipo = (String) e.getValue();

            //Ordenando las cartas por tipo y nombre. 

            if (tipo.equals("Monstruo")) {
                    
                    monstruos += tipo+ " | "+nombre+ "\n";
                    
                } else if (tipo.equals("Hechizo")) {
                    
                    hechizos += tipo+ " | "+nombre+ "\n";                    
                    
                } else if (tipo.equals("Trampa")) {
                    
                    trampas += tipo+ " | "+nombre+ "\n";
                }      
        }
        lista = monstruos + hechizos + trampas; //Concatenando. 
        return lista; //Return de la lista ordenada y concatenada.
    }
    
    /**
     * Imprime las Cartas le??das solo desde el archivo 
     */
    public void imprimirCartas(){
                        
        for (Map.Entry<String, String> i :  MapCartas.entrySet()) {
            
            String key = i.getKey();
            String value = i.getValue();
            
            System.out.println(key + " | " + value); //Impresi??n de las cartas del archivo, primero su nombre y luego el tipo.
            
        }        
    }

}
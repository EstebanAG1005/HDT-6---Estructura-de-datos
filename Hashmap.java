import java.io.*; 
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.Scanner;
 
public class Hashmap {
    HashMap<String, String> map = new HashMap<String, String>();
    HashMap<String, String> col = new HashMap<String, String>();
    HashMap<String, String> repetidos = new HashMap<String, String>();

    Scanner sc = new Scanner(System.in);

 public void hash() throws IOException{
    String filePath = "cards_desc.txt";
    String line;
    BufferedReader reader = new BufferedReader(new FileReader(filePath));
    while ((line = reader.readLine()) != null)
    {
        String[] parts = line.split("\\|", 2);
        if (parts.length >= 2)
        {
            String key = parts[0];
            String value = parts[1];
            map.put(key, value);
        } else {
            System.out.println("ignoring line: " + line);
        }
    }

    for (String key : map.keySet())
    {
        System.out.println(key + ":" + map.get(key));
    }
    reader.close();
}
public void ordenar(){
    List<Entry<String, String>> list = new ArrayList<>(map.entrySet());
		list.sort(Entry.comparingByValue());
		list.forEach(System.out::println);
}
/*public void buscar(){
    System.out.println("Que carta desea agregar a su coleccion: ");
    String busqueda = sc.nextLine();
    if(map.containsKey(busqueda)){
        col.put(busqueda + ":" + map.get(busqueda));
    }*/
/*public void contar(){
    String element = "";
    String elementTwo = "";
    
    for (HashMap.Entry<String, String> entry : map.entrySet()) 
    {
        int count = 0;
        element = entry.getValue();
        
        // extraer la cantidad de veces que existe la clave
        // si no existe la clave se retorna 0 por defecto
        int cuenta = repetidos.(element,0);
        // incrementar la cuenta
        cuenta++;
        // actualizar la cuenta para esa clave
        repetidos.putAll(element);
        
    }*/
}




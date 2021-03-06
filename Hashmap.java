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
    
} 
import java.io.*; 
import java.util.LinkedHashMap;


public class LinkedHashMaps {
    
    public void link() throws IOException{
        String filePath = "cards_desc.txt";
        LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
    
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
    }

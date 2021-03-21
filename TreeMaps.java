import java.io.*; 
import java.util.*;
import java.util.TreeMap;

public class TreeMaps {
    public void leer(String[] args) throws IOException {
        String inputfile = args[0];
        String outputfile = args[1];
    
        Map<String, Integer> map = new TreeMap<String, Integer>();
    
        Scanner scanner = new Scanner(new File(inputfile));
        while (scanner.hasNext()) {
          String word = scanner.next();
          Integer count = map.get(word);
          count = (count == null ? 1 : count + 1);
          map.put(word, count);
        }
        scanner.close();
    
        List<String> keys = new ArrayList<String>(map.keySet());
        Collections.sort( keys );
    
        PrintWriter out = new PrintWriter(new FileWriter(outputfile));
        for (String key : keys)
          out.println(key + " : " + map.get(key));
        out.close();
    }
}
     

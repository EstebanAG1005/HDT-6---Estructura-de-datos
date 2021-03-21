import java.io.*; 
import java.util.*;
import java.util.LinkedHashMap;


public class LinkedHashMaps {
    
    public void readerInstructor() throws IOException
    {
        try
        {
          BufferedReader in = new BufferedReader( new FileReader("cards_desc.txt"));
              
             Map<String, String> instructors = new LinkedHashMap<String, String>();
              
            String line;
            String[] values;
 
            while(((line = in.readLine()) != null))
            {
                line = in.readLine();
                values = line.split("|");
                String ID = values[0];
                String name = values[1];
                 
                instructors.put(ID, name);
            }
 
        }
        catch (FileNotFoundException e)
        {
      e.printStackTrace();
        }
        catch (IOException e)
        {
        e.printStackTrace();
      }
    }

}
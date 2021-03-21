
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
 
public class Hashmap {
 
   /*** Change this - replace file path ****/
   final static String filePath = "cards_desc.txt";
    
   public static void main(String[] args) {
       
       //read text file to HashMap
       Map<String, String> mapFromFile = getHashMapFromTextFile();
       
       //iterate over HashMap entries
       for(Map.Entry<String, String> entry : mapFromFile.entrySet()){
           System.out.println( entry.getKey() + " => " + entry.getValue() );
       }
       
   }
   
   public static Map<String, String> getHashMapFromTextFile(){
       
       Map<String, String> mapFileContents = new HashMap<String, String>();
       BufferedReader br = null;
       
       try{
           
           //create file object
           File file = new File(filePath);
           
           //create BufferedReader object from the File
           br = new BufferedReader( new FileReader(file) );
           
           String line = null;
           
           //read file line by line
           while ( (line = br.readLine()) != null ){
               
               //split the line by :
               String[] parts = line.split("|");
               
               //first part is name, second is age
               String carta = parts[0].trim();
               String tipo =  parts[1].trim();
               
               //put name, age in HashMap if they are not empty
               if( !carta.equals("") && !tipo.equals("") )
                   mapFileContents.put(carta, tipo);
           }
                       
       }catch(Exception e){
           e.printStackTrace();
       }finally{
           
           //Always close the BufferedReader
           if(br != null){
               try { 
                   br.close(); 
               }catch(Exception e){};
           }
       }        
       
       return mapFileContents;
       
   }
}
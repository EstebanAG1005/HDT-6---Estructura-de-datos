public class Factory <E>{
    
    
    public Hashmap getHashmaps(int resp1) {
        // seleccion de la implementacion a utilizar:
            if (resp1 == 1){
                return new Hashmap(); //regresa ArrayList
            }
            return null;
       }
    public LinkedHashMaps getLinkedHashMaps(int resp1){
        if(resp1 == 2){
            return new LinkedHashMaps();
        }
        return null;
    }
    public TreeMaps getTreeMaps(int resp1){
        if(resp1 == 3){
            return new TreeMaps();
        }
        return null;
    }
}
public class Factory <E>{
    
    
    public Hashmap getHashmaps(int op) {
        // seleccion de la implementacion a utilizar:
            if (op == 1){
                return new Hashmap(); //regresa ArrayList
            }
            return null;
       }
    public LinkedHashMaps getLinkedHashMaps(int op){
        if(op == 2){
            return new LinkedHashMaps();
        }
        return null;
    }
    public TreeMaps getTreeMaps(int op){
        if(op == 3){
            return new TreeMaps();
        }
        return null;
    }
}
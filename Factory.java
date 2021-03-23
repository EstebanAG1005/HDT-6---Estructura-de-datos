

public class Factory{

    public Hashmap getHashmaps(int op) {
        //seleccion de la implementacion a utilizar:
            if (op == 1){
                System.out.println("Ha seleccionado usar Hashmap");
                return new Hashmap(); //regresa Hashmap
            }
            return null;
       }
    public LinkedHashMaps getLinkedHashMaps(int op){
        if(op == 2){
            System.out.println("Ha seleccionado usar Treemap");
            return new LinkedHashMaps();
        }
        return null;
    }
    public TreeMaps getTreeMaps(int op){
        if(op == 3){
            System.out.println("Ha seleccionado usar LinkedHashmap");
            return new TreeMaps();
        }
        return null;
    }
}
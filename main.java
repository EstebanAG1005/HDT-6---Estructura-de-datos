import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        int op = 0;
        boolean salir = true;
        Scanner sc = new Scanner(System.in);

        
            while (salir) {

                try {
                System.out.println("Seleccione de que forma desea guardar sus datos");
                System.out.println("1. HashMap");
                System.out.println("2. TreeMap");
                System.out.println("3. LinkedHashMap");                
                System.out.println("4. Salir");
                System.out.print("Seleccione la opcion a realizar: ");
                op = sc.nextInt();

                if (op == 1){

                }
                else if(op == 2){

                }
                else if(op == 3){

                }
                else if(op == 4){

                }
                else{
                    System.out.println("Solo puede ingresar numeros del 1 al 4\n");
                }
            }
            catch (Exception e) {
                System.out.println("Solo se pueden ingresar numeros\n");
                sc.next();
            }
        }
    }
}

             
                        

                   
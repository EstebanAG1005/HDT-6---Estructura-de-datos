/**
 * Main del programa
 * HDT#6 - Estructura de Datos
 * @author Esteban Aldana Guerra 20591
 * @author Javier Valle 20159
 */

import java.util.Scanner;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        int op = 0;
        int implementacion = 0;
        boolean inicio = true; 
        boolean salir = true;
        String nombre;
        ArrayList<Cartas> mazo = new ArrayList<Cartas>();
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
                    implementacion=1;
                    break;
                }
                else if(op == 2){
                    implementacion=2;
                    break;
                }
                else if(op == 3){
                    implementacion=3;
                    break;
            
                }
                else if(op == 4){
                    salir = false;
                    System.out.println("Gracias por usar nuestro programa");
                    System.exit(0);
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
        ejecucion ej = new ejecucion(implementacion);   
        ej.abrirarchivo("./cards_desc.txt");

        while (inicio) {
            try{
            System.out.println("------------------------------------------------------");
            System.out.println("Ingrese la accion que desea realizar:\n");
            System.out.println("1. Agregar una carta a mi coleccion");
            System.out.println("2. Mostrar el tipo de una carta especifica");
            System.out.println("3. Mostrar el nombre, tipo y cantidad de cartas que tengo en mi mazo");
            System.out.println("4. Mostrar cada carta que tengo, ordenadas por tipo");
            System.out.println("5. Mostrar el nombre y tipo de todas las cartas existentes");
            System.out.println("6. Mostrar el nombre y tipo de todas las cartas existentes, ordenadas por tipo");
            System.out.println("7. Salir del programa\n");
            op = sc.nextInt();

            if (op ==1){
                System.out.print("Ingrese el nombre de la carta que desea agregar a su coleccion: ");
                nombre = sc.nextLine();
                nombre = sc.nextLine();
                mazo =ej.agregarCarta(nombre, mazo);

            }
            else if (op == 2){
                System.out.print("Ingrese el nombre de la carta a mostrar (Tipo): ");
                nombre = sc.nextLine();
                nombre = sc.nextLine();
                String tipo =ej.mostrarPorTipo(nombre);
                System.out.println("\nLa carta es de tipo: " + tipo);

            }
            else if (op == 3){
                System.out.println("Usted tiene en este momento: ");
                String lista =ej.mostrarMazo(mazo);
                
                System.out.println("\nUsted posee actualmente: \n");
                System.out.println(lista);
            }
            else if (op == 4){
                System.out.println("Usted tiene en este momento (Ordenadas Por tipo): ");
                String lista =ej.imprimirPorTipo(mazo);
                
                System.out.println("\nUsted posee actualmente: \n");
                System.out.println(lista);
            }
            else if (op == 5){
                System.out.println("Nombre y tipo de cartas existentes ");
               ej.imprimirCartas();
            }
            else if (op == 6){
                System.out.println("Nombre y tipo de cartas existentes (Ordenadas por tipo) ");
                String resultado =ej.imprimirCartasOrdenadas();
                System.out.println(resultado);
            }
            else if (op == 7){
                System.out.println("Gracias por utilizar el programa");
                inicio = false;
            }
            else{
                System.out.println("Solo puede ingresar numeros del 1 al 7\n");
            }
        }
        catch (Exception e) {
            System.out.println("Solo se pueden ingresar numeros\n");
            sc.next();
        }
    }
}
}

             
                        

                   
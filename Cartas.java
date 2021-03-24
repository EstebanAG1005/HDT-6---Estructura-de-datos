/**
 * Clase que sirve como interfaz para ejecutar los metodos
 * HDT#6 - Estructura de Datos
 * @author Esteban Aldana Guerra 20591
 * @author Javier Valle 20159
 */

public class Cartas{
 
    private String nombre;
    private String tipo;
    
    /**
     * 
     * @param nombre nombre de la carta que está en el archivo.
     * @param tipo   tipo de carta que se está recibiendo.
     */
    public Cartas(String nombre, String tipo){
        this.nombre = nombre;
        this.tipo = tipo;
    }

    /**
     * 
     * @return se devuelve el nombre de la carta.
    */
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * @param nombre nombre de la carta.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     *
     * @return devolviendo el tipo de carta que se jaló.
     */

    public String getTipo() {
        return tipo;
    }

    /**
     * 
     * @param tipo tipo de carta.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     *  uniendo el nombre y el tipo para luego imprimirlos. 
     */

    @Override
    public String toString() {
        return nombre + " | " + tipo;
    }
    
    /**
     * @return Se devuelve el tipo y el nombre de la carta del archivo. 
     */
    public String porTipo(){
        return tipo + " | " + nombre;
    }

}
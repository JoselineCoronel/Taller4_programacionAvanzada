import java.io.*;

/**
 *Clase que guarda
 */
public class Pokemon {

    /**
     *Variable tipo String para la id del pokemon
     */
    private String id;
    /**
     *Variable tipo String para el nombre del pokemon
     */
    private String nombre;
    /**
     *Variable tipo String para la etapa del pokemon
     */
    private String etapa;
    /**
     *Variable tipo String para la evolucion siguiente del pokemon
     */
    private String evolucionS;
    /**
     *Variable tipo String para la evolucion previa del pokemon
     */
    private String evolucionP;
    /**
     *Variable tipo String para el primer tipo del pokemon
     */
    private String tipo1;
    /**
     *Variable tipo String para el segundo tipo del pokemon
     */
    private String tipo2;

    /**
     * Constructor de la clase
     * @param id
     * @param nombre
     * @param etapa
     * @param evolucionS
     * @param evolucionP
     * @param tipo1
     * @param tipo2
     */
    public Pokemon(String id, String nombre, String etapa, String evolucionS, String evolucionP, String tipo1, String tipo2) {
        //
        this.id = id;
        //
        this.nombre = nombre;
        //
        this.etapa = etapa;
        //
        this.evolucionS = evolucionS;
        //
        this.evolucionP = evolucionP;
        //
        this.tipo1 = tipo1;
        //
        this.tipo2 = tipo2;
    }


    /**
     *
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @return etapa
     */
    public String getEtapa() {
        return etapa;
    }

    /**
     *
     * @return evolucion siguiente
     */
    public String getEvolucionS() {
        return evolucionS;
    }

    /**
     *
     * @return evolucion previa
     */
    public String getEvolucionP() {
        return evolucionP;
    }

    /**
     *
     * @return tipo 1
     */
    public String getTipo1() {
        return tipo1;
    }

    /**
     *
     * @return tipo 2
     */
    public String getTipo2() {
        return tipo2;
    }
}

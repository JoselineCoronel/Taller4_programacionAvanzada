import java.io.IOException;

/**
 * interface
 */
public interface Pokedex {

    /**
     *Desplegar los pokémons dado un rango de números
     * @return
     */
    public String desplegarPorRango();

    /**
     *Desplegar todos los pokémons almacenados en el sistema
     * @return
     */
    public String desplegarAlmacenados() throws IOException;

    /**
     *Desplegar los pokémons dado un tipo en particular
     * @return
     */
    public String desplegarPorTipo();

    /**
     * Desplegar todos los pokémon de primera evolución
     * @return
     */
    public String desplegarPrimeraEv();

    /**
     * Busqueda personalizada
     */
    public void busqueda();

    /**
     * Metodo que lee el archivo de texto
     * @throws IOException
     */
    public void leerTxt() throws IOException;


}

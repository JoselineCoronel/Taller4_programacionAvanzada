import ucn.StdIn;
import ucn.StdOut;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * Clase que implementa a la interface
 */
public class PokedexImpl implements Pokedex{

    public PokedexImpl() throws IOException {

        StdOut.println("**** Pokedex ****");
        StdOut.println("1-. Deplegar por rango");
        StdOut.println("2-. Desplegar pokemon almacenados");
        StdOut.println("3-. Desplegar por tipo");
        StdOut.println("4-. Desplegar primeras evoluciones");
        StdOut.println("5-. Busqueda personalizada");
        StdOut.println("Ingrese el número de opción: ");

        //variable tipo String "opcion" que guarda el valor ingresado por pantalla
        String opcion = StdIn.readString();

        switch (opcion){
            case "1" : desplegarPorRango();
                break;
            case "2" : desplegarAlmacenados();;
                break;
            case "3" : desplegarPorTipo();
                break;
            case "4": desplegarPrimeraEv();
                break;
            case "5": busqueda();
                break;
        }

    }

    /**
     * Desplegar los pokémons dado un rango de números
     * @return
     */
    @Override
    public String desplegarPorRango() {

        StdOut.println("Ingresar numero");
        StdIn.readString();


        return null;
    }

    /**
     * Desplegar todos los pokémons almacenados en el sistema
     * @return
     */
    @Override
    public String desplegarAlmacenados() throws IOException {

        leerTxt();
        return null;
    }

    /**
     *Desplegar los pokémons dado un tipo en particular
     * @return
     */
    @Override
    public String desplegarPorTipo() {
        return null;
    }

    /**
     *Desplegar todos los pokémon de primera evolución
     * @return
     */
    @Override
    public String desplegarPrimeraEv() {
        return null;
    }

    /**
     *Búsqueda personalizada
     */
    @Override
    public void busqueda() {

    }

    /**
     * Metodo que lee el archivo de texto
     * @throws IOException
     */
    @Override
    public void leerTxt()  throws IOException {

        File file = new File("src/kanto.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String st;
        while ((st = reader.readLine()) != null){
        System.out.println(st);
        }

    try {
        Scanner sc = new Scanner(file);

        List<Pokemon> pokemon = new ArrayList<Pokemon>();

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] details = line.split(",");
            String id = details[0];
            String nombre = details[1];
            String etapa = details[2];
            String evolucionS = details[3];
            String evolucionP = details[4];
            String tipo1 = details[5];
            String tipo2 = details[6];

            Pokemon p = new Pokemon(id,nombre,etapa,evolucionS,evolucionP,tipo1,tipo2);
            pokemon.add(p);

        }

        for (Pokemon p : pokemon) {
            System.out.println(p.toString());
        }

    } catch (FileNotFoundException e) {
        e.printStackTrace();

      }


    }


}

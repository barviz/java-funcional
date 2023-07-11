package forEach;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class ForEach01 {

    public static void main(String[] args) {

        List<String> recetario = new ArrayList<>();

        recetario.add("receta de empanadas");
        recetario.add("receta de pizza");
        recetario.add("receta de sopa");
        recetario.add("receta de milanesas");
        recetario.add("receta de locro");

        //se ordena la lista según la longitud de las cadenas
        recetario.sort(new Comparar02());

        //se utiliza el metodo forEach en la lista recetario
        //se pasa una instancia de la clase Consumidor01 como consumidor de elementos
        //permite realizar una operacion en c/elemento de la lista
        recetario.forEach(new Consumidor01());

        // se itera sobre la lista utilizando el método forEach() para imprimir cada receta en la consola
    }
}

//se implementa la interfaz Consumer<String>
//se requiere la implementacion del metodo accept
class Consumidor01 implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}

/*implementa la interfaz Comparator<String>
* esta nos da una implementacion del metodo compare
* que compara dos cadenas y devuelva un valor entero
* que representa el orden relativo de las cadenas*/
class Comparar02 implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if (o1.length() > o2.length()) {
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        }
        return 0;
    }
}

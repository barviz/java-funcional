package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator01 {

    public static void main(String[] args) {

        List<String> recetario = new ArrayList<>();

        recetario.add("receta de empanadas");
        recetario.add("receta de pizza");
        recetario.add("receta de sopa");
        recetario.add("receta de milanesas");
        recetario.add("receta de locro");

        //Collections.sort(recetario); //ordeno de forma alfabetica

        //se ordena la lista de acuerdo a una personalización definida en la clase Comparar
        Collections.sort(recetario, new Comparar());

        for (String receta : recetario) {
            System.out.println(receta);
        }
    }
}

/*implementa la interfaz Comparator<String>
* esta nos da una implementacion del metodo compare
* que compara dos cadenas y devuelva un valor entero
* que representa el orden relativo de las cadenas*/
class Comparar implements Comparator<String> {

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

package reference;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Reference02 {

    public static void main(String[] args) {

        List<String> recetario = new ArrayList<>();

        recetario.add("receta de empanadas");
        recetario.add("receta de pizza");
        recetario.add("receta de sopa");
        recetario.add("receta de milanesas");
        recetario.add("receta de locro");

        //se ordena la lista según la longitud de las cadenas
        //de menor a mayor utilizando una referencia de método
        //y el método estático comparingInt() de la clase Comparator
        recetario.sort(Comparator.comparingInt(String::length).reversed());

        /*recetario.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/

        /*se utiliza una referencia de método para simplificar la implementación de la interfaz funcional Consumer
        y realiza la operación de imprimir cada elemento de la lista recetario
         * */
        recetario.forEach(System.out::println);
    }

    /*implementa la interfaz Comparator<String>
     * esta nos da una implementacion del metodo compare
     * que compara dos cadenas y devuelva un valor entero
     * que representa el orden relativo de las cadenas*/
    /*static class Comparar03 implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            if (o1.length() > o2.length()) {
                return 1;
            } else if (o1.length() < o2.length()) {
                return -1;
            }
            return 0;
        }
    }*/
}

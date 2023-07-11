package lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Lambdas01 {

    public static void main(String[] args) {

        List<String> recetario = new ArrayList<>();

        recetario.add("receta de empanadas");
        recetario.add("receta de pizza");
        recetario.add("receta de sopa");
        recetario.add("receta de milanesas");
        recetario.add("receta de locro");

        //se ordena la lista según la longitud de las cadenas
        recetario.sort(new Comparar03());

        /*recetario.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/

        /*se utiliza una expresion lambda para simplificar la implementación de una interfaz funcional (Consumer<String>)
        imprime los elementos de la lista en lugar de utilizar un bucle for o el método forEach()
        con una instancia de la clase Consumidor02
         * */
        recetario.forEach(x -> System.out.println(x));
    }

    /*implementa la interfaz Comparator<String>
     * esta nos da una implementacion del metodo compare
     * que compara dos cadenas y devuelva un valor entero
     * que representa el orden relativo de las cadenas*/
    static class Comparar03 implements Comparator<String> {

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
}

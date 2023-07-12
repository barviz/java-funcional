package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class streams01 {
    public static void main(String[] args) {

        List<Receta> recetario = new ArrayList<>();

        recetario.add(new Receta("receta de empanadas", 4));
        recetario.add(new Receta("receta de pizza", 3));
        recetario.add(new Receta("receta de sopa", 1));
        recetario.add(new Receta("receta de milanesas", 2));
        recetario.add(new Receta("receta de locro", 5));

        //se ordena la lista de recetas según las horas de menor a mayor.
        recetario.sort(Comparator.comparing(Receta::getHoras));

        /*se obtiene una lista de elementos
        se filtra por determinada hora
        se itera sobre cada elemento filtrado
        y se imprime (usando una expresion lambda)
         * */
        recetario.stream().filter(x -> x.getHoras() >= 3).forEach(x -> System.out.println(x.getNombre()));

    }

    static class Receta {
        private String nombre;
        private int horas;

        public Receta(String nombre, int horas) {
            this.nombre = nombre;
            this.horas = horas;
        }

        public String getNombre() {
            return nombre;
        }

        public int getHoras() {
            return horas;
        }
    }
}

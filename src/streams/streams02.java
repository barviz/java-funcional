package streams;

import javax.swing.text.html.Option;
import java.util.*;

public class streams02 {
    public static void main(String[] args) {

        List<Receta> recetario = new ArrayList<>();

        recetario.add(new Receta("receta de empanadas", 4));
        recetario.add(new Receta("receta de pizza", 3));
        recetario.add(new Receta("receta de sopa", 1));
        recetario.add(new Receta("receta de milanesas", 2));
        recetario.add(new Receta("receta de locro", 5));

        //se ordena la lista de recetas según las horas de menor a mayor.
        recetario.sort(Comparator.comparing(Receta::getHoras));

        //mapToInt va a mapear cada objeto Receta a su número de horas y lo convierte en un IntStream
        int suma = recetario.stream().mapToInt(x -> x.getHoras()).sum();

        OptionalInt max = recetario.stream().mapToInt(x -> x.getHoras()).max();

        //allMatch verifica si todas las recetas tienen un número de horas mayor a 2
        boolean validaTodos = recetario.stream().allMatch(x -> x.getHoras() > 2);

        //filter filtran las recetas que tienen un número de horas mayor a 3
        //findFirst se usa para encontrar el primer elemento que cumple con la condición del filtro
        Optional<Receta> optionalReceta = recetario.stream().filter(x -> x.getHoras() > 3).findFirst();

        System.out.println(suma);
        System.out.println(max.getAsInt());
        System.out.println(validaTodos);

        if (optionalReceta.isPresent()){
            System.out.println(optionalReceta.get().getNombre());
        }


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

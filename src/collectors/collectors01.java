package collectors;

import java.util.*;
import java.util.stream.Collectors;

public class collectors01 {
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
        //Optional<Receta> optionalReceta = recetario.stream().filter(x -> x.getHoras() > 3).findFirst();

        /*if (optionalReceta.isPresent()) {
            System.out.println(optionalReceta.get().getNombre());
        }*/


        System.out.println(suma);
        System.out.println(max.getAsInt());
        System.out.println(validaTodos);

        //filtra las recetas y encuentra la primera que cumple con la condición
        //ifPresent se usa para imprimir la receta encontrada (se usa reference)
        recetario.stream().filter(x -> x.getHoras() > 2).findFirst().ifPresent(System.out::println);

        //si no se encuentra ninguna receta que cumpla con la condición
        // se devuelve una nueva instancia de Receta con el nombre "no existe" y 0 horas
        Receta receta = recetario.stream().filter(x -> x.getHoras() > 5).findFirst().orElse(new Receta("no existe", 0));
        System.out.println(receta);

        //se recopila las recetas filtradas en una nueva lista
        List<Receta> recetaList = recetario.stream().filter(x -> x.getHoras() > 3).collect(Collectors.toList());
        //se itera sobre cada receta e imprime
        recetaList.forEach(System.out::println);
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

        @Override
        public String toString() {
            return this.nombre.concat(" - ").concat(String.valueOf(this.getHoras()));
        }
    }

}
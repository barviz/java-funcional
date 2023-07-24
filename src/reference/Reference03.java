package reference;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Reference03 {
    public static void main(String[] args) {

        List<String> stringNumeros = Arrays.asList("1", "2", "3", "4", "5");

        //defino una variable parseInt de tipo Function<String, Integer>
        //la inicializo utilizando una referencia a un método estático Integer::parseInt
        //que toma una cadena y devuelve un entero
        Function<String, Integer> parseInt = Integer::parseInt;

        //uso stream para procesar la lista de cadenas
        //con el método map aplico la función parseInt a cada cadena en el stream
        //lo que convierte cada cadena en un número entero
        //con forEach imprimo cada número entero en la consola
        stringNumeros.stream()
                .map(parseInt)
                .forEach(System.out::println);
    }
}

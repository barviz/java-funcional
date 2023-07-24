package streams;


import java.util.Arrays;
import java.util.List;

public class Streams03 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        //uso un stream para procesar la lista de enteros
        //con mapToIn convierto cada valor Integer en un valor primitivo int
        //calculo la suma de todos los elementos (sum())
        //y lo almaceno en la variable sum
        int sum = numeros.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Suma: " + sum);
    }
}

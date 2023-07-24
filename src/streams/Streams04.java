package streams;


import java.util.Arrays;
import java.util.List;

public class Streams04 {
    public static void main(String[] args) {

        List<String> palabras = Arrays.asList("manzana", "banana", "frambueza", "uva");

        //uso un stream para procesar la lista de cadenas
        //con mapToInt convierto cada cadena en su longitud
        //String::length método de instancia de String me ayuda a obtener la longitud de cada palabra
        //con sum() calculo la suma de todas las longitudes
        //y almaceno en la variable totalLetras
        int totalLetras = palabras.stream()
                .mapToInt(String::length)
                .sum();
        System.out.println("Número total de letras: " + totalLetras);
    }
}


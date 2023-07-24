package reference;


import java.util.Arrays;
import java.util.List;

public class Reference04 {
    public static void main(String[] args) {

        List<String> frutas = Arrays.asList("Banana", "manzana", "Naranja", "frutilla", "Mango");

        //con sort para ordenar las frutas alfabéticamente
        //compareToIgnoreCase es un metodo de instancia que se utiliza para comparar dos cadenas de texto
        //ignorando las diferencias de mayúsculas y minúsculas
        frutas.sort(String::compareToIgnoreCase);

        //con forEach imprimo cada elemento de la lista ordenada en la consola
        frutas.forEach(System.out::println);
    }
}

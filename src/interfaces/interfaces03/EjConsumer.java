package interfaces.interfaces03;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//java.util.function.Consumer<T>
//representa una operación que acepta un argumento de tipo T y no devuelve ningún resultado

public class EjConsumer {

    public static void main(String[] args) {

        //se usa consumer para imprimir una cadena en mayúsculas
        Consumer<String> imprimirEnMayusc = s -> System.out.println(s.toUpperCase());

        //se aplica el consumer
        imprimirEnMayusc.accept("hola");

        List<String> lista = Arrays.asList("uno", "dos", "tres");

        Consumer<String> impresion = (s) -> System.out.println(s);
        Consumer<String> impresion2 = System.out::println;

        lista.forEach(impresion);
        lista.forEach(impresion2);

    }
}
package interfaces.interfaces03;

//java.util.function.BiConsumer<T, U>
//representa una operación que acepta dos argumentos de tipo T y U y no devuelve ningún resultado

import java.util.function.BiConsumer;

public class EjBiConsumer {

    public static void main(String[] args) {

        BiConsumer<String, Integer> cortoMinusc = (str, lgtud) -> {
            String resultado = str.substring(0, lgtud);
            System.out.println(resultado.toLowerCase());
        };

        cortoMinusc.accept("Emanuel", 3);

    }
}

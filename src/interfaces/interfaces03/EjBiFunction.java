package interfaces.interfaces03;

import java.util.function.BiFunction;

//java.util.function.BiFunction<T, U, R>
//representa una operación que acepta dos argumentos de tipo T y U y devuelve un resultado de tipo R

public class EjBiFunction {

    public static void main(String[] args) {

        //se usa BiFunction para concatenar dos cadenas
        BiFunction<String, String, String> concatenar = (s1, s2) -> s1 + s2;

        //se aplica BiFunction y se muestra el resultado
        String resultado = concatenar.apply("hola, ", "todo bien?");
        System.out.println("Concatenación: " + resultado);
    }
}
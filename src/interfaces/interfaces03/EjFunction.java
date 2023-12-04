package interfaces.interfaces03;

import java.util.function.Function;

//java.util.function.Function<T, R>
//representa una operación que acepta un argumento de tipo T y devuelve un resultado de tipo R

public class EjFunction {

    public static void main(String[] args) {

        //se usa function para duplicar un número
        Function<Integer, Integer> duplicar = num -> num * 2;

        //se aplica funtion y se muestra el resultado
        int resultado = duplicar.apply(7);
        System.out.println("el doble de 7 es: " + resultado);

        Function<Integer, String> conversorIaS = i -> Integer.toString(i);
        String resultado2 = conversorIaS.apply(91218);
        System.out.println("numero: " + resultado2);
    }
}
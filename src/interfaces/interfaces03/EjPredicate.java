package interfaces.interfaces03;

import java.util.function.Predicate;

//java.util.function.Predicate<T>
//representa una operación que acepta un argumento de tipo T y devuelve un valor boolean

public class EjPredicate {

    public static void main(String[] args) {

        //se usa predicate para verificar si un número es positivo
        Predicate<Integer> esPositivo = num -> num > 0;

        //se verifica y muestra el resultado
        System.out.println("el 5 es positivo? " + esPositivo.test(5));
        System.out.println("el -3 es positivo? " + esPositivo.test(-3));
    }
}
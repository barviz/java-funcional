package lambdas;

import java.util.function.BinaryOperator;

public class Lambdas04 {
    public static void main(String[] args) {

        double n = 5.0;

        //BinaryOperator función que realiza una operación sobre dos valores
        //y devuelve un resultado del mismo tipo que los operandos
        BinaryOperator<Double> suma = (a, b) -> a + b;
        BinaryOperator<Double> resta = (a, b) -> a - b;
        BinaryOperator<Double> multiplicacion = (a, b) -> a * b;

        //aplly se utiliza para aplicar la operación definida por la interfaz
        //T apply(T t, T u)
        System.out.println("Suma: " + suma.apply(n, 1.0));
        System.out.println("Resta: " + resta.apply(n, 4.0));
        System.out.println("Multiplicación: " + multiplicacion.apply(n, 2.0));
    }
}

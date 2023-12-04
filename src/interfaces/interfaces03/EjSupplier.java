package interfaces.interfaces03;

import java.util.function.Supplier;

//java.util.function.Supplier<T>
//representa una operación que no acepta argumentos y devuelve un resultado de tipo T

public class EjSupplier {

    public static void main(String[] args) {

        //se usa supplier para obtener un número aleatorio
        Supplier<Double> generadorAleatorio = Math::random;

        //se obtiene y muestra el número aleatorio
        double numeroAleatorio = generadorAleatorio.get();
        System.out.println("número aleatorio: " + numeroAleatorio);
    }
}
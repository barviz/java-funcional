package interfaces.interfaces02;

//cuando está presente la anotacion FunctionalInterface
//el IDE automáticamente arrojará un error si no se cumple con las reglas de una interface funcional
@FunctionalInterface
interface OperacionMatematica {

    int calcular(int a, int b);

    //metodo por defecto
    default void mostrarResultado(int resultado) {
        System.out.println("el resultado es: " + resultado);
    }
}
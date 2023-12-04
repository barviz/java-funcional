package interfaces.interfaces02;

public class Main {

    public static void main(String[] args) {

        //expresión lambda para implementar la interfaz funcional
        OperacionMatematica suma = (a, b) -> a + b;
        OperacionMatematica resta = (a, b) -> a - b;

        //metodos de la interfaz funcional

        int resultadoSuma = suma.calcular(5, 3);
        int resultadoResta = resta.calcular(8, 4);

        suma.mostrarResultado(resultadoSuma);
        resta.mostrarResultado(resultadoResta);
    }
}

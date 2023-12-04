package abstractclass.clasesAbstractas01;

public class Main {

    public static void main(String[] args) {

        Circulo circulo = new Circulo(5);
        Cuadrado cuadrado = new Cuadrado(4);

        circulo.mostrarInfo();
        System.out.println("area del círculo: " + circulo.calcularArea());

        cuadrado.mostrarInfo();
        System.out.println("area del cuadrado: " + cuadrado.calcularArea());
    }
}
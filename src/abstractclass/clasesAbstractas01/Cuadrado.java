package abstractclass.clasesAbstractas01;

public class Cuadrado extends Figura {

    double lado;

    Cuadrado(double lado) {
        this.lado = lado;
    }

    //se implementa el método abstracto
    @Override
    double calcularArea() {
        return lado * lado;
    }
}
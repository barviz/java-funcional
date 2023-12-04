package abstractclass.clasesAbstractas01;

public class Circulo extends Figura {

    double radio;

    Circulo(double radio) {
        this.radio = radio;
    }

    //se implementa el método abstracto
    @Override
    double calcularArea() {
        return Math.PI * radio * radio;
    }
}
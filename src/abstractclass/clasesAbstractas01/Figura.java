package abstractclass.clasesAbstractas01;

abstract class Figura {

    //pueden haber atributos

    //metodo abstracto que debe ser implementado por las clases hijas
    abstract double calcularArea();

    //metodo no abstracto
    void mostrarInfo() {
        System.out.println("figura");
    }
}

package abstractclass.clasesAbstractas02;

class Gato extends Animal {

    //se implementa el método abstracto
    @Override
    void hacerSonido() {
        System.out.println("maullido");
    }
}
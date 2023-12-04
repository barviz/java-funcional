package abstractclass.clasesAbstractas02;

class Perro extends Animal {

    //se implementa el método abstracto
    @Override
    void hacerSonido() {
        System.out.println("ladrido");
    }
}

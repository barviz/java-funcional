package interfaces.interfaces01;

class Pajaro implements Volador {

    //implementación del metodo abstracto
    @Override
    public void volar() {
        System.out.println("pájaro vuela");
    }

    //el método default se hereda pero se puede sobrescribir si se quiere
}

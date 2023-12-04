package interfaces.interfaces01;

public class Main {

    public static void main(String[] args) {

        Pajaro pajaro = new Pajaro();

        //se llama a un método de la interfaz
        pajaro.volar();

        //se llama a un método default de la interfaz
        pajaro.aterrizar();

        //se llama a un método estático de la interfaz
        Volador.despegar();
    }
}

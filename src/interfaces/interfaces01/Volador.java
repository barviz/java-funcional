package interfaces.interfaces01;

public interface Volador {

    //metodo abstracto
    void volar();

    //metodo default con implementación
    //(puede ser sobreescrito)
    default void aterrizar() {
        System.out.println("aterrizaje comun");
    }

    //metodo estático
    //contiene implementacion
    //depende de la interfaz, no del objeto creado
    static void despegar() {
        System.out.println("despegue comun");
    }
}
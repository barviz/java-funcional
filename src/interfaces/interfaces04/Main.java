package interfaces.interfaces04;

//cuando una expresión lambda es asignada a una interface
//está siempre va a implementar el método abstracto
//por eso solo puede existir un método abstracto y muchos defaults

public class Main {

    public static void main(String[] args) {

        Saludo saludo = (nombre) -> "holi " + nombre;

        System.out.println(saludo.saludoA("Ana"));
        System.out.println(saludo.saludo());

    }
}

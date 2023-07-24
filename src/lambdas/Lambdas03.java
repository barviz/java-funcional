package lambdas;

import java.util.ArrayList;
import java.util.List;

public class Lambdas03 {
    public static void main(String[] args) {

        List<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Ariel", 22));
        personas.add(new Persona("Beto", 15));
        personas.add(new Persona("Marcelo", 33));
        personas.add(new Persona("Enzo", 9));

        //filtro y muestro personas mayores o iguales a 18 años
        personas.stream()
                .filter(persona -> persona.getEdad() >= 18)
                .forEach(persona -> System.out.println(persona.getNombre()));
    }
}

class Persona {
    private String nombre;
    private int edad;

    public Persona(String name, int age) {
        this.nombre = name;
        this.edad = age;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}
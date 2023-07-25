package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Streams05 {

    public static void main(String[] args) {

        List<Curso> cursos = new ArrayList<>();

        cursos.add(new Curso("curso java", 6.5f, 50, 500));
        cursos.add(new Curso("curso python", 8.5f, 60, 200));
        cursos.add(new Curso("curso js", 4.5f, 70, 100));
        cursos.add(new Curso("curso android", 7.5f, 10, 60));
        cursos.add(new Curso("curso react", 1.5f, 10, 200));


        long cursosMayor5Horas = cursos.stream()
                .filter(curso -> curso.getDuracion() > 5.0f)
                .count();
        System.out.println("cantidad de cursos con duración mayor a 5 horas: " + cursosMayor5Horas);


        long cursosMenor2Horas = cursos.stream()
                .filter(curso -> curso.getDuracion() < 2.0f)
                .count();
        System.out.println("cantidad de cursos con duración menor a 2 horas: " + cursosMenor2Horas);


        List<String> cursosConMas50Videos = cursos.stream()
                .filter(curso -> curso.getVideos() > 50)
                .map(Curso::getTitulo)
                .collect(Collectors.toList());
        System.out.println("cursos con más de 50 videos: " + cursosConMas50Videos);


        //título de los 3 cursos con mayor duración
        cursos.stream()
                .sorted(Comparator.comparing(Curso::getDuracion).reversed())
                .limit(3)
                .map(Curso::getTitulo)
                .forEach(System.out::println);
    }
}

class Curso {

    private String titulo;
    private float duracion;
    private int videos;
    private int alumnos;

    public Curso(String titulo, float duracion, int videos, int alumnos) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.videos = videos;
        this.alumnos = alumnos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public int getVideos() {
        return videos;
    }

    public void setVideos(int videos) {
        this.videos = videos;
    }

    public int getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(int alumnos) {
        this.alumnos = alumnos;
    }
}

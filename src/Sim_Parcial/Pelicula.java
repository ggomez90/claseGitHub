package Sim_Parcial;

public class Pelicula extends Contenido {
	
    private String director;

    public Pelicula(String titulo, String genero, int duracion, String director) {
        super(titulo, genero, duracion);
        this.director = director;
    }

    public void verTrailer() {
        System.out.println("Viendo el tráiler de " + titulo);
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo película: " + titulo);
    }
}

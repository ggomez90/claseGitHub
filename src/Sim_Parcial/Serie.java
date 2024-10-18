package Sim_Parcial;

public class Serie extends Contenido {
	
    private int numeroTemporadas;

    public Serie(String titulo, String genero, int duracion, int numeroTemporadas) {
        super(titulo, genero, duracion);
        this.numeroTemporadas = numeroTemporadas;
    }

    public void verEpisodio(int temporada, int episodio) {
        System.out.println("Viendo episodio " + episodio + " de la temporada " + temporada + " de " + titulo);
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo serie: " + titulo);
    }
}

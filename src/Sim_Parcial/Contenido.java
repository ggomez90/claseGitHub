package Sim_Parcial;

public abstract class Contenido {
	
	//SE ACTUALIZO LA CLASE CONTENIDO!!
	
	
    protected String titulo;
    protected String genero;
    protected double duracion;

    public Contenido(String titulo, String genero, double duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public abstract void reproducir();

    public void mostrarDetalles() {
        System.out.println("Título: " + titulo + ", Género: " + genero + ", Duración: " + duracion + " minutos");
    }
}

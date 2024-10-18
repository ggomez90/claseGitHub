package Sim_Parcial;

import java.util.ArrayList;

public class Perfil {
    private String nombre;
    private int edad;
    private ArrayList<String> preferencias;
    private ArrayList<Contenido> contenidoVisto;

    public Perfil(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.preferencias = new ArrayList<>();
        this.contenidoVisto = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public ArrayList<String> getPreferencias() {
		return preferencias;
	}

	public void setPreferencias(ArrayList<String> preferencias) {
		this.preferencias = preferencias;
	}

	public ArrayList<Contenido> getContenidoVisto() {
		return contenidoVisto;
	}

	public void setContenidoVisto(ArrayList<Contenido> contenidoVisto) {
		this.contenidoVisto = contenidoVisto;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void verContenido(Contenido contenido) {
        contenidoVisto.add(contenido);
        System.out.println("Viendo: " + contenido.getTitulo());
        contenido.reproducir();
    }

    public void personalizar(ArrayList<String> nuevasPreferencias) {
        this.preferencias = nuevasPreferencias;
        System.out.println("Preferencias actualizadas.");
    }
}

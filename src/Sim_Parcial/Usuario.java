package Sim_Parcial;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
    private String nombre;
    private String email;
    private String clave;
    private Membresia membresia;
    private ArrayList<Perfil> perfiles;

    public Usuario(String nombre, String email, String clave) {
        this.nombre = nombre;
        this.email = email;
        this.clave = clave;
    }

    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public Membresia getMembresia() {
		return membresia;
	}

	public void setMembresia(Membresia membresia) {
		this.membresia = membresia;
	}

	public void setPerfiles(ArrayList<Perfil> perfiles) {
		this.perfiles = perfiles;
	}

	public void iniciarSesion() {
        System.out.println("Sesión iniciada para: " + this.nombre);
    }

    public void cerrarSesion() {
        System.out.println("Sesión cerrada para: " + this.nombre);
    }

    public void agregarPerfil(Perfil perfil) {
        this.perfiles.add(perfil);
    }

    public List<Perfil> getPerfiles() {
        return this.perfiles;
    }

    public void verPerfilUsuario() {
    	System.out.println("Datos del perfil.....");
    }
}

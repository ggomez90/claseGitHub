package TP1_2024;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
	
	public static ArrayList <Usuario> ListadoUsuarios = new ArrayList <Usuario>();
	
	private String usuario;
	private String clave;
	private Persona usuarioAsociado;
	
	public Usuario (String usuario, String clave) {
		this.usuario= usuario;
		this.clave= clave;
		this.usuarioAsociado= Empleado.extraerEmpleado();	
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public Persona getUsuarioAsociado() {
		return usuarioAsociado;
	}

	public void setUsuarioAsociado(Persona usuarioAsociado) {
		this.usuarioAsociado = usuarioAsociado;
	}
	
	public static void CrearUsuario () {
		Scanner entradaTeclado = new Scanner(System.in);
		
		System.out.println("Ingrese su usuario: ");
		String usuario = entradaTeclado.nextLine();
		System.out.println("Ingrese su clave: ");
		String clave = entradaTeclado.nextLine();
		
		Usuario nuevoUsuario = new Usuario (usuario, clave);
		ListadoUsuarios.add(nuevoUsuario);
		System.out.println("El usuario ha sido cargado.");
	}
		
	
}

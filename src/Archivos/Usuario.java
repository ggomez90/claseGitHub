package Archivos;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
	
	public static ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
	
	private String user;
	private String pass;
	private String tipo;
	private String propietario;
	
	public Usuario (String user, String pass, String tipo, String propietario)
	{
		this.user = user;
		this.pass = pass;
		this.tipo = tipo;
		this.propietario = propietario;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	
	public static void crearUsuario()
	{
		String nombre, clave, tipo, propietario;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Ingrese usuario");
		nombre = entrada.nextLine();
		System.out.println("Ingrese clave");
		clave = entrada.nextLine();
		System.out.println("Ingrese permisos");
		tipo = entrada.nextLine();
		System.out.println("Ingrese propietario");
		propietario = entrada.nextLine();
		Usuario elemento = new Usuario(nombre,clave,tipo,propietario);
		listaUsuarios.add(elemento);
	}
	
	public static void listarUsuarios()
	{
		System.out.println("\n---------------\n");
		for (Usuario elemento: listaUsuarios)
		{
			System.out.println("Usuario: " + elemento.getUser());
			System.out.println("clave: " + elemento.getPass());
			System.out.println("Permisos: " + elemento.getTipo());
			System.out.println("Propietario: " + elemento.getPropietario());
			System.out.println("\n---------------\n");
		}
	}
	
	public static void llenarLista(ArrayList<String> listaArchivo) {
		if (listaArchivo != null) {
			for (String elemento : listaArchivo) {
				String [] vectorContenido = elemento.split("[$]");
				//vectorContenido[0]=ggomez
				//vectorContenido[1]=ggomez1990
				//vectorContenido[2]=admin
				//vectorContenido[3]=guille gomez
				Usuario nuevoUsuario = new Usuario (vectorContenido[0], vectorContenido[1], vectorContenido[2], vectorContenido[3]);
				Usuario.listaUsuarios.add(nuevoUsuario);
			}
		}
	}

}

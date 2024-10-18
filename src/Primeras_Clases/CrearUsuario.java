package Primeras_Clases;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class CrearUsuario {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		String user, pass, rpass;
		boolean flag = true;
		System.out.println("Nombre de usuario: ");
		user = entrada.nextLine(); //averiguar que usuario tiene 6 o mas digitos
		try {
			User.validarUser(user);
		}
		catch (ExcepcionesPersonalizadas error) {
			flag = false;
			System.out.println("ERROR: " + error.getMessage());
			error.retornarError();
			//dar la posiblidad de reingresar
		}
		System.out.println("Clave: ");
		pass = entrada.nextLine(); //ver si la clave tiene 8 o mas digitos
		System.out.println("Repita clave: ");
		rpass = entrada.nextLine(); //verificar la pass
		try
		{
			User.validarClave(pass, rpass);
		}
		catch (ExcepcionesPersonalizadas error)
		{
			flag = false;
			System.out.println("ERROR: " + error.getMessage());
		}
		if (flag == true) {
			User nuevoUsuario = new User(user, pass);
			System.out.println("Usuario: " + user + " creado con exito!");
		}
	}

}

class User {
	
	//Todo usuario debe tener al menos 6 digitos, y la clave 8
	
	private String usuario;
	private String clave;
	
	public User (String usuario, String clave)
	{
		this.usuario = usuario;
		this.clave = clave;
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
	
	public static void validarUser(String user) throws ExcepcionesPersonalizadas
	{
		if (user.length() < 6)
		{
			throw new ExcepcionesPersonalizadas("El usuario debe contener al menos 6 caracteres.");
		}
	}
	
	public static void validarClave(String clave, String claveRep) throws ExcepcionesPersonalizadas
	{
		if (clave.length() < 8)
		{
			throw new ExcepcionesPersonalizadas("El clave debe contener al menos 8 caracteres.");
		}
		if (clave.equals(claveRep) == false)
		{
			throw new ExcepcionesPersonalizadas("Las claves ingresadas no coinciden");
		}
	}
}

//Clase de excepciones propia
class ExcepcionesPersonalizadas extends Exception {
	
	//identificador de version de clase, es unico y sirve para deserializar un objeto serializado. 
	public static final long serial = 1L;
	
	//Constructor recibe un argumento String, que será un mensaje personalizado para mostrar en el metodo getMessage()
	public ExcepcionesPersonalizadas(String mensaje)
	{
		super(mensaje);
	}
	
	public void retornarError() {
		JOptionPane.showMessageDialog(null, "SALTO LA LAUCHA!!");
	}
}

package Primeras_Clases;

import java.util.ArrayList;

public class Persona {
	
	//Atributos
	private String nombre;
	private String apellido;
	private String correo;
	private int dni;
	private String telefonoCelular;
	private String sexo;
	
	//Constructores
	public Persona(String nombre, String apellido, String correo)
	{
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
	}
	
	//public Persona() {}
	
	public Persona(String nombre, String apellido)
	{
		this.nombre = nombre;
		this.apellido = apellido;
	}

	//Metodos setters y getters
	//get = obtener. Metodo para obtener informacion del atributo
	//set = colocar. Metodo para introducir/editar informacion del atributo
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getTelefonoCelular() {
		return telefonoCelular;
	}

	public void setTelefonoCelular(String telefonoCelular) {
		this.telefonoCelular = telefonoCelular;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public void datosCompletos() {
		
	}
	
}//END CLASS PERSONA

class Alumno extends Persona{
	
	//Atributos
	private int legajo;
	private int materiasCursando;
	private int materiasAprobadas;
	private int materiasFaltantes;
	
	
	//Constructor para Alumno
	public Alumno (String nombre, String apellido, int legajo, int materiasCursando)
	{
		super(nombre, apellido);
		this.legajo = legajo;
		this.materiasCursando = materiasCursando;
	}

	//Metodos setters y getters

	public int getLegajo() {
		return legajo;
	}


	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}


	public int getMateriasCursando() {
		return materiasCursando;
	}


	public void setMateriasCursando(int materiasCursando) {
		this.materiasCursando = materiasCursando;
	}


	public int getMateriasAprobadas() {
		return materiasAprobadas;
	}


	public void setMateriasAprobadas(int materiasAprobadas) {
		this.materiasAprobadas = materiasAprobadas;
	}


	public int getMateriasFaltantes() {
		return materiasFaltantes;
	}


	public void setMateriasFaltantes(int materiasFaltantes) {
		this.materiasFaltantes = materiasFaltantes;
	}

}//END CLASS ALUMNO


class Docente extends Persona{
	
	//Atributos
	private double horasCatedra;
	private double sueldo;
	
	//Constructor
	public Docente (String nombre, String apellido, String correo, double horasCatedra, double sueldo)
	{
		super(nombre, apellido, correo);
		this.horasCatedra = horasCatedra;
		this.sueldo = sueldo;
	}

	//Setters y getters
	public double getHorasCatedra() {
		return horasCatedra;
	}

	public void setHorasCatedra(double horasCatedra) {
		this.horasCatedra = horasCatedra;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	public void PromedioHora() {
		System.out.println("Este vivo gana: $" + (this.getSueldo() / (this.getHorasCatedra()*4)));
	}
	
}//END CLASS DOCENTE

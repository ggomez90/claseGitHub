package TP1_2024;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Empleado extends Persona{
	
	//ATRIBUTO ESTATICO DE LA CLASE EMPLEADO
	public static ArrayList <Empleado> ListadoPersonal = new ArrayList <Empleado>();
	
	//ATRIBUTOS
	private String horarios;
	private LocalDate fechaIngreso;
	
	//METODOS CONSTRUCTORES
	public Empleado (String nombre, String apellido, int dni, boolean permisoAdm, String cargo, String telefono, String direccion, double sueldo) {
	super(nombre, apellido, dni, permisoAdm, cargo,telefono,direccion, sueldo);
	}
	public Empleado (String nombre, String apellido, int dni, boolean permisoAdm, String cargo,String horarios, LocalDate fechaIngreso ) {
		super(nombre, apellido, dni, permisoAdm, cargo);
		this.horarios=horarios;
		this.fechaIngreso= fechaIngreso;
	}
	public Empleado (String nombre, String apellido, int dni, boolean permisoAdm, String cargo, String telefono, String horarios, LocalDate fechaIngreso) {
		super(nombre, apellido, dni, permisoAdm, cargo,telefono);
		this.horarios=horarios;
		this.fechaIngreso= fechaIngreso;
	}
	public Empleado (String nombre, String apellido, int dni, boolean permisoAdm, String cargo, String telefono, String direccion,String horarios, LocalDate fechaIngreso) {
		super(nombre, apellido, dni, permisoAdm, cargo,telefono,direccion);
		this.horarios=horarios;
		this.fechaIngreso= fechaIngreso;
	}
	public Empleado (String nombre, String apellido, int dni, boolean permisoAdm, String cargo,double sueldo, String direccion, String horarios, LocalDate fechaIngreso) {
		super(nombre, apellido, dni, permisoAdm, cargo,sueldo, direccion);
		this.horarios=horarios;
		this.fechaIngreso= fechaIngreso;
	}
	public Empleado (String nombre, String apellido, int dni, boolean permisoAdm, String cargo,String telefono, double sueldo,String horarios, LocalDate fechaIngreso) {
		super(nombre, apellido, dni, permisoAdm, cargo,telefono,sueldo);
		this.horarios=horarios;
		this.fechaIngreso= fechaIngreso;
	}
	public Empleado (String nombre, String apellido, int dni, String cargo, boolean permisoAdm, String direccion,String horarios, LocalDate fechaIngreso ) {
		super(nombre, apellido, dni, cargo, permisoAdm,direccion);
		this.horarios=horarios;
		this.fechaIngreso= fechaIngreso;
	}
	public Empleado (String nombre, String apellido, int dni, boolean permisoAdm, String cargo, double sueldo,String horarios, LocalDate fechaIngreso) {
		super(nombre, apellido, dni, permisoAdm, cargo,sueldo);
		this.horarios=horarios;
		this.fechaIngreso= fechaIngreso;	
	}
	
	//METODOS SETTERS Y GETTERS
	public String getHorarios() {
		return horarios;
	}
	public void setHorarios(String horarios) {
		this.horarios = horarios;
	}
	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
	
	public static void CrearEmpleado () {
		Scanner entradaTeclado = new Scanner(System.in);
		
		System.out.print("Ingrese su nombre: ");
		String nombre = entradaTeclado.nextLine();
		System.out.print("Ingrese su apellido: ");
		String apellido = entradaTeclado.nextLine();
		System.out.print("Ingrese su horario: ");
		String horario = entradaTeclado.nextLine();
		System.out.print("Ingrese su cargo: ");
		String cargo = entradaTeclado.nextLine();
		System.out.print("Ingrese su dni: ");
		int dni = entradaTeclado.nextInt();
		
		int aux;
		boolean admin;
		do {
			System.out.print("Es admin 1-SI 2-NO: ");
			aux= entradaTeclado.nextInt();
		}while(aux<1 || aux>2);
		if(aux==1) {
			admin=true;
		}
		else {
			admin=false;
		}
		
		LocalDate fecha = LocalDate.now();
		
		Empleado nuevoEmpleado = new Empleado(nombre, apellido, dni, admin, cargo, horario, fecha);
		ListadoPersonal.add(nuevoEmpleado);
		Persona.ListadoPersona(nuevoEmpleado);
		System.out.print("El esclavo ha sido cargado.");
	}
	public static void mostrarEmpleados (){
		System.out.println("Su nombre es: "+ ListadoPersonal.get(0).getNombre());
		System.out.println("Su apellido es: "+ ListadoPersonal.get(0).getApellido());
		System.out.println("Su horario es: "+ ListadoPersonal.get(0).getHorarios());
		System.out.println("Su cargo es: "+ ListadoPersonal.get(0).getCargo());
		System.out.println("Su dni es: "+ ListadoPersonal.get(0).getDni());
		
		if(ListadoPersonal.get(0).getPermisoAdm()) {
			System.out.println("Tienes permisos de Administrador");
		}
	}
	
	public static Empleado extraerEmpleado () {
		//mostrar la lista de empleado
		//dar opciones, posibilidad de seleccionar un empleado
		//retornar el empleado seleccionado
		return ListadoPersonal.get(0);
	}
	
	public void mostrarDatos() {
		super.mostrarDatos();
		System.out.println("Horarios: " + this.getHorarios());
		System.out.println("Fecha ingreso: " + this.getFechaIngreso());
	}
	
	public void actualizarDatos() {
		super.actualizarDatos();
		Scanner entradaTeclado = new Scanner(System.in);
		System.out.println("INGRESE HORARIO ");
		String horario = entradaTeclado.nextLine();
		this.setHorarios(horario);
		this.setFechaIngreso(MetodosGeneral.crearFecha("crear fecha de ingreso"));
	}

	public void beneficios() {
		System.out.println("Cobra sus haberes el 5to dia habil de cada mes.");
	}
	
	
}

	

package TP1_2024;

import java.util.ArrayList;

public class Administrador extends Persona implements Reclamo{
	public static ArrayList <Administrador> ListadoAdmin = new ArrayList <Administrador>();
	
	//ATRIBUTO
	private ArrayList <Empleado> EmpleadosCargo = new ArrayList<Empleado>();
	
	//METODOS CONSTRUCTORES
	public Administrador (String nombre, String apellido, int dni, boolean permisoAdm, String cargo) {
		super(nombre, apellido, dni, permisoAdm, cargo);
	}
	public Administrador (String nombre, String apellido, int dni, boolean permisoAdm, String cargo, String telefono, String direccion, double sueldo) {
		super(nombre, apellido, dni, permisoAdm, cargo,telefono,direccion, sueldo);
	}
	public Administrador (String nombre, String apellido, int dni, boolean permisoAdm, String cargo, String telefono) {
		super(nombre, apellido, dni, permisoAdm, cargo,telefono);
	}
	public Administrador (String nombre, String apellido, int dni, boolean permisoAdm, String cargo, String telefono, String direccion) {
		super(nombre, apellido, dni, permisoAdm, cargo,telefono,direccion);
	}
	public Administrador (String nombre, String apellido, int dni, boolean permisoAdm, String cargo, double sueldo, String direccion) {
		super(nombre, apellido, dni, permisoAdm, cargo, sueldo, direccion);
	}
	public Administrador (String nombre, String apellido, int dni, boolean permisoAdm, String cargo, String telefono, double sueldo) {
		super(nombre, apellido, dni, permisoAdm, cargo,telefono,sueldo);
	}
	public Administrador (String nombre, String apellido, int dni,String cargo, boolean permisoAdm, String direccion) {
		super(nombre, apellido, dni,cargo, permisoAdm, direccion);
	}
	public Administrador (String nombre, String apellido, int dni, boolean permisoAdm, String cargo, double sueldo) {
		super(nombre, apellido, dni, permisoAdm, cargo,sueldo);
	}

	public void agregarEmpleado (Empleado nuevoEmpleado) {
		this.EmpleadosCargo.add(nuevoEmpleado);
	}
	
	
	public void mostrarDatos() {
		super.mostrarDatos();
		if(this.EmpleadosCargo.isEmpty()) {
			System.out.println("No tiene empleado a cargo");
		}else {
			System.out.println("Tiene empleado a cargo");
			for (Empleado elemento : this.EmpleadosCargo) {
				elemento.mostrarDatos();
				System.out.println("---------------------");
			}
		}
	}
	@Override
	public void beneficios() {
		System.out.println("Cobra su sueldo el primer dia habil de cada mes.");
		System.out.println("Tiene descuento del 5% en la compra de cualquier producto.");
		System.out.println("Tiene actualizaciones de sueldo cada 3 meses.");
	}
	@Override
	public void generarReclamo(String mensaje) {
		System.out.println("Me llego el siguiente reclamo: " + mensaje);
	}
	
}


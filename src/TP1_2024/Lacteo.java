package TP1_2024;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import Archivos.Usuario;

public class Lacteo extends Producto implements ProductoVencido{
	public static ArrayList <Lacteo> ListadoLacteos= new ArrayList <Lacteo>();
	private static int contadorCodigo = 1;
	
	public LocalDate getFechaVto() {
		return fechaVto;
	}

	public void setFechaVto(LocalDate fechaVto) {
		this.fechaVto = fechaVto;
	}

	public String isRequiereFrio() {
		if(this.requiereFrio) {
			return "Si";
		} else {
			return "No";
		}
	}

	public void setRequiereFrio(boolean requiereFrio) {
		this.requiereFrio = requiereFrio;
	}

	private LocalDate fechaVto;
	private boolean requiereFrio;
	
	public Lacteo (String nombre, double precio, int stock) {
		super(nombre,precio,stock,Categoria.LACTEO);
		this.fechaVto= MetodosGeneral.crearFecha("Vto del producto");
		this.requiereFrio= necesitaFrio();
		this.setCodigo("LA"+contadorCodigo);
		contadorCodigo++;
	}
	
	public Lacteo(String nombre, double precio, int stock, LocalDate fecha, boolean frio) {
		super(nombre,precio,stock, Categoria.LACTEO);
		this.setCodigo("LA"+contadorCodigo);
		this.setFechaVto(fecha);
		this.setRequiereFrio(frio);
		contadorCodigo++;
	}
	
	private boolean necesitaFrio (){
		int aux;
		Scanner entradaTeclado = new Scanner(System.in);
		do {
			System.out.print("El producto requiere de frio 1-SI 2-NO ");
			aux = entradaTeclado.nextInt();
		}while(aux<1 || aux>2);
		if(aux==1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void crearLacteo () {
		String nombre, precio, stock;
		double precioAux=0;
		int stockAux=0;
		boolean flag = false;
		Scanner entradaTeclado= new Scanner(System.in);
		System.out.println("Ingrese el nombre: ");
		nombre = entradaTeclado.nextLine();
		do{
			System.out.println("Ingrese el precio: ");
			precio = entradaTeclado.nextLine();
			if (Excepciones.verificarDecimal(precio)) {
				precioAux = Double.parseDouble(precio);
				if (precioAux > 0) {
					flag = true;
				}
			} else if(flag==false){
				System.out.println("Verifique el dato ingresado.");
			}
		}while(flag==false);
		flag = false;
		do{
			System.out.println("Ingrese el stock: ");
			stock = entradaTeclado.nextLine();
			if (Excepciones.verificarEntero(stock)) {
				stockAux = Integer.parseInt(stock);
				flag = true;
			} else {
				System.out.println("Verifique el dato ingresado.");
			}
		}while(flag==false);
		
		Lacteo nuevoLacteo = new Lacteo(nombre,precioAux,stockAux);
		//tenemos un nuevo objeto de tipo lacteo llamado nuevoLacteo
		ListadoLacteos.add(nuevoLacteo);
		System.out.println("El producto ha sido creado con exito.");
	}
	
	public static void mostrarListadoLacteos () {
		for  (Lacteo elemento: ListadoLacteos) {
			System.out.println("Categoria: "+ Categoria.LACTEO.toString());
			System.out.println("Codigo: "+ elemento.getCodigo());
			System.out.println("Nombre: "+ elemento.getNombre());
			System.out.println("Precio: "+ elemento.getPrecio());
			System.out.println("Stock: "+ elemento.getStock());
			System.out.println("FechaVto: "+ elemento.getFechaVto().toString());
			System.out.println("Requiere frio: "+ elemento.isRequiereFrio());
			System.out.println("-----------------------");		
		}
	}
	
	private static LocalDate crearFecha (int anio, int mes, int dia) {
		return LocalDate.of(anio, mes, dia);
	}
	
	public static void cargarLacteos (ArrayList <String> listaAux) {
		if(listaAux.isEmpty() == false) {
			for(String elemento : listaAux) {
				String vectorAux [] = elemento.split("[$]");
				
				String nombre = vectorAux [0];
				String precio = vectorAux [1];
				String stock = vectorAux [2];
				
				String fecha = vectorAux [3]; //2024-09-30
				String fechaAux [] = vectorAux[3].split("[-]");
				int anio = Integer.parseInt(fechaAux[0]);
				int mes = Integer.parseInt(fechaAux[1]);
				int dia = Integer.parseInt(fechaAux[2]);
				LocalDate Fecha = crearFecha(anio, mes, dia);
			
				boolean frio = Boolean.parseBoolean(vectorAux[4]);
				
				Lacteo nuevoLacteo = new Lacteo(nombre, Double.parseDouble(precio), Integer.parseInt(stock), Fecha, frio);
				ListadoLacteos.add(nuevoLacteo);
			}
		}
	}
	
	public static Lacteo buscarLacteo (String codigo) {
		codigo = codigo.toUpperCase();
		for (Lacteo elemento : ListadoLacteos) {
			if(elemento.getCodigo().equals(codigo)) {
				return elemento;
			}
		}
		return null;
	}
	
	public static void mostrarLacteo (Lacteo elemento) {
		if(elemento != null) {
			System.out.println("Lacteo:");
			System.out.println("Codigo: "+ elemento.getCodigo());
			System.out.println("Nombre: "+ elemento.getNombre());
			System.out.println("Precio: "+ elemento.getPrecio());
			System.out.println("Stock: "+ elemento.getStock());
			System.out.println("FechaVto: "+ elemento.getFechaVto().toString());
			System.out.println("Requiere frio: "+ elemento.isRequiereFrio());
			System.out.println("Categoria: "+ Categoria.LACTEO.toString());
			System.out.println("-----------------------");	
		} else {
			System.out.println("ERROR: el lacteo no fue encontrado.");
		}
	}
	
	public String estaPorVencer() {
		return "OJO esta por vencer";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	private static LocalDate crearFecha (int anio, int mes, int dia) {
		return LocalDate.of(anio, mes,dia);
	}
	
	public static void llenarListaLacteo(ArrayList<String> listaArchivo) {
		if (!listaArchivo.isEmpty()) {
			for (String elemento : listaArchivo) {
				String [] vectorContenido = elemento.split("[$]");
				//vectorContenido[0]="yogurt"
				//vectorContenido[1]="1500.0" - pasar a double
				//vectorContenido[2]="10" - pasar a int
				//vectorContenido[3]="2024-09-30" pasar a LocalDate
				//vectorContenido[4]="true" - pasar a boolean
				double precio = Double.parseDouble(vectorContenido[1]);
				int stock = Integer.parseInt(vectorContenido[2]);
				boolean frio = Boolean.parseBoolean(vectorContenido[4]);
				String [] vectorFecha = vectorContenido[3].split("[-]");
				//vectorFecha[0]="2024" - pasar a int para año
				//vectorFecha[1]="09" - pasar a int para mes
				//vectorFecha[2]="30" - pasar a int para dia
				int anio = Integer.parseInt(vectorFecha[0]);
				int mes = Integer.parseInt(vectorFecha[1]);
				int dia = Integer.parseInt(vectorFecha[2]);
				LocalDate fecha = crearFecha(anio, mes, dia);
				Lacteo nuevoLacteo = new Lacteo(vectorContenido[0], precio, stock, fecha, frio);
				ListadoLacteos.add(nuevoLacteo);
			}
		}
	}*/
}

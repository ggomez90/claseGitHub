package TP1_2024;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class PruebasTP {
	
	public static ArrayList <String> listaFrases = new ArrayList<String>();
	
	public static void main(String[] args) {
		
		//Archivo.crearCarpeta("PRODUCTOS");
		//Archivo.crearArchivoTXT("PRODUCTOS" + File.separator + "Lacteos.txt");
//		for (int i = 0; i<3; i++) {
//			Lacteo.crearLacteo();
//		}
		//1 yogurt 1500 10 30/09/2024 si
		
//		System.out.println("\n\n\n");
//		
//		Lacteo.mostrarListadoLacteos();
//		
//		System.out.println("\n\n\n");
		
		
//		PrintWriter imprimir = null;
//		try {
//			imprimir = Archivo.abrirArchivoEscritura("PRODUCTOS" + File.separator + "Lacteos.txt");
//		} catch (IOException error) {
//			System.out.println("ERROR: " + error.getMessage());
//		}
//		if (imprimir != null) {
//			for (Lacteo elemento: Lacteo.ListadoLacteos) {
//				String contenido = elemento.getNombre()+"$"+elemento.getPrecio()+"$"+elemento.getStock()+"$"+elemento.getFechaVto().toString()+"$"+elemento.isRequiereFrio()+ "$" + Categoria.LACTEO;
//				//yogurt$1500$10$30-09-2024$true$LACTEO
//				Archivo.escribirArchivo(imprimir, contenido);
//			}
//			Archivo.cerrarArchivo(imprimir);
//		}
		
//		BufferedReader leyendo = null;
//		ArrayList <String> listaAux = new ArrayList <String> ();
//		try {
//			leyendo = Archivo.abrirArchivoLectura("PRODUCTOS" + File.separator + "Lacteos.txt");
//		} catch (IOException error){
//			System.out.println("ERROR: " + error.getMessage());
//		}
//		if(leyendo != null) {
//			try{
//				listaAux = Archivo.leerArchivos(leyendo);
//			} catch (IOException error) {
//				System.out.println("ERROR: " + error.getMessage());
//			}
//			
//			try {
//				Archivo.cerrarConexionLecturas(leyendo);
//			} catch (IOException error) {
//				System.out.println("ERROR: " + error.getMessage());
//			} 
//		}
//		
//		Lacteo.cargarLacteos(listaAux);
//		
//		Lacteo.mostrarListadoLacteos();
////		
//		Scanner teclado= new Scanner(System.in);
//		String codigo;
//		
//		System.out.println("Ingrese un codigo para buscar un lacteo: ");
//		codigo = teclado.nextLine();
//		Lacteo.mostrarLacteo(Lacteo.buscarLacteo(codigo));
//		
//		System.out.println("Ingrese un codigo para buscar un lacteo: ");
//		codigo = teclado.nextLine();
//		Lacteo.mostrarLacteo(Lacteo.buscarLacteo(codigo));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		BufferedReader lectura = null;
//		try {
//			lectura = Archivo.abrirConexionLectura("PRODUCTOS" + File.separator + "Lacteos.txt");
//		} catch (FileNotFoundException error) {
//			System.out.println("ERROR: " + error.getMessage());
//		}
//		
//		ArrayList<String> listaAux = Archivo.leerArchivo(lectura);
//		
//		Archivo.cerrarConexionLecutra(lectura);
//		
//		Lacteo.llenarListaLacteo(listaAux);
//		
//		Lacteo.mostrarListadoLacteos();
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//HashMap <Integer, String> miDiccionario = new HashMap<>();
		
		
//		LocalDate fechaIngreso = LocalDate.now();
//		
//		Empleado unEmpleado = new Empleado("Guillermo", "Gomez", 35750818, true, "El boliviano", "Full time 24hs los 365 dias del año", fechaIngreso);
//		
//		unEmpleado.mostrarDatos("Este es el empleado del año");
		
		
		
		
//		Empleado.CrearEmpleado();
//		Empleado.mostrarEmpleados();	
//		int cantidad;
//		String codigo;
//		Scanner entradaTeclado= new Scanner(System.in);
//		System.out.println("Ingrese la cantidad de productos a crear: ");
//		cantidad = entradaTeclado.nextInt();
//		for(int i=0; i<cantidad;i++) {
//			Limpieza.crearProdLimpieza();
//		}
//		entradaTeclado.nextLine();
//		Limpieza.mostrarListadoLimipieza();
//		System.out.println("Ingrese el codigo a buscar: ");
//		codigo = entradaTeclado.nextLine();
//		
//		Producto.buscarProdCodigo(codigo.toUpperCase());
//		System.out.println("Ingrese el codigo a buscar: ");
//		codigo = entradaTeclado.nextLine();
//		Producto.buscarProdCodigo(codigo.toUpperCase());
		
		
		//USO DE LISTA
//		int aux = listaFrases.size();
//		//System.out.println("La lista contiene: " + aux + " elementos.");
//		
//		listaFrases.add("Estamos en clase");
//		listaFrases.add("hoy NO salimos temprano");
//		listaFrases.add("Es viernes");
//		
//		aux = listaFrases.size();
//		//System.out.println("La lista contiene: " + aux + " elementos.");
//		
//		listaFrases.add("Juanchi poneteeee las pilassss");
//		listaFrases.add("El martes 2 de sep hay parcial");
//		
//		aux = listaFrases.size();
		//System.out.println("La lista contiene: " + aux + " elementos.");
		
//		for (int i=0; i<aux; i++)
//		{
//			System.out.println("Este es el elemento: " + i);
//			System.out.println(listaFrases.get(i));
//			System.out.println("----------------------");
//		}
		
//		for(String elemento : listaFrases) {
//			System.out.println(elemento);
//		}
		
//		Iterator <String> indice = listaFrases.iterator();
//		while (indice.hasNext()) {
//			String elemento = indice.next();
//			System.out.println(elemento);
//		}
		
		
		//USO DE PILA
		
//		Stack <String> miPila = new Stack <String> ();
//		
//		miPila.push("Estamos en clase");
//		miPila.push("Hoy NO salimos temprano");
//		miPila.push("A la profe de ingles le tienen miedo");
//		miPila.push("juanchi ponete las stack!!");
//		miPila.push("que se yo");
//		System.out.println("La pila contiene: " + miPila.size() + " elementos.");
//		if (miPila.isEmpty() == true)
//		{
//			System.out.println("La pila esta vacia");
//		}
//		else
//		{
//			System.out.println("La pila contiene: " + miPila.size() + " elementos.");
//		}
		
//		System.out.println(miPila.pop());
//		
//		System.out.println("La pila contiene: " + miPila.size() + " elementos.");
		
		
		
		
		
	}
}

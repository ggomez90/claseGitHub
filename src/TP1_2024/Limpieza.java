package TP1_2024;

import java.util.ArrayList;
import java.util.Scanner;

public class Limpieza extends Producto {
	public static ArrayList <Limpieza> ListaLimpieza = new ArrayList <Limpieza> ();
	private static int contadorCodigo = 1;
	
	private boolean isToxic;
	
	public Limpieza (String nombre, double precio, int stock) {
		super(nombre, precio, stock, Categoria.LIMPIEZA);
		this.isToxic= esToxico();
		this.setCodigo("LI"+contadorCodigo);
		contadorCodigo++;
	}
	
	private boolean esToxico (){
		int aux;
		Scanner entradaTeclado= new Scanner(System.in);
		do {
			System.out.print("Es toxico 1-SI 2-NO ");
			
			aux= entradaTeclado.nextInt();
		}while(aux<1 || aux>2);
		if(aux==1) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void crearProdLimpieza () {
		String nombre;
		double precio;
		int stock;
		
		Scanner entradaTeclado= new Scanner(System.in);
		System.out.print("Ingrese el nombre: ");
		nombre = entradaTeclado.nextLine();
		System.out.print("Ingrese el precio: ");
		precio = entradaTeclado.nextDouble();
		entradaTeclado.nextLine();
		System.out.print("Ingrese el stock: ");
		stock = entradaTeclado.nextInt();
		
		Limpieza nuevoProdLimpieza = new Limpieza(nombre,precio,stock);
		ListaLimpieza.add(nuevoProdLimpieza);
		Producto.ListaProductos.add(nuevoProdLimpieza);
		
		System.out.println("El producto ha sido creado con exito.");
	}
	public static void mostrarListadoLimipieza () {
		System.out.println("Listado de Limpieza: ");
		for  (Limpieza elemento: ListaLimpieza) {
			System.out.println("Codigo: "+ elemento.getCodigo());
			System.out.println("Nombre: "+ elemento.getNombre());
			System.out.println("Precio: "+ elemento.getPrecio());
			System.out.println("Stock: "+ elemento.getStock());
			System.out.println("-----------------------");
		}
	}
	
	public static void buscarProdCodigo (String codigo) {
		
	}
	
}

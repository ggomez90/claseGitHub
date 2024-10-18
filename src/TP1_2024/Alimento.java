package TP1_2024;

import java.util.ArrayList;
import java.util.Scanner;

public class Alimento extends Producto {
	public static ArrayList <Alimento> ListaAlimentos = new ArrayList <Alimento>();
	private static int contadorCodigo = 1;
	private boolean contieneTAC;
	
	public Alimento (String nombre, double precio, int stock) {
		super(nombre,precio,stock, Categoria.ALIMENTO);
		this.contieneTAC= tieneTAC("Contiene TAC??");
		this.setCodigo("AL"+contadorCodigo);
		contadorCodigo++;
	}
	
	private boolean tieneTAC (String mensaje){
		int aux;
		Scanner entradaTeclado= new Scanner(System.in);
		do {
			System.out.print(mensaje);
			aux= entradaTeclado.nextInt();
		}while(aux<1 || aux>2);
		if(aux==1) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void crearAlimentos() {
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
		
		Alimento nuevoAlimento = new Alimento(nombre,precio,stock);
		ListaAlimentos.add(nuevoAlimento);
		System.out.println("El producto ha sido creado con exito.");
	}
	public static void mostrarListaAlimentos () {
		System.out.println("Listado de Lacteos: ");
		for  (Alimento elemento: ListaAlimentos) {
			System.out.println("Codigo: "+ elemento.getCodigo());
			System.out.println("Nombre: "+ elemento.getNombre());
			System.out.println("Precio: "+ elemento.getPrecio());
			System.out.println("Stock: "+ elemento.getStock());
			System.out.println("-----------------------");
		}
	}
}

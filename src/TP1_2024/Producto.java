package TP1_2024;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public abstract class Producto {
	
	public static ArrayList <Producto> ListaProductos = new ArrayList <Producto>();
	
	//ATRIBUTOS
	private String nombre;
	private String codigo;
	private double precio;
	private int stock;
	private Categoria categoria;
	
	
	//CONSTRUCTOR
	public Producto (String nombre, double precio, int stock, Categoria categoria) {
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
		this.categoria = categoria;
	}
	
	public Producto() {
		
	}

	//SETTERS Y GETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	public void controlarStock() {
		if (this.getStock() < 10) {
			JOptionPane.showMessageDialog(null,"El numero de Stock es menor a 10");
		}
	}
	
	public void modificiarPrecio() {
		double aux;
		Scanner entradaTeclado = new Scanner(System.in);
		do {
		System.out.println("Ingrese el nuevo valor del producto: ");
		aux = entradaTeclado.nextDouble();
		}while (aux<0);
		this.setPrecio(precio);
	}
	
	public void modificarSegunPorcentaje () {
		Scanner entradaTeclado = new Scanner(System.in);
		int aux,aux1,aux2;
		System.out.println("El precio acutal del Producto es: "+ this.getPrecio());	
		System.out.println("1 para incrementar 2 para decrementar 0 salir: ");
		do {
		aux = entradaTeclado.nextInt();
		
		}while(aux<0 || aux>2);
		if (aux==1) {
			System.out.println("Ingrese el porcentaje a incrementar: ");
			aux1= entradaTeclado.nextInt();
			double nuevoPrecio = this.getPrecio()*aux1/100+this.getPrecio();
			nuevoPrecio = Math.ceil(nuevoPrecio); 
			System.out.println("El precio final seria: "+ nuevoPrecio);
			System.out.println("Esta seguro de que desea modificar el precio 1-SI 2-NO");
			aux2= entradaTeclado.nextInt();
			if(aux2== 1) {
				this.setPrecio(nuevoPrecio);
				JOptionPane.showMessageDialog(null,"El precio fue modificado con exito");
			}
		}
		else if(aux==2) {
			System.out.println("Ingrese el porcentaje a decrementar: ");
			aux1= entradaTeclado.nextInt();
			double nuevoPrecio = this.getPrecio()-this.getPrecio()*aux1/100;
			nuevoPrecio = Math.ceil(nuevoPrecio); 
			System.out.println("El precio final seria: "+ nuevoPrecio);
			System.out.println("Esta seguro de que desea modificar el precio 1-SI 2-NO");
			aux2= entradaTeclado.nextInt();
			if(aux2== 1) {
				this.setPrecio(nuevoPrecio);
				JOptionPane.showMessageDialog(null,"El precio fue modificado con exito");
			}
		}
		}
		public static void buscarProdCodigo (String codigo) {
			boolean flag=false;
			for(int i=0; i< ListaProductos.size();i++) {
				if(ListaProductos.get(i).getCodigo().equals(codigo)) {
					System.out.println("Codigo: "+ListaProductos.get(i).getCodigo());
					System.out.println("Nombre: "+ListaProductos.get(i).getNombre());
					System.out.println("Precio: "+ListaProductos.get(i).getPrecio());
					System.out.println("Stock: "+ListaProductos.get(i).getStock());
					flag=true;
					}
			}
				if(flag==false) {
				System.out.println("El producto no fue encontrado.");
				}
		}
		 
	}
	

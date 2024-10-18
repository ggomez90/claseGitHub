package Sim_Parcial;

import java.time.LocalDate;
import java.util.Scanner;

public class Utilidades {

	public static LocalDate crearFecha (String mensaje) {
		System.out.println(mensaje);
		String dia=null,mes=null,año=null;
		int diaAux=0,mesAux=0,añoAux=0;
		
		diaAux = castearEntero("Ingrese el dia: ", dia);
		mesAux = castearEntero("Ingrese el mes: ", mes);
		añoAux = castearEntero("Ingrese el año: ", año);
		
		LocalDate aux = LocalDate.of(añoAux, mesAux, diaAux);
		return aux;
	}
	
	public static int castearEntero (String mensaje, String dato) {
		int num = 0;
		boolean flag = true;
		Scanner entradaTeclado= new Scanner(System.in);
		
		do {
			System.out.print(mensaje);
			dato = entradaTeclado.nextLine();
			if(verificarEntero(dato)) {
				num = Integer.parseInt(dato);
				flag = true;
			} else {
				flag = false;
			}
		}while(flag == false);
		
		return num;
	}
	
	public static double castearDecimal (String mensaje, String dato) {
		double num = 0;
		boolean flag = true;
		Scanner entradaTeclado= new Scanner(System.in);
		
		do {
			System.out.print(mensaje);
			dato = entradaTeclado.nextLine();
			if(verificarEntero(dato)) {
				num = Double.parseDouble(dato);
				flag = true;
			} else {
				flag = false;
			}
		}while(flag == false);
		
		return num;
	}
	
	public static boolean verificarEntero (String numero) {
		try{
			Integer.parseInt(numero);
			return true;
		} catch (NumberFormatException error) {
			System.out.println("ERROR: " + error.getMessage());
			return false;
		}
	}
	
	public static boolean verificarDecimal (String numero) {
		try{
			Double.parseDouble(numero);
			return true;
		} catch (NumberFormatException error) {
			System.out.println("ERROR: " + error.getMessage());
			return false;
		}
	}
	
}

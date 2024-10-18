package Primeras_Clases;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class EjemploExcepciones {
	
	public static boolean esNumeroEntero(String cadena) {
        boolean flag;
        try {
            Integer.parseInt(cadena);
            flag = true;
        } 
        catch (NumberFormatException error) {
            flag = false;
        }
        return flag;
    }
	
	
	/*public static void metodo()
	{
		Scanner entrada = new Scanner(System.in);
		String auxiliar;
		System.out.println("Ingrese un numero entero: ");
		auxiliar = entrada.nextLine();
		
		while(EjemploExcepciones.esNumeroEntero(auxiliar) == false)
		{
			System.out.println("Vieja tenes que poner un numero, reintente: ");
			auxiliar = entrada.nextLine();
		}
		int numero = Integer.parseInt(auxiliar);
		System.out.println("Numero guardado correctamente.");
		System.out.println("numero vale " + numero);
	}*/
	
	public static boolean verificarEdad(int edad) throws IllegalArgumentException
	{
		boolean flag = true;
		if (edad < 1)
		{
			throw new IllegalArgumentException("Edad no puede ser 0 o negativo.");
		}
		if (edad < 18)
		{
			throw new IllegalArgumentException("Ud es menor de edad.");
		}
		if (edad > 70)
		{
			throw new IllegalArgumentException("El limite de edad para adquirir un credito es 70 años.");
		}
		return flag;
	}

	public static void main(String[] args){
		
		Scanner entrada = new Scanner(System.in);	
		
		//EXCEPCIONES DE TIPO RuntimeException
		
		//Division por 0;
		
//		double divisor, dividendo, resultado;
//		System.out.println("Ingrese dividendo: ");
//		dividendo = entrada.nextDouble();
//		System.out.println("Ingrese divisor: ");
//		divisor = entrada.nextDouble();
//		resultado = dividendo/divisor;
//		System.out.println(resultado);
//		System.out.println("El programa continua");
		
		
		//Desbordar un tipo de dato - ArithmeticException
		
//		int numero = Integer.MAX_VALUE;
//		System.out.println(numero);
//		numero = Math.incrementExact(numero);
//		System.out.println(numero);
//		System.out.println("El programa continua...");
		
		//Recorrer mal un arreglo - ArrayIndexOutOfBoundsException
		
//		int vector[] = new int [5];
//		System.out.println("El programa comienza");
//		for (int i=0; i<6; i++){
//			vector[i]=i+10;
//		}
//		for (int elemento: vector) {
//			System.out.print(elemento + " ");
//		}
//		System.out.println("\nEl programa continua");
		
		
		//Almacenar una cadena en una variable numerica - InputMismatchException
		
//		int numero = 0;
//		System.out.println("Ingrese solamente un numero y no otra cosa que no sea un numero");
//		numero = entrada.nextInt();
//		System.out.println("El numero es " + numero);
		
		
		//Utilizar un metodo de un objeto null - NullPointerException
		
//		String nombre = null;
//		System.out.println("Su nombre contiene: " + nombre.length() + " letras.");
		
		
		
		
		//TRATAMIENTO DE EXCEPCIONES RuntimeException
		
		//Ejemplo InputMismatchException - NumberFormatException
//		String auxiliar;
//		int numero;
//		System.out.println("Ingrese un numero entero: ");
//		auxiliar = entrada.nextLine();//"3a3"
//		try {
//			numero = Integer.parseInt(auxiliar);//33
//			System.out.println("El numero es " + numero);
//		} catch (NumberFormatException error) {
//			System.out.println("Debe ingresar solo numero.");
//		}

		
		//NumberFormatException con metodo
//		String auxiliar;
//		System.out.println("Ingrese un numero entero: ");
//		auxiliar = entrada.nextLine();
//		while(EjemploExcepciones.esNumeroEntero(auxiliar) == false)
//		{
//			System.out.println("Vieja tenes que poner un numero, reintente: ");
//			auxiliar = entrada.nextLine();
//		}
//		int	numero = Integer.parseInt(auxiliar);
//		System.out.println("Numero guardado correctamente.");
//		System.out.println("numero vale " + numero);
		
		
		
		//LANZAR EXCEPCIONES PROPIAS EN METODOS 
		
//		System.out.println("Ingrese su edad");
//		String edad = entrada.nextLine();
//		while(EjemploExcepciones.esNumeroEntero(edad) == false)
//		{
//			System.out.println("Lo que ingreso no corresponde a una edad valida: ");
//			edad = entrada.nextLine();
//		}
//		int numero = Integer.parseInt(edad);//aca hay un numero
//		
//		
//		
//		
//		
//		
//		boolean bandera = true;
//		try
//		{
//			if (verificarEdad(numero) == true){
//				System.out.println("Edad aprobada.");
//			}
//		}
//		catch(IllegalArgumentException error)
//		{
//			bandera = false;
//			System.out.println(error.getMessage());
//		}
//		finally
//		{
//			System.out.println("Este codigo se ejecuta si o si");
//			if (bandera == true)
//			{
//				//continuar con la carga de datos
//			}
//			else
//			{
//				//volver al menu
//			}
//		}
		
		//CREAR  EXCECPCIONES PROPIAS
		//VER CLASE CrearUsuario
		
		
		
		
		
		
		//EXCEPCIONES DE TIPO IOException
		//lectura de archivo inexistente en una ubicacion especifica, o que cambió de nombre
		
//		try
//		{
//			FileReader lectorFile = new FileReader("C:\\Users\\guill\\OneDrive\\Desktop\\prueba.txt");
//			BufferedReader archivo = new BufferedReader(lectorFile);
//			String texto = archivo.readLine();
//			while (texto != null)
//			{
//				System.out.println(texto);
//			}
//			archivo.close();
//		} catch (FileNotFoundException error) {
//			System.out.println("No se encontró el archivo");
//		}
//		catch(IOException error){
//			System.out.println("ERROR: " + error.getMessage());
//		}
//
//		System.out.println("EL PROGRAMA CONTINUAA..");
		
		
		//creacion de archivos en rutas inexistentes
		//Archivo.crearArchivo();
		
	}

}











/*class Archivo
{
	public static void crearArchivo()
	{
		try
		{
			FileWriter archivo = new FileWriter(new File("C:\\Users\\guill\\OneDrive\\Documentos\\Escritorio Viejo\\UTN\\2024\\PROGRAMACION II\\prueba.txt"));
			BufferedWriter bw = new BufferedWriter(archivo);
	        bw.write("PUTO EL QUE LEE");
	        bw.close();
	        archivo.close();
		}
       catch (IOException error)
		{
        	System.out.println("Se ha producido un error: " + error.getMessage());
		}
		finally
		{
			System.out.println("Este codigo se va a ejectuar sin importar lo que pase.");
		}
	}
}*/



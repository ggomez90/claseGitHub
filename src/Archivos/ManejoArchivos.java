package Archivos;

import java.io.*;

public class ManejoArchivos {
	
	public static void crearArchivo(String ruta)
	{
		/*File miArchivo = new File ("C:\\Users\\Guille Gomez\\Desktop\\UTN\\archivo1.txt");
		File miArchivo2 = new File ("archivo2.txt");
		
		try {
			PrintWriter salida = new PrintWriter(miArchivo);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			PrintWriter salida2 = new PrintWriter (miArchivo2);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}*/
		
		
		//----------------------
		
		File miArchivo = new File (ruta);
		
		if (miArchivo.exists() == true)
		{
			System.out.println("El archivo ya existe.");
		}
		else
		{
			try
			{
				PrintWriter salida = new PrintWriter(miArchivo);
				salida.close();
				System.out.println("Archivo creado con exito.");
			}
			catch (FileNotFoundException error)
			{
				System.out.println(error.getMessage());
			}
		}
	}
	
	
	//---------------------------------
	
	public static void escribirArchivo(String ruta, String contenido)
	{
		File miArchivo = new File (ruta);
		try
		{
			PrintWriter escritura = new PrintWriter(new FileWriter(miArchivo, true));
			escritura.println(contenido);
			escritura.close();
		}
		catch (FileNotFoundException error)
		{
			System.out.println(error.getMessage());
		}
		catch ( IOException error)
		{
			System.out.println(error.getMessage());
		}
	}
	
	//--------------------------------
	
	
	public static void leerArchivo (String ruta)
	{
		File miArchivo = new File (ruta);
		
		try
		{
			BufferedReader lectura = new BufferedReader(new FileReader(miArchivo));
			String contenido = lectura.readLine();
			while (contenido != null)
			{
				System.out.println(contenido);
				contenido = lectura.readLine();
			}
			lectura.close();
		}
		catch (FileNotFoundException error)
		{
			System.out.println(error.getMessage());
		}
		catch ( IOException error)
		{
			System.out.println(error.getMessage());
		}
	}
	
	//--------------------------------------
	
	
	public static void eliminarArchivo(String ruta)
	{
		File miArchivo = new File (ruta);
		if (miArchivo.exists() == true)
		{
			miArchivo.delete();
			System.out.println("Se ha eliminado correctamente el archivo.");
		}
		else
		{
			System.out.println("No se elimino nada porque no existe.");
		}
	}
	
//	public static void leerArchivo (String ruta) {
//	File miArchivo = new File (ruta);
//	try {
//		BufferedReader lectura = new BufferedReader(new FileReader(miArchivo));
//		String contenido = lectura.readLine();
//		while (contenido != null) {
//			String [] vectorContenido = contenido.split("[$]");
//			Usuario elemento = new Usuario (vectorContenido[0], vectorContenido[1], vectorContenido[2], vectorContenido[3]);
//			Usuario.listaUsuarios.add(elemento);
//			contenido = lectura.readLine();
//		}
//		lectura.close();
//	} catch (FileNotFoundException error) {
//		System.out.println(error.getMessage());
//	} catch ( IOException error) {
//		System.out.println(error.getMessage());
//	}
//}
}

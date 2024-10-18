package Archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Main_Usuarios {

	public static void main(String[] args) {
//		Archivo.crearCarpeta("REGISTROS");
//		Archivo.crearArchivo("REGISTROS" + File.separator + "Usuarios.txt");
		
//		for (int i = 0; i<3; i++)
//		{
//			Usuario.crearUsuario();
//		}
//		
//		Usuario.listarUsuarios();
//		
//		//ESCRIBIR UNA LISTA EN UN ARCHIVO
//		//llamar lista.size veces al metodo escribirArchivo simple.
//		for (Usuario elemento: Usuario.listaUsuarios)
//		{
//			String aux = elemento.getUser() + "$" + elemento.getPass() + "$" + elemento.getTipo() + "$" + elemento.getPropietario();
//			//ggomez$guille123$admin$guille gomez
//			Archivo.escribirArchivo("REGISTROS" + File.separator + "Usuarios.txt", aux);
//		}
		
		//ESCRIBIR UNA LISTA EN UN ARCHIVO METODO MEJORADO
//		PrintWriter escritura = null;
//		try {
//			escritura = Archivo.abrirConexionEscritura("REGISTROS" + File.separator + "Usuarios.txt");
//		} catch (IOException error) {
//			System.out.println("Error al escribir el archivo: " + error.getMessage());
//		}
//		if (escritura != null) {
//			for (Usuario elemento: Usuario.listaUsuarios) {
//				String contenido = elemento.getUser() + "$" + elemento.getPass() + "$" + elemento.getTipo() + "$" + elemento.getPropietario();
//				//ggomez$guille123$admin$guille gomez
//				Archivo.escribirArchivo(escritura, contenido);
//			}
//			Archivo.cerrarConexion(escritura);
//		}
		
			
		//LEER UN ARCHIVO
		//Archivo.leerArchivo("REGISTROS" + File.separator + "Usuarios.txt");
		
		//LEER UN ARCHIVO RETORNANDO UNA LISTA DE STRING
		BufferedReader lectura = null;
		ArrayList<String> listaAux = new ArrayList<String>();
		try {
			lectura = Archivo.abrirConexionLectura("REGISTROS" + File.separator + "Usuarios.txt");
		} catch (FileNotFoundException error) {
			System.out.println("Error al abrir el archivo: " + error.getMessage());
		}
		if (lectura != null) {
			String contenido;
			try {
				contenido = lectura.readLine();
				while (contenido != null) {
					listaAux.add(contenido);
					contenido = lectura.readLine();
				}
			} catch (IOException error) {
				System.out.println(error.getMessage());
			}
			Archivo.cerrarConexion(lectura);
		}
		
		//IMPRIMIR LA LISTA
		for (String elemento : listaAux) {
			System.out.println(elemento);
		}
		
		Usuario.llenarLista(listaAux);
		Usuario.listarUsuarios();
		
	}

}

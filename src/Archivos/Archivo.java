package Archivos;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Archivo {
	
	public static void crearCarpeta (String ruta) {
		File miArchivo = new File (ruta);
			//mkdir() devuelve true o false, true si la carpeta se creo con exito.
			if (miArchivo.mkdir()) {
				System.out.println("Carpeta creada con exito.");
			} else {
				//false si no pudo crear la carpeta porque ya existe, o error en la ruta o no hay permisos
				System.out.println("No se pudo crear carpeta, revise path y/o permisos.");
			}
	}
	
	public static void crearArchivo(String ruta) {
		File miArchivo = new File (ruta);
		try {
			if(miArchivo.createNewFile()) {
				//devuelve true si se pudo crear OK
				System.out.println("Archivo creado con exito.");
			} else {
				//Devuelve false si el archivo ya existe
				System.out.println("El archivo ya existe.");
			}
		} catch (IOException error) {
			//lanza excepcion en caso de no haber podido retornar T o F
			System.out.println("ERROR: " + error.getMessage());
		}
	}
	
	public static void eliminarArchivo(String ruta)
	{
		File miArchivo = new File (ruta);
		//True o false segun si existe el archivo o no
		if (miArchivo.exists()){
			//true o false segun si se pudo eliminar OK o no se puede eliminar por X motivo
			if (miArchivo.delete()) {
				System.out.println("Se ha eliminado correctamente el archivo.");
			} else {
				System.out.println("No se ha podido eliminar el archivo.");
			}
		} else {
			System.out.println("No se elimino nada porque no existe.");
		}
	}


	public static void eliminarCarpeta(String ruta) {
	    File carpeta = new File(ruta);
	    if (carpeta.exists()) {
	        eliminarRecursivo(carpeta);
	        System.out.println("La carpeta ha sido eliminada correctamente.");
	    } else {
	        System.out.println("No se elimino nada porque la carpeta no existe.");
	    }
	}

	private static void eliminarRecursivo(File carpeta) {
	    if (carpeta.isDirectory()) {
	        File[] Arregloarchivos = carpeta.listFiles();
	        if (Arregloarchivos != null) {
	            for (File file : Arregloarchivos) {
	                eliminarRecursivo(file);
	            }
	        }
	    }
	    carpeta.delete();
	}

	//TRADICIONAL
	public static void escribirArchivo(String ruta, String contenido) {
		File miArchivo = new File (ruta);
		if (miArchivo.exists()) {
			PrintWriter escritura = null;
			try{
				escritura = new PrintWriter(new FileWriter(miArchivo, true));
				escritura.println(contenido);
			} catch (IOException error) {
				System.out.println("Error al escribir el archivo: " + error.getMessage());
			} finally {
				if (escritura != null) {
	                escritura.close();
	            }
			}
		} else {
			System.out.println("El archivo especificado no existe.");
		}
	}
		
	public static void leerArchivo (String ruta) {
		File miArchivo = new File (ruta);
		if (miArchivo.exists()) {
			BufferedReader lectura = null;
			try {
				lectura = new BufferedReader(new FileReader(miArchivo));
				String contenido = lectura.readLine();
				while (contenido != null) {
					System.out.println(contenido);
					contenido = lectura.readLine();
				}
			} catch (FileNotFoundException error) {
				System.out.println(error.getMessage());
			} catch ( IOException error) {
				System.out.println(error.getMessage());
			} finally {
				if (lectura != null) {
					try {
						lectura.close();
					} catch (IOException error) {
						System.out.println(error.getMessage());
					}
				}
			}
		} else {
			System.out.println("El archivo especificado no existe.");
		}
	}
	
	
	
	
	//MEJORAS EN ESCRIBIR/LEER UN ARCHIVO/LISTA|
	//METODO PARA ABRIR LA CONEXION CON EL ARCHIVO MODO ESCRITURA
	public static PrintWriter abrirConexionEscritura(String ruta) throws IOException {
	    File miArchivo = new File(ruta);
	    if (miArchivo.exists()) {
	        return new PrintWriter(new FileWriter(miArchivo, true));
	    } else {
	        throw new FileNotFoundException("El archivo especificado no existe.");
	    }
	}
	
	//METODO PARA CERRAR LA CONEXION CON EL ARCHIVO
	public static void cerrarConexionEscritura(PrintWriter escritura) {
	    if (escritura != null) {
	        escritura.close();
	    }
	}
	
	public static void cerrarConexionLecutra(BufferedReader escritura) {
	    if (escritura != null) {
	        try {
				escritura.close();
			} catch (IOException e) {
				System.out.println("ERROR: " + e.getMessage());
			}
	    }
	}
	
	//O UTILIZAR CLOSEABLE PARA GENERAR UN SOLO METODO
	public static void cerrarConexion(Closeable conexion) {
	    if (conexion != null) {
	        try {
	            conexion.close();
	        } catch (IOException error) {
	            System.out.println("Error al cerrar el recurso: " + error.getMessage());
	        }
	    }
	}

	//METODO PARA ESCRIBIR EL ARCHIVO, SERA LLAMADO LISTA.SIZE VECES
	public static void escribirArchivo(PrintWriter escritura, String contenido) {
		if (escritura != null) { 
			escritura.println(contenido);
		}
	}
	
	//METODO PARA ABRIR LA CONEXION CON EL ARCHIVO MODO LECTURA
	public static BufferedReader abrirConexionLectura(String ruta) throws FileNotFoundException {
	    File miArchivo = new File(ruta);
	    if (miArchivo.exists()) {
	        return new BufferedReader(new FileReader(miArchivo));
	    } else {
	        throw new FileNotFoundException("El archivo especificado no existe.");
	    }
	}

//	public static List<String> leerArchivo (BufferedReader lectura, String contenido) {
//		ArrayList<String> listaRetorno = null;
//		if (lectura != null) { 
//			listaRetorno.add(contenido);
//		}
//		return listaRetorno;
//	}

}
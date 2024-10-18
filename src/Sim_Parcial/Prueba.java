package Sim_Parcial;

import java.util.Date;

public class Prueba {

	public static void main(String[] args) {
        Membresia membresia = new Membresia(Tipos_Membresia.GOLD);
        Usuario usuario = new Usuario("Guillermo", "gguillermo1990@gmail.com", "guille90");
        
        usuario.setMembresia(membresia);
        
        Perfil perfil1 = new Perfil("Juan", 25);
        Perfil perfil2 = new Perfil("Maria", 30);
        
        usuario.agregarPerfil(perfil1);
        usuario.agregarPerfil(perfil2);
        
        Serie serie = new Serie("Stranger Things", "Ciencia ficción", 50, 4);
        Pelicula pelicula = new Pelicula("Inception", "Acción", 148, "Christopher Nolan");
        
        perfil1.verContenido(serie);
        perfil1.verContenido(pelicula);
        
        serie.verEpisodio(1, 1);
        pelicula.verTrailer();
    }
	
}

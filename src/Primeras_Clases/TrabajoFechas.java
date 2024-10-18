package Primeras_Clases;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TrabajoFechas {
	
	public static final DateTimeFormatter fechaFormateada = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public static void main(String[] args) {
			
			
		
			LocalDate hoy = LocalDate.now(); //metodo now para almacenar la fecha actual
			LocalDate cumple = LocalDate.of(2023, 12, 30); //metodo of para armar una fecha introduciendo valores enteros
			
			System.out.println(hoy);
			System.out.println(cumple);
			
			System.out.println("Hoy es: " + hoy.format(fechaFormateada)); //objeto de tipo DateTimeFormatter para dar formato particular a una fecha
			System.out.println("Tu cumpel es: " + cumple.format(fechaFormateada));
			int dias = (int) ChronoUnit.DAYS.between(hoy, cumple); //metodo between del enum ChronoUnit para calcular la diferencia entre dos fechas
			System.out.println("Para tu cumple faltan: " + dias);
	}

}
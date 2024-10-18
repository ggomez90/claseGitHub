package TP1_2024;

public enum DiaSemana {
	LUNES(1, "El peor dia de la semana"), 
	MARTES(2, "aburrido"), 
	MIERCOLES(3, "mitad de semana"), 
	JUEVES(4, "va queriendo"), 
	VIERNES(5, "dia de tokyo"), 
	SABADO(6, "asadito"), 
	DOMINGO(7, "se duerme todo el dia"),;

	private int numeroDia;
	private String comentarioDia;
	
	DiaSemana(int numeroDia, String comentarioDia) {
		this.numeroDia = numeroDia;
		this.comentarioDia = comentarioDia;
	}

	public int getNumeroDia() {
		return numeroDia;
	}

	public String getComentarioDia() {
		return comentarioDia;
	}
}

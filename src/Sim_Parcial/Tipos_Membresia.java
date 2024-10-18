package Sim_Parcial;

public enum Tipos_Membresia {

	BASIC(1, 5, "Membresia basica"),
	PREMIUM(1,12, "Membresia PREMIUM"),
	GOLD(1, 20, "Membresia ORO");
	
	private int codigo;
	private double precio;
	private String detalle;
	
	private Tipos_Membresia(int codigo, double precio, String detalle) {
		this.codigo = codigo;
		this.precio = precio;
		this.detalle = detalle;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	
}

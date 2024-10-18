package Sim_Parcial;

import java.time.LocalDate;
import java.util.Date;

public class Membresia {
	
    private Tipos_Membresia tipo;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public Membresia(Tipos_Membresia tipo) {
        this.tipo = tipo;
        this.fechaInicio = LocalDate.now();
        this.fechaFin = this.fechaInicio.plusMonths(1);
    }

    public void cancelar() {
        System.out.println("Membresía cancelada.");
    }

    public void renovar() {
        System.out.println("Membresía renovada.");
    }
}

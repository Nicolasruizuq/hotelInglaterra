package co.edu.uniquindio.poo;
import java.time.LocalDate;

public class Reserva {
    private LocalDate fechaSalida;
    private LocalDate fechaEntrada;

    public Reserva(LocalDate fechaSalida, LocalDate fechaEntrada) {
        this.fechaSalida = fechaSalida;
        this.fechaEntrada = fechaEntrada;
    }
    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

}
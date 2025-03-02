package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Reserva {
    private LocalDate fechaSalida;
    private LocalDate fechaEntrada;
    private Habitacion habitacion;

    public Reserva(LocalDate fechaSalida, LocalDate fechaEntrada, Habitacion habitacion) {
        this.fechaSalida = fechaSalida;
        this.fechaEntrada = fechaEntrada;
        this.habitacion = habitacion;
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

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }
}

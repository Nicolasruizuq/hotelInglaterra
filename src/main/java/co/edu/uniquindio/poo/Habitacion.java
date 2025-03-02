package co.edu.uniquindio.poo;

public class Habitacion {

    public int numero;
    public double precio;
    public tipoHabitacion tipoHabitacion;

    public Habitacion(int numero, double precio, tipoHabitacion tipoHabitacion) {
        this.numero = numero;
        this.precio = precio;
        this.tipoHabitacion = tipoHabitacion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "numero=" + numero +
                ", precio=" + precio +
                ", tipoHabitacion=" + tipoHabitacion +
                '}';
    }
}
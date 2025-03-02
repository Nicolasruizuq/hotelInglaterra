package co.edu.uniquindio.poo;

public class Habitacion {

    public int numero;
    public double precio;
    public TipoHabitacion TipoHabitacion;

    public Habitacion(int numero, double precio, TipoHabitacion tipoHabitacion) {
        this.numero = numero;
        this.precio = precio;
        this.TipoHabitacion = TipoHabitacion;
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
                ", tipoHabitacion=" + TipoHabitacion +
                '}';
    }
}
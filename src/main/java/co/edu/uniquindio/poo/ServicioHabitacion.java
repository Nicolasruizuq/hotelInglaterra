package co.edu.uniquindio.poo;

public class ServicioHabitacion extends Servicio {
    private double costo;
    public ServicioHabitacion(String nombre, String descripcion, double costo) {
        super(nombre, descripcion);
    }
    public double getCosto() {
        return costo;
    }
    public void setCosto(double costo) {
        this.costo = costo;
    }
}
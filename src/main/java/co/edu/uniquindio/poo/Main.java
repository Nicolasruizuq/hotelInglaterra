package co.edu.uniquindio.poo;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Hotel");

        Habitacion habitacion1 = new Habitacion(101, 150.0, TipoHabitacion.SIMPLE);
        Habitacion habitacion2 = new Habitacion(102, 200.0, TipoHabitacion.DOBLE);
        Habitacion habitacion3 = new Habitacion(103, 350.0, TipoHabitacion.SUIT);

        Cliente cliente1 = new Cliente("Juan Pablo", "123456", 1);
        Cliente cliente2 = new Cliente("Nicolas", "1234567", 2);
        Cliente cliente3 = new Cliente("Camilo", "12345678", 3);
        hotel.agregarCliente(cliente1);
        hotel.agregarCliente(cliente2);
        hotel.agregarCliente(cliente3);

        Reserva reserva1 = new Reserva(LocalDate.of(2025, 2, 10), LocalDate.of(2025, 2, 3), habitacion1);
        Reserva reserva2= new Reserva(LocalDate.of(2025, 2, 10), LocalDate.of(2025, 2, 3), habitacion2);
        Reserva reserva3= new Reserva(LocalDate.of(2025, 2, 10), LocalDate.of(2025, 2, 3), habitacion3);
        hotel.agregarReserva(reserva1);
        hotel.agregarReserva(reserva2);
        hotel.agregarReserva(reserva3);

        System.out.println("Cliente " + cliente1.getNombre() + " reservó la habitación " + reserva1.getHabitacion().getNumero());
        System.out.println("Cliente " + cliente2.getNombre() + " reservó la habitación " + reserva2.getHabitacion().getNumero());
        System.out.println("Cliente " + cliente3.getNombre() + " reservó la habitación " + reserva3.getHabitacion().getNumero());

        // Funcionalidad 1
        hotel.mostrarInformacion();

        // Funcionalidad 2
        hotel.mostrarResumen();

        // Funcionalidad 3
        System.out.println("\nIngreso total por reservas: $" + hotel.calcularIngresoTotal());

    }
}

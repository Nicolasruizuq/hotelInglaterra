package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private  String nombre;
    private List<Cliente> clientes;
    private List<Reserva> reservas;

    public Hotel (String nombre){
        this.nombre = nombre;
        this.clientes = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }
    //Crud para clientes
    public void agregarCliente(Cliente nuevoCliente) {
        for (Cliente cliente : clientes) {
            if (cliente.getCedula().equals(nuevoCliente.getCedula())) {
                System.out.println("El Cliente con ID " + nuevoCliente.getCedula() + " ya existe.");
                return;
            }
        }

        clientes.add(nuevoCliente);
        System.out.println("Cliente con ID " + nuevoCliente.getCedula() + " se ha agregado exitosamente.");
    }

    public void eliminarCliente(String cedulaCliente) {
        Cliente clienteEncontrado = null;

        // Verica si el cliente ya existe en la lista de clientes
        for (Cliente cliente : clientes) {
            if (cliente.getCedula().equals(cedulaCliente)) {
                clienteEncontrado = cliente;
                break;
            }
        }
        // una vez encontrado el cliente se elimina de la lista
        if (clienteEncontrado != null) {
            clientes.remove(clienteEncontrado);
            System.out.println("Cliente con ID " + cedulaCliente + " eliminado exitosamente.");
        } else {
            System.out.println("Cliente con ID " + cedulaCliente + " no encontrado.");
        }
    }
    public void agregarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public void eliminarReserva(Reserva reserva) {
        reservas.remove(reserva);
    }
    //


}
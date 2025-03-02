package co.edu.uniquindio.poo;
public class Cliente {
    private String nombre;
    private String cedula;
    private int numeroReservas;

    public Cliente (String nombre, String cedula, int numeroReservas) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.numeroReservas = numeroReservas;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public int getNumeroReservas() {
        return numeroReservas;
    }
    public void setNumeroReservas(int numeroReservas){
        this.numeroReservas = numeroReservas;
    }
}
package co.edu.uniquindio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;

public class RegistroMisiones {

    private int id;
    private LocalDate fecha;
    private String ubicacion;
    private Vehiculo vehiculoUtilizado;

    private static LinkedList<Soldado> personal;



    public RegistroMisiones (int id, LocalDate fecha, String ubicacion) {
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.id = id;
        personal = new LinkedList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Vehiculo getVehiculoUtilizado() {
        return vehiculoUtilizado;
    }

    public void setVehiculoUtilizado(Vehiculo vehiculoUtilizado) {
        this.vehiculoUtilizado = vehiculoUtilizado;
    }

    public static LinkedList<Soldado> getPersonal() {return personal;}

    public void setPersonal(LinkedList<Soldado> personalAsignado) {this.personal = personalAsignado;}

    public void agregarPersonal(Soldado soldado) {
        soldado.setEstadoSoldado(EstadoSoldado.EN_MISION);
        personal.add(soldado);
    }

    @Override
    public String toString() {
        return "RegistroMisiones {\n" +
                "  ID: " + id + ",\n" +
                "  Fecha: " + fecha + ",\n" +
                "  Ubicación: '" + ubicacion + "',\n" +
                "  Vehículo Utilizado: " + vehiculoUtilizado + ",\n" +
                "  Personal Asignado: " + personal + "\n" +
                '}';
    }

}
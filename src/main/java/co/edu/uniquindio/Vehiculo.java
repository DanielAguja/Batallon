package co.edu.uniquindio;

import java.util.ArrayList;
import java.util.LinkedList;

public abstract class Vehiculo {

    public static ArrayList<co.edu.uniquindio.TransporteTropas> listaTransporte = new ArrayList<>();

    String idVehiculo;
    String modelo;
    String anioFabricacion;
    double kilometraje;
    EstadoOperativo estadoOperativo;
    int misionesCompletadas;

    public Vehiculo(String idVehiculo, String modelo, String
            anioFabricacion, double kilometraje, EstadoOperativo estadoOperativo, int misionesCompletadas) {
        this.idVehiculo = idVehiculo;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.kilometraje = kilometraje;
        this.estadoOperativo = estadoOperativo;
        this.misionesCompletadas = misionesCompletadas;
    }

    public abstract void desplazar();

    public static ArrayList<TransporteTropas> getListaTransporte() {
        return listaTransporte;
    }

    public static void setListaTransporte(ArrayList<TransporteTropas> listaTransporte) {
        Vehiculo.listaTransporte = listaTransporte;
    }

    public String getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(String idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(String anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public EstadoOperativo getEstadoOperativo() {
        return estadoOperativo;
    }

    public void setEstadoOperativo(EstadoOperativo estadoOperativo) {
        this.estadoOperativo = estadoOperativo;
    }

    public int getMisionesCompletadas() {
        return misionesCompletadas;
    }

    public void setMisionesCompletadas(int misionesCompletadas) {
        this.misionesCompletadas = misionesCompletadas;
    }
}

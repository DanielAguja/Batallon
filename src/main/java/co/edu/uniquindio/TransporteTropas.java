package co.edu.uniquindio;

import java.util.Arrays;

public class TransporteTropas extends Vehiculo{

    private String capacidadSoldados;

    public TransporteTropas(String id, String modelo, String anioFabricacion, double kilometraje, EstadoOperativo estadoOperativo,
                            String capacidadSoldados, int misionesCompletadas) {
        super(id, modelo, anioFabricacion, kilometraje, estadoOperativo, misionesCompletadas);
        this.capacidadSoldados = capacidadSoldados ;
    }

    @Override
    public String toString() {
        return "TransporteTropas {\n" +
                "  Capacidad de Soldados: '" + capacidadSoldados + "',\n" +
                "  ID Vehículo: '" + idVehiculo + "',\n" +
                "  Modelo: '" + modelo + "',\n" +
                "  Año de Fabricación: '" + anioFabricacion + "',\n" +
                "  Kilometraje: " + kilometraje + ",\n" +
                "  Estado Operativo: " + estadoOperativo + ",\n" +
                "  Misiones Completadas: " + misionesCompletadas + "\n" +
                '}';
    }

    @Override
    public void desplazar() {

    }

    public String getCapacidadSoldados() {
        return capacidadSoldados;
    }

    public void setCapacidadSoldados(String capacidadSoldados) {
        this.capacidadSoldados = capacidadSoldados;
    }
}

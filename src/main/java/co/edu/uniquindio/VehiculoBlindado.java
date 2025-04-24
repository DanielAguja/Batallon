package co.edu.uniquindio;

import java.util.Arrays;

public class VehiculoBlindado extends Vehiculo{
    private String nivelBlindaje;

    public VehiculoBlindado(String id, String modelo, String anioFabricacion, double kilometraje, EstadoOperativo estadoOperativo,
                            String nivelBlindaje, int misionesCompletadas) {
        super(id, modelo, anioFabricacion, kilometraje, estadoOperativo, misionesCompletadas);
        this.nivelBlindaje = nivelBlindaje;
    }

    @Override
    public String toString() {
        return "VehiculoBlindado {\n" +
                "  Nivel de Blindaje: '" + nivelBlindaje + "',\n" +
                "  ID Vehículo: '" + idVehiculo + "',\n" +
                "  Modelo: '" + modelo + "',\n" +
                "  Año de Fabricación: '" + anioFabricacion + "',\n" +
                "  Kilometraje: " + kilometraje + ",\n" +
                "  Estado Operativo: " + estadoOperativo + ",\n" +
                "  Misiones Completadas: " + misionesCompletadas + "\n" +
                '}';
    }

    @Override
    public void desplazar(){

    }

    public String getNivelBlindaje() {
        return nivelBlindaje;
    }

    public void setNivelBlindaje(String nivelBlindaje) {
        this.nivelBlindaje = nivelBlindaje;
    }
}

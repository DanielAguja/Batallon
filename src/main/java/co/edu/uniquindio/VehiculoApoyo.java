package co.edu.uniquindio;

import java.util.Arrays;

public class VehiculoApoyo extends Vehiculo{
    private TipoApoyo tipoApoyo;

    public VehiculoApoyo(String id, String modelo, String anioFabricacion, double kilometraje,
                         EstadoOperativo estadoOperativo, TipoApoyo tipoApoyo, int misionesCompletadas) {
       super(id, modelo, anioFabricacion, kilometraje, estadoOperativo, misionesCompletadas);
        this.tipoApoyo = tipoApoyo;
    }

    @Override
    public String toString() {
        return "VehiculoApoyo {\n" +
                "  ID Vehiculo: '" + idVehiculo + "',\n" +
                "  Modelo: '" + modelo + "',\n" +
                "  Año de Fabricación: '" + anioFabricacion + "',\n" +
                "  Kilometraje: " + kilometraje + ",\n" +
                "  Estado Operativo: " + estadoOperativo + ",\n" +
                "  Misiones Completadas: " + misionesCompletadas + ",\n" +
                "  Tipo de Apoyo: " + tipoApoyo + "\n" +
                '}';
    }

    @Override
    public void desplazar(){

    }

    public TipoApoyo getTipoApoyo() {
        return tipoApoyo;
    }

    public void setTipoApoyo(TipoApoyo tipoApoyo) {
        this.tipoApoyo = tipoApoyo;
    }
}


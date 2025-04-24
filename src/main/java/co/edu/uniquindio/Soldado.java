package co.edu.uniquindio;

public class Soldado {
    private String idSoldado;
    private String nombreSoldado;
    private RangoMilitar rangoMilitar;
    private TipoApoyo especializacion;
    private int edad;
    private EstadoSoldado estadoSoldado;

    public Soldado(String idSoldado, String nombreSoldado, RangoMilitar rangoMilitar,
                   TipoApoyo especializacion, int edad, EstadoSoldado estadoSoldado) {
        this.idSoldado = idSoldado;
        this.nombreSoldado = nombreSoldado;
        this.rangoMilitar = rangoMilitar;
        this.especializacion = especializacion;
        this.edad = edad;
        this.estadoSoldado = estadoSoldado;
    }

    @Override
    public String toString() {
        return "Soldado {\n" +
                "  ID Soldado: '" + idSoldado + "',\n" +
                "  Nombre: '" + nombreSoldado + "',\n" +
                "  Rango Militar: " + rangoMilitar + ",\n" +
                "  Especialización: " + especializacion + ",\n" +
                "  Edad: " + edad + ",\n" +
                "  Estado: " + estadoSoldado + "\n" +
                '}';
    }


    public String getIdSoldado() {
        return idSoldado;
    }

    public void setIdSoldado(String idSoldado) {
        this.idSoldado = idSoldado;
    }

    public String getNombreSoldado() {
        return nombreSoldado;
    }

    public void setNombreSoldado(String nombreSoldado) {
        this.nombreSoldado = nombreSoldado;
    }

    public RangoMilitar getRangoMilitar() {
        return rangoMilitar;
    }

    public void setRangoMilitar(RangoMilitar rangoMilitar) {
        this.rangoMilitar = rangoMilitar;
    }

    public TipoApoyo getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(TipoApoyo especializacion) {
        this.especializacion = especializacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public EstadoSoldado getEstadoSoldado() {
        return estadoSoldado;
    }

    public void setEstadoSoldado(EstadoSoldado estadoSoldado) {
        this.estadoSoldado = estadoSoldado;
    }

}

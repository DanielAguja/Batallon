package co.edu.uniquindio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;

public class Batallon {
    private String id;
    private String nombre;

    private LinkedList<VehiculoApoyo> listVehiculosApoyo;
    private LinkedList<VehiculoBlindado> listVehiculosBlindado;
    private LinkedList<TransporteTropas> listTransporteTropas;
    private LinkedList<Soldado> listSoldados;

    private static ArrayList<RegistroMisiones> listRegistroMisiones;

    public Batallon(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;

        this.listVehiculosApoyo = new LinkedList<>();
        this.listVehiculosBlindado = new LinkedList<>();
        this.listTransporteTropas = new LinkedList<>();
        this.listSoldados = new LinkedList<>();
        this.listRegistroMisiones = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<VehiculoApoyo> getListVehiculosApoyo() {
        return listVehiculosApoyo;
    }

    public void setListVehiculosApoyo(LinkedList<VehiculoApoyo> listVehiculosApoyo) {
        this.listVehiculosApoyo = listVehiculosApoyo;
    }

    public LinkedList<VehiculoBlindado> getListVehiculosBlindado() {
        return listVehiculosBlindado;
    }

    public void setListVehiculosBlindado(LinkedList<VehiculoBlindado> listVehiculosBlindado) {
        this.listVehiculosBlindado = listVehiculosBlindado;
    }

    public LinkedList<TransporteTropas> getListTransporteTropas() {
        return listTransporteTropas;
    }

    public void setListTransporteTropas(LinkedList<TransporteTropas> listTransporteTropas) {
        this.listTransporteTropas = listTransporteTropas;
    }

    public ArrayList<RegistroMisiones> getListRegistroMisiones() {
        return listRegistroMisiones;
    }

    public void setListRegistroMisiones(ArrayList<RegistroMisiones> listRegistroMisiones) {
        this.listRegistroMisiones = listRegistroMisiones;
    }

    public LinkedList<Soldado> crearSoldado(String idSoldado, String nombreSoldado, RangoMilitar rangoMilitar,
                                            TipoApoyo especializacion, int edad, EstadoSoldado estadoSoldado) {

        boolean flag = true;

        for(Soldado soldado : listSoldados) {
            if (soldado.getIdSoldado().equals(idSoldado)) {
                flag = false;
            }
        }

        if (flag == true) {
            Soldado newSoldado = new Soldado(idSoldado, nombreSoldado, rangoMilitar,
                    especializacion, edad, estadoSoldado);
            listSoldados.add(newSoldado);
        }
        return listSoldados;
    }

    public LinkedList<Soldado> eliminarSoldado(String idEliminar){
        for(Soldado soldado : listSoldados) {
            if(soldado.getIdSoldado().equals(idEliminar)) {
                listSoldados.remove(soldado);
            }
        }
        return listSoldados;
    }

    public ArrayList<Soldado> listarSoldados(){
        ArrayList<Soldado> listaSoldados = new ArrayList();

        for(Soldado soldado: listSoldados){
            listaSoldados.add(soldado);
        }
            return listaSoldados;
    }

    public ArrayList<Soldado> listarSoldadosEspecialidad(TipoApoyo especialidad){

        ArrayList<Soldado> soldadosEspecialidad = new ArrayList<>();

        for(Soldado soldado : listSoldados)
            if(soldado.getEspecializacion().equals(especialidad)) {
                soldadosEspecialidad.add(soldado);
            }
        return soldadosEspecialidad;
    }

    public ArrayList<Soldado> listarSoldadosRango(RangoMilitar rangoMilitar){

        ArrayList<Soldado> soldadosRango = new ArrayList<>();

        for(Soldado soldado : listSoldados)
            if(soldado.getRangoMilitar().equals(rangoMilitar)) {
                soldadosRango.add(soldado);
            }
        return soldadosRango;
    }

    public ArrayList<Soldado> buscarSoldadoID(String idBuscar ){

        ArrayList<Soldado> soldadosEncontrado = new ArrayList<>();

        for(Soldado soldado : listSoldados)
            if(soldado.getIdSoldado().equals(idBuscar)) {
                soldadosEncontrado.add(soldado);
            }
        return soldadosEncontrado;
    }

    public LinkedList<Soldado> modificarSoldado(String idBuscar,
                                                String idCambiar, String nombreCambiar, RangoMilitar rangoMilitar,
                                                TipoApoyo especializacion, int edad, EstadoSoldado estadoSoldado) {

        for(Soldado soldado : listSoldados)
            if(soldado.getIdSoldado().equals(idBuscar)){
                soldado.setIdSoldado(idCambiar);
                soldado.setNombreSoldado(nombreCambiar);
                soldado.setRangoMilitar(rangoMilitar);
                soldado.setEspecializacion(especializacion);
                soldado.setEdad(edad);
                soldado.setEstadoSoldado(estadoSoldado);
            }
        return listSoldados;
    }


        public LinkedList<VehiculoBlindado> crearVehiculoBlindado(String id, String modelo, String anioFabricacion, double kilometraje, EstadoOperativo estadoOperativo,
                                         String nivelBlindaje, int misionesCompletadas) {

//        boolean flag = false;

//        for(VehiculoBlindado vehiculo : listVehiculosBlindado) {
//            if (vehiculo.getIdVehiculo().equals(id)) {
//                return flag;
//            }
//        }

        VehiculoBlindado newvehiculoBlindado = new VehiculoBlindado(id, modelo, anioFabricacion, kilometraje,
                estadoOperativo, nivelBlindaje, misionesCompletadas);
        listVehiculosBlindado.add(newvehiculoBlindado);
        return listVehiculosBlindado;
    }

    public LinkedList<VehiculoBlindado> eliminarBlindado(String idEliminar){
        for(VehiculoBlindado vehiculo : listVehiculosBlindado) {
            if(vehiculo.getIdVehiculo().equals(idEliminar)) {
                listVehiculosBlindado.remove(vehiculo);
            }
        }
        return listVehiculosBlindado;
    }

    public ArrayList<VehiculoBlindado> buscarBlindado(String idBuscar) {

        ArrayList<VehiculoBlindado> blindadoEncontrado = new ArrayList<>();

        for (VehiculoBlindado vehiculo : listVehiculosBlindado) {
            if (vehiculo.getIdVehiculo().equals(idBuscar)) {
                blindadoEncontrado.add(vehiculo);
            }
        }
        return blindadoEncontrado;
    }

    public LinkedList<VehiculoBlindado> modificarBlindado(String idBuscar, String id, String modelo, String anioFabricacion, double kilometraje, EstadoOperativo estadoOperativo,
                                                          String nivelBlindaje, int misionesCompletadas){
        for(VehiculoBlindado vehiculo : listVehiculosBlindado) {
            if(vehiculo.getIdVehiculo().equals(idBuscar)) {
                vehiculo.setIdVehiculo(id);
                vehiculo.setModelo(modelo);
                vehiculo.setAnioFabricacion(anioFabricacion);
                vehiculo.setKilometraje(kilometraje);
                vehiculo.setEstadoOperativo(estadoOperativo);
                vehiculo.setNivelBlindaje(nivelBlindaje);
                vehiculo.setMisionesCompletadas(misionesCompletadas);
            }
        }

        return listVehiculosBlindado;
    }

    public LinkedList<VehiculoApoyo> crearVehiculoApoyo(String id, String modelo, String anioFabricacion, double kilometraje, EstadoOperativo estadoOperativo,
                                      String tipoFuncion,TipoApoyo tipoApoyo, int misionesCompletadas) {

//        boolean flag = false;
//
//        for(VehiculoApoyo vehiculo : listVehiculosApoyo) {
//            if (vehiculo.getIdVehiculo().equals(id)) {
//                return flag;
//            }
//        }

        VehiculoApoyo newvehiculoApoyo = new VehiculoApoyo(id, modelo, anioFabricacion, kilometraje,
                estadoOperativo, tipoApoyo, misionesCompletadas);
        listVehiculosApoyo.add(newvehiculoApoyo);
        return listVehiculosApoyo;
    }

    public LinkedList<VehiculoApoyo> eliminarApoyo(String idEliminar){
        for(VehiculoApoyo vehiculo : listVehiculosApoyo) {
            if(vehiculo.getIdVehiculo().equals(idEliminar)) {
                listVehiculosApoyo.remove(vehiculo);
            }
        }
        return listVehiculosApoyo;
    }

    public ArrayList<VehiculoApoyo> buscarApoyo(String idBuscar) {

        ArrayList<VehiculoApoyo> apoyoEncontrado = new ArrayList<>();

        for (VehiculoApoyo vehiculo : listVehiculosApoyo) {
            if (vehiculo.getIdVehiculo().equals(idBuscar)) {
                apoyoEncontrado.add(vehiculo);
            }
        }
        return apoyoEncontrado;
    }

    public LinkedList<VehiculoApoyo> modificarApoyo(String idBuscar, String id, String modelo, String anioFabricacion, double kilometraje, EstadoOperativo estadoOperativo,
                                                          TipoApoyo tipoApoyo, int misionesCompletadas){
        for(VehiculoApoyo vehiculo : listVehiculosApoyo) {
            if(vehiculo.getIdVehiculo().equals(idBuscar)) {
                vehiculo.setIdVehiculo(id);
                vehiculo.setModelo(modelo);
                vehiculo.setAnioFabricacion(anioFabricacion);
                vehiculo.setKilometraje(kilometraje);
                vehiculo.setEstadoOperativo(estadoOperativo);
                vehiculo.setTipoApoyo(tipoApoyo);
                vehiculo.setMisionesCompletadas(misionesCompletadas);
            }
        }

        return listVehiculosApoyo;
    }

    public LinkedList<TransporteTropas> crearTransporteTropas(String id, String modelo, String anioFabricacion, double kilometraje, EstadoOperativo estadoOperativo,
                                         String capacidadSoldados, int misionesCompletadas) {

//        boolean flag = false;
//
//        for(TransporteTropas vehiculo : listTransporteTropas) {
//            if (vehiculo.getIdVehiculo().equals(id)) {
//                return flag;
//            }
//        }

        TransporteTropas newtrasnporteTropa = new TransporteTropas(id, modelo, anioFabricacion, kilometraje,
                estadoOperativo, capacidadSoldados, misionesCompletadas);
        listTransporteTropas.add(newtrasnporteTropa);
        return listTransporteTropas;
    }

    public LinkedList<TransporteTropas> eliminarTransporte(String idEliminar){
        for(TransporteTropas vehiculo : listTransporteTropas) {
            if(vehiculo.getIdVehiculo().equals(idEliminar)) {
                listTransporteTropas.remove(vehiculo);
            }
        }
        return listTransporteTropas;
    }

    public ArrayList<TransporteTropas> buscarTransporte(String idBuscar) {

        ArrayList<TransporteTropas> transporteEncontrado = new ArrayList<>();

        for (TransporteTropas vehiculo : listTransporteTropas) {
            if (vehiculo.getIdVehiculo().equals(idBuscar)) {
                transporteEncontrado.add(vehiculo);
            }
        }
        return transporteEncontrado;
    }

    public LinkedList<TransporteTropas> modificarTransporte(String idBuscar, String id, String modelo, String anioFabricacion, double kilometraje, EstadoOperativo estadoOperativo,
            String capacidadSoldados, int misionesCompletadas){
        for(TransporteTropas vehiculo : listTransporteTropas) {
            if(vehiculo.getIdVehiculo().equals(idBuscar)) {
                vehiculo.setIdVehiculo(id);
                vehiculo.setModelo(modelo);
                vehiculo.setAnioFabricacion(anioFabricacion);
                vehiculo.setKilometraje(kilometraje);
                vehiculo.setEstadoOperativo(estadoOperativo);
                vehiculo.setCapacidadSoldados(capacidadSoldados);
                vehiculo.setMisionesCompletadas(misionesCompletadas);
            }
        }

        return listTransporteTropas;
    }

    public LinkedList<Vehiculo> obtenerVehiculosMisiones() {
        LinkedList<Vehiculo> vehiculosMisionesCompletadas = new LinkedList<>();


        for (VehiculoApoyo vehiculo : listVehiculosApoyo) {
            if (vehiculo.getMisionesCompletadas() > 50){
                vehiculosMisionesCompletadas.add(vehiculo);
            }
        }

        for(VehiculoBlindado vehiculo : listVehiculosBlindado){
            if (vehiculo.getMisionesCompletadas() > 50){
                vehiculosMisionesCompletadas.add(vehiculo);
            }
        }

        for(TransporteTropas vehiculo : listTransporteTropas){
            if (vehiculo.getMisionesCompletadas() > 50){
                vehiculosMisionesCompletadas.add(vehiculo);
            }
        }

        return vehiculosMisionesCompletadas;
    }

    public ArrayList<RegistroMisiones> registroMision(LocalDate fecha, String ubicacion,
                                                      String vehiculoUtilizado) {

//        boolean flag = false;

        int id = listRegistroMisiones.size() + 1;
        RegistroMisiones mision = new RegistroMisiones(id, fecha, ubicacion);

        for (VehiculoApoyo vehiculo : listVehiculosApoyo) {
            if (vehiculo.getIdVehiculo().equals(vehiculoUtilizado)) {
                mision.setVehiculoUtilizado(vehiculo);
                vehiculo.setEstadoOperativo(EstadoOperativo.EN_MISION);
//
//                flag = true;
            }
        }
        for (VehiculoBlindado vehiculo : listVehiculosBlindado) {
            if (vehiculo.getIdVehiculo().equals(vehiculoUtilizado)) {
                mision.setVehiculoUtilizado(vehiculo);
                vehiculo.setEstadoOperativo(EstadoOperativo.EN_MISION);
//
//                flag = true;
            }
        }
        for (TransporteTropas vehiculo : listTransporteTropas) {
            if (vehiculo.getIdVehiculo().equals(vehiculoUtilizado)) {
                mision.setVehiculoUtilizado(vehiculo);
                vehiculo.setEstadoOperativo(EstadoOperativo.EN_MISION);
//
//                flag = true;
            }
        }
        listRegistroMisiones.add(mision);
        return listRegistroMisiones;
    }

    public ArrayList<RegistroMisiones> finalizarMision(int idMision) {

        RegistroMisiones misionEliminar = null;

        for(RegistroMisiones mision : listRegistroMisiones){
            if(mision.getId() == (idMision)) {
                mision.getVehiculoUtilizado().setMisionesCompletadas(+1);
                mision.getVehiculoUtilizado().setEstadoOperativo(EstadoOperativo.DISPONIBLE);


            }
        }

        for(RegistroMisiones mision : listRegistroMisiones) {
            if (mision.getId() == (idMision)) {
                LinkedList<Soldado> personalMision = mision.getPersonal();{
                    for(Soldado soldado : personalMision){
                        soldado.setEstadoSoldado(EstadoSoldado.DISPONIBLE);
                    }
                }
            }
        }

        for(RegistroMisiones mision : listRegistroMisiones) {
            if(mision.getId() == idMision) {
                misionEliminar = mision;
                break;
            }
        }
        if(misionEliminar != null) {
            listRegistroMisiones.remove(misionEliminar);
        }
        return listRegistroMisiones;
    }


    public boolean asignarSoldado(int idMision, String idSoldado) {

        boolean flag = false;

        Soldado soldadoEncontrado = null;
        RegistroMisiones misionEncontrada = null;


        for (RegistroMisiones mision : listRegistroMisiones) {
            if (mision.getId() == idMision) {
                misionEncontrada = mision;
            }
        }
        if(misionEncontrada == null){
            System.out.println("No se encontro la misión");
        }

        for (Soldado soldado : listSoldados) {
            if (soldado.getIdSoldado().equals(idSoldado)) {
                soldadoEncontrado = soldado;
            }
        }
        if (soldadoEncontrado == null) {
            System.out.println("No se encontro el soldado");
        }

        if (soldadoEncontrado.getEstadoSoldado().equals(EstadoSoldado.EN_MISION)) {
                System.out.println("Soldado ya esta en mision");
                soldadoEncontrado = null;
        }
        if( soldadoEncontrado != null && misionEncontrada != null) {
            misionEncontrada.agregarPersonal(soldadoEncontrado);
            flag = true;
        }
        return flag;
    }

    public double kilometrajePromedioTransporteTropas(LinkedList<TransporteTropas> listTransporteTropas) {
        double sumakilometraje = 0;
        int contador = 0;
        for (TransporteTropas vehiculo : listTransporteTropas) {

            sumakilometraje += vehiculo.getKilometraje();

            contador++;

        }

        if (contador != 0) {
            return sumakilometraje / contador;
        }
        return 0;
    }

    public double kilometrajePromedioVehiculoApoyo(LinkedList<VehiculoApoyo> listVehiculosApoyo) {

        double sumakilometraje = 0;
        int contador = 0;

        for (VehiculoApoyo vehiculo : listVehiculosApoyo) {

            sumakilometraje += vehiculo.getKilometraje();

            contador++;

        }

        if (contador != 0) {
            return sumakilometraje / contador;
        }
        return 0;
    }
    public double kilometrajePromedioVehiculoBlindado(LinkedList<VehiculoBlindado> listVehiculoBlindados) {

        double sumakilometraje = 0;
        int contador = 0;

        for (VehiculoBlindado vehiculo : listVehiculoBlindados) {

            sumakilometraje += vehiculo.getKilometraje();

            contador++;
        }

        if (contador != 0) {
            return sumakilometraje / contador;
        }
        return 0;
    }

    public void filtrarMisiones(LinkedList<RegistroMisiones> listRegistroMisiones,
                                LocalDate fechaFiltrar, String ubicacionFiltrar ) {

        ArrayList<RegistroMisiones> filtrados = new ArrayList<>();

        for (RegistroMisiones misiones : listRegistroMisiones) {
            if (ubicacionFiltrar.equals(misiones.getUbicacion()) && fechaFiltrar.equals(misiones.getFecha())) {
                filtrados.add(misiones);
            }
        }
    }

    public double calcularEdadPromedioSoldados(){

        int contador = 0;

        int cantidadSoldados = listSoldados.size();

        for(Soldado soldado : listSoldados){
            contador += soldado.getEdad();
        }

        double promedioEdad = contador / cantidadSoldados;

        return promedioEdad;
    }
}

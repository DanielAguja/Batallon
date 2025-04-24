/**
 * Clase BatallonTest para probar las funcionalidades de las clases
 * @author Daniel Aguja
 * @since 8/4/2025
 *
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE)
 */


package co.edu.uniquindio;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.logging.Logger;

public class BatallonTest {
    /**
     * Instancia para el manejo de logs
     */
    private static final Logger LOG = Logger.getLogger(BatallonTest.class.getName());
    @Test

    public void registroBatallonTest() {

        LOG.info("La prueba Creacion de Soldado inicio...");

        Batallon newBatallon = new Batallon("121212", "Bodega Aurrera");

        LinkedList<VehiculoBlindado> vehiculoPrueba = newBatallon.crearVehiculoBlindado("01", "1992", "1992", 80,
                EstadoOperativo.DISPONIBLE, "Alto", 0);

        LinkedList<Soldado> soldadoPrueba = newBatallon.crearSoldado("1", "Juan Carmona",
                RangoMilitar.SARGENTO, TipoApoyo.MEDICO, 74, EstadoSoldado.EN_MISION);
        LinkedList<Soldado> soldado1 = newBatallon.crearSoldado("2", "Juan Lopez",
                RangoMilitar.CABO, TipoApoyo.MEDICO, 32, EstadoSoldado.DISPONIBLE);
        LinkedList<Soldado> soldado2 = newBatallon.crearSoldado("3", "Juan Solanilla ",
                RangoMilitar.CABO, TipoApoyo.LOGISTICA, 64, EstadoSoldado.DISPONIBLE);

        System.out.println(soldadoPrueba);

        //Pruebas Creacion Soldado

//        assertNotNull(soldadoPrueba);
//        assertTrue(soldadoPrueba.size() > 0);


        ArrayList<RegistroMisiones> misionprueba = newBatallon.registroMision(LocalDate.of(1997, 10, 02),
                "Colombia", "01");

        boolean asignamientoPersonal = newBatallon.asignarSoldado(1, "1");
        //Pruebas Cambio de estado Soldado
//        assertEquals(EstadoSoldado.EN_MISION, soldadoPrueba.get(1).getEstadoSoldado());
//        System.out.println(soldadoPrueba);
        System.out.println(misionprueba);



        ArrayList<RegistroMisiones> finalMision = newBatallon.finalizarMision(1);
        //Pruebas Cambio de estado Soldado al Finalizar Mision
//        assertEquals(EstadoSoldado.DISPONIBLE, soldadoPrueba.get(1).getEstadoSoldado());
//        System.out.println(soldadoPrueba);




        ArrayList<Soldado> listadoSoldadosEspecialidad = newBatallon.listarSoldadosEspecialidad(TipoApoyo.MEDICO);
        ArrayList medicos = new ArrayList();
        medicos.add(soldadoPrueba.get(0));
        medicos.add(soldadoPrueba.get(1));
        //Pruebas Listado (Misma Especialidad)
//        assertIterableEquals(medicos, listadoSoldadosEspecialidad);

        ArrayList<Soldado> listadoSoldadosRango = newBatallon.listarSoldadosRango(RangoMilitar.CABO);
        ArrayList cabos = new ArrayList();
        cabos.add(soldadoPrueba.get(1));
        cabos.add(soldadoPrueba.get(2));
        //Pruebas Listado (Mismo rango)
//        assertIterableEquals(cabos, listadoSoldadosRango);


        double pruebaPromedioEdad = newBatallon.calcularEdadPromedioSoldados();
        // Pruebas Promedio de Edad
//        assertEquals(56., pruebaPromedioEdad);
//        assertNotEquals(0, pruebaPromedioEdad);

        ArrayList<Soldado> buscarSoldado = newBatallon.buscarSoldadoID("1");
        ArrayList soldadoID = new ArrayList();
        soldadoID.add(soldadoPrueba.get(0));
        // Pruebas Busqueda por ID
        assertIterableEquals(soldadoID, buscarSoldado );

        LOG.info("Fin de prueba...");
    }
}

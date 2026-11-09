package es.dampro.unidad2.tarea7;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author edugutdev
 * @version 1.0
 */
public final class AnalizadorFecha {


    private static final String separador = "|";

    public static String analizarFecha(LocalDate fecha) {
        Objects.requireNonNull(fecha, "La fecha no puede ser null");
        return fecha
                + separador + fecha.getDayOfWeek()
                + separador + fecha.getDayOfYear()
                + separador + fecha.isLeapYear()
                + separador + fecha.lengthOfMonth();
    }
}
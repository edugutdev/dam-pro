package es.dampro.unidad2.tarea7;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author edugutdev
 * @version 1.0
 */
public final class CalculadoraVencimientos {


    public static LocalDate calcularVencimiento(LocalDate fecha, int dias, int meses, int anios) {
        Objects.requireNonNull(fecha, "La fecha no puede ser null");
        return fecha.plusYears(anios).plusMonths(meses).plusDays(dias);
    }
}

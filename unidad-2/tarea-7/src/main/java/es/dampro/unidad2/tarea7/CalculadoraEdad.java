package es.dampro.unidad2.tarea7;


import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

/**
 * @author edugutdev
 * @version 1.0
 */
public final class CalculadoraEdad {

    public static Period calcularEdad(LocalDate nacimiento, LocalDate fechaActual) {
        Objects.requireNonNull(nacimiento, "La fecha de nacimiento no puede ser null");
        Objects.requireNonNull(fechaActual, "La fecha actual no puede ser null");
        if (nacimiento.isAfter(fechaActual)) {
            throw new IllegalArgumentException("El nacimiento no puede ser posterior a la fecha actual");
        }
        return Period.between(nacimiento, fechaActual);
    }
}
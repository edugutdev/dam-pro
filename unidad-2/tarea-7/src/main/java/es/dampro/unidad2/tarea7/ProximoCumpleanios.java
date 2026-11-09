package es.dampro.unidad2.tarea7;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author edugutdev
 * @version 1.0
 */
public final class ProximoCumpleanios {


    public static LocalDate calcularProximoCumpleanios(LocalDate nacimiento, LocalDate hoy) {
        Objects.requireNonNull(nacimiento, "La fecha de nacimiento no puede ser null");
        Objects.requireNonNull(hoy, "La fecha de hoy no puede ser null");
        if (nacimiento.isAfter(hoy)) {
            throw new IllegalArgumentException("El nacimiento no puede ser posterior a hoy");
        }
        // withYear ajusta el 29/02 al 28/02 cuando el año destino no es bisiesto.
        LocalDate cumpleaniosEsteAnio = nacimiento.withYear(hoy.getYear());
        if (cumpleaniosEsteAnio.isBefore(hoy)) {
            return nacimiento.withYear(hoy.getYear() + 1);
        }
        return cumpleaniosEsteAnio;
    }
}

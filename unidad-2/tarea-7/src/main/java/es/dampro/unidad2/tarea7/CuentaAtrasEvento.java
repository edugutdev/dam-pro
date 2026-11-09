package es.dampro.unidad2.tarea7;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

/**
 * @author edugutdev
 * @version 1.0
 */
public final class CuentaAtrasEvento {


    public static long calcularDiasRestantes(LocalDate hoy, LocalDate evento) {
        Objects.requireNonNull(hoy, "La fecha de hoy no puede ser null");
        Objects.requireNonNull(evento, "La fecha del evento no puede ser null");
        return ChronoUnit.DAYS.between(hoy, evento);
    }
}

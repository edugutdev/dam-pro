package es.dampro.unidad2.tarea7;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Objects;

/**
 * @author edugutdev
 * @version 1.0
 */
public final class CalculadoraJornada {

    public static Duration calcularTiempoTrabajado(LocalTime entrada, LocalTime salida, int descansoMinutos) {
        Objects.requireNonNull(entrada, "La hora de entrada no puede ser null");
        Objects.requireNonNull(salida, "La hora de salida no puede ser null");
        if (!salida.isAfter(entrada)) {
            throw new IllegalArgumentException("La salida debe ser posterior a la entrada");
        }
        if (descansoMinutos < 0) {
            throw new IllegalArgumentException("El descanso no puede ser negativo");
        }
        Duration jornadaBruta = Duration.between(entrada, salida);
        Duration descanso = Duration.ofMinutes(descansoMinutos);
        if (descanso.compareTo(jornadaBruta) > 0) {
            throw new IllegalArgumentException("El descanso no puede exceder la duración de la jornada");
        }
        return jornadaBruta.minus(descanso);
    }
}

package es.dampro.unidad2.tarea7;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * @author edugutdev
 * @version 1.0
 */
public final class CalculadoraViaje {


    public static LocalDateTime calcularLlegada(LocalDateTime salida, long horas, long minutos) {
        Objects.requireNonNull(salida, "La salida no puede ser null");
        if (horas < 0 || minutos < 0) {
            throw new IllegalArgumentException("Las horas y los minutos no pueden ser negativos");
        }
        return salida.plusHours(horas).plusMinutes(minutos);
    }
}

package es.dampro.unidad2.tarea7;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Objects;

/**
 * @author edugutdev
 * @version 1.0
 */
public final class ConversorZonasHorarias {


    public static ZonedDateTime convertirZona(ZonedDateTime fechaOrigen, ZoneId zonaDestino) {
        Objects.requireNonNull(fechaOrigen, "La fecha de origen no puede ser null");
        Objects.requireNonNull(zonaDestino, "La zona de destino no puede ser null");
        return fechaOrigen.withZoneSameInstant(zonaDestino);
    }
}

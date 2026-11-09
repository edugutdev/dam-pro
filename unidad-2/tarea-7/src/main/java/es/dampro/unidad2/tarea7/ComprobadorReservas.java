package es.dampro.unidad2.tarea7;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * @author edugutdev
 * @version 1.0
 */
public final class ComprobadorReservas {


    public static boolean haySolapamiento(LocalDateTime inicio1, LocalDateTime fin1,
                                          LocalDateTime inicio2, LocalDateTime fin2) {
        Objects.requireNonNull(inicio1, "El inicio de la primera reserva no puede ser null");
        Objects.requireNonNull(fin1, "El fin de la primera reserva no puede ser null");
        Objects.requireNonNull(inicio2, "El inicio de la segunda reserva no puede ser null");
        Objects.requireNonNull(fin2, "El fin de la segunda reserva no puede ser null");
        if (!fin1.isAfter(inicio1) || !fin2.isAfter(inicio2)) {
            throw new IllegalArgumentException("El fin de cada reserva debe ser posterior a su inicio");
        }
        return inicio1.isBefore(fin2) && inicio2.isBefore(fin1);
    }
}

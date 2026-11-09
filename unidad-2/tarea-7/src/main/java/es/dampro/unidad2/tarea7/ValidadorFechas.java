package es.dampro.unidad2.tarea7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

/**
 * @author edugutdev
 * @version 1.0
 */
public final class ValidadorFechas {


    private static final DateTimeFormatter FORMATO_ESTRICTO =
            DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);


    public static LocalDate validarFecha(String texto) {
        return LocalDate.parse(texto, FORMATO_ESTRICTO);
    }
}

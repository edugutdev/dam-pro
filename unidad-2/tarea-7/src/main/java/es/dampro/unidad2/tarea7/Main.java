package es.dampro.unidad2.tarea7;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Scanner;

/**
 * @author edugutdev
 * @version 1.0
 */
public final class Main {


    private static final DateTimeFormatter FORMATO_FECHA = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    private static final DateTimeFormatter FORMATO_FECHA_HORA =
            DateTimeFormatter.ofPattern("dd/MM/uuuu HH:mm").withResolverStyle(ResolverStyle.STRICT);


    private static final DateTimeFormatter FORMATO_FECHA_HORA_ZONA =
            DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm VV");


    private interface Demostracion {


        String ejecutar(Scanner teclado);
    }


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Algoritmos de fechas y horas (Enter = usar el ejemplo)");
        ejecutar("AnalizadorFecha", teclado, Main::demostrarAnalizadorFecha);
        ejecutar("CalculadoraEdad", teclado, Main::demostrarCalculadoraEdad);
        ejecutar("CalculadoraVencimientos", teclado, Main::demostrarCalculadoraVencimientos);
        ejecutar("ValidadorFechas", teclado, Main::demostrarValidadorFechas);
        ejecutar("CuentaAtrasEvento", teclado, Main::demostrarCuentaAtrasEvento);
        ejecutar("CalculadoraJornada", teclado, Main::demostrarCalculadoraJornada);
        ejecutar("CalculadoraViaje", teclado, Main::demostrarCalculadoraViaje);
        ejecutar("ComprobadorReservas", teclado, Main::demostrarComprobadorReservas);
        ejecutar("ProximoCumpleanios", teclado, Main::demostrarProximoCumpleanios);
        ejecutar("ConversorZonasHorarias", teclado, Main::demostrarConversorZonasHorarias);
        teclado.close();
    }


    private static void ejecutar(String etiqueta, Scanner teclado, Demostracion demostracion) {
        System.out.println();
        try {
            System.out.println(etiqueta + ": " + demostracion.ejecutar(teclado));
        } catch (RuntimeException excepcion) {
            System.out.println(etiqueta + ": ERROR - " + excepcion.getMessage());
        }
    }


    private static String demostrarAnalizadorFecha(Scanner teclado) {
        LocalDate fecha = leerFecha(teclado, "Fecha (dd/MM/aaaa)", "29/02/2024");
        return AnalizadorFecha.analizarFecha(fecha);
    }

    private static String demostrarCalculadoraEdad(Scanner teclado) {
        LocalDate nacimiento = leerFecha(teclado, "Fecha de nacimiento (dd/MM/aaaa)", "20/05/2000");
        LocalDate fechaActual = leerFecha(teclado, "Fecha actual (dd/MM/aaaa)", "06/11/2026");
        Period edad = CalculadoraEdad.calcularEdad(nacimiento, fechaActual);
        return edad.getYears() + " anios, " + edad.getMonths() + " meses y " + edad.getDays() + " dias (" + edad + ")";
    }


    private static String demostrarCalculadoraVencimientos(Scanner teclado) {
        LocalDate fecha = leerFecha(teclado, "Fecha de vencimiento (dd/MM/aaaa)", "31/01/2026");
        int dias = leerEntero(teclado, "Dias a sumar", "0");
        int meses = leerEntero(teclado, "Meses a sumar", "1");
        int anios = leerEntero(teclado, "Anios a sumar", "0");
        return CalculadoraVencimientos.calcularVencimiento(fecha, dias, meses, anios).format(FORMATO_FECHA);
    }

    private static String demostrarValidadorFechas(Scanner teclado) {
        String texto = leerTexto(teclado, "Validador de fechas (dd/MM/aaaa)", "29/02/2024");
        try {
            return "valida -> " + ValidadorFechas.validarFecha(texto).format(FORMATO_FECHA);
        } catch (DateTimeParseException excepcion) {
            return "invalida -> \"" + texto + "\" (" + excepcion.getMessage() + ")";
        }
    }

    private static String demostrarCuentaAtrasEvento(Scanner teclado) {
        LocalDate hoy = leerFecha(teclado, "Fecha de hoy (dd/MM/aaaa)", "01/12/2026");
        LocalDate evento = leerFecha(teclado, "Fecha del evento (dd/MM/aaaa)", "25/12/2026");
        return CuentaAtrasEvento.calcularDiasRestantes(hoy, evento) + " dias";
    }

    private static String demostrarCalculadoraJornada(Scanner teclado) {
        LocalTime entrada = LocalTime.parse(leerTexto(teclado, "Hora de entrada (HH:mm)", "08:30"));
        LocalTime salida = LocalTime.parse(leerTexto(teclado, "Hora de salida (HH:mm)", "17:00"));
        int descansoMinutos = leerEntero(teclado, "Descanso en minutos", "30");
        Duration trabajado = CalculadoraJornada.calcularTiempoTrabajado(entrada, salida, descansoMinutos);
        return trabajado + " (" + trabajado.toHours() + " h " + trabajado.toMinutesPart() + " min)";
    }


    private static String demostrarCalculadoraViaje(Scanner teclado) {
        LocalDateTime salida = leerFechaHora(teclado, "Salida (dd/MM/aaaa HH:mm)", "15/06/2026 22:30");
        long horas = leerEntero(teclado, "Horas de viaje", "5");
        long minutos = leerEntero(teclado, "Minutos de viaje", "45");
        return CalculadoraViaje.calcularLlegada(salida, horas, minutos).format(FORMATO_FECHA_HORA);
    }


    private static String demostrarComprobadorReservas(Scanner teclado) {
        LocalDateTime inicio1 = leerFechaHora(teclado, "Inicio reserva 1 (dd/MM/aaaa HH:mm)", "15/06/2026 10:00");
        LocalDateTime fin1 = leerFechaHora(teclado, "Fin reserva 1 (dd/MM/aaaa HH:mm)", "15/06/2026 11:30");
        LocalDateTime inicio2 = leerFechaHora(teclado, "Inicio reserva 2 (dd/MM/aaaa HH:mm)", "15/06/2026 11:00");
        LocalDateTime fin2 = leerFechaHora(teclado, "Fin reserva 2 (dd/MM/aaaa HH:mm)", "15/06/2026 12:00");
        boolean solapan = ComprobadorReservas.haySolapamiento(inicio1, fin1, inicio2, fin2);
        return solapan ? "SI se solapan" : "NO se solapan";
    }

    private static String demostrarProximoCumpleanios(Scanner teclado) {
        LocalDate nacimiento = leerFecha(teclado, "Fecha de nacimiento (dd/MM/aaaa)", "20/05/2000");
        LocalDate hoy = leerFecha(teclado, "Fecha de hoy (dd/MM/aaaa)", "06/11/2026");
        return ProximoCumpleanios.calcularProximoCumpleanios(nacimiento, hoy).format(FORMATO_FECHA);
    }

    private static String demostrarConversorZonasHorarias(Scanner teclado) {
        LocalDateTime fechaHora = leerFechaHora(teclado, "Reunion (dd/MM/aaaa HH:mm)", "15/01/2026 12:00");
        ZoneId zonaOrigen = ZoneId.of(leerTexto(teclado, "Zona de origen", "Atlantic/Canary"));
        ZoneId zonaDestino = ZoneId.of(leerTexto(teclado, "Zona de destino", "Europe/Madrid"));
        ZonedDateTime origen = fechaHora.atZone(zonaOrigen);
        ZonedDateTime convertida = ConversorZonasHorarias.convertirZona(origen, zonaDestino);
        return origen.format(FORMATO_FECHA_HORA_ZONA) + " -> " + convertida.format(FORMATO_FECHA_HORA_ZONA);
    }

    private static String leerTexto(Scanner teclado, String pregunta, String ejemplo) {
        System.out.println(pregunta + " [Enter = " + ejemplo + "]:");
        if (!teclado.hasNextLine()) {
            return ejemplo;
        }
        String linea = teclado.nextLine().trim();
        return linea.isEmpty() ? ejemplo : linea;
    }

    private static LocalDate leerFecha(Scanner teclado, String pregunta, String ejemplo) {
        return ValidadorFechas.validarFecha(leerTexto(teclado, pregunta, ejemplo));
    }

    private static LocalDateTime leerFechaHora(Scanner teclado, String pregunta, String ejemplo) {
        return LocalDateTime.parse(leerTexto(teclado, pregunta, ejemplo), FORMATO_FECHA_HORA);
    }

    private static int leerEntero(Scanner teclado, String pregunta, String ejemplo) {
        return Integer.parseInt(leerTexto(teclado, pregunta, ejemplo));
    }
}

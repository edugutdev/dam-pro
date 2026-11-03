package ies.puerto.es;

import java.util.Scanner;

/**
 * @author edugutdev
 * @version 1.0.0
 */
public class EcuacionCuadratica {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el coeficiente de a: ");
        String a = teclado.nextLine();
        System.out.println("Introduce el coeficiente de b: ");
        String b = teclado.nextLine();
        System.out.println("Introduce el coeficiente de c: ");
        String c = teclado.nextLine();
        System.out.println("Ecuacion: "+calcularDiscriminante(a,b,c));
    }

    public static double calcularDiscriminante(String a, String b, String c) {
        if (a == null || b == null || c == null || a.isEmpty() || b.isEmpty() || c.isEmpty()) {
            throw new IllegalArgumentException("Los coeficientes no pueden ser nulos ");
        }
        double valA, valB, valC;
        try {
            valA = Double.parseDouble(a.trim());
            valB = Double.parseDouble(b.trim());
            valC = Double.parseDouble(c.trim());
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Coeficiente mal formado");
        }
        if (!Double.isFinite(valA) || !Double.isFinite(valB) || !Double.isFinite(valC)) {
            throw new IllegalArgumentException("Los coeficientes deben ser numeros reales");
        }
        if (valA == 0.0) {
            throw new IllegalArgumentException("El coeficiente a no puede ser 0");
        }
        return (valB * valB) - (4.0 * valA * valC);
    }
}
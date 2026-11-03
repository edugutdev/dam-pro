package ies.puerto.es;

import java.util.Scanner;

/**
 * @author edugutdev
 * @version 1.0.0
 */
public class BinarioDecimal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero binario: ");
        String binario = teclado.nextLine();
        System.out.println("Binacio decimal: "+convertirBinario(binario));
        teclado.close();
    }
    public static int convertirBinario(String binario) {
        if (binario == null || binario.isEmpty()) {
            throw new IllegalArgumentException("El texto no puede estar vacio");
        }
        for (int i = 0; i < binario.length(); i++) {
            char c = binario.charAt(i);
            if (c != '0' && c != '1') {
                throw new NumberFormatException("El texto binario contiene caracteres no válidos");
            }
        }
        try {
            return Integer.parseInt(binario, 2);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Desbordamiento en la conversión binaria");
        }
    }
}


package ies.puerto.es;

public class ClaveSecreta {
    static void main() {
        //o O = 0
        //i I = 2
        //u U = 3
        //e E = *
        //a A = ?
    }
    static String generarClaveSegura(String palabra) {
        String clave = "";

        if (palabra == null || palabra.isEmpty()) {
            return "";
        }
        palabra.replace("a", "?");
        palabra.replace("A", "?");
        palabra.replace("i", "2");
        palabra.replace("I", "2");
        palabra.replace("o", "0");
        palabra.replace("O", "0");
        palabra.replace("u", "3");
        palabra.replace("U", "3");
        palabra.replace("e", "*");
        palabra.replace("E", "*");


        return clave;
    }
}

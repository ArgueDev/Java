/*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */

import java.util.Arrays;

public class Anagrama {
    public static void main(String[] args) {
        String palabra1 = "japones";
        String palabra2 = "esponja";

        boolean resultado = sonAnagramas(palabra1, palabra2);
        if (resultado) {
            System.out.println(palabra1 + " y " + palabra2 + " son anagramas.");
        } else {
            System.out.println(palabra1 + " y " + palabra2 + " no son anagramas.");
        }
    }

    public static boolean sonAnagramas(String palabra1, String palabra2) {
        // Verificar si las longitudes de las palabras son diferentes
        if (palabra1.length() != palabra2.length()) {
            return false;
        }

        // Convertir ambas palabras a arrays de caracteres para facilitar el procesamiento
        char[] palabra1Array = palabra1.toCharArray();
        char[] palabra2Array = palabra2.toCharArray();

        // Ordenar los arrays de caracteres
        Arrays.sort(palabra1Array);
        Arrays.sort(palabra2Array);

        // Verificar si los arrays ordenados son iguales
        return Arrays.equals(palabra1Array, palabra2Array);
    }
}

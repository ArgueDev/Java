/*
 * Escribe un programa que imprima los 50 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 * - La serie Fibonacci se compone por una sucesión de números en
 *   la que el siguiente siempre es la suma de los dos anteriores.
 *   0, 1, 1, 2, 3, 5, 8, 13...
 */

public class Fibonacci {
    public static void main(String[] args) {
        int n = 50; // Número de términos a imprimir
        int a = 0;
        int b = 1;

        System.out.println("Los primeros " + n + " números de la secuencia de Fibonacci:");

        // Imprimir los primeros dos términos de la secuencia
        System.out.print(a + ", " + b);

        // Calcular e imprimir los siguientes términos de la secuencia
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(", " + c);
            a = b;
            b = c;
        }
    }
}


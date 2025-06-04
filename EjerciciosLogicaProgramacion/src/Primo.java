/*
 * Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */

public class Primo {
    public static void main(String[] args) {
        System.out.println("Numeros primos entre 1 y 100:");

        for( int i = 1; i <= 100; i++) {
            if (esPrimo(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

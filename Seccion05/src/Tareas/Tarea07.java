package Tareas;

/*
* Crear una clase con el método main donde el desafío es buscar el número menor de mínimo 10 valores enteros,
* usando la clase Scanner ingresar la cantidad de números a comparar, luego utilizando una sentencia for iterar
* el número de veces (ingresado) para pedir el número entero, entonces se requiere:
* Calcular el menor número e imprimir el valor.
* Si el menor número es menor que 10, imprimir "El número menor es menor que 10!". Si no, imprimir" el número menor es igual o mayor que 10!".
* */

import java.util.Scanner;

public class Tarea07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de números que desea comparar: ");
        System.out.print("--> : ");
        int cantidad = sc.nextInt();

        int[] numeros = new int[cantidad];

        for (int i = 0; i < cantidad; i++){
            System.out.print("Ingrese un número: ");
            numeros[i] = sc.nextInt();
        }

        // Encontrar el número menor
        int menor = numeros[0]; // Asumimos que el primer número es el menor inicialmente
        for (int i = 1; i < cantidad; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        // Imprimir el número menor
        System.out.println("El número menor es: " + menor);

        // Imprimir un mensaje dependiendo del valor del número menor
        if (menor < 10) {
            System.out.println("El número menor es menor que 10!");
        } else {
            System.out.println("El número menor es igual o mayor que 10!");
        }

        sc.close();
    }
}


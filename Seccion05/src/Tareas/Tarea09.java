package Tareas;

/*
* Mediante el teclado pedir dos números enteros positivos o negativos y multiplicarlos, pero sin usar el símbolo de multiplicación (*).
* Puede utilizar una sentencia for para realizar la multiplicación y tener en cuenta los unarios, donde menos por menos es positivo.
* */

import java.util.Scanner;

public class Tarea09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variables
        int resultado = 0;
        int num1;
        int num2;

        // Ingreso de los datos
        System.out.println("Ingrese los numeros para multiplicar");
        System.out.print("Numero 1: ");
        num1 = sc.nextInt();
        System.out.print("Numero 2: ");
        num2 = sc.nextInt();

        // Manejo de los signos
        boolean signoPositivo = (num1 >= 0 && num2 >= 0) || (num1 < 0 && num2 < 0);

        // Convertir ambos números a su valor absoluto
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);

        // Calcular el resultado
        for (int i = 0; i < num2; i++){
            resultado += num1;
        }

        // Aplicar el signo correcto al resultado
        resultado = signoPositivo ? resultado : -resultado;

        // Imprimir el resultado
        System.out.println("La multiplicacion de " + num1 + "x" + num2 + " es: " + resultado);

        sc.close();
    }
}

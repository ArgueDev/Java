package Tareas;

/*
* El desafío es un programa que pida dos números y los muestre ordenados de mayor a menor.
* Podría ser utilizando operador ternario.
* */

import java.util.Scanner;

public class Tarea04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        System.out.print("--> : ");
        int num1 = sc.nextInt();

        System.out.println("Ingrese un numero");
        System.out.print("--> : ");
        int num2 = sc.nextInt();

        int mayor = num1 > num2 ? num1 : num2;
        int menor = num1 < num2 ? num1 : num2;

        System.out.println(mayor + ", " + menor);
    }
}

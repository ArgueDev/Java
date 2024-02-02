package Tareas;

/*
* Suponiendo un estanque de gasolina (gas) con capacidad 70 litros, se requiere un programa que pida la medida actual en litros y mostrar el resultado de la forma:
* Insuficiente, Suficiente, Medio...
* La medida o capacidad actual del estanque puede ser en tipo double, para una mejor precisión, pero también puede ser del tipo int.
* Si la capacidad actual es 70 litros: imprimir Estanque lleno
* Si está entre 60 y menor a 70: imprimir Estanque casi lleno
* Si está entre 40 y menor a 60: imprimir Estanque 3/4
* Si está entre 35 y menor a 40: imprimir Medio Estanque
* Si está entre 20 y menor a 35: imprimir Suficiente
* Si está entre 1 y menor a 20: imprimir Insuficiente
* */

import java.util.Scanner;

public class Tarea05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Diga en que capacidad en litros, esta el tanque");
        System.out.print("--> : ");
        double capacidad = sc.nextDouble();

        if(capacidad == 70){
            System.out.println("Estanque lleno");
        } else if (capacidad >= 60 && capacidad < 70 ) {
            System.out.println("Estanque casi lleno");
        } else if (capacidad >= 40 && capacidad < 60) {
            System.out.println("Estanque 3/4");
        } else if (capacidad >= 35 && capacidad < 40) {
            System.out.println("Medio Tanque");
        } else if (capacidad >= 20 && capacidad < 35) {
            System.out.println("Suficiente");
        } else if (capacidad >= 1 && capacidad < 20) {
            System.out.println("Insuficiente");
        } else {
            System.out.println("Tanque Vació");
        }
    }
}

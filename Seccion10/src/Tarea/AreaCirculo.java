package Tarea;

import java.util.Scanner;

/*
* Pedir el radio de un círculo y calcular su área.
* Utilizar la fórmula:
* área = PI*r² (Constante PI multiplicado por el radio al cuadrado).
* */
public class AreaCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora del Area de un circulo");
        System.out.print("Ingrese el radio del circulo: ");
        double radio = sc.nextDouble();

        double area = Math.PI * Math.pow(radio, 2);
        area = Math.round(area*100.0)/100.0;
        System.out.println("El area del Circulo es: " +  area + " cm2");
    }
}

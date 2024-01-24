package Tarea;
/* Tarea:
* La tarea consiste en crear una nueva clase con el método main llamada DetalleDeFactura, se requiere desarrollar un programa que reciba datos de la factura utilizando la clase Scanner de la siguiente manera:

Reciba el nombre de la factura o descripción, utilizar método nextLine() para obtener el nombre de la factura con espacios.

Reciba 2 precios de productos de tipo double, utilizar método nextDouble() para obtener precios con decimales (,).

Calcule el total, sume ambos precios y agregue un valor de impuesto del 19%

Se pide mostrar en un solo String el nombre de la factura, el monto total bruto (antes de impuesto), el impuesto y el monto total neto incluyendo impuesto.

Por ejemplo, el resultado podría ser algo así:

La factura producto de oficina tiene un total bruto de 134.78, con un impuesto de 25.6082 y el monto después de impuesto es de 160.3882
*  */

import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la Factura: ");
        String factura = sc.nextLine();

        System.out.print("1. Precio: ");
        double precio1 = sc.nextDouble();

        System.out.print("2. Precio: ");
        double precio2 = sc.nextDouble();

        double subTotal = precio1 + precio2;
        double impuesto = (subTotal * 19) / 100 ;
        double total = subTotal + impuesto;

        System.out.println("La Factura producto por " + factura + " tiene un total bruto de " + subTotal + ", con un impuesto de " + impuesto + " y el monto despues del impuesto es de " + total);
    }
}

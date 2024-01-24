package Tarea;

import java.util.Scanner;

/*
* La tarea consiste en crear una clase llamada ProgramaManejoDeNombres de la siguiente manera:

Se requiere desarrollar un programa que reciba los nombres de 3 integrantes de tu familia o amigos como argumentos de línea de comandos.

Se pide por cada nombre de la persona una nueva variable del tipo String al tomar el segundo carácter pero convertido en mayúscula y se le concatena un punto y los dos últimos caracteres de la persona. Por ejemplo para Andres debe quedar como N.es

Debe imprimir como resultado los tres nuevos nombres separado con guion bajo (como una única variable).

Ejemplo, un resultado final esperado para los nombres Andres, Maria y Pepe podría ser:

N.es_A.ia_E.pe
* */
public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-- Integrante 1 --");
        System.out.print("Ingrese su nombre: ");
        String nombre1 = sc.nextLine();
        String alterado = nombre1.substring(1,2).toUpperCase().concat(".").concat(nombre1.substring(nombre1.length()-2));

        System.out.println("-- Integrante 2 --");
        System.out.print("Ingrese su nombre: ");
        String nombre2 = sc.nextLine();
        String alterado2 = nombre2.substring(1,2).toUpperCase().concat(".").concat(nombre2.substring(nombre2.length()-2));

        System.out.println("-- Integrante 3 --");
        System.out.print("Ingrese su nombre: ");
        String nombre3 = sc.nextLine();
        String alterado3 = nombre3.substring(1,2).toUpperCase().concat(".").concat(nombre3.substring(nombre3.length()-2));

        String resultado = alterado.concat("_").concat(alterado2).concat("_").concat(alterado3);
        System.out.println(resultado);
    }
}

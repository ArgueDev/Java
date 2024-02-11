package Tareas;

/*
* Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejar decimales en las notas (double).
* Mostrar el promedio de las notas mayores a 5, promedio de notas inferiores a 4 y la cantidad de notas 1, además mostrar el promedio total.
* Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las notas una a una para realizar los cálculos (contadores, sumas).
* Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y mostrar un mensaje de error finalizando el programa.
* */


import java.util.Scanner;

public class Tarea08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[20];
        int count = notas.length;
        double sumaMasDeCinco = 0, masDeCinco = 0, promMasDeCinco;
        double sumaMenosDeCuatro = 0, menosDeCuatro = 0, promMenosDeCuatro;
        double sumaTotal = 0, promedioTotal;
        int cantidadUno = 0;

        for (int i = 0; i < count; i++) {
            System.out.println("Ingrese la nota en una escala de 1 a 7");
            System.out.print("--> : ");
            notas[i] = sc.nextDouble();

            if (notas[i] > 7 || notas[i] <= 0) {
                System.out.println("Error, solo debe ser numeros dentro de la escala de 1 a 7");
                System.exit(1);
            } else if (notas[i] == 1) {
                cantidadUno++;
            } else if (notas[i] > 5) {
                sumaMasDeCinco += notas[i];
                masDeCinco++;
            } else if (notas[i] < 4) {
                sumaMenosDeCuatro += notas[i];
                menosDeCuatro++;
            }

            sumaTotal += notas[i];
        }

        promMasDeCinco = sumaMasDeCinco / masDeCinco;
        promMenosDeCuatro = sumaMenosDeCuatro / menosDeCuatro;
        promedioTotal = sumaTotal / count;
        System.out.println("El promedio de las notas mayores a 5 son: " + promMasDeCinco);
        System.out.println("El promedio de las notas menores a 4 son: " + promMenosDeCuatro);
        System.out.println("La cantidad de notas 1 son: " + cantidadUno);
        System.out.println("El promedio total es: " + promedioTotal);

        sc.close();
    }
}

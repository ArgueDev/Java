import java.util.Scanner;

public class EjemploArregloDesplazarPosicion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int [10];
        int elemento, posicion;

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese un numero: ");
            a[i] = sc.nextInt();
        }

        System.out.println();
        System.out.print("Nuevo Elemento: ");
        elemento = sc.nextInt();

        System.out.print("Posicion donde agregar (0-9): ");
        posicion = sc.nextInt();

        for (int i = a.length-2; i >= posicion; i--) {
            a[i+1] = a[i];
        }

        a[posicion] = elemento;

        System.out.println("El Arreglo final");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}

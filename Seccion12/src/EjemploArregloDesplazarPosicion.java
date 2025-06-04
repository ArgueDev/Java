import java.util.Scanner;

public class EjemploArregloDesplazarPosicion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int [10];
        int ultimo;

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese un numero: ");
            a[i] = sc.nextInt();
        }

        System.out.println();
        ultimo = a[a.length-1];

        for (int i = a.length-2; i >= 0; i--) {
            a[i+1] = a[i];
        }

        a[0] = ultimo;

        System.out.println("El Arreglo final");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}

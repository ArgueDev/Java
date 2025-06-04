import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {
        String[] productos = new String[7];

        productos[0] = "Kingston Pendrive";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chomecast 4ta generacion";
        productos[6] = "Bicicleta Oxford";

        Arrays.sort(productos);

        String prod1 = productos[0];
        String prod2 = productos[1];
        String prod3 = productos[2];
        String prod4 = productos[3];
        String prod5 = productos[4];
        String prod6 = productos[5];
        String prod7 = productos[6];

        System.out.println("Producto[0] = " + prod1);
        System.out.println("Producto[1] = " + prod2);
        System.out.println("Producto[2] = " + prod3);
        System.out.println("Producto[3] = " + prod4);
        System.out.println("Producto[4] = " + prod5);
        System.out.println("Producto[5] = " + prod6);
        System.out.println("Producto[6] = " + prod7);

        int[] numeros = new int[4];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[3];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
}

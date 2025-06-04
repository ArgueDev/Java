import java.util.Arrays;

public class EjemploArregloFor {
    public static void main(String[] args) {
        String[] productos = new String[7];
        int total = productos.length;

        productos[0] = "Kingston Pendrive";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chomecast 4ta generacion";
        productos[6] = "Bicicleta Oxford";

        Arrays.sort(productos);

        // Usando For
        for(int i = 0; i < total; i++) {
            System.out.println("Para indice " + i + " : " + productos[i]);
        }

        // Usando ForEach
        for (String prod: productos) {
            System.out.println("Prod = " + prod);
        }

        // Usando While
        int i = 0;
        while (i < total){
            System.out.println("Para indice " + i + " : " + productos[i]);
            i++;
        }

        // Usando Do While
        int j = 0;
        do {
            System.out.println("Para indice " + j + " : " + productos[j]);
            j++;
        } while (j < total);


        int[] numeros = new int[10];
    }
}

import java.util.Arrays;

public class EjemplosArreglosForInverso {
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

        // Usando For a la inversa
        for(int i = 0; i < total; i++) {
            System.out.println("indice " + (total-1-i) + " : " + productos[total - 1 - i]);
        }
    }
}

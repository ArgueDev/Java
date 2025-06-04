import java.util.Arrays;

public class EjemploArregloForInversoMutable {
    public static void main(String[] args) {
        String[] productos = {"Kngston Pendrive", "Samsung Galaxy", "Disco Duro SSD", "MacBook Air", "Chromecast 4ta generacion", "Bicicleta Oxford"};
        int total = productos.length;

        Arrays.sort(productos);

        for(int i = 0; i < total; i++) {
            System.out.println(i + " : " + productos[i]);
        }

        for(int i = 0; i < total/2; i++) {
            String actual = productos[i];
            String inverso = productos[total - 1 - i];
            productos[i] = inverso;
            productos[total - 1 - i] = actual;
        }

        for(int i = 0; i < total; i++) {
            System.out.println(i + " : " + productos[i]);
        }
    }
}

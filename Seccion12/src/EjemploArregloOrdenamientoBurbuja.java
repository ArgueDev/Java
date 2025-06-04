public class EjemploArregloOrdenamientoBurbuja {

    public static void sortBurbuja(Object[] arreglo) {
        for(int i = 0; i < arreglo.length; i++) {
            for(int j = 0; j < arreglo.length - 1 - i; j++) {
                if ( ( (Comparable)arreglo[j+1]).compareTo(arreglo[j]) < 0) {
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = auxiliar;
                }
            }
        }
    }

    public static void main(String[] args) {
        int contador = 0;

        String[] productos = {
          "Kingston Pendrive",
          "Samsung Galaxy",
          "Disco Duro SSD",
          "Asus Notebook",
          "MacBook Air",
          "Chomecast 4t generacion",
          "Bicicleta Oxford"
        };

        int total = productos.length;

        // Algoritmo de Burbuja
//        for(int i = 0; i < total; i++) {
//            for(int j = 0; j < total; j++) {
//                if (productos[i].compareTo(productos[j]) < 0) {
//                    String auxiliar = productos[i];
//                    productos[i] = productos[j];
//                    productos[j] = auxiliar;
//                }
//                contador++;
//            }
//        }

        // Algoritmo de Burbuja Optimizado
        sortBurbuja(productos);

        for (int i = 0; i < total; i++) {
            System.out.println("productos = " + productos[i]);
        }
    }
}

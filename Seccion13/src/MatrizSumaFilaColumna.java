public class MatrizSumaFilaColumna {
    public static void main(String[] args) {
        int sumaFila, sumaColumna;

        int[][] a = {
                {1, 3, 4},
                {3, 4, 5},
                {9, 5, 3}
        };

        for (int i = 0; i < a.length; i++) {
            sumaFila = 0;
            sumaColumna = 0;
            for (int j = 0; j < a[i].length; j++) {
                sumaFila += a[i][j];
                sumaColumna += a[j][i];
            }
            System.out.println("Total fila " + i + ":" + sumaFila);
            System.out.println("Total columna " + i + ":" + sumaColumna);
        }
    }
}

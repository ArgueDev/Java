public class MatrizSumar {
    public static void main(String[] args) {
        int[][] a = {
                {1, 3, 4},
                {3, 4, 5},
                {9, 5, 3}
        };

        int[][] b = {
                {1*2, 3*2, 4*2},
                {3*2, 4*2, 5*2},
                {9*2, 5*2, 3*2}
        };

        int[][] suma = new int[3][3];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                suma[i][j] = a[i][j] + b[i][j];
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < suma[i].length; j++) {
                System.out.print(suma[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

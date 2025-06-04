import java.util.Scanner;

public class EjemploArregloNotasAlumnos {
    public static void main(String[] args) {
        double[] claseMatematicas, claseHistoria, claseLenguaje;
        int sumNotasMatematicas = 0, sumNotasHistoria = 0, sumNotasLenguaje = 0;

        claseMatematicas = new double[7];
        claseHistoria = new double[7];
        claseLenguaje = new double[7];

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 7 notas de estudiantes para Matematicas");
        for (int i = 0; i < claseMatematicas.length; i++) {
            System.out.print("Nota " + (i+1) + ": ");
            claseMatematicas[i] = sc.nextDouble();
        }

        System.out.println("Ingrese 7 notas de estudiantes para Historia");
        for (int i = 0; i < claseHistoria.length; i++) {
            System.out.print("Nota " + (i+1) + ": ");
            claseHistoria[i] = sc.nextDouble();
        }

        System.out.println("Ingrese 7 notas de estudiantes para Lenguaje");
        for (int i = 0; i < claseLenguaje.length; i++) {
            System.out.print("Nota " + (i+1) + ": ");
            claseLenguaje[i] = sc.nextDouble();
        }

        for (int i = 0; i < 7; i++) {
            sumNotasMatematicas += claseMatematicas[i];
            sumNotasHistoria += claseHistoria[i];
            sumNotasLenguaje += claseLenguaje[i];
        }

        double promedioMatematicas = sumNotasMatematicas/claseMatematicas.length;
        double promedioHistoria = sumNotasHistoria/claseHistoria.length;
        double promedioLengauje = sumNotasLenguaje/claseLenguaje.length;
        double promedioGeneral = (promedioMatematicas + promedioHistoria + promedioLengauje) / 3;

        System.out.println("Promedio clase matematicas: " + promedioMatematicas);
        System.out.println("Promedio clase historia: " + promedioHistoria);
        System.out.println("Promedio clase lenguaje: " + promedioLengauje);
        System.out.println("Promedio general de las clases: " + promedioGeneral);

    }
}

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
//        String variable = 7 == 5 ? "Si es verdadero" : "Es falso";
//        System.out.println("variable = " + variable);

        String estado;
        double promedio;
        double matematicas;
        double ciencias;
        double historia;

        System.out.println("Ingrese la nota de matematicas");
        System.out.print("--> : ");
        matematicas = sc.nextDouble();

        System.out.println("Ingrese la nota de ciencias");
        System.out.print("--> : ");
        ciencias = sc.nextDouble();

        System.out.println("Ingrese la nota de historia");
        System.out.print("--> : ");
        historia = sc.nextDouble();

        promedio = (matematicas + ciencias + historia) / 3;

        estado = promedio >= 5.49 ? "Aprobado" : "Rechazado";
        System.out.println("Promedio = " + promedio + ", " + estado);
    }
}

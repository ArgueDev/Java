import java.util.Scanner;

public class OperadorTernarioNumeroMayor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0;

        System.out.println("Ingrese el primer numero");
        int num = sc.nextInt();

        System.out.println("Ingrese el segundo numero");
        int num2 = sc.nextInt();

        System.out.println("Ingrese el tercer numero");
        int num3 = sc.nextInt();

        max = (num > num2) ? num : num2;
        max = (max > num3) ? max : num3;
        System.out.println("max = " + max);
    }
}

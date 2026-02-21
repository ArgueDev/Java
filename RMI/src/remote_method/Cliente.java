package remote_method;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        try {
            Registry registro = LocateRegistry.getRegistry("localhost");
            Calculadora cal = (Calculadora) registro.lookup("CalculadoraService");

            Scanner sc = new Scanner(System.in);

            System.out.print("Ingrese un numero: ");
            int num1 = sc.nextInt();
            System.out.print("Ingrese un numero: ");
            int num2 = sc.nextInt();

            System.out.println("Resultado suma: " + cal.sumar(num1,num2));
            System.out.println("Resultado resta: " + cal.restar(num1, num2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

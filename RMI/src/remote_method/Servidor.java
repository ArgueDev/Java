package remote_method;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Servidor {
    public static void main(String[] args) {
        try {
            Calculadora cal = new CalculadoraImpl();
            Registry registro = LocateRegistry.createRegistry(1099);
            registro.rebind("CalculadoraService", cal);
            System.out.println("Servidor RMI listo...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

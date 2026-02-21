package remote_method;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculadoraImpl extends UnicastRemoteObject implements Calculadora {
    protected CalculadoraImpl() throws RemoteException {
        super();
    }

    public int sumar(int a, int b) throws RemoteException {
        return a + b;
    }

    public int restar(int a, int b) throws RemoteException {
        return a - b;
    }
}



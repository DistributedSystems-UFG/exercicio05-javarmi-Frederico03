package example.hello;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class CalculadoraImplem extends UnicastRemoteObject implements Calculadora {

    public CalculadoraImplem(int port) throws RemoteException {
        super(port);
    }

    public int multiplicacao(int a, int b) throws RemoteException {
        return a * b;
    }
}

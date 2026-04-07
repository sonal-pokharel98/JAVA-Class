package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpI extends UnicastRemoteObject implements Hello {

    public HelloImpI() throws RemoteException {
        super();
    }

    public String sayHello() {
        return "Hello from Server!";
    }
}
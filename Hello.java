package rmi;

import java.rmi.*;
import java.rmi.Remote;

public interface Hello extends Remote {
    String sayHello() throws RemoteException;
}
package rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class HelloServer {
    public static void main(String[] args) {
        try {
            HelloImpI obj = new HelloImpI();

            Registry registry = LocateRegistry.createRegistry(2000);
            registry.rebind("HelloService", obj);

            System.out.println("Server Started...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

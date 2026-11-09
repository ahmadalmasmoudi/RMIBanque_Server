package rmiServer;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import rmiService.BanqueImpl;

public class BanqueServer {

    public static void main(String[] args) {

        try {
            BanqueImpl banque = new BanqueImpl();

            Registry registry = LocateRegistry.createRegistry(1099);

            registry.rebind("Banque", banque);

            System.out.println("Serveur RMI démarré...");
            System.out.println("Service Banque prêt.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
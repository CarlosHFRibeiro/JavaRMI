package dev.senzalla.rmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class MyRMIServer {
    public static void main(String[] args) {
        try {
            // Criar e registrar o registro RMI na porta 1099 (porta padrão)
            LocateRegistry.createRegistry(1099);
            // Instanciar o serviço remoto
            MyRemoteService service = new MyRemoteServiceImpl();
            // Associar o serviço ao registro
            Naming.rebind("rmi://localhost/MyService", service);
            System.out.println("Servidor RMI pronto.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

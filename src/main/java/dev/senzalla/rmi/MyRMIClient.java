package dev.senzalla.rmi;

import java.rmi.Naming;

public class MyRMIClient {
    public static void main(String[] args) {
        try {
            // Localizar o serviço remoto
            MyRemoteService service = (MyRemoteService) Naming.lookup("rmi://localhost/MyService");
            // Invocar método remoto
            String response = service.sayHello("John Doe");
            System.out.println("Resposta do servidor: " + response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

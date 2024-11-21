package dev.senzalla.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemoteService extends Remote {
    String sayHello(String name) throws RemoteException;
}

package com.designpatterns.proxy;

import com.designpatterns.proxy.states.State;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GumballMachineRemote extends Remote {

    int getGumballsCount() throws RemoteException;
    String getLocation() throws RemoteException;
    // All return types need to be primitive or Serializable.
    State getState() throws RemoteException;
}

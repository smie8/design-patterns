package com.designpatterns.proxy;

import java.rmi.Naming;

public class GumballMonitorTestDrive {

    public static void main(String[] args) {
        // Locations we are going to monitor:
        String[] location = {"rmi://santafe.mightygumball.com/gumballmachine",
                             "rmi://boulder.mightygumball.com/gumballmachine",
                             "rmi://seattle.mightygumball.com/gumballmachine"};

        GumballMonitor[] monitors = new GumballMonitor[location.length];

        for (int i = 0; i < location.length; i++) {
            try {
                // Get the remote object (proxy) from the RMI registry with the lookup() method.
                GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location[i]);

                // Once we have the proxy, we can instantiate a GumballMonitor for it.
                monitors[i] = new GumballMonitor(machine);
                System.out.println(monitors[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (GumballMonitor monitor : monitors) {
            monitor.report();
        }
    }
}

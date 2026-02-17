package security.firewall;

public class NetworkFirewall implements Filterable {


    public void scanPacket() {
        System.out.println("NetworkFirewall: Scanning network packets for threats...");
    }

    public void blockThreat() {
        System.out.println("NetworkFirewall: Blocking suspicious network activity!");
    }
}


package security.firewall;

public class ApplicationFirewall implements Filterable {


    public void scanPacket() {
        System.out.println("ApplicationFirewall: Scanning application data for malware...");
    }


    public void blockThreat() {
        System.out.println("ApplicationFirewall: Blocking malicious application request!");
    }
}

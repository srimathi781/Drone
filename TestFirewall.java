package security.main;
import java.util.Scanner;
import security.firewall.*;
public class TestFirewall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Firewall System ===");
        System.out.print("Enter type of firewall (network/application): ");
        String choice = sc.nextLine().toLowerCase();

        Filterable firewall;

        switch (choice) {
            case "network":
                firewall = new NetworkFirewall();
                break;
            case "application":
                firewall = new ApplicationFirewall();
                break;
            default:
                System.out.println("Invalid choice! Please enter either 'network' or 'application'.");
                sc.close();
                return;
        }

        System.out.println("\nFirewall Activated!");
        firewall.scanPacket();
        firewall.blockThreat();

        sc.close();
    }
}

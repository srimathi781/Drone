package security.firewall;

public interface Filterable {
    void scanPacket();
    void blockThreat();
}

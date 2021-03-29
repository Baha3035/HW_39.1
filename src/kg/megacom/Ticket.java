package kg.megacom;

public class Ticket {
    private boolean isVIP;
    private int cost;

    public Ticket() {
    }

    public Ticket(boolean isVIP, int cost) {
        this.isVIP = isVIP;
        this.cost = cost;
    }

    public boolean isVIP() {
        return isVIP;
    }

    public void setVIP(boolean VIP) {
        isVIP = VIP;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "isVIP=" + isVIP +
                ", cost=" + cost +
                '}';
    }
}

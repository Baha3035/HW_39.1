package kg.megacom;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Comparator forTicketsWithCost = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Ticket first = (Ticket) o1;
                Ticket second = (Ticket) o2;
                return second.getCost() - first.getCost();
            }
        };

        Comparator forTicketsWithVIP = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Ticket first = (Ticket) o1;
                Ticket second = (Ticket) o2;
                return Boolean.compare(second.isVIP(), first.isVIP());
            }
        };

        PriorityQueue<Ticket> ticketsWithCost = new PriorityQueue<Ticket>(forTicketsWithCost);
        ticketsWithCost.add(new Ticket(true, 1500));
        ticketsWithCost.add(new Ticket(false, 2500));
        ticketsWithCost.add(new Ticket(false, 1500));
        ticketsWithCost.add(new Ticket(false, 1500));
        ticketsWithCost.add(new Ticket(true, 2500));
        ticketsWithCost.add(new Ticket(false, 5500));
        ticketsWithCost.add(new Ticket(true, 3500));


        PriorityQueue<Ticket> ticketsWithVIP = new PriorityQueue<>(forTicketsWithVIP);
        ticketsWithVIP.addAll(ticketsWithCost);

        while (!ticketsWithCost.isEmpty()){
            System.out.println(ticketsWithCost.poll());
        }
        System.out.println(" ");
        System.out.println("Tickets with VIP: ");

        while (!ticketsWithVIP.isEmpty()){
            System.out.println(ticketsWithVIP.poll());
        }
    }
}

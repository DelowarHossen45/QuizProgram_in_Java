package main;

import java.util.Scanner;
public class TicketSeller {
    public static final int TICKET_COUNT = 100;
    public static final int TICKET_MAX_PER_USER = 4;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int tickets = TICKET_COUNT;
        int buyers = 0;

        System.out.println(tickets + " tickets will be sold.");

        while(tickets > 0) {
            System.out.println("How many tickets would you like to buy?");

            int count = in.nextInt();

            if(count < 0 || count > TICKET_MAX_PER_USER) {
                System.out.println("You can only buy up to " + TICKET_MAX_PER_USER + " tickets.");
                continue;
            }

            if(count == 0) {
                System.out.println("You don't want to buy any tickets, bye!\n");
                continue;
            }

            if(tickets < count) {
                System.out.println("There are only " + tickets + " ticket(s) left.");
                continue;
            }

            tickets -= count;
            buyers++;
            System.out.println("You've bought " + count + " ticket(s)!\n");
        }

        System.out.println("All tickets have been sold, to " + buyers + " buyers.");
    }
}
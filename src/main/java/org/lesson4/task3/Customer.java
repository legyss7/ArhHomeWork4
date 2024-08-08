package org.lesson4.task3;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Покупатель
 */
public class Customer {
    private static int counter;
    private final int id;
    private Collection<Ticket> tickets;

    {
        id = ++counter;
    }

    public Collection<Ticket> getTickets() {
        return tickets;
    }

    public int getId() {
        return id;
    }

    public void setTickets(Collection<Ticket> tickets) {
        this.tickets = tickets;
    }
}

package org.lesson4.task3;

import java.util.ArrayList;
import java.util.Collection;

/**
 * База данных
 */
public class Database {
    private static int counter;
    private final Collection<Ticket> tickets = new ArrayList<>();
    private final Collection<Customer> customers = new ArrayList<>();

    public Database() {
        tickets.add(new Ticket());
        tickets.add(new Ticket());
        tickets.add(new Ticket());
    }

    public Collection<Ticket> getTickets() {
        return tickets;
    }

    public Collection<Customer> getCustomers() {
        return customers;
    }

    /**
     * Получить актуалльную стоимость билета
     *
     * @return
     */
    public double getTicketAmount() {
        return 45;
    }

    /**
     * Получить идентификатор заявки на покупку билетов
     *
     * @param clientId
     * @return
     */
    public int createTicketOrder(int clientId) {
        return ++counter;
    }
}

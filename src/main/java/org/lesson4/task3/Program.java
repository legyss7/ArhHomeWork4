package org.lesson4.task3;

import java.util.Collection;
import java.util.Date;

public class Program {
    /**
     * Разработать контракты и компоненты системы "Покупка онлайн
     * билетов на автобус в час пик"
     * 1. Предусовия.
     * 2. Постусловния.
     * 3. Инвариант.
     * 4. Определить абстрактные и конкретные классы.
     * 5. Определть интерфейсы.
     * 6. Реализовать наследование.
     * 7. Выявить компоненты.
     * 8. Разработать диаграмму компонет используя нотацию UML 2.0.
     * Общюю без деталей.
     */
    public static void main(String[] args) {
        Core core = new Core();
        MobileApp mobileApp = new MobileApp(core.getTicketProvider(),
                core.getCustomerProvider());
        BusStation busStation = new BusStation(core.getTicketProvider());
        if (mobileApp.buyTicket("11000000000221")) {
            System.out.println("Клиент успешно купил билет.");
            mobileApp.searchTicket(new Date());
            Collection<Ticket> tickets = mobileApp.getTickets();
            if (busStation.checkTicket(tickets.stream().findFirst().get().getQrcode())) {
                System.out.println("Клиент успешно прошел в автобус");
            }

        }
    }
}

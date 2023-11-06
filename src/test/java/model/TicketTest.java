package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {

    @Test
    void getPrice() {
        Ticket ticketUnder18 = new Ticket(100, 15);
        assertEquals(16, ticketUnder18.getPrice());

        Ticket ticketOver65 = new Ticket(100, 70);
        assertEquals(12, ticketOver65.getPrice());
        Ticket ticketStandard = new Ticket(100, 30);
        assertEquals(21, ticketStandard.getPrice());
    }

    @Test
    public void InvalidConstructor() {
        assertThrows(IllegalArgumentException.class, () -> new Ticket(-100, 25));
        assertThrows(IllegalArgumentException.class, () -> new Ticket(100, -25));
    }
}

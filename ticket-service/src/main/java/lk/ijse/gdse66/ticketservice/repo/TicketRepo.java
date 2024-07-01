package lk.ijse.gdse66.ticketservice.repo;

import lk.ijse.gdse66.ticketservice.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TicketRepo  extends JpaRepository<Ticket, String> {
}

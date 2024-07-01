package lk.ijse.gdse66.ticketservice.repo;

import lk.ijse.gdse66.ticketservice.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: Theekshana De Silva,
 * @Runtime version: 11.0.11+9-b1341.60amd64
 **/

public interface TicketRepo  extends JpaRepository<Ticket, String> {
}

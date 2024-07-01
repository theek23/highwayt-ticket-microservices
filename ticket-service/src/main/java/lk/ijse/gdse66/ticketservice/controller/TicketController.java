package lk.ijse.gdse66.ticketservice.controller;

import lk.ijse.gdse66.ticketservice.dto.TicketDTO;
import lk.ijse.gdse66.ticketservice.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v0/ticket")
public class TicketController {
    private final TicketService ticketService;

    @Autowired
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping
    public List<TicketDTO> getAllTickets() {
        return ticketService.getAllTickets();
    }

    @PostMapping
    public TicketDTO saveTicket(@RequestBody TicketDTO ticketDTO) {
        return ticketService.saveTicket(ticketDTO);
    }

    @PutMapping
    public void updateTicket(@RequestBody TicketDTO ticketDTO) {
        ticketService.updateTicket(ticketDTO);
    }

    @DeleteMapping
    public void deleteTicket(@RequestBody TicketDTO ticketDTO) {
        ticketService.deleteTicket(ticketDTO);
    }

    @GetMapping("/{id}")
    public TicketDTO findTicketById(@PathVariable String id) {
        return ticketService.findTicketById(id);
    }
    @PutMapping("/{id}/{status}")
    public void updateTicketStatus(@PathVariable String id, @PathVariable String status) {
        ticketService.updateTicketStatus(id, status);
    }
}

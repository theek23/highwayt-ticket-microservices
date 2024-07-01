package lk.ijse.gdse66.ticketservice.service.impl;

import lk.ijse.gdse66.ticketservice.dto.TicketDTO;
import lk.ijse.gdse66.ticketservice.entity.Ticket;
import lk.ijse.gdse66.ticketservice.repo.TicketRepo;
import lk.ijse.gdse66.ticketservice.service.TicketService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TicketServiceImpl implements TicketService {
    private final TicketRepo ticketRepo;
    private final ModelMapper modelMapper;

    @Autowired
    public TicketServiceImpl(TicketRepo ticketRepo, ModelMapper modelMapper) {
        this.ticketRepo = ticketRepo;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<TicketDTO> getAllTickets() {
        List<Ticket> tickets = ticketRepo.findAll();
        return tickets.stream()
                .map(ticket -> modelMapper.map(ticket, TicketDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public TicketDTO saveTicket(TicketDTO ticketDTO) {
        if (ticketDTO.getId() == null) {
            throw new IllegalArgumentException("Ticket ID must be provided");
        }
        Ticket ticket = modelMapper.map(ticketDTO, Ticket.class);
        Ticket savedTicket = ticketRepo.save(ticket);
        return modelMapper.map(savedTicket, TicketDTO.class);
    }

    @Override
    public void updateTicket(TicketDTO ticketDTO) {
        if (ticketDTO.getId() == null) {
            throw new IllegalArgumentException("Ticket ID must be provided for update");
        }
        Ticket ticket = modelMapper.map(ticketDTO, Ticket.class);
        ticketRepo.save(ticket);
    }

    @Override
    public void deleteTicket(TicketDTO ticketDTO) {
        if (ticketDTO.getId() == null) {
            throw new IllegalArgumentException("Ticket ID must be provided for delete");
        }
        Ticket ticket = modelMapper.map(ticketDTO, Ticket.class);
        ticketRepo.delete(ticket);
    }

    @Override
    public void updateTicketStatus(String ticketId, String status) {
        Ticket ticket = ticketRepo.findById(ticketId).orElse(null);
        if (ticket != null) {
            ticket.setStatus(status);
            ticketRepo.save(ticket);
        }
    }

    @Override
    public TicketDTO findTicketById(String id) {
        Ticket ticket = ticketRepo.findById(id).orElse(null);
        if (ticket != null) {
            return modelMapper.map(ticket, TicketDTO.class);
        }
        return null;
    }
}

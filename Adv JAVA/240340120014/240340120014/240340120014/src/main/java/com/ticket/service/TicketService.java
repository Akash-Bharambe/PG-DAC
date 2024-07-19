package com.ticket.service;

import java.util.List;

import javax.validation.Valid;

import com.ticket.dto.TicketDTO;
import com.ticket.dto.UpdateTicketDTO;
import com.ticket.entities.Status;

// Ticket Service Interface for declaring Business logic Methods
public interface TicketService {

	TicketDTO createTicket(@Valid TicketDTO newTicketDTO);

	TicketDTO updateTicketDetails(Long id, @Valid UpdateTicketDTO updateTicketDTO);

	List<TicketDTO> getOpenTickets(Status status);

	TicketDTO getTicketById(Long id);

}

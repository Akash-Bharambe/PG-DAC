package com.ticket.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ticket.dto.TicketDTO;
import com.ticket.dto.UpdateTicketDTO;
import com.ticket.ecxeptions.TicketNotFoundException;
import com.ticket.entities.Status;
import com.ticket.entities.Ticket;
import com.ticket.repository.TicketRepository;

// Implementation of Ticket Service that consists of Business Logic methods
@Service
@Transactional
public class TicketServiceImplementation implements TicketService {

	@Autowired
	private TicketRepository ticketRepository;

	@Autowired
	private ModelMapper mapper;

	@Override
	public TicketDTO createTicket(@Valid TicketDTO newTicketDTO) {
		Ticket ticket = mapper.map(newTicketDTO, Ticket.class);
		ticket.setStatus(Status.OPEN);
		return mapper.map(ticketRepository.save(ticket), TicketDTO.class);
	}

	@Override
	public TicketDTO updateTicketDetails(Long id, @Valid UpdateTicketDTO updateTicketDTO) {
		if (ticketRepository.existsById(id)) {
			Ticket ticket = ticketRepository.findById(id).orElseThrow();
			if (ticket.getStatus() != Status.RESOLVED) {
				mapper.map(updateTicketDTO, ticket);
				ticketRepository.save(ticket);
				return mapper.map(ticket, TicketDTO.class);
			}
		}
		throw new TicketNotFoundException("Ticket with id " + id + " NOT FOUND");
	}

	@Override
	public List<TicketDTO> getOpenTickets(Status status) {
		List<Ticket> allByStatus = ticketRepository.findAllByStatus(status);
//		if (allByStatus.size() > 0) {
		List<TicketDTO> allByStatusDTO = allByStatus.stream().map(ticket -> mapper.map(ticket, TicketDTO.class))
				.collect(Collectors.toList());
		return allByStatusDTO;
//		}
//		return new APIResponse("No Ticket Available with status "+status);
	}

	@Override
	public TicketDTO getTicketById(Long id) {
		if (ticketRepository.existsById(id)) {
			Ticket ticket = ticketRepository.findById(id).orElseThrow();
			return mapper.map(ticket, TicketDTO.class);
		}
		throw new TicketNotFoundException("Ticket NOT FOUND");
	}

}

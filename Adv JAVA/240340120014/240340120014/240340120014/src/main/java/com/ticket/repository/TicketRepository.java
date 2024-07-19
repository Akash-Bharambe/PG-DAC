package com.ticket.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ticket.entities.Status;
import com.ticket.entities.Ticket;

// Ticket Repository 
@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long>{
	List<Ticket> findAllByStatus(Status status);
}

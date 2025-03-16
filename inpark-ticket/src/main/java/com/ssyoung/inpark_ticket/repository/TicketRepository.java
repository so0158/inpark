package com.ssyoung.inpark_ticket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssyoung.inpark_ticket.model.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
    

}

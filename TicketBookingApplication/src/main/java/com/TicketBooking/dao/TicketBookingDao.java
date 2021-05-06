package com.TicketBooking.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TicketBooking.domain.Ticket;

public interface TicketBookingDao extends JpaRepository<Ticket, Integer> {
	

}

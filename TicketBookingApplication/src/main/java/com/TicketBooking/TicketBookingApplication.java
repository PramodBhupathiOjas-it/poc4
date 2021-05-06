package com.TicketBooking;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.TicketBooking.domain.Ticket;
import com.TicketBooking.service.TicketService;

@SpringBootApplication
public class TicketBookingApplication implements CommandLineRunner {
	
	@Autowired
	private TicketService service;

	public static void main(String[] args) {
		SpringApplication.run(TicketBookingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Ticket ticket = new Ticket();
		ticket.setPassengerName("SunilJoshi");
		ticket.setEmail("joshi@gamil.com");
		ticket.setSourceStation("Delhi");
		ticket.setDestinationStation("Hyderabad");
		ticket.setBookingDate(new Date());
		service.createTicket(ticket);
		
	}

}

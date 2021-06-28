package com.railway.ReserveTicketsService.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.railway.ReserveTicketsService.model.TicketsModel;
import com.railway.ReserveTicketsService.mongodb.Tickets;
import com.railway.ReserveTicketsService.repository.TicketsRepository;
import com.railway.ReserveTicketsService.service.TicketsService;

@Service
public class TicketsServiceImpl implements TicketsService {
	
	@Autowired
	private TicketsRepository ticketsRepository;

	@Override
	public Tickets addTicket(TicketsModel ticketDto) {
		
		Tickets ticket= new Tickets(ticketDto.getPnr(),ticketDto.getSource_station(),ticketDto.getDestination_station(),
				ticketDto.getDeparture_date(),ticketDto.getBoarding_time(),ticketDto.getTravel_class(),ticketDto.getJourney_duration());
		Tickets saved = ticketsRepository.save(ticket);
		return saved;

	}

	@Override
	public Tickets getTicketByPnr(String pnr) {
		return ticketsRepository.findByPnr(pnr);
	}

}

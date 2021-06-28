package com.railway.ReserveTicketsService.service;

import com.railway.ReserveTicketsService.model.TicketsModel;
import com.railway.ReserveTicketsService.mongodb.Tickets;

public interface TicketsService {
	
	public Tickets addTicket(TicketsModel ticketDto);
	public Tickets getTicketByPnr(String pnr );

}

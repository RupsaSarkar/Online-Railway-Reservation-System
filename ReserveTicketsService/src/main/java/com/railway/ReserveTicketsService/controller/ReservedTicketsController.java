package com.railway.ReserveTicketsService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.railway.ReserveTicketsService.model.TicketsModel;
import com.railway.ReserveTicketsService.mongodb.Tickets;
import com.railway.ReserveTicketsService.service.TicketsService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/Tickets")
public class ReservedTicketsController {
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private TicketsService ticketsService;
	
	@ApiOperation(value="It will add tickets")
	@PostMapping("/reserve")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Tickets> addTicket(@RequestBody TicketsModel ticketDto){
		return new ResponseEntity<>(ticketsService.addTicket(ticketDto), HttpStatus.CREATED);
	}

	@ApiOperation(value="It will find booked tickets by PNR")
	@GetMapping("/reserve/{pnr}")
	public Tickets getTicketByPnr(@PathVariable String pnr){
		return ticketsService.getTicketByPnr(pnr);
	}
}

package com.railway.ReserveTicketsService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.railway.ReserveTicketsService.mongodb.Tickets;

@Repository
public interface TicketsRepository extends MongoRepository<Tickets, String>{
	
	public Tickets findByPnr(String pnr);


}

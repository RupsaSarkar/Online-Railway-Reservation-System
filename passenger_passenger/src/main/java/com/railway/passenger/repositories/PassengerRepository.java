package com.railway.passenger.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.railway.passenger.models.Card;
import com.railway.passenger.models.PassengerModel;

@Repository
public interface  PassengerRepository extends MongoRepository<PassengerModel, Long>{

}

package com.railway.passenger.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.railway.passenger.models.Train;

@Repository
public interface MainAdminRepository extends MongoRepository<Train, String>{
	@Query("{'train_no' : ?0}")
	public Train findByTrain_no(String train_no);
	
	

}

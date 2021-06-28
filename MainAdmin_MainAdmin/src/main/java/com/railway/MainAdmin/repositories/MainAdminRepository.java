package com.railway.MainAdmin.repositories;

import java.util.List;
import java.util.Optional;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.railway.MainAdmin.models.Train;


@Repository
public interface MainAdminRepository extends MongoRepository<Train, String> {
	@Query("{'train_no' : ?0}")
	public Train findByTrain_no(String train_no);
	
	@Query(value = "{'train_no' : ?0}", delete = true)
	public void deleteByTrain_no(String train_no);
	

}

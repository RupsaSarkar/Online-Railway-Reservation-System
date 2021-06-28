package com.railway.passenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.railway.passenger.models.Card;
import com.railway.passenger.models.PassengerModel;
import com.railway.passenger.models.Train;
import com.railway.passenger.repositories.MainAdminRepository;
import com.railway.passenger.repositories.PassengerRepository;

@Service
public class PassengerServiceImpl implements PassengerService{
	@Autowired
	private MainAdminRepository adminrepo;
	
	@Autowired
	private PassengerRepository passengerRepo;
	
	public List<Train> getAllTrains(){
		List<Train> allTrainDetails = new ArrayList<Train>();
		adminrepo.findAll().forEach(train -> allTrainDetails.add(train));
		return allTrainDetails;

	}

	@Override
	public Train getDetailsByTrainNo(String train_no) {
		return adminrepo.findByTrain_no(train_no);
	}
	
	@Override
	public List<Train> getTrainByStartStationandDestination(String starting_station, String destination) {
		List<Train> detList=adminrepo.findAll();
		List<Train> req=new ArrayList<Train>();
		for(Train tr:detList)
		{
			String starting=tr.getStarting_station();
			String final_station=tr.getDestination();
			if(starting.equals(starting_station) && final_station.equals(destination))
			{
				req.add(tr);
			}
		}
		return req;
	}

	//@Override
	//public PassengerModel addPassenger(PassengerModel passengerDto) {
		
		//PassengerModel passenger = new PassengerModel(passengerDto.getId(),passengerDto.getUser_id(),passengerDto.getName(),passengerDto.getEmail(),
				//passengerDto.getAge(),passengerDto.getGender(),passengerDto.getLocation(),passengerDto.getPassword());
		//PassengerModel saved = passengerRepo.save(passenger);
		//return saved;
		
		//}


}

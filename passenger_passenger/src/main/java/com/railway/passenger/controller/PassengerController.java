package com.railway.passenger.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.railway.passenger.models.PassengerModel;
import com.railway.passenger.models.Train;
import com.railway.passenger.service.PassengerServiceImpl;

@RestController
@RequestMapping("/Train")
public class PassengerController {
	
	@Autowired
	private PassengerServiceImpl mainrepo;
	
	//@PostMapping("/addPassenger")
   // @ResponseStatus(HttpStatus.CREATED)
   // public ResponseEntity<PassengerModel> addPassenger(@RequestBody PassengerModel passengerDto){
        //return new ResponseEntity<>(mainrepo.addPassenger(passengerDto), HttpStatus.CREATED);
    //}
	
	@GetMapping("/allTrains")
	public List<Train> getAllTrains(){
		return mainrepo.getAllTrains();
	}
	
	@GetMapping("/findAllTrain/{train_no}")
	public Train getDetailsByTrainNo(@PathVariable String train_no){
		return mainrepo.getDetailsByTrainNo(train_no);
	}
	
	@GetMapping("/{starting_station}/{destination}")
	public List<Train> getTrainByStartStationandDestination(@PathVariable String starting_station,@PathVariable String destination)
	{
		return mainrepo.getTrainByStartStationandDestination(starting_station,destination);
	}
}

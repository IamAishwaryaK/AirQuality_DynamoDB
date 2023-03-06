package com.airquality.microservice.airqualtymonitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import com.airquality.microservice.airqualtymonitor.modal.airQuality;
import com.airquality.microservice.airqualtymonitor.repository.airDBRespository;
import com.airquality.microservice.airqualtymonitor.exception.FloorNotFoundException;

import java.util.List;


@RestController
public class AirController {
	 @Autowired
	    private airDBRespository airDBRespository;
	 private Logger logger = LoggerFactory.getLogger(this.getClass());
	 
	   
	 
	 @CrossOrigin(origins = "http://airquality-frontend.s3-website-ap-northeast-1.amazonaws.com")
	    @GetMapping("/")
	    public String start(){
	    	return "Welcome";
	    	}
	    
	 
         //find the airquality of particular floor
	 @CrossOrigin(origins = "http://airquality-frontend.s3-website-ap-northeast-1.amazonaws.com")
	    @GetMapping("floor/{floor}")
	    public List<airQuality> findByFloor(@PathVariable Integer floor){
	    	if(!airDBRespository.containsFloor(floor))throw new FloorNotFoundException();
	    	else {
	    	logger.info(""+airDBRespository.findByFloor(floor));
	        return airDBRespository.findByFloor(floor);
	    	}
	    }

	    //find the airquality of all floors
	    @CrossOrigin(origins = "http://airquality-frontend.s3-website-ap-northeast-1.amazonaws.com")
	    @GetMapping("/floor/all")
	    public List<airQuality> findAll(){
	    	 logger.info(""+airDBRespository.findAll());
	         return airDBRespository.findAll();
	    }
	       

	   
}
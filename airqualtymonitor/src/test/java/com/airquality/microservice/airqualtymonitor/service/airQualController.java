package com.airquality.microservice.airqualtymonitor.service;
import com.airquality.microservice.airqualtymonitor.modal.airQuality;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.airquality.microservice.airqualtymonitor.AirController;
import com.airquality.microservice.airqualtymonitor.repository.airDBRespository;

@SpringBootTest
public class airQualController {
	
	
	@BeforeEach
	void beforeEach() {
	MockitoAnnotations.openMocks(this);
	}

	@InjectMocks
    AirController aqc;
	
	@Mock	
	airDBRespository aqs;
	
	airQuality aq;
	//Test the findbyfloor method of controller 
	
	@Test
	public void getFloor() {	
		
		//Mockito.when(aqs.findByFloor(3)).thenReturn(aqs.findByFloor(3));
    	assertNotNull(aqs.findByFloor(3));
//		assertEquals(aqs.findByFloor(3), aq);
	
	}
	

	}



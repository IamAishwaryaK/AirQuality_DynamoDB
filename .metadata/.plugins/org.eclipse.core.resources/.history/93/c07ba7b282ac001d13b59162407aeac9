package com.airquality.microservice.airqualtymonitor.repository;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.airquality.microservice.airqualtymonitor.modal.airQuality;
import com.airquality.microservice.airqualtymonitor.repository.airDBRespository;





@SpringBootTest
public class airDBRepositoryTest {
	
	@Autowired
	private airDBRespository aqr;
 
	
	airQuality aq;
	

	private Logger logger=LoggerFactory.getLogger(this.getClass());
	//airQuality aqs=(airQuality) aqr.findByFloor(1);
	List<airQuality> list=new ArrayList<>();
    //list.add(aqs);
    
	@Test
	public void containsFloor()
	{
		int floor=2;
		boolean aqt=aqr.containsFloor(floor);
		assertNotNull(aqr.containsFloor(1));
		logger.info("User  "+true+"  DB  "+aqr.containsFloor(floor));
	}

	//floor number oxygen test
	@Test
	public void contextLoads() {
		List<airQuality> a=new ArrayList<>();
		a=aqr.findAll();
		airQuality q=a.get(0);
		System.out.println(q);
		System.out.println(q.getAirqual());
		Integer check=Integer.valueOf(77);
		assertNotNull(q.getAirqual());
		
	}
//	//floor oxygen test
	@Test
	public void floorOxygen() {
		
	   // list.add(aqs);
		//List<airQuality> a=new ArrayList<>();
		list=aqr.findAll();
		//a.add(aq);
		airQuality ab=list.get(0);
		assertNotNull(ab.getOxygen());
		//logger.info("User  "+22+"  DB  "+aqs.getOxygen());
	}
//	@Test
//	public void floorCarbon() {
//		//list.add(aqs);
//	    airQuality aqt=list.get(0);
//		assertEquals(1,aqt.getCarbon());
//	}
//	//check if the floor is present
	
}

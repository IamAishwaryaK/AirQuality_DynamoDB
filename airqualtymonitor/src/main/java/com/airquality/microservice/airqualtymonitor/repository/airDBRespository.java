package com.airquality.microservice.airqualtymonitor.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.airquality.microservice.airqualtymonitor.modal.airQuality;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;


@Repository
public class airDBRespository {


    @Autowired
    private DynamoDBMapper dynamoDBMapper;

   
    

    public List<airQuality> findByFloor(Integer floor){
    	List<airQuality> floor1=new ArrayList<airQuality>();
    	floor1=dynamoDBMapper.scan(airQuality.class, new DynamoDBScanExpression());
    	Iterator<airQuality> iter = floor1.iterator();
    	List<airQuality> res=new ArrayList<airQuality>();

    while (iter.hasNext()) {

    	airQuality e=iter.next();
        if(e.getFloor()==floor) {
        
        	res.add(e);
        }
    }
    return res;
       
    }

    public List<airQuality> findAll(){
        return dynamoDBMapper.scan(airQuality.class, new DynamoDBScanExpression());
    }

   
    public boolean containsFloor(Integer floor)
	{
		if(floor<=0)
			return false;
		else if(floor>3)
		    return false;
		else 
			return true;
		
	}

}
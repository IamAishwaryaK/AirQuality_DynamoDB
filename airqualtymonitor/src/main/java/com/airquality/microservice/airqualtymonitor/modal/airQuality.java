package com.airquality.microservice.airqualtymonitor.modal;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import java.io.Serializable;




@DynamoDBTable(tableName = "airquality_sensordata")
public class airQuality implements Serializable {



	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getFloor() {
		return floor;
	}

	public void setFloor(Integer floor) {
		this.floor = floor;
	}

	
	public Integer getAirqual() {
		return airqual;
	}

	public void setAirqual(Integer airqual) {
		this.airqual = airqual;
	}

	public Integer getCarbon() {
		return carbon;
	}

	public void setCarbon(Integer carbon) {
		this.carbon = carbon;
	}

	public Integer getCarbondioxide() {
		return carbondioxide;
	}

	public void setCarbondioxide(Integer carbondioxide) {
		this.carbondioxide = carbondioxide;
	}

	public Integer getCarbonmonoxide() {
		return carbonmonoxide;
	}

	public void setCarbonmonoxide(Integer carbonmonoxide) {
		this.carbonmonoxide = carbonmonoxide;
	}

	public Integer getOxygen() {
		return oxygen;
	}

	public void setOxygen(Integer oxygen) {
		this.oxygen = oxygen;
	}

	public Integer getSulphurdioxde() {
		return sulphurdioxde;
	}

	public void setSulphurdioxde(Integer sulphurdioxde) {
		this.sulphurdioxde = sulphurdioxde;
	}


	public Integer getIsError() {
		return isError;
	}

	public void setIsError(Integer isError) {
		this.isError = isError;
	}

	public Integer getIsNull() {
		return isNull;
	}

	public void setIsNull(Integer isNull) {
		this.isNull = isNull;
	}


	private static final long serialVersionUID = 2077992697029525233L;
	
	@DynamoDBAttribute(attributeName="timestamp")
	private String timestamp;
	
	@DynamoDBAttribute(attributeName="airqual")
	private Integer airqual;
	
	@DynamoDBAttribute(attributeName="carbon")
	private Integer carbon;
	
	
	@DynamoDBAttribute(attributeName="carbondioxide")
	private Integer carbondioxide;
	
	@DynamoDBAttribute(attributeName="carbonmonoxide")
	private Integer carbonmonoxide;
	
	@DynamoDBHashKey(attributeName="floor")
	private Integer floor;
	

	@DynamoDBAttribute(attributeName="oxygen")
	private Integer oxygen;
	

	@DynamoDBAttribute(attributeName="sulphurdioxde")
	private Integer sulphurdioxde;
	@DynamoDBAttribute(attributeName="isError")
	private Integer isError;
	
	@DynamoDBAttribute(attributeName="isNull")
	private Integer isNull;

	public String toString()
	{
		return "airQuality [floor=" + floor + ", oxygen=" + oxygen + ", carbondioxide=" + carbondioxide
				+ ", sulphurdioxde=" + sulphurdioxde + ", carbonmonoxide=" + carbonmonoxide + ", carbon=" + carbon
				+ ", airqual=" + airqual + "]";
		
	}
}
package com.airquality.microservice.airqualtymonitor.exception;

public class FloorNotFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	public FloorNotFoundException() {}
	 //Displays Exception message
    public FloorNotFoundException(String msg)
    {
        super(msg);
        this.message = msg;
    }

}

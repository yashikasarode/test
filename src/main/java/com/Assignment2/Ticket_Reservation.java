package com.Assignment2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Ticket_Reservation {
	
	@PostConstruct
	public void initialize() {
		System.out.println("Initializing the Ticket");
	}
	
	@PreDestroy
	public void cleanUp() {
		System.out.println("Cleaning the ticket");
		
	}

	@Override
	public String toString() {
		return "Ticket_Reservation [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}

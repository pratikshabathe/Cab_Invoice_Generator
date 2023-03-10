package com.bridgelabz;

public class CabInvoiceGenerator {

	private  static final int MINIMUM_COST_PER_KILOMETER = 10;
	private static final int COST_PER_TIME = 1;

	public double calculateFare(double distance, int time) {
		return distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME;
	}
	
	public double multipleRides(double distance, int time) {
		int noOfRides = 10;
		return distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME;
	}
	
}

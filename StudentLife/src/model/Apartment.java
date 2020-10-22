package model;

public class Apartment {

	private int city; 
	private int squareMeters; 
	private int pricePerSquareMeter; 
	

	public Apartment(int city, int squareMeters, int pricePerSquareMeter){ 
		this.city = city; 
		this.squareMeters = squareMeters; 
		this.pricePerSquareMeter = pricePerSquareMeter;
	}	
	
		
	public boolean larger(Apartment otherApartment) {
		while (true) {
				
		if (this.squareMeters>otherApartment.squareMeters) {
			return true;
		}
		else {
			return false;
			}
		}
	}
	public boolean moreExpensiveThan(Apartment otherApartment) {
		while (true) {
			if (this.pricePerSquareMeter>otherApartment.pricePerSquareMeter) {
				return true;
			}
			else {
				return false;
			}
		}
	}
	public int priceDifference(Apartment otherApartment) {
		this.pricePerSquareMeter = this.squareMeters*this.pricePerSquareMeter;
		otherApartment.pricePerSquareMeter = otherApartment.squareMeters*otherApartment.pricePerSquareMeter; 
		if (this.pricePerSquareMeter<otherApartment.pricePerSquareMeter) {
			return otherApartment.pricePerSquareMeter-this.pricePerSquareMeter;
		}
		if (this.pricePerSquareMeter>otherApartment.pricePerSquareMeter) {
			return otherApartment.pricePerSquareMeter-this.pricePerSquareMeter;
		}
		return 0;
	}
	

}

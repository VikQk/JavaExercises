package Exercici86;

public class Apartment {
	//update final
	private int rooms; 
	private int squareMeters; 
	private int pricePerSquareMeter; 
	

	public Apartment(int rooms, int squareMeters, int pricePerSquareMeter){ 
		this.rooms = rooms; 
		this.squareMeters = squareMeters; 
		this.pricePerSquareMeter = pricePerSquareMeter;
	}
		
	
	public static void main(String[] args) {
		Apartment studioManhattan = new Apartment(1, 16, 5500); 
		Apartment twoRoomsBrooklyn = new Apartment(2, 38, 4200); 
		Apartment fourAndKitchenBronx = new Apartment(3, 78, 2500); 
		System.out.println( studioManhattan.moreExpensiveThan(twoRoomsBrooklyn) );
		System.out.println( studioManhattan.priceDifference(twoRoomsBrooklyn) );
		
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

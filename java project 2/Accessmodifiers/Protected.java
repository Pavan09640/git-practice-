package Accessmodifiers;

public class Protected{
	public static void main(String[] args) {
		
		House house = new House();
		
		System.out.println("Name : " + house.name);
		System.out.println("No. of Room's : " + house.noOfRooms);
		System.out.println("No. of Kitechen's : " + house.noOfKitechen);
		
		System.out.println("-----------------");
		
		house.showDetails();
		
		
		System.out.println("-----------------");
		
		Protected a= new Protected();
		
	}
}

class House {
	
	protected String name = "White House";
	protected byte noOfRooms = 20;
	protected byte noOfKitechen = 5;
	protected byte noOfBalcony = 15;
	
	protected String showName() {
		return this.name;
	}
	
	protected void showDetails() {
		System.out.println(this.name + " has total "+this.noOfRooms + " rooms , "+this.noOfKitechen
				+ " kitchen and "+this.noOfBalcony + " balconines");
	}
	
	protected House() {}
}


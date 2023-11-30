package Accessmodifiers;

public class Default {
public static void main(String[] args) {
		
		// create an object
		FarmHouse farmHouse = new FarmHouse();
		
		System.out.println("Title : " + farmHouse.title);
		System.out.println("Price : " + farmHouse.price);
		
		farmHouse.showDetails();
		farmHouse.showPrice();
	}
}


class FarmHouse {
	
	String title = "Open Green Farm";
	int chairCount = 100;
	byte games = 10;
	float price = 4854.45f;
	
	void showDetails() {
		System.out.println(this.title + " has chair count : "+this.chairCount + " and per day price is : $"+this.price );
	}
	
	void showPrice() {
		System.out.println(this.title + " per day price is : $"+this.price );
	}
	
	FarmHouse() {} 
}

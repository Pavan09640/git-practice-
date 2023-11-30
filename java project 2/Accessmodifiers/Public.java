package Accessmodifiers;

public class Public {
public static void main(String[] args) {
		
		
		Park park = new Park();
		
		System.out.println(park.title);
		System.out.println(park.statuesCount);
		
		System.out.println("---------------");
		
		park.showDetails();
		park.showStatues();
		
	}

}

class Park {
	
	
	public String title = "Public Health Center Park";
	public int chairCount = 100;
	public short statuesCount = 30;
	public byte games = 10; 
	public void showDetails() {
		System.out.println(this.title + " has chair count : "+ this.chairCount +" and statues are : "+this.statuesCount);
	}
	public void showStatues() {
		System.out.println(this.title + " has total "+this.statuesCount +" statues.");
	}
	
	public Park() { };

}

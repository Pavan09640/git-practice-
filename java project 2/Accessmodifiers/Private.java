package Accessmodifiers;

public class Private {
public static void main(String[] args) {
		
		
		BankAccount account = new BankAccount();
		
		
		account.showName();
		account.showBalance();
	}
}

class BankAccount {
	
	
	private long accNo =3335535;
	private double accBalance =0567893.566d;
	private String fullName = "Pavan kumar";
	private String email = "pavan@gmail.com";
	
	
	private String showEmail() {
		return this.email;
	}
	
	public void showBalance() {
		System.out.println("The Account : " + this.accNo + " has balance : $"+this.accBalance);
	}
	
	public void showName() {
		System.out.println("The Account : " + this.accNo + " blongs to : "+this.fullName);
	}
	
	public BankAccount() { }

}

package demoblocks;

public class finallydemo {
	
	public static void main(String args[]) {
		try {
			int x = 1/0;
			
		}catch(ArithmeticException  e) {
			
			System.out.println("Division by 0 gives arithmetic Exception");
			
		}finally {
			System.out.println("-----------------------");
			System.out.println("Finally block executes everytime");
			System.out.println("--------------------------");
		}
		
		System.out.println("program does not crash beacuse of try catch block");
		
	}

}

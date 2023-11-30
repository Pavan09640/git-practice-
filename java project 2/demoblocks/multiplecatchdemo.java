package demoblocks;

public class multiplecatchdemo {
	public static void main(String[] args) {
		
		
		int array[] = {0,1,2,3,4,5};
		
		try {
			int a= 20/1;
			System.out.println(array[6]);
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception caught");
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("ArrayIndexOutOfBounds  Exception caught");

		}catch(Exception exc) {
			System.out.println("Arithmetic Exception caught");

		}
		
	}
		


}

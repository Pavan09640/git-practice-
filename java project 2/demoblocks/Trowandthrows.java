package demoblocks;

import java.io.IOException;


class Demo{
	public void demo() throws IOException{
		throw new  IOException("This is a custom Exception");
	}
}


public class Trowandthrows {
	public static void main(String args[]) {
		Demo d = new Demo();
		
		try {
			d.demo();
			
		}catch(IOException e) {
			System.out.println("Exception Caught" );
		}
	}
	

}

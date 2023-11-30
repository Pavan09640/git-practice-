package whileloop;



public class ClassW 
{
	void meth1(int i) 
	{
	  System.out.println("-------meth1()----------");
	  while(i<=5) 
	  {
	   System.out.println("i value:"+i);
	   i++;
	  }
	  System.out.println("meth1() executed completed");
	}
	void meth2(int i) 
	{
		System.out.println("i value:"+i);
		i++;		
	
	while(i<=5);
	
		System.out.println("meth2() excution completed");
	}
	
	public static void main(String[] args) {
		ClassW obj=new ClassW();
		//obj.meth1(5);
		obj.meth2(4);
	}
	

}

package demoblocks;


public class Trycatchdemo {
	void meth1()
    {
        
        System.out.println(10);        
       
        try
        {
            System.out.println("try block executed");
            System.out.println("Please enter a number");
            System.out.println("Hello world");
        }    
        //System.out.println("Hi");// C.E
        catch(ArithmeticException eobj)
        {
            System.out.println("1st catch block executed");        
            eobj.printStackTrace();
        }
        
        }
  public static void main(String[] args) 
  {
	Trycatchdemo obj=new Trycatchdemo();
	obj.meth1();
  }

}

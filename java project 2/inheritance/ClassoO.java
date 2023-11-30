package inheritance;

public class ClassoO extends ClassP
{
  void meth2()
  {
	  System.out.println("hello welcome child class");
  }
  public static void main(String[] args) 
  {
	  ClassoO obj=new ClassoO();
	  obj.meth1();
	  obj.meth2();
	
}
}

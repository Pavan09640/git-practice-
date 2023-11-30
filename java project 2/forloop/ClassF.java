package forloop;

public class ClassF 
{
  void meth1() 
  {
	System.out.println("-----meth1()-------");
	for(int i=1; i<=5; i++)
	{
	System.out.println("value i:"+i);
	}
	System.out.println("meth1() executed");
  }
  void meth2()
  {
	  System.out.println("-------meth2()-------"); 
	  for(int i=1;i<=10;i++)
	  {
		  System.out.println("i value:"+i++);
	  }
	  System.out.println("meth2() executed");
	  
  }
  public static void main(String[] args) 
  {
	ClassF obj=new ClassF();
	obj.meth1();
	obj.meth2();
  }
}

package Dowhile;

public class ClassD {
	void meth1(int i)
	{
	do {	
	System.out.println("i value:"+i);
	i++;
	}
	while(i<9); 
	System.out.println(i);
	}
	public static void main(String[] args) {
		ClassD obj=new ClassD();
		obj.meth1(10);
	}
}
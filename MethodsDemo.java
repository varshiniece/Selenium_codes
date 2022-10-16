package demo;

public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create obj for the class MethodsDemo
		MethodsDemo d = new MethodsDemo();
		d.getdata();
		
		methodsdemo2 d1 = new methodsdemo2();
		System.out.println(d1.getuserdata());
		
		

	}
	
	public void getdata() //void is the returntype of this method
	{
		System.out.println("Hello world");
	}

}

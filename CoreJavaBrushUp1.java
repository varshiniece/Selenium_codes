package demo;

public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //Variable declaration using its datAtype 
		
		int num = 5; //int is primitive datatype 
		String name= "varshini"; //string is primitive datatype 
		char letter = 'g';
		double dec =2.34;
		
		System.out.println(num+ " is my favourite number.");
		System.out.println("My name is "+name);
		
		//arrays = to store multiple values.
		int[] arr = new int[5];
		arr[0]  = 12; arr[1]=12 ; arr[2]=33; arr[3]=45; arr[4]=88;
		
		System.out.println(arr[3]);
		
		//another way to declare an array
		int[] array = {1,2,3,6,7,16,9,8};
				
		System.out.println(array[5]);
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		//for array of strings
		String[] friends = {"varsha","sharmi","karthik","ruthvik"};
		
		System.out.println(friends[2]);		
		
		//enhanced for loop
		for(String s: friends)
		{
			System.out.println(s);
		}
	
	}
}


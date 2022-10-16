package demo;

import java.util.ArrayList;

public class CoreJavabrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to print even numbers using if else.
		
		int[] arr = {23,45,77,88,44,34};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2 == 0)
			{
				System.out.println(arr[i]+ " are even numbers");
			    
			}
			else 
				System.out.println(arr[i]+ " are odd numbers");
		}
//Arraylist is a class in java. if we want to access any methods of
		//the class, we have to create objects of the class 
		ArrayList<String> a = new ArrayList<String>();
		//with add method,we can add strings to the array dynamically.
		a.add("a");
		a.add("b");
		a.add("c");
		a.add("d");
		System.out.println(a.get(3));
		
		
	}

}

package demo;

public class Corejavabrushup3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String is an datatype object that represents a group of sequences  //string literal 
		//both objects s and s1 has the same string . so java will not allocate new memory for the other object. it will just point s1 to s . 
		//if text is same , only one object is created. 
		String s = "Love for learning"; 
		String s1 = "Love for learning";
		
		//string declatartion using new keyword. //even if objects have same text (string value)
		//memory is allocated for both the objects . 
		String s3 = new String("welcome");
		String s4 = new String("welcome");
		
		//to break the string. -->use split method. 
		String[] splittedarray = s.split(" ");//split where there is space (delimiter is space) n save in a string array. 
		System.out.println(splittedarray[0]);
		System.out.println(splittedarray[1]);

		
	}

}

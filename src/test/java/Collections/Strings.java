package Collections;

import java.util.Arrays;

public class Strings {
	public static void main(String[] args) {
		String s ="welcome";
//		System.out.println(s.length());
//		System.out.println("welcome".length());
//		
		// concat
		String s1="welcome";
		String s2="to java";
		String s3="automation";
//		System.out.println(s1.concat(s2));//will join only on;y two string
//		System.out.println(s1.concat(s2).concat(s3));
		
		
		
//		trim- removes right and left white spaces 
		s ="  welcome ";
		System.out.println(s);
//		System.out.println(s.length());
//		System.out.println(s.trim());
		
		// charAt()- gives the index of string
		
		s ="welcome";
		System.out.println(s.charAt(0));
		
		//contains- returns T or F string values are case sensitive
//		 checks if string is part of the main string
		System.out.println(s.contains("wel"));
		System.out.println(s.contains("Come"));
		System.out.println(s.contains("em"));
		
		//equals() , equalsIgnorecase(), compare string returns T or F
//	 equals method will compare values. == will compare objects
		s1="welcome";
		s2="Welcome";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
	
//		replace()-replace single/multiple(sequence) of character in a string
		s =" welcome to selenium java selenium python selenium c#";
		System.out.println(s.replace('e', 'X'));
		System.out.println(s.replace("selenium", "playright"));
		
//		substring()- two parameters first index and index +1
		s="welcome";
		System.out.println(s.substring(0, 3));
		
		
	// split()- split the string into multiple parts based on delimeter which is  @or.
		s ="abc@gmail.com";
		String[] split = s.split("@");
	    System.out.println(Arrays.toString(split));
	    System.out.println(Arrays.toString(s.split("@")));
		System.out.println(split[0]);//abc 
		System.out.println(split[1]);//gmail.com
		
		String amount ="$15,20,55";//152055
		System.out.println(amount.replace("$", "").replace(",", ""));
		
		
		s="abc,123@xyz"; //abc 123 xyz
	     String[] arr1 = s.split(",");//abc 123@xyz
	     System.out.println(Arrays.toString(arr1));//[abc,123@xyz]
	     String[] arr2 = arr1[1].split("@");
	     System.out.println(Arrays.toString(arr2));//[123,xyz]
	     
	     System.out.println(arr1[0]);//abc
	     System.out.println(arr2[0]);//123
	     System.out.println(arr2[1]);//xyz
	     
	     s="abc 123";
	     String[] ar = s.split(" ");
	     System.out.println(Arrays.toString(ar));
	     
	     // * % ^ & () - you cannot use as delimiter
	     
	     
	     String name ="John Kenedy";
	     System.out.println(name.replace('J', 'j').contains("john"));
	     System.out.println(name.toLowerCase().contains("john"));
	     System.out.println(name.substring(0, 4));
	     
	     
		
		
	}
	
	
	

}

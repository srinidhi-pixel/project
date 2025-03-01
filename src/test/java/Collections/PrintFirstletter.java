package Collections;

import java.util.Iterator;

public class PrintFirstletter { 
	
	public static void main(String[] args) {
		String s ="welcome to java";
	  String[] words = s.split("\\s");
	  
	   for (String word : words) {
		if (!word.isEmpty()) {
			System.out.println(word.charAt(0));
			System.out.println(word);
		}
	}
		 
		
	}

}

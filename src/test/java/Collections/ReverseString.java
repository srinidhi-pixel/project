package Collections;

import java.util.Iterator;

//option 1
public class ReverseString {
	public static void main(String[] args) {
		/* immutable will not change it does not affect the original value
		String s ="welcome";
		String rev="";
		for (int i = s.length()-1;i>=0; i--) {
			  rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);
		*/
		
		//option 2 
		/* here the length is the array 
		String s ="welcome";
		String rev ="";
		char[] a = s.toCharArray();
		for (int i = a.length-1; i >=0; i--) {
			rev=rev+a[i];
		}
	   System.out.println(rev);
	   */
		
		//option 3. only string buffer and builder have inbuilt methods reverse 
		/*mutable can change .it affects the original values
		StringBuffer sb= new StringBuffer("welcome");
		System.out.println(sb.reverse());
		*/
		
		//option 4  we have append method instead of concat
		
		StringBuilder sb = new StringBuilder("welcome");
		System.out.println(sb.reverse());
		
		// whenever we are createing object use ==
	}

}

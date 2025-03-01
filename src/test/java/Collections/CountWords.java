package Collections;

import java.util.Iterator;
import java.util.Scanner;

public class CountWords {
public static void main(String[] args) {
	System.out.println("Enter the String:");
	Scanner sc = new Scanner(System.in);
	
	String s=sc.nextLine();
	int count =1;//welcome to java.when we get empty means one word.empty is also char
	//first extract each character till u get empty space and after empty der should be char
for (int i = 0; i <s.length()-1; i++) {
	if (s.charAt(i)==' '&& s.charAt(+1)!=' ') {
		count++;
	}
	
}
	System.out.println(count);
}
}

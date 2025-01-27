package Collections;

import java.util.Arrays;

public class ReverseOnlyLetters {
public static void main(String[] args) {
	 String input = "1ab2";//1ba2
	 int left=0;
	 int right =input.length()-1;
	 char inputArray[]=input.toCharArray();
	while(left<right) {
		if (!Character.isLetter(inputArray[left])) {
			left++;
		}
		else if (!Character.isLetter(inputArray[right])) {
			right--;
		}
		
		else {
			//swapp
			
			char temp;
			temp =inputArray[left];
			inputArray[left]=inputArray[right];
			inputArray[right]=temp;
			left++;
			right--;
		}
	}
	
	
	System.out.println(Arrays.toString(inputArray));
	System.out.println(new String(inputArray));
}
}

package LogicalQues;

import java.util.Arrays;

public class ReverseLetter {
	public static void main(String[] args) {
		String input ="1ab2"; // 1ba2
		 char charArray[] = input.toCharArray();
		int left =0;
		int right=input.length()-1;
		while(left<right){
		if (!Character.isLetter(charArray[left])) {
			left++;
		}else if(!Character.isLetter(charArray[right])) {
			right--;
		}
		else {
		char temp;
		temp=charArray[left];
		charArray[left]=charArray[right];
		charArray[right]=temp;
		left++;
		right--;
		}
	}
		
		System.out.println(new String(charArray));
	}
}

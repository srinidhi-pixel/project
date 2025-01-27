package LogicalQues;

public class C {
public static void main(String[] args) {
	
	String input="sri97nidhi";
	char[] inputArray = input.toCharArray();
    int	left=0;
	int right=input.length()-1;
	while (left<right) {
		if (Character.isLetter(inputArray[left])) {
			left++;
		}else if (Character.isLetter(inputArray[right])) {
			right--;
		}
		else {
			char temp= inputArray[left];
			inputArray[left]=inputArray[right];
			inputArray[right]=temp;
			left++;
			right--;
		}
		
	}
	System.out.println(new String(inputArray));
}
}

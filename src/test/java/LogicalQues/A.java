package LogicalQues;

public class A {
	
	public static void main(String[] args) {
		String input="1ab2";//1ba2
		char inputArray[] = input.toCharArray();
		int left =0;
		int right=input.length()-1;
		while(left<right) {
			if (!Character.isLetter(inputArray[left])) {
				left++;
			}else if (!Character.isLetter(inputArray[right])) {
				right--;
			}else {
				char temp;
				temp= inputArray[left];
				inputArray[left]=inputArray[right];
				inputArray[right]=temp;
				left++;
				right--;
			}
		}
System.out.println(new String(inputArray));
}
}
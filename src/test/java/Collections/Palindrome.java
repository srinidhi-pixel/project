package Collections;

public class Palindrome {
	public static void main(String[] args) {
		String s ="madam";
		char[] a = s.toCharArray();
		String rev="";
		for (int i =a.length-1 ; i>=0; i--) {
			rev=rev+a[i];
		}
		System.out.println(rev);
			if (rev.equals(s)) {
			   System.out.println("is alindrome");
			}
			}
		
		}


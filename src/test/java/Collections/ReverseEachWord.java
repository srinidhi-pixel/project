package Collections;

public class ReverseEachWord {
	public static void main(String[] args) {
		String s="Welcome to java";
		String[] words = s.split(" ");
		String strRev="";
		
		for (String w : words) {
			
			String revWord="";
			for (int i = w.length()-1; i>=0; i--) {
				  revWord=revWord+w.charAt(i);
			}
			strRev=strRev+revWord+" ";
		}
		
		System.out.println(strRev);
	}

         
}

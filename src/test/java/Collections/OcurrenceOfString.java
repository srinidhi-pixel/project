package Collections;

public class OcurrenceOfString {
	public static void main(String[] args) {
		String s ="java programing java oops";
		int totlCount=s.length();
		int totalCountAfterRemovea=s.replace("j", "").length();
	   int count = totlCount- totalCountAfterRemovea;
	   System.out.println(count);
	}

}

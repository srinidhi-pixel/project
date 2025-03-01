package Collections;

public class RemoveWhiteSpaces {
	public static void main(String[] args) {
		String s="java      programing      selenium  automation";
          s = s.replaceAll("\\s", "");
          System.out.println(s);
          System.out.println(s.charAt(0));
	}

}

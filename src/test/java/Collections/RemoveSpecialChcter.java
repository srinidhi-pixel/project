package Collections;

public class RemoveSpecialChcter {
	public static void main(String[] args) {
		String s ="welc@c#ome Aditya 78998333";
	 s= s.replaceAll("[^a-zA-Z]", "");
	 System.out.println(s);

}
}
